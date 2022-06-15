package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//กำหนดให้ vowel = ['a','e','i','o','u'] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ จากนั้นให้ตรวจสอบว่าสายอักขระที่รับมีสมาชิกใน vowel ปรากฎหรือไม่
public class Ex025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> vowel = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
		boolean check = false;
		System.out.print("Input String: ");
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			if(vowel.contains(str.charAt(i)) == true) {
				check = true;
				break;
			}
		}
		if(check == true) {
			System.out.println("There is vowel");
		}
		else {
			System.out.println("There is no vowel");
		}
		sc.close();
	}
}
