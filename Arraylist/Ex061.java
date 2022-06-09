package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//กำหนดให้ array7 = ["bird","dog","ant","bear"] เขียนโปรแกรมเพื่อเรียงลำดับข้อมูลใน array7 ตามตัวอักษรแบบถอยหลัง หลังจากนั้นพิมพ์ array7 ออกมา
public class Ex061 {
	public static void main(String[] args) {
		ArrayList<String> array7 = new ArrayList<String>(Arrays.asList("bird","dog","ant","bear"));
		Collections.sort(array7);
		System.out.println(array7);
	}
}
