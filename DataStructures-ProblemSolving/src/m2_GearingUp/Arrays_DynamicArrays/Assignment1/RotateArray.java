package m2_GearingUp.Arrays_DynamicArrays.Assignment1;
import java.util.Scanner;

public class RotateArray {
	
	static long[] reverseArray(int i, int j, long arr[]) {
		long temp;
		int l = j-i+1;
		for(int k=i;k<i+(l/2);k++) {
			temp = arr[k];
			arr[k] = arr[j];
			arr[j] = temp;
			j--;
		}
		return arr;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		k = k%n;
		reverseArray(n-k,n-1,arr);
		reverseArray(0,n-k-1,arr);
		reverseArray(0,n-1,arr);
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}
	}

}
