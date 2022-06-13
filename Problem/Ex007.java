package Problem;

//เขียนโปรแกรมพิมพ์จำนวนที่หารด้วย 3 และ 5 ลงตัว แต่หารด้วย 2 ไม่ลงตัวอยู่ระหว่าง 0 และ 99
public class Ex007 {
	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			if((i%3==0 && i%5==0)&&i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
