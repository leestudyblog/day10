package array_;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//문자열 비교
		Scanner input = new Scanner(System.in);
	
		String s1, s2;
		System.out.println("문자열 입력 : ");
		s1=input.next();
		System.out.println("문자열 입력 : ");
		s2=input.next();
		
		if (s1==s2) {
			System.out.println("두 문자열은 같다");
		}else {
			System.out.println("두 문자열은 다르다");
		}
		System.out.println("========.equals=========");
		if (s1.equals(s2)) {
			System.out.println("두 문자열은 같다");
		}else {
			System.out.println("두 문자열은 다르다");
		}
		
	
	}//method

}
