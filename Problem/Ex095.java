package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//กำหนดให้ array1 = [6,5,7,9,8,1,3,5,7,2] เขียนโปรแกรมหามัธยฐานของข้อมูลใน array1
public class Ex095 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(6,5,7,9,8,1,3,5,7,2));
		Collections.sort(array1);
		double median;
		if(array1.size()%2!=0) {
			int pos = (array1.size()-1)/2;
			median = array1.get(pos);
		}
		else {
			int pos = array1.size()/2;
			median = (array1.get(pos-1)+array1.get(pos))/2.0;
		}
		System.out.println(array1);
		System.out.println(median);
	}
}
