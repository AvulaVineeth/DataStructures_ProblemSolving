package m2_GearingUp.Arrays_DynamicArrays.Assignment1;
import java.util.Scanner;

public class MaxChunksToMakeSorted {
	
	static int maxChunks(int n, int arr[]) {
		int max = 0;
		int pMax = (int)Double.NEGATIVE_INFINITY;
		for(int i=0;i<n;i++) {
			pMax = Math.max(pMax, arr[i]);
			if(i == pMax) {
				max++;
			}
		}
		
		return max;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxChunks(n,arr));
	}

}
