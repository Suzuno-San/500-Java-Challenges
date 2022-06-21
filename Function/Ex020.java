package Function;

/*เขียนฟังก์ชันเพื่อคำนวณเงินทุนสะสม โดยรับ parameter 3 ตัว ได้แก่
 * เงินลงทุนเริ่นต้น(PV)
 * อัตราผลตอบแทนในรูป % ต่อปี(r)
 * จำนวนปีที่ลงทุน(n)
 ให้ return เงินลงทุนเมื่อผ่านไปแล้ว n ปี (คิดผลตอบแทนแบบทบต้น)*/
public class Ex020 {
	public static double fund(double PV, double r, double n) {
		return PV * Math.pow(1+r/100, n);
	}
	public static void main(String[] args) {
		System.out.println(fund(100,10,2));
	}
}
