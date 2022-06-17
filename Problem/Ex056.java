package Problem;

import java.util.ArrayList;
import java.util.Arrays;

/*กำหนดให้ matrix1 = [[1,2,3],[4,5,6],[7,8,9]] และ matrix2 = [[1,2,3],[1,2,3],[1,2,3]] เขียนโปรแกรมหาผลบวกของสมาชิกในตำแหน่งที่ตรงกันของ
matrix1 และ matrix2 จากนั้นให้พิมพ์ผลลัพธ์ในรูปแบบของ array2 มิติออกมา*/
public class Ex056 {
	public static void main(String[] args) {
		ArrayList< ArrayList<Integer> > matrix1 = new ArrayList < ArrayList<Integer> >();
		matrix1.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		matrix1.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		matrix1.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
		ArrayList< ArrayList<Integer> > matrix2 = new ArrayList < ArrayList<Integer> >();
		matrix2.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		matrix2.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		matrix2.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		int row = matrix1.size();
		int column = matrix1.get(0).size();
		ArrayList< ArrayList<Integer> > summatrix = new ArrayList< ArrayList<Integer> >();
		summatrix.add(new ArrayList<Integer>(Arrays.asList(0,0,0)));
		summatrix.add(new ArrayList<Integer>(Arrays.asList(0,0,0)));
		summatrix.add(new ArrayList<Integer>(Arrays.asList(0,0,0)));
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				summatrix.get(i).set(j, matrix1.get(i).get(j)+matrix2.get(i).get(j));
			}
		}
		System.out.println(summatrix);
	}
	
}
