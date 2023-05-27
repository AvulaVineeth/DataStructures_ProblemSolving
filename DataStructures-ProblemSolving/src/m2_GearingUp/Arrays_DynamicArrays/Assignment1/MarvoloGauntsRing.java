package m2_GearingUp.Arrays_DynamicArrays.Assignment1;
import java.util.Scanner;

public class MarvoloGauntsRing {
	
	static long maxarray(int n, long p, long q, long r, long arr[]) {
		long max = (long)Double.NEGATIVE_INFINITY;
		long pArr[] = new long[n];
		long sArr[] = new long[n];
		long pMax = (long)Double.NEGATIVE_INFINITY,sMax = (long)Double.NEGATIVE_INFINITY;
		for(int i=0;i<n;i++) {
			pMax = Math.max(pMax, arr[i]*p);
			pArr[i] = pMax;
		}
		for(int k=n-1;k>=0;k--) {
			sMax = Math.max(sMax, arr[k]*r);
			sArr[k] = sMax;
		}
		for(int j=0;j<n;j++) {
			max = Math.max(max, pArr[j]+(q*arr[j])+sArr[j]);
		}
		return max;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long p = sc.nextInt();
		long q = sc.nextInt();
		long r = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxarray(n,p,q,r,arr));
	}
}
