package Problem;

import java.util.HashMap;
import java.util.Scanner;

/*สร้าง emply map(map1) แล้วเขียนโปรแกรมรับอินพุตที่เป็นสายอักขระจากนั้นให้ทำการรับค่าจนกว่าความยาวของ map1 จะเท่ากับ 3 โดยให้ตรวจสอบว่าสายอักขระที่รับมาเป็นหนึ่งใน key ของ map1 หรือไม่
* ถ้าเป็น ให้ลบ key นั้น
* ถ้าไม่เป็น ให้สร้าง key ชื่อเดียวกันกับสายอักขระที่รับมา จากนั้นรับอินพุตที่เป็นจำนวนเต็มเพื่อมาเป็น value*/
public class Ex079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		while(map1.size()<3) {
			System.out.print("Input Key(String): ");
			String key = sc.next();
			if(map1.containsKey(key)) {
				map1.remove(key);
				System.out.println(map1);
			}
			else {
				System.out.print("Input Value(Integer): ");
				int value = sc.nextInt();
				map1.put(key, value);
				System.out.println(map1);
			}
		}
		System.out.println(map1);
		sc.close();
	}
}
