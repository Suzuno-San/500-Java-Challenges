package Function;

/*เขียนฟังก์ชัน Calculator(a,b,op) โดยรับ parameter 3 ตัว ได้แก่ a, b ซื่งเป็นจำนวนเต็ม และ op ซึ่งเป็นสายอักขระที่เป็นไปได้ 4 แบบ คือ '+','-','*','/'
 * ถ้า op เป็น '+' ให้ return a+b
 * ถ้า op เป็น '-' ให้ return a-b
 * ถ้า op เป็น '*' ให้ return a*b
 * ถ้า op เป็น '/' ให้ return a/b*/
public class Ex022 {
	public static double Calculator(int a, int b, char op) {
		double result = 0;
		if(op == '+') {
			result = a+b;
		}
		else if(op == '-') {
			result = a-b;
		}
		else if(op == '*') {
			result = a*b;
		}
		else if(op == '/'){
			result = a/b;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Calculator(6,2,'*'));
	}
}
