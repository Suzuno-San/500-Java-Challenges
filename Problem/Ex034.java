package Problem;

import java.util.ArrayList;
import java.util.Scanner;

/*เขียนโปรแกรมสร้าง empty array (array1) และรับอินพุต 5 ตัวที่เป็นจำนวนเต็มโดยใช้ for loop และให้ตรวจสอบว่า จำนวนที่รับยังไม่เป็นสมาชิกของ array1 หรือไม่
-ถ้ายังไม่เป็นสมาชิก ให้ add จำนวนนั้นเข้าไปใน array1 
-ถ้าเป็นสมาชิกอยู่แล้ว ไม่ดำเนินการใดๆ*/
public class Ex034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		for(int i=1;i<=5;i++) {
			System.out.print("Input Integer: ");
			int int1 = sc.nextInt();
			if(!array1.contains(int1)) {
				array1.add(int1);
			}
		}
		System.out.println(array1);
		sc.close();
	}
}
