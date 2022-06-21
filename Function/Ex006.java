package Function;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนฟังก์ชันเพื่อหาผลบวกของจำนวนเต็มที่เป็นสมาชิกใน array และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ arrayA ที่มีสมาชิกเป็นจำนวนเต็ม
public class Ex006 {
	public static int sumList(ArrayList<Integer> arrayA) {
		int sum = 0;
		for(int i : arrayA) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.print(sumList(array1));
	}
}
