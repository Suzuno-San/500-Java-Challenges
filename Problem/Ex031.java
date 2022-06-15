package Problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ จากนั้นเป็นสายอักขระ จากนั้นให้ทำการหาอักขระที่แตกต่างกันทั้งหมดพร้อมทั้งจำนวนครั้งที่อักขระนั้นๆ ปรากฎและพิมพ์ออกมา
public class Ex031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str1 = sc.next();
		HashSet<Character> set1 = new HashSet<Character>(str1.chars().mapToObj(e -> (char)e).collect(Collectors.toList()));
		for(char i : set1) {
			int count = (int)str1.chars().filter(ch -> ch == i).count();
			System.out.println(i+" "+count);
		}
		sc.close();
	}
}
