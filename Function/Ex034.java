package Function;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนฟังก์ชันเพื่อตรวจสอบความเป็นจำนวนเฉพาะของสมาชิกทุกตัวใน array และ retrun array ที่เป็นผลลัพธ์จากการตรวจสอบออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ arrayA ที่มีสมาชิกเป็นจำนวนเต็ม
public class Ex034 {
	public static ArrayList<Boolean> primeNum(ArrayList<Integer>arrayA){
		ArrayList<Boolean> primeCheck = new ArrayList<Boolean>();
		for(int i=0;i<arrayA.size();i++) {
			int count = 0;
			for(int j=1;j<=arrayA.get(i);j++) {
				if(arrayA.get(i)%j==0) {
					count++;
				}
			}
			if(count == 2) {
				primeCheck.add(true);
			}
			else {
				primeCheck.add(false);
			}
		}
		return primeCheck;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(primeNum(array1));
	}
}
