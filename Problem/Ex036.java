package Problem;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array1 = [1,2,3,...,10] เขียนโปรแกรมสร้าง array ถอยหลังของ array1 ออกมา
public class Ex036 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> arraybackword = new ArrayList<Integer>();
		for(int i=array1.size();i>0;i--) {
			arraybackword.add(i);
		}
		System.out.println(arraybackword);
	}
}
