package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//เขียนฟังก์ชันเพื่อหาค่าเฉลี่ย, มัธยฐาน และฐานนิยม จากนั้นให้ return ผลลัพธ์ทั้ง 3 ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ arrayA ที่มีสมาชิกเป็นจำนวนเต็ม
public class Ex032 {
	static double findMean(ArrayList<Integer> arrayA) {
		double sum = 0;
		for(int i=0;i<arrayA.size();i++) {
			sum += arrayA.get(i);
		}
		return sum/arrayA.size();
	}
	static double findMedian(ArrayList<Integer> arrayA) {
		Collections.sort(arrayA);
		if(arrayA.size()%2==0) {
			return (arrayA.get((arrayA.size()-1)/2)+arrayA.get(arrayA.size()/2))/2.0;
		}
		else {
			return arrayA.get(arrayA.size()/2);
		}
	}
	static double findMode(ArrayList<Integer> arrayA) {
		HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
		for(int i: arrayA) {
			if(count.containsKey(i)) {
				count.put(i, count.get(i)+1);
			}
			else {
				count.put(i, 1);
			}
		}
		int mode = -1;
		int freq = -1;
		for(HashMap.Entry<Integer,Integer> entry : count.entrySet()) {
			if(entry.getValue()>freq) {
				mode = entry.getKey();
				freq = entry.getValue();
			}
		}
		return mode;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,8,9));
		System.out.println("average = "+findMean(array1));
		System.out.println("Median = "+findMedian(array1));
		System.out.println("Mode = "+findMode(array1));
	}
}

//median = (arrayA.get(arrayA.size()/2)+arrayA.get(arrayA.size()/2-1))/2;
