package Problem;

import java.util.HashMap;

//สร้าง empty map และกำหนด key เป็น 0,1,2,...,9 โดยที่ value มีค่าเป็น 2 เท่าของ key จากนั้นให้พิมพ์ค่า map ที่สร้างออกมา
public class Ex069 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		for(int i=0;i<=9;i++) {
			map1.put(i, i*2);
		}
		System.out.println(map1);
	}
}
