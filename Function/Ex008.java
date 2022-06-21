package Function;

//เขียนฟังก์ชันเพื่อต่อสายอักขระ 2 สายเข้าด้วยกัน และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ str1 และ str2 ที่เป็นสายอักขระ
public class Ex008 {
	public static String sumStr(String str1,String str2) {
		return str1+str2;
	}
	public static void main(String[] args) {
		System.out.println(sumStr("banana","boat"));
	}
}
