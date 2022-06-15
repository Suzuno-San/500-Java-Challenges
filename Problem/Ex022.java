package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นสายอักขระโดยใช้ for loop จากนั้นให้นับความยาวรวมของสายอักขระที่รับและพิมพ์ออกมา
public class Ex022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i=1;i<=5;i++) {
			System.out.print("Input String: ");
			String str = sc.next();
			count += str.length();
		}
		System.out.println(count);
		sc.close();
	}
}
