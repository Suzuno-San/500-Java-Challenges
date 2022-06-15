package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//กำหนดให้ vowel = ['a','e','i','o','u'] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ(str1) ให้แทนที่ค่าอักขระในตำแหน่งที่สมาชิกใน vowel ปรากฎด้วย '*' จากนั้นให้พิมพ์สายอักขระที่ผ่านกระบวนการดังกล่าวออกมา
public class Ex026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> vowel = new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
		System.out.print("Input Stirng: ");
		String str = sc.next();
		for(String i : vowel) {
			str = str.replace(i, "*");
		}
		System.out.println(str);
		sc.close();
	}
}
