package Problem;

public class Ex104 {
	public static void main(String[] args) {
		int row = 4;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("-");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
}
