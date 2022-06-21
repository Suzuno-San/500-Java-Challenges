package Function;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนฟังชันเพื่อยกกำลังสองสมาชิกทุกตัวใน array และ return array ที่เป็นผลลัพธ์จากการยกกำลังสองออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ arrayA ที่มีสมาชิกเป็นจำนวนเต็ม
public class Ex004 {
	static ArrayList<Integer>squareList(ArrayList<Integer> arrayA){
		ArrayList<Integer> square = new ArrayList<Integer>();
		for(int i : arrayA) {
			square.add(i * i);
		}
		return square;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(squareList(array1));
	}
}
