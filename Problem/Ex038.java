package Problem;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array1 = [1,2,3,...,10] เขียนโปรแกรมพิมพ์สมาชิกใน array1 ที่มี index เป็นเลขคี่
public class Ex038 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		for(int i=0;i<array1.size();i++) {
			if(i%2!=0) {
				System.out.println(array1.get(i));
			}
		}
	}
}
