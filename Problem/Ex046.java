package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*กำหนดให้ array4 = ['a','b','c','d','e','f'] เขียนโปรแกรมรับ index และ element ที่่จะแทรกใน array จำนวน 3 ครั้งโดยใช้ for loop 
โดยมีเงื่อนไขว่าจะทำการแทรกก็ต่อเมื่อ element ยังไม่เป็นสมาชิกของ array4 เท่านั้น จากนั้นให้พิมพ์ค่า array4 ที่ผ่านกระบวนการดังกล่าวออกมา*/
public class Ex046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> array4 = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f'));
		for(int i=1;i<=3;i++) {
			System.out.print("Input Index: ");
			int index = sc.nextInt();
			System.out.print("Input Element: ");
			char element = sc.next().charAt(0);
			if(!array4.contains(element)) {
				array4.add(index, element);
			}
			System.out.println(array4);
		}
		sc.close();
	}
}
