package Function;

//เขียนฟังก์ชันเพื่อหาความยาวด้านตรงข้ามมุมฉาก และ return ผลลัพธ์ออกมากำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ a และ b ที่เป็นด้านประกอบมุมฉาก
public class Ex023 {
	public static double hypotenuse(int a, int b) {
		return Math.sqrt((a*a)+(b*b));
	}
	public static void main(String[] args) {
		System.out.println(hypotenuse(6,8));
	}
}
