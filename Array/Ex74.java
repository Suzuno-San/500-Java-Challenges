package Array;

//กำหนดให้ array1 = ["America","Brazil","China","Dominican","Egypt"] เขียนโปรแกรมเพื่อพิมพ์ "China" ออกมาโดยอ้างอิงตำแหน่งจาก array1
public class Ex74 {
	public static void main(String[] args) {
		String[] array1 = {"America","Brazil","China","Dominican","Egypt"};
		System.out.println(array1[2]);
		System.out.println(array1[array1.length-3]);	//or
	}
}
