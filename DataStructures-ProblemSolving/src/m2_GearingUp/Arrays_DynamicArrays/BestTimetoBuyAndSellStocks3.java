package m2_GearingUp.Arrays_DynamicArrays;
import java.util.Arrays;
import java.util.Scanner;

public class BestTimetoBuyAndSellStocks3 {

	static long maxProfit(long array[], int a,int b) {
		long max = 0;
		long arr[] = Arrays.copyOfRange(array, a, b);
		int n = arr.length;
		long pMin = (long)Double.POSITIVE_INFINITY;
		long pArr[] = new long[n];
		long sMax = (long)Double.NEGATIVE_INFINITY;
		long sArr[] = new long[n];
		for(int i=0;i<n;i++) {
			pMin = Math.min(pMin, arr[i]);
			pArr[i] = pMin;
			sMax = Math.max(sMax, arr[n-1-i]);
			sArr[n-1-i] = sMax;
		}
		for(int i=0;i<=n-2;i++) {
			max = Math.max(max, sArr[i+1]- pArr[i]);
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		long max = 0;
		for(int j=0;j<n;j++) {
			max = Math.max(max,maxProfit(arr,0,j+1)+maxProfit(arr,j+1,n));
		}
		System.out.println(max);
	}

}
