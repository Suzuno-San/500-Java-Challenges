package Function;

import java.util.ArrayList;
import java.util.Arrays;

/*เขียนฟังก์ชันเพื่อหาผลบวก และผลคูณใน index ที่ตรงกันของ 2 array และ return ผลลัพธ์ทั้ง 2 ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ arrayA และ arrayB ที่มีสมาชิกเป็นจำนวนเต็ม*/
public class Ex038 {
	public static ArrayList<Integer> plus(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB){
		ArrayList<Integer>	result = new ArrayList<Integer>();
		for(int i=0;i<arrayA.size();i++) {
			result.add(arrayA.get(i)+arrayB.get(i));
		}
		return result;
	}
	public static ArrayList<Integer> cross(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<arrayA.size();i++) {
			result.add(arrayA.get(i)*arrayB.get(i));
		}
		return result;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(6,7,8));
		System.out.println(plus(array1,array2));
		System.out.println(cross(array1,array2));
	}
}
