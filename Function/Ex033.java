package Function;

/*เขียนฟังก์เพื่อตรวจสอบจำนวนเฉพาะ
 * ถ้าเป็นจำนวนเฉพาะ ให้ return true
 * ถ้าไม่เป็นจำนวนเฉพาะ ให้ return false
กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ num ที่เป็นจำนวนเต็มบวก*/
public class Ex033 {
	public static boolean primeNum(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(primeNum(7));
	}
}

//or
//public class Ex033 {
//	static boolean isPrime(int num) {
//		if(num<=1) {
//			return false;
//		}
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				return false;
//			}
//		}
//		return true;
//	}
//	public static void main(String[] args) {
//		System.out.println(isPrime(11));
//	}
//}


