package Function;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนฟังก์ชันเพื่อหาความยาวรวมของสายอักขระที่เป็นสมาชิกใน array และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ arrayA ที่มีสมาชิกเป็นสายอักขระ
public class Ex012 {
	public static int lengthArray(ArrayList<String> arrayA) {
		return arrayA.size();
	}
	
	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		System.out.println(lengthArray(array1));
	}
}
