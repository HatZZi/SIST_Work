package sist.com.core.array;

public class ArrayEx7_Test_Clue {
	

	final int ROW = 4;
	final int COL = 3;
	int [][]aa = new int [ROW][COL];  //4행3열.
	int [][]bb = new int [COL][ROW];  //3행4열.
	
	public void init(int [][]data) {
		int cnt = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j]=++cnt;
			}
		}
	}
	
	public void disp(int [][]data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("%5d",data[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void change(int [][]aa, int [][]bb) {
		int h=0, y=0;
		for (int i = 0; i < bb.length; i++) {
			for (int j = 0; j < bb[i].length; j++) {
				bb[i][j] = aa[h][y];
				if(y<aa[i].length-1) {
					y++;
				}else {
					y=0;
					h++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayEx7_Test_Clue a = new ArrayEx7_Test_Clue();  // ROW | COL | aa | bb 가 생성
		a.init(a.aa);
		a.change(a.aa, a.bb);
		a.disp(a.aa);
		a.disp(a.bb);
	}

}
