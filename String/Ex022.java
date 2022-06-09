package String;

//เขียนโปรแกรมสร้างตัวแปรชื่อ string1 และกำหนดค่าให้เท่ากับ "Expert" หลังจากนั้นให้ทำการพิมพ์อักขระที่ index ที่ -1 ออกมา
public class Ex022 {
	public static void main(String[] args) {
		String string1 = "Expert";
		System.out.println(string1.charAt(string1.length()-1));
	}
}
