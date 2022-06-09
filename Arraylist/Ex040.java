package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนโปรแกรมสร้าง array ที่มีสมาชิกเป็น 0,1,2,3,4,5 ตามลำดับ จากนั้นให้ทำการพิมพ์ค่าและชนิดข้อมูลของ array ที่สร้างออกมา
public class Ex040 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		System.out.println(arr);
	}
}
