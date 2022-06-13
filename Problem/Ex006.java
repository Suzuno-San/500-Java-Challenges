package Problem;

//เขียนโปรแกรมพิมพ์จำนวนที่หารด้วย 3 หรือ 5 ลงตัวเพียงตัวใดตัวหนึ่ง ซึ่งอยู่ระหว่าง 0 และ 99
public class Ex006 {
	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			if(i%3==0 && i%5 != 0) {
				System.out.println(i);
			}
			if(i%5==0 && i%3!=0) {
				System.out.println(i);
			}
		}
	}
}
