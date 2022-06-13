package Problem;

//เขียนโปรแกรมพิมพ์จำนวนที่หารด้วย 3 ลงตัว ซึ่งอยู่ระหว่าง 0 และ 99
public class Ex001 {
	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}
