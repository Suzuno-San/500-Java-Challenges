package Problem;

public class Ex105 {
	public static void main(String[] args) {
		int row = 4;
		for(int i=row;i>0;i--) {
			for(int j=row-i;j>0;j--) {
				System.out.print("-");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
}
