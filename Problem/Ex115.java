package Problem;

public class Ex115 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				int num = 2*i+1;
				for(int j=0;j<5;j++) {
					if(i+j >= 4) {
						System.out.print(num);
						num--;
					}
					else {
						System.out.print("-");
					}
				}
				System.out.println();
			}
			else {
				int num = 1;
				for(int j=0;j<5;j++) {
					if(i+j >= 4) {
						System.out.print(num);
						num++;
					}
					else {
						System.out.print("-");
					}
				}
				System.out.println();
			}
		}
	}
}
