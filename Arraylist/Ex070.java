package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//กำหนดให้ array1 = [1,2,3,4,5] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็ม ให้ทำการตรวจสอบว่า numeric1 เป็นสมาชิกใน array1 หรือไม่ จากนั้นพิมพ์ค่าออกมา
public class Ex070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.print("Input Integer: ");
		int num = sc.nextInt();
		System.out.println(array1.contains(num));
		sc.close();
	}
}
