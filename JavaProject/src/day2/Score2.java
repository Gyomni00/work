package day2;

//세 사람의 성적처리프로그램
//입력 : 이름, 국, 영, 수
//연산 : 총점, 평균
//출력 : 이름, 국, 영, 수, 총, 평균

import java.util.Scanner;
public class Score2 {
	
	public static void main(String[] args) {

		String[] name = new String[3]; // 이름
		int[][] score = new int[3][4]; // 국, 영, 수, 총
		float[] avg = new float[3]; // 평균

		Scanner sc = new Scanner(System.in);

		// 입력 : 이름, 국, 영, 수
		for (int i = 0; i < 3; i++) { // 세 명의 이름 입력받기
			System.out.println("이름을 입력하세요");
			name[i] = sc.next();

			for (int j = 0; j < 3; j++) { // 세 명의 점수 입력받기
				System.out.println("점수를 입력하세요");
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j];
			}
		
		// 연산 : 총점, 평균
		avg[i] = score[i][3] / 3.f;
}
		// 출력 : 이름, 국, 영, 수, 총, 평균
		for (int i = 0; i < 3; i++) {
			System.out.println("이름 : " + name[i] + "\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(avg[i]);
		}
	}
}
