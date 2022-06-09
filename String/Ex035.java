package String;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ ให้ทำการแทนที่อักขระ "a" ด้วย "A" จากนั้นให้พิมพ์สายอักขระที่ผ่านการดำเนินการออกมา
public class Ex035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str = sc.next();
		System.out.println(str.replace("a", "A"));
		sc.close();
	}
}
