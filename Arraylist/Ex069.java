package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array1 = [1,2,3,1,2,3] แล้วพิมพ์ความยาวของ array1 ออกมา
public class Ex069 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3));
		System.out.println(array1.size());
	}
}
