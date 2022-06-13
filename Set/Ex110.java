package Set;

import java.util.Arrays;
import java.util.HashSet;

//กำหนดให้ set1 = [1,2,3,4,5] และ set2 = [3,4,5,6] เขียนโปรแกรมพิมพ์ผลลัพธ์ที่เกิดจากการ symmetric difference ระหว่าง set1 และ set2 ออกมา
public class Ex110 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,4,5,6));
		HashSet<Integer> set1minusset2 = new HashSet<Integer>(set1);
		set1minusset2.removeAll(set2);
		HashSet<Integer> set2minusset1 = new HashSet<Integer>(set2);
		set2minusset1.removeAll(set1);
		HashSet<Integer> symmetricdifference = new HashSet<Integer>(set1minusset2);
		symmetricdifference.addAll(set2minusset1);
		System.out.println(symmetricdifference);
	}
}
