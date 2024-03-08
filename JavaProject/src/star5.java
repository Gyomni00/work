
// 별찍기
//   *
//  ***
// *****
//  ***
//   *

import java.util.Scanner;

public class star5 {
	public static void main(String[] args) {
		String[][] star = new String[5][5];
		for (int i = 0; i < star.length; i++) {
			int checkNum = Math.abs(i - 2);

			//System.out.println(checkNum);

			for (int j = 0; j < star[i].length; j++) {

			if (j < checkNum || 5-checkNum<= j) {

			System.out.print(" ");
			} else {
				System.out.print("★");

			}
		}
		System.out.println();
	}
}
}