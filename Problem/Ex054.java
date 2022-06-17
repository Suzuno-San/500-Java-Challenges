package Problem;

import java.util.ArrayList;

//กำหนดให้ array3 = [1,2,3,...,25] เขียนโปรแกรมลบสมาชิกใน array3 ที่ค่าถูกหารด้วย 2 ลงตัวแต่หารด้วย 3 ไม่ลงตัว จากนั้นให้พิมพ์ค่า array3 ที่ผ่านกระบวนการดังกล่าวออกมา
public class Ex054 {
	public static void main(String[] args) {
		ArrayList<Integer> array3 = new ArrayList<Integer>();
		for(int i=1;i<=25;i++) {
			array3.add(i);
		}
		for(int i=array3.size()-1;i>=0;i--) {
			if(array3.get(i)%2==0 && array3.get(i)%3!=0) {
				array3.remove(i);
			}
		}
		System.out.println(array3);
	}
}
