package Problem;

import java.util.Scanner;
import java.util.HashMap;

/*กำหนดให้ map2 = {"name"="Mario","age"="30","job"="mushroom picker"} เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระและทำการตรวจสอบว่า 
สายอักขระที่รับมาเป็นหนึ่งใน value ของ map2 หรือไม่
* ถ้าเป็น ให้พิมพ์ key ของ value นั้นออกมา
* ถ้าไม่เป็น ไม่ดำเนินการใดๆ*/
public class Ex076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map2 = new HashMap<String,String>();
		map2.put("name", "mario");
		map2.put("age", "30");
		map2.put("job", "mushroom picker");
		System.out.print("Input CheckValue: ");
		String str = sc.nextLine();
		for(HashMap.Entry<String,String> entry : map2.entrySet()) {
			if(entry.getValue().equals(str)) {
				System.out.println(entry.getKey());
			}
		}
		sc.close();
	}
}
