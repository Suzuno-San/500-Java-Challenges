package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array1 = [0,1,2,3,4,5] เขียนโปรแกรมเพื่อพิมพ์ 4 ออกมาโดยอ้างอิงตำแหน่งจาก array1 
public class Ex044 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		System.out.println(array1.get(4));
		System.out.println(array1.get(array1.size()-2));	//or
	}
}
