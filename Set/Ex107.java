package Set;

import java.util.Arrays;
import java.util.HashSet;

//กำหนดให้ set1 = [1,2,3,4,5] และ set2 = [3,4,5,6] เขียนโปรแกรมพิมพ์ผลลัพธ์ที่เกิดจากการ intersection ระหว่าง set1 และ set2 ออกมา
public class Ex107 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,4,5,6));
		set1.retainAll(set2);
		System.out.println(set1);
	}
}
