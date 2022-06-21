package Function;

//เขียนฟังก์ชันเพื่อยกกำลังสองเลข 1 ตัว และ return ผลลัพธ์ออกมากำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ a ที่เป็นจำนวนเต็ม
public class Ex003 {
	public static int square(int a) {
		return a*a;
	}
	
	public static void main(String[] args) {
		System.out.println(square(2));
	}
}
