package Problem;

import java.util.Arrays;
import java.util.ArrayList;

//กำหนดให้ array1 = ['a','b','c','d','e','f'] เขียนโปรแกรมสร้าง array ที่มีสมาชิกเหมือนกับ array1 จากนั้นให้พิมพ์ array ที่สร้างออกมา
public class Ex060 {
	public static void main(String[] args) {
		ArrayList<Character> array1 = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f'));
		System.out.println(array1);
	}
}
