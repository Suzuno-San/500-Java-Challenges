package Function;

import java.util.ArrayList;
import java.util.Arrays;

/*เขียนฟังก์ชันเพื่อลบสายอักขระที่มีความยาวเกินกว่าค่าที่กำหนดออกจากจาก array และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ arrayA ที่มีสมาชิกเป็นสายอักขระ และ n ที่เป็นจำนวนเต็ม*/
public class Ex043 {
	public static ArrayList<String> lengthStr(ArrayList<String> arrayA, int n){
		for(int i=0;i<arrayA.size();i++) {
			if(arrayA.get(i).length()>n) {
				arrayA.remove(i);
			}
		}
		return arrayA;
	}
	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("name","n","me"));
		System.out.println(lengthStr(array1,2));
	}
}
