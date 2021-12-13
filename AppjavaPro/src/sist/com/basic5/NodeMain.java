package sist.com.basic5;

public class NodeMain {
	
	
	
	public static void main(String[] args) {
		Node.getInstance().setDataValue(50);   //Node생성자가 Private이며 스테틱이기때문에
		                                       //getInstance를 사용한다.
		System.out.println(Node.getInstance().getDataValue());
	}

}
