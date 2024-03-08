
	package day2;

	// 계산기 만들기
	// y Y 를 통해 원하는만큼 반복

	import java.util.Scanner;

public class DoWhile {

		public static void main(String[] args) {

			String q;

			do {

				Scanner sc;
				sc = new Scanner(System.in);

				System.out.println("첫번째 수를 입력해주세요.");
				int a = sc.nextInt();

				System.out.println("연산을 입력해주세요.");
				String b = sc.next();

				System.out.println("두번째 수를 입력해주세요.");
				int c = sc.nextInt();

				if (b.equals("+")) {
					System.out.println(a + "" + b + "" + c + "=" + (a + c));
				} else if (b.equals("-")) {
					System.out.println(a + "" + b + "" + c + "=" + (a - c));
				} else if (b.equals("*")) {
					System.out.println(a + "" + b + "" + c + "=" + (a * c));
				} else if (b.equals("/")) {
					System.out.println(a + "" + b + "" + c + "=" + ((double) a / c));
				} else {
					System.out.println("잘못된 입력입니다");

				}
				System.out.println("연산을 계속하시려면 Y 또는 y를 입력해주세요");
				q = sc.next();

			} while (q.equals("y") || q.equals("Y"));
			System.out.println("고생하셨습니다.");

		}
	}
