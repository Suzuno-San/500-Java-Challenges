package Array;

import java.util.Arrays;

//เขียนโปรแกรมสร้าง array ที่มีสมาชิกเป็น "America","Brazil","China","Domimmican","Egypt" ตามลำดับ จากนั้นให้ทำการพิมพ์ค่าและชนิดข้อมูลของ array ที่สร้างออกมา
public class Ex071 {
	public static void main(String[] args) {
		String[] array1 = {"America","Brazil","China","Domimmican","Egypt"};
		System.out.println(Arrays.toString(array1));
		System.out.println(array1.getClass().getSimpleName());
	}
}
