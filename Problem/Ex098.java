package Problem;

import java.util.HashMap;
import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนจริงโดยใช้ for loop จากนั้นให้สร้าง map ที่มี key เป็นจำนวนจริงที่รับมา(ที่แตกต่างกัน) และ value เป็นจำนวนครั้งที่จำนวนนั้นๆปรากฎ สุดท้ายให้พิมพ์ map ที่สร้างออกมา
public class Ex098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Double,Integer> map1 = new HashMap<Double,Integer>();
		for(int i=1;i<=5;i++) {
			System.out.print("Input numeric: ");
			double num1 = sc.nextDouble();
			if(map1.containsKey(num1)) {
				map1.put(num1, map1.get(num1)+1);
			}
			else {
				map1.put(num1, 1);
			}
		}
		System.out.println(map1);
		sc.close();
	}
}
