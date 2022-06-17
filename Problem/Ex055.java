package Problem;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/*กำหนดให้ array1 = [1,2,3,...,10] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็ม และตรวจสอบว่าจำนวนที่รับมาเป็นสมาชิกใน array1 หรือไม่
 * ถ้าเป็นให้ทำการลบสมาชิก
 * ถ้าไม่เป็นไม่ดำเนินการใดๆ 
 กระบวนการนี้จะดำเนินไปเรื่อย จนกว่าความยาวของ array1 จะเท่ากับ 7 จากนั้นพิมพ์ค่า array1 ออกมา*/ 
public class Ex055 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		while(array1.size()>7) {
			System.out.print("Input Integer: ");
			int int1 = sc.nextInt();
			if(array1.contains(int1)) {
				array1.remove(Integer.valueOf(int1));
			}
			System.out.println(array1+" size = "+array1.size());
		}
		sc.close();
	}
}
