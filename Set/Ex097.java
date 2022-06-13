package Set;

import java.util.Arrays;
import java.util.HashSet;

//เขียนโปรแกรมสร้าง set ที่มีสมาชิกเป็น 1,2,3,4,5,6 จากนั้นให้ทำการพิมพ์ค่าและชนิดข้อมูลของ set ออกมา
public class Ex097 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(set1);
		System.out.println(set1.getClass().getSimpleName());
	}
}
