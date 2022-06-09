package String;

//เขียนโปรแกรมสร้างตัวแปรชื่อ string1 และกำหนดค่าให้เท่ากับ "Expert" หลังจากนั้นให้ทำการพิมพ์อักขระ "p" ออกมา โดยอ้างอิงตำแหน่งจาก string1
public class Ex024 {
	public static void main(String[] args) {
		String string1 = "Expert";
		System.out.println(string1.charAt(2));
		System.out.println(string1.charAt(string1.length()-4)); //or
	}
}
