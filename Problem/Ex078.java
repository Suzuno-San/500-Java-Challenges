package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*กำหนดให้ map2 = {"name"="Mario","age"="30","job"="mushroom picker"} และ array1 = ["first_name","last_name","age","job"]
เขียนโปรแกรมลบ key ของ map2 ที่เป็นสมาชิกของ array1 จากนั้นให้พิมพ์ค่า map1 ออกมา*/
public class Ex078 {
	public static void main(String[] args) {
		HashMap<String,String> map2 = new HashMap<String,String>();
		map2.put("name", "mario");
		map2.put("age", "30");
		map2.put("job", "mushroom picker");
		ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("first_name","last_name","age","job"));
		for(int i=0;i<array1.size();i++) {
			if(map2.containsKey(array1.get(i))) {
				map2.remove(array1.get(i));
			}
		}
		System.out.println(map2);
	}
}
