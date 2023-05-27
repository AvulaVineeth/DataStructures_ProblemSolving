package m2_GearingUp.Arrays_DynamicArrays.Assignment2;
import java.util.Scanner;

public class RangeSumQuery2D {
	
	public static int sumOfSubArray(int arr[][], int c1, int c2, int c3,int c4) {
		int sum =0;
		if(c1!=0 && c2!=0) {
			sum = arr[c3][c4]-arr[c1-1][c4]-arr[c3][c2-1]+arr[c1-1][c2-1];
		}else if(c1==0 && c2==0) {
			sum = arr[c3][c4];
		}else if(c1==0) {
			sum = arr[c3][c4]-arr[c3][c2-1];
		}else if(c2==0) {
			sum = arr[c3][c4]-arr[c1-1][c4];
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=1;j<n;j++) {
				arr[i][j] = arr[i][j]+arr[i][j-1];
			}
		}
		for(int j=0;j<n;j++) {
			for(int i=1;i<m;i++) {
				arr[i][j] = arr[i][j]+arr[i-1][j];
			}
		}
		int noOfQueries = sc.nextInt();
		int arr2[] = new int[noOfQueries*4];
		for(int i=0;i<noOfQueries*4;i++) {
			arr2[i] = sc.nextInt();
		}
		for(int i=0;i<noOfQueries*4;i=i+4) {
			System.out.println(sumOfSubArray(arr,arr2[i],arr2[i+1],arr2[i+2],arr2[i+3]));
		}
	}

}
