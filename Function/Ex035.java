package Function;

public class Ex035 {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||j==n-i+1) {
					System.out.print("x");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(6);
	}
}
