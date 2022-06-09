package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array1 = [1,2,3,1,2,3] เขียนโปรแกรมลบสมาชิกทุกตัวออกจาก array1 หลังจากนั้นให้พิมพ์ array1 ออกมา
public class Ex068 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3));
		array1.clear();
//		array1.removeAll(array1); or 
		System.out.println(array1);
	}
}
