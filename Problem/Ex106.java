package Problem;

public class Ex106 {
	public static void main(String[] args) {
		int row = 7;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i==j || j==row-i+1) {
					System.out.print("x");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
