
// 배열
// 1차원 : 열
// 2차원 : 행 열
// 3차원 : 면 행 열


package day2;

public class array {
	
	public static void main(String[] args) {

		int[] arr = new int[5]; //arr은 다 알고 있음

		//1번 
		for(int i = 0; i < arr.length; i++) { //length 이용
			System.out.println(arr[i]);
		}
		
		//2번 : 둘 중 아무거나 해도 동일한 결과 값 출력
//		for(int i:arr) { // arr의 첫번째 주소만 알려주면 알아서 꺼내옴
//			System.out.println(i);
//		}
	}
}