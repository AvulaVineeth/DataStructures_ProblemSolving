package m2_GearingUp.Arrays_DynamicArrays.Assignment2;
import java.util.Scanner;

public class SumofAllSubmatrices {
	
	static long sumOfAllSubMatrices(int n, int m, long arr[][]) {
		long sum = 0;
		long mod = 1000000007;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum = (sum%mod + (((((arr[i][j]%mod)*(i+1))%mod*(j+1))%mod*(n-i))%mod*(m-j))%mod)%mod;
			}
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long arr[][] = new long[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextLong();
			}
		}
		
		System.out.println(sumOfAllSubMatrices(n,m,arr));
		
	}

}
