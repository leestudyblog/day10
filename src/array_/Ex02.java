package array_;

public class Ex02 {

	public static void main(String[] args) {
		int [] arr = {111,222,333};
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println("===========");
		}
			for (int n : arr) {
				System.out.println(n);
				System.out.println("===========");
			}
		
		/*for each문
		 배열의 값을 변수에 담아서 중괄호 구간 안으로 전달해준다. 
		 반복문의 종료조건이나 종료조건을 위해서 기준 값을 증가시키는 증의 반복적인 작업을 내부적으로 감춘 것. 
		 * for (자료형 변수명 : 배열){
				종속문장
			} 
		  */
		 
		for (int i=0; i<arr.length; i++) {
			arr[i] = arr[i] +100;
			System.out.println(arr[i]);
		}
		System.out.println("===========");
		int index=0; //for each는 변수 생성 필요
		for (int n : arr) {//211, 322, 433 
			arr[index] = n-100; // 위 숫자들에 각 100을 빼고 arr index 값에 넣기
			System.out.println(arr[index]);
			index++;
		}
	
	}//method
}
