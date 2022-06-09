package String;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ ให้ทำการตรวจสอบสายอักขระที่รับมาว่ามี "a" หรือไม่ จากนั้นให้พิมพ์ค่าความจริงออกมา
public class Ex033 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str = sc.next();
		System.out.println(str.contains("a"));
		sc.close();
	}
}
