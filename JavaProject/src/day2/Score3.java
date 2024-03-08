package day2;

// n명의 성적처리프로그램
// 입력 : 이름, 국, 영, 수
// 연산 : 총점, 평균
// 출력 : 이름, 국, 영, 수, 총, 평균

import java.util.Scanner;

public class Score3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("몇 명의 성적을 구하시겠습니까?");
		int num = sc.nextInt(); //인원수 변수 num
		
		String[] name = new String[num]; // 이름
		int[][] score = new int[num][4]; // 국, 영, 수, 총
		float[] avg = new float[num]; // 평균

		// 입력 : 이름, 국, 영, 수
		for (int i = 0; i < num; i++) { // num 명의 이름 입력받기
			System.out.println("이름을 입력하세요");
			name[i] = sc.next();

			for (int j = 0; j < 3 ; j++) { // 국 영 수 3가지 과목의 점수 입력받기
				System.out.println("점수를 입력하세요");
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j];
			}
		
		// 연산 : 총점, 평균
		avg[i] = score[i][3] / 3.f;
}
		// 출력 : 이름, 국, 영, 수, 총, 평균
		for (int i = 0; i < num; i++) {
			System.out.println("이름 : " + name[i] + "\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(avg[i]);
		}
	}
}
