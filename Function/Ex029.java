package Function;

//เขียนฟังก์ชันเพื่อแปลงเลขฐาน 10 เป็นเลขฐาน 2 โดยรับ parameter 1 ตัว คือ x ซึ่งเป็นจำนวนเต็มบวก ให้ return เลขฐาน 2 ของ x ในรูปแบบของสายอักขระ
public class Ex029 {
	public static String d2b(int x) {
		return Integer.toBinaryString(x);
	}
	public static void main(String[] args) {
		System.out.println(d2b(13));
	}
}
