package Demo;

public class Npattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=6; j++) {
				if (j==0 || j==6 || i==1 && j==1 || i==2 && j==2 || i==3 && j==3 || i==4 && j==4 || i==5 && j==5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
