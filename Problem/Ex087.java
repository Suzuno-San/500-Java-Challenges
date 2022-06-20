package Problem;

import java.util.HashSet;
import java.util.Scanner;

//เขียนโปรแกรมรับอินพุตที่เป็นสายอักขระเพื่อสร้าง set1 และ set2 ที่มีสมาชิก 3 ตัว จากนั้นให้หา set1 - set2 และ set2 - set1 สุดท้ายให้พิมพ์ผลลัพธ์ออกมา
public class Ex087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		while(set1.size()!=3) {
			System.out.print("Input Set1: ");
			String str1 = sc.next();
			set1.add(str1);
		}
		while(set2.size()!=3) {
			System.out.print("Input Set2: ");
			String str2 = sc.next();
			set2.add(str2);
		}
		HashSet<String> set1subtract2 = new HashSet<String>(set1);
		HashSet<String> set2subtract1 = new HashSet<String>(set2);
		set1subtract2.removeAll(set2);
		System.out.println("set1 - set2 : "+set1subtract2);
		set2subtract1.removeAll(set1);
		System.out.println("set2 - set1 : "+set2subtract1);
		sc.close();
	}
}
