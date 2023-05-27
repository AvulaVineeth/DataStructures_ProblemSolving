package m2_GearingUp.Arrays_DynamicArrays.Homework1;
import java.util.Scanner;

public class AlyonaAndFlowers {
	
	static int printMax(int arr[],int arr2[],int m) {
		int finalMax=0;
		for(int i=0;i<m*2;i=i+2) {
			int max=0;
			for(int j=arr2[i]-1;j<arr2[i+1];j++) {
				if(arr2[i+1]-arr2[i]!=0) {
					max = arr[j]+max;
				}else {
					max = arr[j];
				}
			}
			
			if(max>0) {
				finalMax = finalMax+max;
			}
		}
		
		return finalMax;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int arr2[] = new int[m*2];
		for(int j=0;j<m*2;j++) {
			arr2[j] = sc.nextInt();
		}
		System.out.println(printMax(arr,arr2,m));

	}

}
