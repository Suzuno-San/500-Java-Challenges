package Function;

import java.util.HashMap;

/*เขียนฟังก์ชันเพื่อแปลงเลขฐานใดๆ เป็นเลขฐาน 10 โดยรับ parameter 2 ตัว คือ s ซึ่งเป็นสายอักขระที่เก็บเลขฐานใดๆ และ b ซึ่งเป็นจำนวนเต็มบวกที่บ่งบอกเลขฐานของ s ให้ return จำนวนที่เป็นเลขฐาน 10 ของ s*/
public class Ex028 {
	public static int Numbase(String s, int b) {
		HashMap<Character, Integer> converter = new HashMap<Character, Integer>();
		for(int i=0;i<16;i++) {
			if(i<10) {
				converter.put((char)('0'+i), i);
			}
			else {
				converter.put((char)('A'+i-10), i);
			}
		}
		int decimal = 0;
		for(int i=s.length()-1;i>=0;i--) {
			decimal += converter.get(s.charAt(i))*Math.pow(b, s.length()-i-1);
		}
		return decimal;
	}
	public static void main(String[] args) {
		System.out.println(Numbase("71A",16));
	}
}
