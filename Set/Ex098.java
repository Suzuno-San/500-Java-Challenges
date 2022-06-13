package Set;

import java.util.Arrays;
import java.util.HashSet;

//กำหนดให้ set1 = [1,2,3,4,5,6] เขียนโปรแกรมพิมพ์สมาชิกทุกตัวใน set1 ออกมา
public class Ex098 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
		for(Integer i : set1) {
			System.out.println(i);
		}
	}
}
