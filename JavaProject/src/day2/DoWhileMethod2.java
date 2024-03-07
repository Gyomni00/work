package day2;

import java.util.Iterator;
import java.util.Scanner;

public class DoWhileMethod2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		char num3;
		char q = sc.next().string(char));
	
		
		do {
		num1 = DoWhileMethod2.input1();
		num3 = DoWhileMethod2.input3();
		num2 = DoWhileMethod2.input2();
		
		DoWhileMethod2.output(num1, num2, num3);
		}while (q.equals('y') || q.equals('Y'));
		System.out.println("고생하셨습니다.");
	}

	// 입력
	public static int input1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해주세요.");
		int a = sc.nextInt();
		return a;
	}

	public static int input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두번째 수를 입력해주세요.");
		int a = sc.nextInt();
		return a;
	}

	public static char input3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산을 입력해주세요.");
		char a = sc.next().charAt(0);
		return a;
	}

	// 계산식
	public static int plus(int num1, int num2) { 					// 더하기
		return num1 + num2;
	}

	public static int minus(int num1, int num2) { 					// 빼기
		return num1 - num2;
	}

	public static int multiply(int num1, int num2) {				 // 곱하기
		return num1 * num2;
	}

	public static double divide(int num1, int num2) {					//나누기
		return num1 /(double) num2;	
	}

	//  출력
	public static void output(int num1, int num2, char num3) {
		if(num3 == '+') {
			System.out.print("결과는 "+DoWhileMethod2.plus(num1,num2)+" 입니다.");
		}
		else if(num3 == '-') {
			System.out.print("결과는 "+DoWhileMethod2.minus(num1,num2)+" 입니다.");
		}
		else if(num3 == '*') {
			System.out.print("결과는 "+DoWhileMethod2.multiply(num1,num2)+" 입니다.");
		}
		else if(num3 == '/') {
			System.out.print("결과는 "+DoWhileMethod2.divide(num1,num2)+" 입니다.");
		}
		else 
			System.out.print("잘못입력하셨습니다.");
	}
}
			
	
	

//
//		do {
//
//			Scanner sc;
//			sc = new Scanner(System.in);
//
//			System.out.println("첫번째 수를 입력해주세요.");
//			int a = sc.nextInt();
//
//			System.out.println("연산을 입력해주세요.");
//			String b = sc.next();
//
//			System.out.println("두번째 수를 입력해주세요.");
//			int c = sc.nextInt();
//
//			if (b.equals("+")) {
//				System.out.println(a + "" + b + "" + c + "=" + (a + c));
//			} else if (b.equals("-")) {
//				System.out.println(a + "" + b + "" + c + "=" + (a - c));
//			} else if (b.equals("*")) {
//				System.out.println(a + "" + b + "" + c + "=" + (a * c));
//			} else if (b.equals("/")) {
//				System.out.println(a + "" + b + "" + c + "=" + ((double) a / c));
//			} else {
//				System.out.println("잘못된 입력입니다");
//
//			}
//			System.out.println("연산을 계속하시려면 Y 또는 y를 입력해주세요");
//			q = sc.next();
//
//		} while (q.equals("y") || q.equals("Y"));
//		System.out.println("고생하셨습니다.");
//
//	}
//}
