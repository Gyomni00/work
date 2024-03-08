
// 별찍기
//  *
// **
//***

public class star3 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {				// 전체 구문을 3번 반복
			for (int k = 2; k > i; k--) {			// 공백 출력 구문
				System.out.print(" ");
			}
			
			for (int j = 0; j < i + 1; j++) {		// * 출력 구문
				System.out.print("*");
			}
			System.out.println();

			
		}
	}
}


/*6-9행
i=0 일 때 k=2 k>i이므로 공백 하나
i=0 일 때 k=1 k>i이므로 공백 하나
i=0 일 때 k=0 k=i이므로 공백 x -> 11행으로 넘어감
i=0 일 때 j=0 j<i+1이므로 별 하나
i=0 일 때 j=1 j=i+1이므로 별 x -> 6행으로 다시 돌아감*/