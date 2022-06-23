package Function;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนฟังก์ชันเพื่อหาค่าต่ำสุด และค่าสูงสุด ให้ return ผลลัพธ์ทั้ง 2 ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ arrayA ที่มีสมาชิกเป็นจำนวนเต็ม
public class Ex031 {
	public static int min,max;
	static void MaxMin(ArrayList<Integer> arrayA){
		min = arrayA.get(0);
		max = arrayA.get(0);
		for(int i : arrayA) {
			if(i<min) {
				min = i;
			}
			if(i>max) {
				max = i;
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		MaxMin(array1);
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);
	}
}
