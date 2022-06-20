package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*กำหนดให้ array1 = ['t','u','r','i','n','g'] และ array2 = ['n','e','w','t','o','n'] เขียนโปรแกรมสร้าง set1 และ set2
โดยที่ set1 มีสมาชิกเป็น index เลขคู่ของ array1 และ set2 มีสมาชิกเป็น index เลขคี่ของ array2 จากนั้นให้พิมพ์ค่า set1 และ set2 ออกมา*/
public class Ex084 {
	public static void main(String[] args) {
		ArrayList<Character> array1 = new ArrayList<Character>(Arrays.asList('t','u','r','i','n','g'));
		ArrayList<Character> array2 = new ArrayList<Character>(Arrays.asList('n','e','w','t','o','n'));
		HashSet<Character> set1 = new HashSet<Character>();
		HashSet<Character> set2 = new HashSet<Character>();
		for(int i=0;i<array1.size();i++) {
			if(i%2==0) {
				set1.add(array1.get(i));
			}
		}
		for(int i=0;i<array2.size();i++) {
			if(i%2!=0) {
				set2.add(array2.get(i));
			}
		}
		System.out.println(set1);
		System.out.println(set2);
	}
}
