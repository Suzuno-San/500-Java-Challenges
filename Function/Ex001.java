package Function;

//เขียนฟังก์ชันเพื่อบวกเลข 2 ตัว และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ a และ b ที่เป็นจำนวนเต็ม
public class Ex001 {
	public static int addition(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(addition(2,3));
	}
}
