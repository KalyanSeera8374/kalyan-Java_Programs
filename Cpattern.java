package Demo;
public class Cpattern {
	public static void main(String[] args) {
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=6; j++) {
				if (i==0 && j>=1 || i>=1 && i<=5 && j==0 || i==6 && j>=1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}