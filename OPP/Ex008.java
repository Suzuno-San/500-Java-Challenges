package OPP;

import java.util.ArrayList;
import java.util.Arrays;

/*เขียนโปรแกรมสร้าง class ชื่อ stats โดยมี attribute และ method ดังนี้
attribute
 * data เป็น array ที่เก็บจำนวนใดๆ
method
 * mean() ทำหน้าที่คำนวณค่าเฉลี่ยของจำนวนใน data
 * min() ทำหน้าที่คำนวณค่าต่ำสุดของจำนวนใน data
 * max() ทำหน้าที่คำนวณค่าสูงสุดของจำนวนใน data
 * summary ทำหน้าที่แสดงค่า mean, min และ max โดยเมื่อเรียกใช้โปรแกรมจะพิมพ์ Mean:<mean>,Min:<Min>และMax:<max> ออกมา*/
class Stats {
	ArrayList<Integer> data;
	
	public Stats(ArrayList<Integer> data) {
		this.data = data;
	}
	public double mean() {
		double sum = 0;
		for(int i=0;i<data.size();i++) {
			sum += this.data.get(i);
		}
		return sum/this.data.size();
	}
	public int min() {
		int min = this.data.get(0);
		for(int i : this.data) {
			if(i<min) {
				min = i;
			}
		}
		return min;
	}
	public int max() {
		int max = this.data.get(0);
		for(int i : this.data) {
			if(i>max) {
				max = i;
			}
		}
		return max;
	}
	public void summary() {
		System.out.println(this.data);
		System.out.println("Mean : "+this.mean());
		System.out.println("Min : "+this.min());
		System.out.println("Max : "+this.max());
	}
}

public class Ex008 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,11));
		Stats s = new Stats(a);
		s.summary();
	}
}
