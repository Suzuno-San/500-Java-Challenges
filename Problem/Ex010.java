package Problem;

//เขียนโปรแกรมหาผลบวกของจำนวนที่หารด้วย 3 ลงตัว ซึ่งอยู่ระหว่าง 0 และ 999 ว่ามีค่าเท่าไร จากนั้นให้พิมพ์ออกมา
public class Ex010 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=999;i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
