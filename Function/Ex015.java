package Function;

//เขียนฟังก์ชันเพื่อถ้าหากำไรขั้นต้น และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ sales(ยอดขาย) และ cogs(ต้นทุน) ที่เป็นจำนวนบวก
public class Ex015 {
	public static int profit(int salse, int cogs) {
		return salse - cogs;
	}
	public static void main(String[] args) {
		System.out.println("Profit: "+profit(100,70));
	}
}
