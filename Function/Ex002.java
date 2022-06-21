package Function;

//เขียนฟังก์ชันเพื่อบวกเลข 3 ตัว และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 3 ตัว คือ a,b และ c ที่เป็นจำนวนเต็ม
public class Ex002 {
	public static int addition(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		System.out.println(addition(1,2,3));
	}
}
