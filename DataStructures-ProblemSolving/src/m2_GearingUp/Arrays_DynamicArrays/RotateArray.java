package m2_GearingUp.Arrays_DynamicArrays;
import java.util.Scanner;

public class RotateArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		if(k>0) {
			rotateArray(arr,n,k);
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] rotateArray(int arr[],int n, int k) {
		int temp = 0;
		for(int i=0;i<k;i++) {
			temp = arr[n-1];
			for(int j=n-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		return arr;
	}
}
