package m2_GearingUp.Arrays_DynamicArrays.Homework2;

import java.util.Scanner;

public class PermutationInString {
	
	public static boolean permutationCheck(String s1,String s2) {
		boolean status = true;
		boolean status1 = false;
		long sum = 0;
		long sum1 = 0;
		if(s2.length()<s1.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			sum = sum + s1.charAt(i);
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.indexOf(s2.charAt(i))==-1) {
				status = false;
			}
			sum1 = sum1 + s2.charAt(i);
		}
		if(status == true && sum==sum1) {
			return true;
		}
		for(int i=1;i<=s2.length()-s1.length();i++) {
			sum1 = sum1 - s2.charAt(i-1) + s2.charAt(i+s1.length()-1);
			if(s1.indexOf(s2.charAt(i+s1.length()-1))!=-1 && sum1==sum) {
				status1 = true;
				break;
			}
		}
		
		return status1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n*2];
		for(int i=0;i<s.length;i++) {
			s[i] = sc.next();
		}
		for(int i=0;i<s.length;i+=2) {
			if(permutationCheck(s[i],s[i+1])){
				System.out.println("True");
			}else{
				System.out.println("False");
			}
		}
	}
}
