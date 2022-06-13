package Problem;

//เขียนโปรแกรมนับจำนวนทั้งหมดที่หารด้วย 3 ลงตัว ซึ่งอยู่ระหว่าง 0 และ 999 จากนั้นให้พิมพ์ออกมา
public class Ex009 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1;i<=999;i++) {
			if(i%3==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
