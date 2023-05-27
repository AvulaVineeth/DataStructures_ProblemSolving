package m2_GearingUp.Arrays_DynamicArrays.Homework1;
import java.util.Scanner;

public class RotateImage {
	
	static int[][] rotateArray(int n, int arr[][]){
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		return arr;
	}
	
	static int[][] reverseArray(int n, int arr[][]){
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				temp = arr[i][j];
				arr[i][j] = arr[i][n-j-1];
				arr[i][n-j-1] = temp;
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		rotateArray(n,arr);
		reverseArray(n,arr);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
