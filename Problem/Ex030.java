package Problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ(str1) จากนั้นให้ทำการหาอักขระที่แตกต่างกันทั้งหมดและพิมพ์ออกมา
public class Ex030 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str1 = sc.next();
		HashSet<Character> set1 = new HashSet<Character>(str1.chars().mapToObj(e -> (char)e).collect(Collectors.toList()));
		System.out.println(set1);
		sc.close();
	}
}
