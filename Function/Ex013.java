package Function;

import java.util.ArrayList;
import java.util.Arrays;

/*เขียนฟังก์ชันเพื่อตัดอักขระพิเศษออกจากอักขระ และ return ผลลัพธ์ออกมา(กำหนดให้อักขระพิเศษ คือ !@#\$%,) กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ str1 ที่เป็นสายอักขระ*/
public class Ex013 {
	public static String removeSpecialChar(String str1) {
		ArrayList<String> SpecialChar = new ArrayList<String>(Arrays.asList("!","@","#","\\","$","%"));
		for(String i : SpecialChar) {
			str1 = str1.replace(i, "");
		}
		return str1;
	}
	
	public static void main(String[] args) {
		System.out.println(removeSpecialChar("Bana@naBo#at%"));
	}
}
