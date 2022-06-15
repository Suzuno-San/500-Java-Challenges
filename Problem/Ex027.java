package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ(str1) จากนั้นให้สร้างสายอักขระถอยหลังของอินพุตที่รับและพิมพ์ออกมา
public class Ex027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str1 = sc.next();
		String str2 = "";
		for(int i=str1.length()-1;i>=0;i--) {
			str2 += str1.charAt(i);
		}
		System.out.println(str2);
		sc.close();
	}
}
