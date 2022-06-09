package String;

//เขียนโปรแกรมสร้างตัวแปรชื่อ string1 และกำหนดค่าให้เท่ากับ "Expert" หลังจากนั้นให้ทำการพิมพ์อักขระตั้งแต่ index ที่ 1 จนถึง index ที่ 3 ออกมา
public class Ex026 {
	public static void main(String[] args) {
		String string1 = "Expert";
		System.out.println(string1.substring(1,4));
	}
}
