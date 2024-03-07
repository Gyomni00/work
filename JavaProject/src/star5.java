
public class star5 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int k = 2; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 0; i < 3; i++) {
			for (int k = 2 ; k < 1+i ; k++) {
				System.out.print(" ");
			}
			for (int j = 0 ; j < i-2 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
