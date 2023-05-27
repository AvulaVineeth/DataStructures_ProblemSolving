package m2_GearingUp.Arrays_DynamicArrays.Homework2;

import java.util.Scanner;

public class MatrixBlockSum {
	
	static long[][] matrixBlockSum(int m,int n,int k,long[][] mat){
		for(int i=0;i<m;i++) {
			for(int j=0;j<n-1;j++) {
				mat[i][j+1]=mat[i][j+1]+mat[i][j];
			}
		}
		
		for(int i=0;i<m-1;i++) {
			for(int j=0;j<n;j++) {
				mat[i+1][j]=mat[i+1][j]+mat[i][j];
			}
		}
		
		long mat1[][] = new long[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
//				if(i+k<=m-1 && j+k<=n-1 && i-k>0 && j-k>0) {
				int a = i+k;
				int b = j+k;
				int c = i-k-1;
				int d = j-k-1;
				if(a>m-1) {
					a=m-1;
				}
				if(b>n-1) {
					b=n-1;
				}
				if(i-k<=0) {
					c=0;
				}
				if(j-k<=0) {
					d=0;
				}
//				if(i+k<=m-1 && j+k<=n-1 && i-k<=0 && j-k<=0) {
//					mat1[i][j] = mat[i+k][j+k]-mat[0][j+k]-mat[i+k][0]+mat[0][0];
//				}else if(i+k>m-1 && j+k<=n-1 && i-k>0 && j-k>0) {
//					mat1[i][j] = mat[m-1][j+k]-mat[i-k-1][j+k]-mat[m-1][j-k-1]+mat[i-k-1][j-k-1];
//				}else if(i+k<=m-1 && j+k>n-1 && i-k>0 && j-k>0) {
//					mat1[i][j] = mat[i+k][n-1]-mat[i-k-1][n-1]-mat[i+k][j-k-1]+mat[i-k-1][j-k-1];
//				}else if(i+k<=m-1 && j+k<=n-1 && i-k<=0 && j-k>0) {
//					mat1[i][j] = mat[i+k][j+k]-mat[0][j+k]-mat[i+k][j-k-1]+mat[0][j-k-1];
//				}else if (i+k<=m-1 && j+k<=n-1 && i-k>0 && j-k<=0){
//					mat1[i][j] = mat[i+k][j+k]-mat[i-k-1][j+k]-mat[i+k][0]+mat[i-k-1][0];
//				}else {
//					System.out.println(i+k+" "+j+k+" "+(i-k-1)+" "+j+k+" "+i+k+" "+(j-k-1)+" "+(i-k-1)+" "+(j-k-1));
//					mat1[i][j] = mat[a][b]-mat[c][b]-mat[a][d]+mat[c][d];
//				}
				System.out.println(i+k+" "+j+k+" "+(i-k-1)+" "+j+k+" "+i+k+" "+(j-k-1)+" "+(i-k-1)+" "+(j-k-1));
				System.out.println(a+" "+b+" "+c+" "+d);
				mat1[i][j] = mat[a][b]-mat[c][b]-mat[a][d]+mat[c][d];
				
				
			}
		}
		
		return mat1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		long mat[][] = new long[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		mat = matrixBlockSum(m,n,k,mat);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
