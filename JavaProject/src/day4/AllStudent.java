
//몇 명인지 값을 입력받는 성적처리클래스

package day4;

import java.util.Scanner;

public class AllStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("몇 명의 성적을 구하시겠습니까?");
		int num = sc.nextInt(); // 인원수 변수 num

		StudentScoreHasA[] stu = new StudentScoreHasA[num]; // 배열 만든거 : 레퍼런스를 num개만큼 ㅁㅁㅁㅁ num개

		for (int i = 0; i < num; i++) {
			stu[i] = new StudentScoreHasA(); // 레퍼런스 아래의 '객체'를 만든 것. 이 객체 이름은 무조건 레퍼런스 이름과 같아야 하며(여기서 stu)
												// StudentScoreHasA stu[i] = ~~ 로 쓰지 않는 이유는 StudentScoreHasA라는 type을 18행
												// 레퍼런스에서 이미 선언해서
			System.out.println("이름을 입력해주세요");
			String name = sc.next();
			stu[i].setName(name);

			System.out.println("국어 점수를 입력해주세요");
			int kor = sc.nextInt();
			stu[i].setKor(kor);

			System.out.println("수학 점수를 입력해주세요");
			int mat = sc.nextInt();
			stu[i].setMat(mat);

			System.out.println("영어 점수를 입력해주세요");
			int eng = sc.nextInt();
			stu[i].setEng(eng);

			System.out.println(stu[i].getName());
			System.out.println(stu[i].getKor());
			System.out.println(stu[i].getMat());
			System.out.println(stu[i].getEng());
			System.out.println(stu[i].getTotal());
			System.out.println(stu[i].getAvg());
		}
	}
}
