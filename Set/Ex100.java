package Set;

import java.util.Arrays;
import java.util.HashSet;

//กำหนดให้ set1 = [1,2,3,4,5,6] เขียนโปรแกรมเพิ่ม 1 ไปเป็นสมาชิกใน set1 จากนั้นให้พิมพ์ set1 ออกมา
public class Ex100 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
		set1.add(1);
		System.out.println(set1);
	}
}