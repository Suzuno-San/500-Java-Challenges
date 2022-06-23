package Function;

//เขียนฟังก์ชันเพื่อแปลงสายอักขระจาก lower case เป็น upper case และจาก upper case เป็น lower case และ return ผลลัพธ์ออกมากำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ word ที่เป็นสายอักขระ
public class Ex042 {
	public static String switchCase(String word) {
		String result = "";
		for(int i=0;i<word.length();i++) {
			if('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				result += (char)(word.charAt(i)-'A'+'a');
			}
			else if('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
				result += (char)(word.charAt(i)-'a'+'A');
			}
			else {
				result += word.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(switchCase("Hello, My Name is Boat"));
	}
}
