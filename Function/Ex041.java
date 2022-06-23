package Function;

/*เขียนฟังก์ชันเพื่อตรวจสอบด้านประกอบของสามเหลี่ยม โดยรับ parameter 3 ตัว ได้แก่ a,b,c ซึ่งเป็นจำนวนบวก ที่เป็นความยาวด้านทั้ง 3 ของสามเหลี่ยมให้ตรวจสอบว่า a,b,c สามารถเป็นความยาวด้านของสามเหลี่ยมได้หรือไม่
 * ถ้าได้ ให้ return true
 * ถ้าไม่ได้ ให้ return false*/
public class Ex041 {
	static boolean check(int a, int b, int c) {
		if(a+b>c && a+c>b && b+c>a) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(check(5,3,4));
	}
}
