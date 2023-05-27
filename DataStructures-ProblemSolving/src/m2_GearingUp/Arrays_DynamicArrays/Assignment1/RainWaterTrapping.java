package m2_GearingUp.Arrays_DynamicArrays.Assignment1;
import java.util.Scanner;

public class RainWaterTrapping {

	static long waterTapped(int n, long arr[]) {
		long units = 0;
		long pMax = (long)Double.NEGATIVE_INFINITY;
		long sMax = (long)Double.NEGATIVE_INFINITY;
		long pArr[] = new long[n];
		long sArr[] = new long[n];
		for(int i=0;i<n;i++) {
			pMax = Math.max(pMax, arr[i]);
			pArr[i] = pMax;
		}
		for(int j=n-1;j>=0;j--) {
			sMax = Math.max(sMax, arr[j]);
			sArr[j] = sMax;
		}
		for(int i=1;i<=n-2;i++) {
			if(Math.min(pArr[i-1], sArr[i+1])>arr[i]) {
				units = units + Math.min(pArr[i-1], sArr[i+1]) - arr[i];
			}
		}
		
		return units;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(waterTapped(n,arr));
	}
}
