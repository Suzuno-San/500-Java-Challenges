package Problem;

public class Ex107 {
	public static void main(String[] args) {
		int row = 7;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(j==Math.abs((row/2)-i)||j==(row-1)-Math.abs((row/2)-i)) {
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
