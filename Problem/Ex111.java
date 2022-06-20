package Problem;

public class Ex111 {
	public static void main(String[] args) {
		int row = 10;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("-");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("x");
			}
			for(int l=1;l<=row-i+1;l++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
