package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array1 = [0,1,2] และ array2 = [3,4,5] เขียนโปรแกรมเพื่อนำสมาชิกทั้งหมดของ array2 ไปต่อท้าย array1 จากนั้นให้พิมพ์ array1 และ array2 ออกมา
public class Ex062 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(0,1,2));
		ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(3,4,5));
		array1.addAll(array2);
		System.out.println(array1);
		System.out.println(array2);
	}
}
