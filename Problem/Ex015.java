package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็มบวก หลังจากนั้นให้นับจำนวนเต็มบวกที่หารจำนวนที่รับมาลงตัวและพิมพ์ออกมา
public class Ex015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Input Integer: ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
