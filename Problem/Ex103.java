package Problem;

public class Ex103 {
	public static void main(String[] args) {
		int row = 10;
		for(int i=row;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
}
