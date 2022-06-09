package String;

import java.util.Scanner;

//เขียนโปรแกรมรัยอินพุต 2 ตัวที่เป็นสายอักขระ (str1,str2) ให้ทำการต่อสายอักขระทั้งสอง (โดยนำ str2 ไปต่อหลัง str1) หลังจากนั้นให้พิมพ์ผลลัพธ์ออกมา
//Ex: str1 = "ham" , str2 = "burger" ผลลัพธ์คือ hamburger
public class Ex039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String1: ");
		String str1 = sc.next();
		System.out.print("Input String2: ");
		String str2 = sc.next();
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2)); //or
		sc.close();
	}
}
