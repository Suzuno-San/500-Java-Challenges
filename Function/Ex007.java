package Function;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนฟังก์ชันเพื่อหาผลบวกของจำนวนจริงที่เป็นสมาชิกใน array และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ arrayA ที่มีสมาชิกเป็นจำนวนจริง
public class Ex007 {
	public static Double sumList(ArrayList<Double> arrayA) {
		Double sum = 0.0;
		for(Double i : arrayA) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList<Double> array1 = new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0,5.0));
		System.out.println(sumList(array1));
	}
}
