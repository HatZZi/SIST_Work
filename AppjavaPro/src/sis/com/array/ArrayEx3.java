package sis.com.array;

public class ArrayEx3 {
	
	public void arrayPos1(int x, int y, int z, int k, int o) {
			
	}
	
	public void arrayPos2(int[]v) {
		for(int i=0; i<v.length;i++) {
			v[i]+=50;
		}
	}
	
	public int[] arrayPos5() {
		int x=15;
		int y=25;
		return new int[] {x,y};  
	}
	
	public static void main(String[] args) {
		ArrayEx3 a = new ArrayEx3();
//		int []m = {1,2,3,4,5};
//		a.arrayPos2(m);
//		for(int i=0; i<m.length;i++) {
//		System.out.println(m[i]);
//		}
//		a.arrayPos1(10,20,30,40,50);
		System.out.println((a.arrayPos5()));
	}

}
