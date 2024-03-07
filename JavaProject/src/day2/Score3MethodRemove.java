package day2;

// n명의 성적처리 프로그램 함수 제거
// score3 파일에서 함수 제거
// 입력 : 이름, 국, 영, 수
// 연산 : 총점, 평균
// 출력 : 이름, 국, 영, 수, 총, 평균

import java.util.Scanner;

public class Score3MethodRemove {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("몇 명의 성적을 구하시겠습니까?");
		int num = sc.nextInt(); // 인원수 변수 num

		String[] name = new String[num]; // 이름 입력 공간 선언
		int[][] score = new int[num][4]; // 국, 영, 수, 총
		float[] avg = new float[num]; // 평균

		// 위에 입력받은 인원수에 따라 반복하며 인덱스(i) 생성
		for (int i = 0; i < num; i++) { 
			name = Score3MethodRemove.input1(name,i); // input1 호출하면서 input1에게 name과 i 배열 전달 후 결과값 전달받음
			score = Score3MethodRemove.input2(score,i); //score는 (위에서 정의한)배열, i가 인덱스 몇번쨰 학생인지 알려주는
			avg[i] = Score3MethodRemove.avg(score[i][0],score[i][1],score[i][2]); // score라는 배열 안에 i번째 학생
			// 배열은 선언할 때만 앞 뒤 모두 작성 가능, 사용할 때는 뒤에서만 가능 ex)avg[i]
		}
	
		
		// 출력 : 이름, 국, 영, 수, 총, 평균
		for (int i = 0; i < num; i++) { 
			System.out.println("이름 : " + name[i] + "\t"); // 학생 이름 출력
			
			System.out.println(score[i][0]); // 국어 점수 출력
			System.out.println(score[i][1]); // 영어 점수 출력
			System.out.println(score[i][2]); // 수학 점수 출력
			System.out.println(score[i][3]); // 총점 출력

			System.out.println(avg[i]); // 평균 점수 출력}
		}
	}

	// 입력 : 이름 + 인원수, 국, 영, 수
	public static String[] input1(String[] inputName, int i) { // input1 메소드가 생성되며 
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		inputName[i] = sc.next();
		return inputName;
	}
	
	public static int[][] input2(int[][] inputscore, int i ) { // 인원수 국 영 수 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		int a = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		int b = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		int c = sc.nextInt();
		
		inputscore[i][0] = a;
		inputscore[i][1] = b;
		inputscore[i][2] = c;
		inputscore[i][3] = a+b+c;
		
		return inputscore;
	}

	// 연산 : 총점, 평균
	public static int plus(int num1, int num2, int num3) { // 국 영 수 총점 구하기
		return num1 + num2 + num3;
	}

	public static float avg(int num1, int num2, int num3) { // 국 영 수 평균 구하기
		return (num1 + num2 + num3) / 3.f;
	}
}
