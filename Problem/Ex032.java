package Problem;

import java.util.ArrayList;

//เขียนโปรแกรมสร้าง empty array และ add ค่า 0, 1, 2, ..., 19 ลงไปใน array นั้น หลังจากนั้นให้พิมพ์ค่า array ที่สร้างออกมา
public class Ex032 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		for(int i=0;i<=19;i++) {
			array1.add(i);
		}
		System.out.println(array1);
	}
}
