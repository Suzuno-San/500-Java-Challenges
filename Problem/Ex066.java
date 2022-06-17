package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*กำหนดให้ array1 = [1,2,3,...,10] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็มและให้ทำการตรวจสอบว่าความยาวของ array1 มีค่ามากกว่า,น้อยกว่า หรือเท่ากับจำนวนที่รับมา
 * ถ้ามากกว่า ให้พิมพ์ "greater"
 * ถ้าน้อยกว่า ให้พิมพ์ "lesser"
 * ถ้าเท่ากับ ให้พิมพ์ "equals"*/
public class Ex066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.print("Input Integer: ");
		int int1 = sc.nextInt();
		if(array1.size()>int1) {
			System.out.println("greater");
		}
		else if(array1.size()<int1) {
			System.out.println("lesser");
		}
		else {
			System.out.println("equals");
		}
		sc.close();
	}
}
