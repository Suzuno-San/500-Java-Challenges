package Problem;

public class Ex112 {
	public static void main(String[] args) {
		int row = 9;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("-");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
