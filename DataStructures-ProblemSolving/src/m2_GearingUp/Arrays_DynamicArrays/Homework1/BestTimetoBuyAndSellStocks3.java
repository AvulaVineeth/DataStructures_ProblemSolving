package m2_GearingUp.Arrays_DynamicArrays.Homework1;
import java.util.Arrays;
import java.util.Scanner;

public class BestTimetoBuyAndSellStocks3 {

	static long maxProfit(int n, long arr[]) {
		long finalMax = 0;
		
		//first transaction
		long left[] = new long[n];
		long min = arr[0];
		for(int i=1;i<n;i++) {
			min = Math.min(min, arr[i]);
			left[i] = Math.max(left[i-1], arr[i]-min);
		}
		
		//second transaction
		long right[] = new long[n];
		long max = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			max = Math.max(max, arr[i]);
			right[i] = Math.max(right[i+1], max-arr[i]);
		}
		
		//final max calculating by add the ith position of left & right arrays
		for(int i=0;i<n;i++) {
			finalMax = Math.max(finalMax, left[i]+right[i]);
		}
		return finalMax;
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
