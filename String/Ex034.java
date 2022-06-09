package String;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 2 ตัวที่เป็นสายอักขระ (string1, string2) ให้ทำการตรวจ string1 ที่รับมาว่ามี string2 ในนั้นหรือไม่ จากนั้นให้พิมพ์ค่าความจริงออกมา
//Ex: string1 = "happy", string2 = "app" ผลลัพธ์คือ  true
public class Ex034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String1: ");
		String string1 = sc.next();
		System.out.print("Input String2: ");
		String string2 = sc.next();
		System.out.println(string1.contains(string2));
		sc.close();
	}
}
