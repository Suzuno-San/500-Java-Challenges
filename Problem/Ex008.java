package Problem;

//เขียนโปรแกรมพิมพ์จำนวนที่หารด้วย 3 หรือ 5 ลงตัว แต่หารด้วย 2 ไม่ลงตัวซึ่งอยู่ระหว่าง 0 และ 99
public class Ex008 {
	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			if((i%3==0 || i%5==0)&&i%2 != 0) {
				System.out.println(i);
			}
		}
	}
}
