package Function;

//เขียนฟังก์ชันสำหรับวาดรูปต่อไปนี้ โดยไม่ต้องรับ parameter
public class Ex037 {
	public static void pattern() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print("-");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern();
	}
}

