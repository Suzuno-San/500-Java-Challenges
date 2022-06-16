package Problem;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ arrayx = [0,2,4,6,8] และ array4 = ['a','b','c','d','e','f'] เขียนโปรแกรมแทรก '*' ไปใน array4 ใน index ที่เป็นสมาชิกของ arrayx
public class Ex044 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayx = new ArrayList<Integer>(Arrays.asList(0,2,4,6,8));
		ArrayList<Character> array4 = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f'));
		for(int i : arrayx) {
			array4.add(i, '*');
		}
		System.out.println(array4);
	}
}
