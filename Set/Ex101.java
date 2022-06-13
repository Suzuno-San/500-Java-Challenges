package Set;

import java.util.HashSet;
import java.util.Scanner;

//เขียนโปรแกรมสร้าง empty set และรับอินพุต 3 ตัวที่เป็นสายอักขระ (str1,str2,str3) จากนั้นให้ทำการเพิ่มสายอักขระทั้น 3 ไปเป็นสมาชิกใน set สุดท้ายให้พิมพ์ set ออกมา
public class Ex101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set1 = new HashSet<String>();
		System.out.print("Input String1: ");
		String str1 = sc.next();
		System.out.print("Input String2: ");
		String str2 = sc.next();
		System.out.print("Input String3: ");
		String str3 = sc.next();
		set1.add(str1);
		set1.add(str2);
		set1.add(str3);
		System.out.println(set1);
		sc.close();
	}
}
