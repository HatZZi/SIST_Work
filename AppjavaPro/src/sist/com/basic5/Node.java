package sist.com.basic5;

public class Node {
	
	private int dataValue;
	static Node node;
	
	private Node() {
		dataValue = 0;
	}
	
	public void setDataValue(int dataValue) {
		this.dataValue = dataValue;
	}
	
	public int getDataValue() {
		return this.dataValue;
	}
	
	public static Node getInstance() {
		if(node == null) {
			node = new Node();
		}
		return node;
	}
	
	public static void main(String[] args) {
//		dataValue = 100;  //new하지않아서 사용불가
		new Node();
	}
	

}
