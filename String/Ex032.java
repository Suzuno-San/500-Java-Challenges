package String;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวสายอักขระ ให้ทำการพิมพ์ค่าความยาวของสายอักขระออกมา
public class Ex032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str = sc.next();
		System.out.println(str.length());
		sc.close();
	}
}
