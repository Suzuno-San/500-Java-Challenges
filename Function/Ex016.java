package Function;

//เขียนฟังก์ชันเพื่อลดราคาสินค้า และ return ราคาหลังได้รับส่วนลดแลัวกำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ price ที่เป็นจำนวนบวก และ discount ที่เป็น % ซื่งอยู่ในช่วง 0 - 100
public class Ex016 {
	public static double sale(int price ,int discount) {
		return price*(100.0 - discount)/100;
	}
	public static void main(String[] args) {
		System.out.println(sale(100,20));
	}
}
