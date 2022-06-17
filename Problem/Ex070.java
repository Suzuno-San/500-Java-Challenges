package Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็ม(n) จากนั้นให้ผู้ใช้งานกรอกข้อมูลเพื่อสร้าง array1 และ array2 ความยาว n ที่สมาชิกทุกตัวเป็นสายอักขระและจำนวนเต็มตามลำดับ
สุดท้ายให้สร้าง map ที่มี key เป็นสมาชิกใน array1 และ value เป็นสมาชิกใน array2 ใน index ที่ตรงกันและพิมพ์ค่า map ที่สร้างออกมา*/
public class Ex070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		System.out.print("Input n: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Input String: ");
			String str1 = sc.next();
			array1.add(str1);
		}
		for(int i=0;i<n;i++) {
			System.out.print("Input Integer: ");
			int int1 = sc.nextInt();
			array2.add(int1);
		}
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		for(int i=0;i<n;i++) {
			map1.put(array1.get(i), array2.get(i));
		}
		System.out.println(map1);
		sc.close();
	}
}
