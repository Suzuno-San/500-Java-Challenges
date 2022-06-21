package Function;

//เขียนฟังก์ชันเพื่อหาระยะห่างระหว่าง 2 จุดบนเส้นจำนวนจริง และ return ผลลัพธ์ออกมา (hint:ระยะห่างระหว่าง 2 จุด |x1-x2|) กำหนดให้ฟังก์ชันนี้นี้รับ parameter 2 ตัว คือ x1 และ x2 ที่เป็นจำนวน
public class Ex014 {
	public static int distanceR1(int x1, int x2) {
		return Math.abs(x1 - x2);
	}
	
	public static void main(String[] args) {
		System.out.println(distanceR1(32,-18));
	}
}
