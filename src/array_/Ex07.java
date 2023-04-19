package array_;

import java.util.Scanner;

public class Ex07 { 

	public static void main(String[] args) {
		String id[]=new String [5];
		String pwd[]=new String [5];
		
		Scanner input=new Scanner(System.in);
		int num;
		int index=0, cnt=0; 
		String inputid = null;
		String inputpw = null;
		
		while(true) {
			
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.특정회원 보기");
			System.out.println("4.특정회원 비밀번호 수정");
			System.out.println("5.특정회원 삭제");
			System.out.println("6. 모든 회원 보기");
			System.out.println("7.나가기");
			System.out.println(">>> : ");
			num=input.nextInt();
			
			switch (num) {
			case 1 :
				System.out.println("아이디를 입력하시오");
				inputid = input.next();
				System.out.println("비민번호를 입력하시오");
				inputpw = input.next();
				
			
				System.out.println("로그인"); break;
			case 2 : System.out.println("회원가입"); break;
			case 3 : System.out.println("특정회원보기"); break;
			case 4 : System.out.println("특정회원 비밀번호 수정"); break;
			case 5 : System.out.println("특정회원 삭제"); break;
			case 6 : System.out.println("모든 회원 보기"); break;
			case 7 : System.out.println("나가기"); break;
			
			
			}
			
			
			
			
		}
		
	}
	
}