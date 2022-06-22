package Function;

/*เขียนฟังก์ชันเพื่อหาระยะห่างระหว่างจุด 2 จุดในระนาบ 2 มิติ และ return ผลลัพธ์ออกมา (hint: ระยะห่างระหว่าง 2 จุด = sqrt((x1-x2)^2+(y1-y2)^2)
กำหนดให้ฟังก์ชันนี้รับ parameter 4 ตัว คือ x1,y1,x2,y2 ที่เป็นจำนวนจริง*/
public class Ex024 {
	public static double ab(double x1, double x2, double y1, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	}
	public static void main(String[] args) {
		System.out.println(ab(-19,5,5,12));
	}
}
