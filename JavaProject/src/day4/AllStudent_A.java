
//몇 명인지 값을 입력받는 성적처리클래스 강사님 답안

package day4;

import java.util.Scanner; // 함수를 쓸 때(String scanner)등을 쓸 때 사용하는데, 너무 자주쓰는 String등은 해당 구문으 안써도 작동됨 Scanner 쓸 떄는 작성해야함

public class AllStudent_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		StudentScoreHasA[] stu = new StudentScoreHasA[num];

		for (int i = 0; i < num; i++) {
			stu[i] = new StudentScoreHasA();

			stu[i].setName(sc.next());
			stu[i].setKor(sc.nextInt());
			stu[i].setEng(sc.nextInt());
			stu[i].setMat(sc.nextInt());

		}

		for (int i = 0; i < num; i++) {
			System.out.println(stu[i].getName());
			System.out.println(stu[i].getKor());
			System.out.println(stu[i].getEng());
			System.out.println(stu[i].getMat());
			System.out.println(stu[i].getTotal());
			System.out.println(stu[i].getAvg());
		}

	}

}
