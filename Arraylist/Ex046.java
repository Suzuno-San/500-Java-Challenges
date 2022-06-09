package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

////กำหนดให้ array1 = [0,1,2,3,4,5] เขียนโปรแกรมเพื่อพิมพ์ array ที่มีสมาชิกตั้งแต่ index ที่ 1 จนถึง index ที่ -2 ของ array1 ออกมา
public class Ex046 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		System.out.println(array1.subList(1, array1.size()-1));
	}
}
