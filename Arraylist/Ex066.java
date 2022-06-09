package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array1 = [1,2,3,1,2,3] เขียนโปรแกรมลบ 1 ตัวแรกออกจาก array1 หลังจากนั้นให้พิมพ์ array1 ออกมา
public class Ex066 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3));
		array1.remove(Integer.valueOf(1));
		System.out.println(array1);
	}
}
