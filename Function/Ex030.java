package Function;

/*เขียนฟังก์ชันเพื่อแปลงเลขฐานเลขฐาน 10 เป็นเลขฐาน 16 โดยรับ parameter 1 ตัว คือ x ซึ่งเป็นจำนวนเต็มบวก ให้ return เลขฐาน 16 ของ x ในรูปแบบของสายอักขระ*/
public class Ex030 {
	public static String d2h(int x) {
		return Integer.toHexString(x);
	}
	public static void main(String[] args) {
		System.out.println(d2h(318));
	}
}
