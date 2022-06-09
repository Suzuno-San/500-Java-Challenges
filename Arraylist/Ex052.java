package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

////กำหนดให้ array2 = ["ant","bird","cat","dog","eagle"] เขียนโปรแกรมเพื่อเพื่อ "fish" ไปเป็นสมาชิกตัวสุดท้ายของ array2 หลังจากนั้นให้พิมพ์ array2 ออกมา
public class Ex052 {
	public static void main(String[] args) {
		ArrayList<String> array2 = new ArrayList<String>(Arrays.asList("ant","bird","cat","dog","eagle"));
		array2.add("fish");
		System.out.println(array2);
	}
}
