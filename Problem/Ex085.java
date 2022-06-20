package Problem;

import java.util.Arrays;
import java.util.HashSet;

//จากผลลัพธ์ข้อ 84 ให้นำ set1 และ set2 มา union กัน จากนั้นให้พิมพ์ผลลัพธ์ออกมา
public class Ex085 {
	public static void main(String[] args) {
		HashSet<Character> set1 = new HashSet<Character>(Arrays.asList('r','t','n'));
		HashSet<Character> set2 = new HashSet<Character>(Arrays.asList('t','e','n'));
		set1.addAll(set2);
		System.out.println(set1);
	}
}
