package Function;

//เขียนฟังก์ชันเพื่อลบคำจากสายอักขระ และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ str1 และ str2 ที่เป็นสายอักขระ
public class Ex010 {
	public static String removeStr(String str1 ,String str2) {
		return str1.replace(str2,"");
	}
	
	public static void main(String[] args) {
		System.out.println(removeStr("onetwothree","two"));
	}
}
