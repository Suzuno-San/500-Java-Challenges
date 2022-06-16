package Problem;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

//กำหนดให้ array2 = ['a','l','l','i','g','a','t','o','r'] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ ให้ตรวจสอบว่าสายอักขระที่รับมามีค่าตรงกับสมาชิกตำแหน่งใดใน array2 และพิมพ์ออกมา
public class Ex040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> array2 = new ArrayList<Character>(Arrays.asList('a','l','l','i','g','a','t','o','r'));
		System.out.print("Input Character: ");
		char char1 = sc.next().charAt(0);
		for(int i=0;i<array2.size();i++) {
			if(array2.get(i)==char1) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
