package Problem;

import java.util.Scanner;
import java.util.HashMap;

/*กำหนดให้ map2 = {"name"="Mario","age"="30","job"="mushroom picker"} เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระและทำการตรวจสอบว่า
สายอักขระที่รัยมาเป็นหนึ่งใน value ของ map2 หรือไม่
* ถ้าเป็น ให้ลบ key ของ value นั้น
* ถ้าไม่เป็น ให้สร้าง key ชื่อ "new_key" และกำหนด value เป็นสายอักขระที่รับ*/ 
public class Ex077 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map2 = new HashMap<String,String>();
		map2.put("name", "mario");
		map2.put("age", "30");
		map2.put("job", "mushroom picker");
		System.out.print("Input CheckValue: ");
		String str1 = sc.nextLine();
		for(HashMap.Entry<String,String> entry : map2.entrySet()) {
			if(entry.getValue().equals(str1)) {
				map2.remove(entry.getKey());
				break;
			}
			else {
				map2.put("new_key", str1);
				break;
			}
		}
		System.out.println(map2);
		sc.close();
	}
}
