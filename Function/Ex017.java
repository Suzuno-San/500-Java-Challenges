package Function;

/*เขียนฟังก์ชันกบกระโดด โดยรับ parameter 2 ตัว ได้แก่ d ซึ่งเป็นระยะทางที่กบต้องการกระโดด และ s ซึ่งเป็นระยะที่กระโดดได้ 1 ครั้งของกบ 
ให้ return จำนวนครั้งน้อยที่สุดที่กบต้องกระโดดเพื่อเดินทางให้ได้มากกว่าหรือเท่ากับ d*/
public class Ex017 {
	public static double frogJump(int d ,int s) {
		return Math.ceil(d/s);
	}
	public static void main(String[] args) {
		System.out.println(frogJump(100,3));
	}
}
