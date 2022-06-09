package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

////กำหนดให้ array2 = ["ant","bird","cat","dog","eagle"] เขียนโปรแกรมเพื่อเปลี่ยนค่าสมาชิกใน index ที่ 3 เป็น "duck" หลังจากนั้นให้พิมพ์ array2 ออกมา
public class Ex050 {
	public static void main(String[] args) {
		ArrayList<String> array2 = new ArrayList<String>(Arrays.asList("ant","bird","cat","dog","eagle"));
		array2.set(3, "duck");
		System.out.println(array2);
	}
}
