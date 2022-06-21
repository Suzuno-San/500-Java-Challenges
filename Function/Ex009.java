package Function;

//เขียนฟังก์ชันเพื่อต่อสายอักขระ 3 สายเข้าด้วยกัน และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 3 ตัว คือ str1,str2 และ str3 ที่เป็นสายอักขระ
public class Ex009 {
	public static String sumStr(String str1,String str2,String str3) {
		return str1+str2+str3;
	}
	
	public static void main(String[] args) {
		System.out.println(sumStr("A","B","C"));
	}
}
