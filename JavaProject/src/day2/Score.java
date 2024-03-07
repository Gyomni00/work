package day2;

//한 사람의 성적처리프로그램
//입력 : 이름, 국, 영, 수
//연산 : 총점, 평균
//출력 : 이름, 국, 영, 수, 총, 평균

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		String name;
		int score[] = new int[4]; // int []score도 가능
		float avg;

		Scanner sc = new Scanner(System.in);  

		// 입력 : 이름, 국, 영, 수

		System.out.println("이름을 입력하세요");
		name = sc.next();

		System.out.println("국어 점수를 입력하세요");
		score[0] = sc.nextInt();

		System.out.println("영어 점수를 입력하세요");
		score[1] = sc.nextInt();

		System.out.println("수학 점수를 입력하세요");
		score[2] = sc.nextInt();

		// 연산 : 총점, 평균
		score[3] = score[0] + score[1] + score[2];

		avg = score[3] / 3;

		// 출력 : 이름, 국, 영, 수, 총, 평균
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + score[0] + " 영어 점수 : " + score[1] + " 수학 점수 : " + score[2]);
		System.out.println("총점 : " + score[3] + " 평균 점수 : " + avg);
	}
}


//		답안
//	      System.out.println("이름을 입력하세요");
//	      name = sc.next();
//	      
//	      for(int i=0;i<3;i++) {
//	         System.out.println("점수를 입력하세요");
//	         score[i] = sc.nextInt();   
//	         score[3] += score[i];
//	      }
//	      avg = score[3] / 3.f;
//
//	      System.out.println("이름 : " + name+ "\t");
//	      for(int sco:score) {
//	         System.out.print(sco+"\t");
//	      }
//	      System.out.println(avg);            
//	   }
//	}
