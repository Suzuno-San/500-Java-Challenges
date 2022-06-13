package Problem;

//เขียนโปรแกรมพิมพ์จำนวนที่หารด้วย 3 และ 5 ลงตัว ซื่งอยู่ระหว่าง 0 และ 99
public class Ex002 {
	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
}
