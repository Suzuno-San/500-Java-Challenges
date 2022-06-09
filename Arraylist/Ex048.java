package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

////กำหนดให้ array1 = [0,1,2,3,4,5] เขียนโปรแกรมเพื่อพิมพ์ [3,4,5] โดยอ้างอิงตำแหน่งจาก array1
public class Ex048 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		System.out.println(array1.subList(3, 6));
		System.out.println(array1.subList(3, array1.size())); //or
		System.out.println(array1.subList(array1.size()-3, 6));	//or
		System.out.println(array1.subList(array1.size()-3, array1.size()));	//or
	}
}
