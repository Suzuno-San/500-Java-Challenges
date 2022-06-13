package Set;

import java.util.Arrays;
import java.util.HashSet;

//กำหนดให้ set1 = [1,2,3,4,5,6] เขียนโปรแกรมพิมพ์จำนวนสมาชิกใน set1 ออกมา
public class Ex104 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(set1.size());
	}
}
