package sist.com.core.array;

public class ArrayEx1_P {
	
//	public int[] add(int ...x) {
//		for(int i=0; i<x.length; i++) {
//			x[i]+=50;
//		}
//		return x;
//	}
	
	public int[] add(int x[]) {
		int i = 0;
		while(i<x.length) {
			x[i++]+=30;
		}
		return x;
	}
	
	public static void main(String[] args) {
		ArrayEx1_P a = new ArrayEx1_P();
		a.add(new int[] {10,20,30});
//		for(int i:a.add(10,20,30,40,50)) {
//			System.out.println(i);
//		}

	}
}
