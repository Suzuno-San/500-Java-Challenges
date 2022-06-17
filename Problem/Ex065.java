package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*กำหนดให้ array1 = [1,2,3,...,10] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็มและให้ทำการตรวจสอบว่าจำนวนที่รับมาเป็นสมาชิกของ array1 หรือไม่
 * ถ้าเป็น ให้พิมพ์ "yes"
 * ถ้าไม่เป็น ให้พิมพ์ "No"*/
public class Ex065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.print("Input Integer: ");
		int int1 = sc.nextInt();
		if(array1.contains(int1)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}
}
