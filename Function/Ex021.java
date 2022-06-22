package Function;

/*เขียนฟังก์ชันเพื่อหาอัตราผลตอบแทนในรูปแบบในรูป % ต่อปี โดยรับ parameter 3 ตัว ได้แก่
 * เงินทุนเริ่มต้น(PV)
 * เงินลงทุนเมื่อผ่านไป n ปี (FV)
 * จำนวนปีที่ลงทุน (n)
ให้ return ผลตอบแทนในรูป % ต่อปี*/
public class Ex021 {
	public	static double fund(double PV, double FV, int n) {
		return (Math.pow(FV/PV,1.0/n)-1)*100;
	}
	public static void main(String[] args) {
		System.out.println(fund(10000,12000,1));
	}
}
