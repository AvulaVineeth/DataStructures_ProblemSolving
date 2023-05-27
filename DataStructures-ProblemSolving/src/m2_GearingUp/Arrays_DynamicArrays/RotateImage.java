package m2_GearingUp.Arrays_DynamicArrays;

import java.util.Scanner;

public class RotateImage {
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[][] = new long[n][n];
		int a = 0;
		int b = n-1;
		for(int i=0;i<n*n;i++) {
			arr[a][b] = sc.nextLong();
			a++;
			if(a==3) {
				a = 0;
				b--;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
