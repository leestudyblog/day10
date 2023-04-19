package array_;

public class Ex03 {

	public static void main(String[] args) {
		//일반 for문
		String [] str = {"aaa", "bbb","ccc"};
		for (int i=0; i <str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("============");
		
		//for each문
		for (String s : str) {
			System.out.println(s);
		}
		
		
		int arr[] = {10,54,13,17,25,30};
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println("짝수 : "+ arr[i]);
			}
			else {
				System.out.println("홀수 : "+ arr[i]);
			}
		}
		System.out.println("======for each======");
		for (int a : arr) {
			if (a%2==0) {
				System.out.println("짝수 : "+ a);
				//continue; 사용
			}
			else { 
				System.out.println("홀수 : "+ a);
			}
		}
		
		
	}//method

}
