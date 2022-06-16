package Problem;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/*กำหนดให้ array1 = [1,2,3,...,10] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็มและให้ตรวจสอบว่า จำนวนที่รับมาเป็นสมาชิกของ array1 หรือไม่
-ถ้าเป็นให้ทำการลบจำนวนนั้น -ถ้าไม่เป็นให้เพิ่มจำนวนนั้น*/
public class Ex049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.print("Input Integer: ");
		int int1 = sc.nextInt();
		if(array1.contains(int1)) {
			array1.remove(Integer.valueOf(int1));
		}
		System.out.println(array1);
		sc.close();
	}
}
