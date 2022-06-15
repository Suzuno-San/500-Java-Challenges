package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นสายอักขระโดยให้ for loop จากนั้นให้ทำการต่อสายอักขระทั้งหมดที่รับและพิมพ์ออกมา
public class Ex028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "";
		for(int i=1;i<=5;i++) {
			System.out.print("Input String"+i+": ");
			String str = sc.next();
			str1 += str;
		}
		System.out.println(str1);
		sc.close();
	}
}
