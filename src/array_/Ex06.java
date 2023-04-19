package array_;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		int [] arr=new int[5];
		System.out.println(arr[0]);
		String [] str =new String[5];
		System.out.println(str[0]);
	
		str[0]="aaa";
		if (str[0] !=null) {
			System.out.println("값이 존재한다");
			if(str[0].equals("aaa")) 
			{
				System.out.println("aaa와 같다");
			}
			else {
				System.out.println("aaa가 아니다");
			}
			
		}else {
			System.out.println("값이 없다");
		}
		
		package array;

			public class Ex06 {
			public static void main(String[] args) {
				int[] arr = new int[5];
				System.out.println( arr[0] );
				String[] str = new String[5];
				System.out.println( str[0] );
				
				str[0] = "aaaa";
				if( str[0] != null ) {
					System.out.println("값이 존재한다");
					if( str[0].equals("aaaa") ) {
						System.out.println("aaa와 같다");
					}else {
						System.out.println("aaa가 아니다");
					}
				}else {
					System.out.println("값이 없다");
				}
			}
			}

	
		*/
		String id[]=new String [5];
		String pwd[]=new String [5];
		
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//메뉴
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			int num = input.nextInt();
			
			// 메뉴 선택
			switch(num) {
			
			case 1: System.out.println("로그인가능"); 
			 
		 break;
			 //2. 회원가입시
			case 2: System.out.println("회원가입가능"); 
		case 3: System.out.println("나가기") ; break;
			}
	}
	
	
	
	
	
	
	}//method
	
	

}
