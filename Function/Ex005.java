package Function;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนฟังก์ชันเพื่อหาผลบวกกำลังสองของสมาชิกใน array และ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ arrayA ที่มีสมาชิกเป็นจำนวนเต็ม
public class Ex005 {
	public static int sumSquareList(ArrayList<Integer> arrayA){
		int sum = 0;
		for(int i : arrayA) {
			sum += i*i;
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(sumSquareList(array1));
	}
}
