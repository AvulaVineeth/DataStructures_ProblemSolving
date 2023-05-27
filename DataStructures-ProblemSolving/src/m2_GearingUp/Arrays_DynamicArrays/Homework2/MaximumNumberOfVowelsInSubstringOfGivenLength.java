package m2_GearingUp.Arrays_DynamicArrays.Homework2;

import java.util.Scanner;

public class MaximumNumberOfVowelsInSubstringOfGivenLength {
	
	static int printMaxVowels(String s, int d) {
		int vowels = 0;
		int temp = 0;
		for(int i=0;i<d;i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			vowels++;	
			}
		}
		temp = vowels;
		for(int i=d;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vowels++;	
				}
			if(s.charAt(i-d)=='a'||s.charAt(i-d)=='e'||s.charAt(i-d)=='i'||s.charAt(i-d)=='o'||s.charAt(i-d)=='u') {
				vowels--;	
				}
			if(temp<vowels) {
				temp = vowels;
			}
		}
		return temp;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		int d[] = new int[n];
		for(int i=0;i<n;i++) {
			s[i] = sc.next();
			d[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(printMaxVowels(s[i],d[i]));
		}
		
	}
}
