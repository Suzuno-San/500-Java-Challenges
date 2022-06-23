package Function;

//เขียนฟังก์ชันสำหรับวาดรูปต่อไปนี้โดยรับ parameter 1 ตัว คือ n
public class Ex036 {
	public static void pattern(int n) {
		int row = n%2 == 0 ? n-1 : n;
		for(int i=0;i<row;i++) {
			for(int j=0;j<n;j++) {
				if(j==Math.abs((n-1)/2-i) || j==(n-1)-Math.abs((n-1)/2-i)){
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
