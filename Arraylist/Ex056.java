package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//กำหนดให้ array4 = [0,4,2,3,1] เขียนโปรแกรมเพื่อเรียงลำดับข้อมูลใน array4 จากน้อยไปมาก หลังจากนั้นพิมพ์ array4 ออกมา
public class Ex056 {
	public static void main(String[] args) {
		ArrayList<Integer> array4 = new ArrayList<Integer>(Arrays.asList(0,4,2,3,1));
		Collections.sort(array4);
		System.out.println(array4);
	}

}
