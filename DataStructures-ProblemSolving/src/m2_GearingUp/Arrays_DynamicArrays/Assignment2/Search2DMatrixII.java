package m2_GearingUp.Arrays_DynamicArrays.Assignment2;
import java.util.Scanner;
public class Search2DMatrixII {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long arr[][] = new long[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = sc.nextLong(); 
			}
		}
		long target = sc.nextLong();
		boolean flag = false;
		for(int j=4;j>=0;j--) {
			if(arr[0][j] == target) {
				flag = true;
			}else if(arr[0][j]<target) {
				for(int i=1;i<5;i++) {
					if(arr[i][j] == target) {
						flag = true;
					}
				}
			}
		}
		System.out.println(flag);
	}
}
