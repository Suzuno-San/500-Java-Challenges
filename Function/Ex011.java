package Function;

//เขียนฟังก์ชันเพื่อสร้างคำซ้ำและ return ผลลัพธ์ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ str1 และ k ที่เป็นสายอักขระและจำนวนเต็ม
public class Ex011 {
	public static String repleatStr(String str1,int k) {
		String word = "";
		for(int i=1;i<=k;i++) {
			if(i>1) {
				word += "-";
			}
			word += str1;
		}
		return word;
	}
	public static void main(String[] args) {
		System.out.print(repleatStr("one",3));
	}
}
