package Problem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/*เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็ม(n) จากนั้นให้ผู้ใช้งานกรอกข้อมูลเพื่อสร้าง array1 และ array2 ความยาว n ที่สมาชิกทุกตัวเป็นสายอักขระและจำนวนเต็มตามลำดับ
สุดท้ายให้สร้าง map โดยมีเงื่อนไขดังนี้
* ถ้า index เป็นเลขคู่ ให้ key เป็นสมาชิกใน array1 และ value เป็นสมาชิกใน array2
* ถ้า index เป็นเลขคี่ ให้ key เป็นสมาชิกใน array2 และ value เป็นสมาชิกใน array1*/
public class Ex071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		System.out.print("Input n : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Input String: ");
			String str1 = sc.next();
			array1.add(str1);
		}
		for(int i=0;i<n;i++) {
			System.out.print("Input Integer: ");
			String int1 = sc.next();
			array2.add(int1);
		}
		HashMap<String,String> map1 = new HashMap<String,String>();
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				map1.put(array1.get(i), array2.get(i));
			}
			else {
				map1.put(array2.get(i), array1.get(i));
			}
		}
		System.out.println(map1);
		sc.close();
	}
}
