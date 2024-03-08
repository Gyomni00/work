
// 별찍기
// *
// **
// ***

public class star2 {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {			// i 반복 횟수 : 1부터 시작, 4종료니까 총 3번
			for (int j = 0; j < i; j++) {		// j 별찍는 갯수
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


// 6행이 1부터 시작하는 이유는 
// 만약 0부터 시작할 경우 7번행에서 j=i=0이 되어 결과값의 첫 행이 아무것도 출력되지 않기 때문
