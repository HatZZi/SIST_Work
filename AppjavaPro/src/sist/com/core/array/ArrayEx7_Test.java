package sist.com.core.array;

public class ArrayEx7_Test {
	
	
	
	public void disp(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
		}
	}
	

	
	public void move(int[][]t) {
		int [][]newArray = new int [3][4];
		int k = 0;
		int y = 3;
		for(int i=0; i<newArray.length; i++) {
			int	j = 0;
			if(j<=3) {
				if(i+j>=3) {
					newArray[i][j] = t[i+1][j-y];
					j++;
				}		
				else {
					newArray[i][j] = t[i][j+k];
					j++;
				}		
				//k++;
				//y--;
			}
		}
	}

	public static void main(String[] args) {
		ArrayEx7 a = new ArrayEx7();
		
		int [][]t = {{1,2,3},
				     {4,5,6},
				     {7,8,9},
				     {10,11,12}};
		
		//a.morethan3(t);
		a.move(t);
		}
}
