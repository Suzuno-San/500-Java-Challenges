package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็มบวก หลังจากนั้นให้ทำการตรวจสอบว่า มีจำนวนเต็มบวกตัวใดบ้างที่หารจำนวนที่รับมาลงตัวและพิมพ์จำนวนเหล่านั้นออกมา
public class Ex014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Integer: ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
