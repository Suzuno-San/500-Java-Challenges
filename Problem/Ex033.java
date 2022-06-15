package Problem;

import java.util.ArrayList;

//เขียนโปรแกรมสร้าง empty array และ add ค่า 99,98,97,...,80 ลงไป array นั้น หลังจากนั้นให้พิมพ์ค่า array ที่สร้างออกมา
public class Ex033 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		for(int i=99;i>=80;i--) {
			array1.add(i);
		}
		System.out.println(array1);
	}
}
