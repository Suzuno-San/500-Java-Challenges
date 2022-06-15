package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 2 ตัวที่เป็นสายอักขระ(str1,char1) ให้ตรวจสอบความยาวของ char1 ว่าเป็น 1 หรือไม่
public class Ex023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str1 = sc.next();
		System.out.print("Input Character: ");
		String char1 = sc.next();
		if(char1.length()==1) {
			for(int i=0;i<str1.length();i++) {
				if(char1.charAt(0)==str1.charAt(i)) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}
}
