package m2_GearingUp.Arrays_DynamicArrays.Assignment2;

import java.util.Scanner;

public class MinimumSwapstobringTogether {
	
	static int minSwaps(int n, int k, long arr[]) {
		int size=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<=k) {
				size++;
			}
		}
		int count = 0;
		for(int i=0;i<size;i++) {
			if(arr[i]<=k) {
				count++;
			}
		}
		int maxCount = count;
		for(int i=size;i<n;i++) {
			if(arr[i-size]<= k) {
				count--;
			}
			if(arr[i]<=k) {
				count++;
			}
			if(count>maxCount) {
				maxCount = count;
			}
		}
		
		return size-maxCount;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(minSwaps(n,k,arr));
	}

}
