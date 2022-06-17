package Problem;

import java.util.Arrays;
import java.util.ArrayList;

//กำหนดให้ array1 = [1,2,3,...,10] เขียนโปรแกรมลบสมาชิกที่ index เป็นเลขคี่ จากนั้นให้พิมพ์ค่า array1 ออกมา
public class Ex052 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		for(int i=array1.size()-1;i>=0;i--) {
			if(i%2!=0) {
				array1.remove(i);
			}
		}
		System.out.println(array1);
	}
}
