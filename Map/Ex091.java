package Map;

import java.util.HashMap;
import java.util.Scanner;

//เขียนโปรแกรมสร้าง empty map และรับอินพุต 2 ตัวที่เป็นสายอักขระ(str1,str2) โดยให้ str1 เป็น key และ str2 เป็น value หลังจากนั้นให้พิมพ์ map ออกมา
public class Ex091 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map1 = new HashMap<String,String>();
		System.out.print("Input key<String>: ");
		String str1 = sc.next();
		System.out.print("Input value<String>: ");
		String str2 = sc.next();
		map1.put(str1, str2);
		System.out.println(map1);
		sc.close();
	}
}
