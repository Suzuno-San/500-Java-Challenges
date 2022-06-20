package Problem;

public class Ex108 {
	public static void main(String[] args) {
		int row = 10;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("-");
			}
			for(int k=1;k<=i;k++) {
				if(k==1) {
					System.out.print("x");
				}
			}
			System.out.println();
		}
	}
}