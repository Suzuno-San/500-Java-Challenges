package Function;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนฟังก์ชัน reshape matrix จาก 1D ไปเป็น 2D กำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ arrayA และ array 2 มิติ เพื่อบอก shape ใหม่
public class Ex045 {
	static ArrayList<ArrayList<Integer>> reshape(ArrayList<Integer> arrayA, int row, int col){
		ArrayList<ArrayList<Integer>> matrixA = new ArrayList<ArrayList<Integer>>();
		int i=0;
		for(int r=0;r<row;r++) {
			matrixA.add(new ArrayList<Integer>());
			for(int c=0;c<col;c++) {
				matrixA.get(r).add(arrayA.get(i));
				i++;
			}
		}
		return matrixA;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
		System.out.println(reshape(array1,4,3));
	}
}
