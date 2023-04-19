package array_;

public class Ex01 {

	public static void main(String[] args) {
	
		/*
		 배열 : 같은 자료형으로 연속된 공간을 만드는 것
		  - 자료형 배열명[] & 자료형 [] 배열명 =new 자료형 [];
		  - index는 0부터 시작한다. (index = 배열의 위치)
		  - 참조형 변수
		  - length : 길이 
		 */
		
		
		int [] arr = new int [3];
		arr[0] =1111;
		arr[1] =2222;
		arr[2] =3333;
		System.out.println(arr.length); //length - 해당길이
		System.out.println(arr); //정보값 출력
		
		for(int i=0; i <3; i++) {
			System.out.println(arr[i]); //arr의 0,1,2 의 값을 출력한다.(i=3)
			
		}
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]); 
			
		}
		
		//배열 초기화
		int [] arr2 = {111,222,333,444,555};
		System.out.println("arr2 length : " + arr2.length);
		
		for (int j=0; j<arr2.length; j++) {
			System.out.println(arr2[j]);
		}
		
		int[] arr3 = new int [] {1,2,3,4,5};
		for (int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
	}//method end

}
