package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array1 = [0,1,2,3,4,5] เขียนโปรแกรมเพื่อพิมพ์สมาชิกที่ index เป็น -3 ออกมา
public class Ex042 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		System.out.println(array1.get(array1.size()-3));
	}
}
