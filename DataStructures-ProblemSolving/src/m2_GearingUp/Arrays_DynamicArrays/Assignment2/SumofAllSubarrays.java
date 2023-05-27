package m2_GearingUp.Arrays_DynamicArrays.Assignment2;

import java.util.Scanner;

public class SumofAllSubarrays {
	
	static long sumOfSubarrays(int n, long arr[]) {
		long sum = 0;
		long mod = 1000000007;
		for(int i=0;i<n;i++) {
			sum = (sum%mod + (((arr[i]*(i+1))%mod)*(n-i))%mod)%mod;
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sumOfSubarrays(n,arr));
	}

}
