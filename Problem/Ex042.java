package Problem;

import java.util.ArrayList;

//กำหนดให้ array3 = [1,2,3,...,25] เขียนโปรแกรมเปลี่ยนสมาชิกใน array3 ที่ index เป็นเลขคี่ให้เป็น "b" จากนั้นให้พิมพ์ค่า array3 ออกมา
public class Ex042 {
	public static void main(String[] args) {
		ArrayList<String> array3 = new ArrayList<String>();
		for(int i=1;i<=25;i++) {
			array3.add(Integer.toString(i));
		}
		for(int i=0;i<array3.size();i++) {
			if(i%2!=0) {
				array3.set(i, "b");
			}
		}
		System.out.println(array3);
	}
}
