package Problem;

import java.util.ArrayList;

//กำหนดให้ array3 = [1,2,3,...,25] เขียนโปรแกรมเปลี่ยนสมาชิกใน array3 ที่ค่าสามารถถอดรากที่สองแล้วเป็นจำนวนเต็มให้เป็น 'square' จากนั้นให้พิมพ์ค่า array3 ออกมา
public class Ex043 {
	public static void main(String[] args) {
		ArrayList<String> array3 = new ArrayList<String>();
		for(int i=1;i<=25;i++) {
			array3.add(Integer.toString(i));
		}
		for(int i=0;i<array3.size();i++) {
			if(Math.sqrt(Integer.parseInt(array3.get(i)))%1.0<1e-5) {
				array3.set(i, "square");
			}
		}
		System.out.println(array3);
	}
}
