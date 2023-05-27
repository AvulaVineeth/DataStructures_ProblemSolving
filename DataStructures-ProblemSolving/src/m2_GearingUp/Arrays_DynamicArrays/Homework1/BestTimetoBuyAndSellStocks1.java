package m2_GearingUp.Arrays_DynamicArrays.Homework1;
import java.util.Scanner;

public class BestTimetoBuyAndSellStocks1 {
	
	static long maxProfit(int n, long arr[]) {
		long max = 0;
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
		System.out.println(maxProfit(n,arr));

	}

}
