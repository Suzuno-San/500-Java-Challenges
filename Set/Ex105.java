package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//กำหนดให้ set1 = [1,2,3,4,5,6] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็ม(int1) ให้ทำการตรวจสอบว่า int1 เป็นสมาชิกของ set1 หรือไม่ จากนั้นให้พิมพ์ค่าความจริงออกมา
public class Ex105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.print("Input Integer: ");
		int int1 = sc.nextInt();
		System.out.println(set1.contains(int1));
		sc.close();
	}
}