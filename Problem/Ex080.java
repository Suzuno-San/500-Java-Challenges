package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//กำหนดให้ array1 = ['a','b','c','d','e','f'] เขียนโปรแกรมสร้าง set ที่มีสมาชิกเหมือนกับ array1 จากนั้นให้พิมพ์ค่า set ที่สร้างออกมา
public class Ex080 {
	public static void main(String[] args) {
		ArrayList<Character> array1 = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f'));
		HashSet<Character> set1 = new HashSet<Character>(array1);
		System.out.println(set1);
	}
}
