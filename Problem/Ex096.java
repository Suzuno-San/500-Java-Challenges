package Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*กำหนดให้ data = {"Brazil"=35000,"China"=24000,"Germary"=42000,"Japan"=53000,"Sweden"=17000} เขียนโปรแกรมหามัธยฐานของข้อมูลใน data*/
public class Ex096 {
	public static void main(String[] args) {
		HashMap<String,Integer> data = new HashMap<String,Integer>();
		data.put("Brazil",35000);
		data.put("China", 24000);
		data.put("Germary", 42000);
		data.put("Japan", 53000);
		data.put("Sweden", 17000);
		ArrayList<Integer> array1 = new ArrayList<Integer>(data.values());
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
		System.out.print(median);
	}
}
