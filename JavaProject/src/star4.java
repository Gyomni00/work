
// 별찍기
//   *
//  ***
// *****

public class star4 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {			// 전체 구문을 3번 반복
			for (int k = 2; k > i; k--) {		// 공백 출력 구문
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)+1; j++) {	// * 출력 구문
				System.out.print("*");
			}
			System.out.println();

		}
	}
}


// k 공백 2 1 0 : -1씩 변화
// j 별   1 3 5 : +2씩 변화