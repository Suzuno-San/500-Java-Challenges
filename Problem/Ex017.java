package Problem;

//เขียนโปรแกรมหาจำนวนเฉพาะที่อยู่ระหว่าง 0 และ 99 และพิมพ์ออกมา
public class Ex017 {
	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i);
			}
		}
	}
}
