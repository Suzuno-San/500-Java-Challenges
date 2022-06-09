package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array1 = [1,2,3,1,2,3] เขียนโปรแกรมลบสมาชิกใน index ที่ 1 ออกจาก array1 หลังจากนั้นให้พิมพ์ array1 ออกมา
public class Ex064 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3));
		array1.remove(1);
//		array1.remove(array1.size()-5); or
		System.out.println(array1);
	}
}
