package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

//เขียนโปรแกรมสร้าง empty array และรับอินพุต 3 ตัวที่เป็นสายอักขระ (str1,str2,str3) จากนั้นให้ทำการเพิ่มสายอักขระทั้ง 3 ไปเป็นสมาชิกใน array สุดท้ายให้พิมพ์ array ออกมา
public class Ex053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array1 = new ArrayList<String>();
		System.out.print("Input String1: ");
		String str1 = sc.next();
		System.out.print("Input String2: ");
		String str2 = sc.next();
		System.out.print("Input String3: ");
		String str3 = sc.next();
		array1.add(str1);
		array1.add(str2);
		array1.add(str3);
		System.out.println(array1);
		sc.close();
	}
}
