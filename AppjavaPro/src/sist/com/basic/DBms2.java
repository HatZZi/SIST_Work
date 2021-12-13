package sist.com.basic;
//생성자 Constructor
//목적:Instance변수를 초기화 하는 목적 
public class DBms2 {
	
	private String url;
	private String account;
	private String password;
	private int connectMax;
	private boolean isStart;
	
//	public  DBms() {     //생성자의 이름은 클래스의 이름과 같다.결과형이 없다. 오버로드가 된다. 강제로 호출할수없다.
//		System.out.println("DBms");
//		this.url="lacalhost:1521:sist";
//		this.account = "Action";
//		this.password = "1234";
//		this.connectMax = 500;
//		this.isStart=true;
//		
//	}
	
	public DBms2() {
		this("");
		System.out.println("DBms2()");
	}
	public DBms2(String url) {   
		this(url,"");
		System.out.println("DBms2(String url)");
	}
	public DBms2(String url, String account) {
		this(url,account,"");
		System.out.println("DBms2(String url, String account)");
	}
	public DBms2(String url, String account, String password) {
		this(url,account,password,0);
		System.out.println("DBms2(String url, String account, String password)");
	}
	public DBms2(String url, String account, String password, int connectMax) {
		this(url,account,password,connectMax,false);
		System.out.println("DBms2(String url, String account, String password, int connectMax)");
	}
	public DBms2(String url, String account, String password, int connectMax, boolean isStart) {
		this.url=url;
		this.account=account;
		this.password=password;
		this.connectMax=connectMax;
		this.isStart=isStart;
	}
	
	public DBms2(DBms2 db) {
		this.url=db. url;
		this.account=db. account;
		this.password=db. password;
		this.connectMax=db. connectMax;
		this.isStart=db. isStart;
	}
	
	public void disp() {
		System.out.println("url:"+url+" account:"+account+" password:"+password+" connectMAx:"+connectMax+" isStart:"+isStart);
	}
	
	public static void main(String[] args) {
		DBms2 db1 = new DBms2();  //url|account|password|connectMax
//		DBms2 db2 = new DBms2("localhost:1521");  //url|account|password|connectMax
//		DBms2 db3 = new DBms2("localhost:1521","Java");  //url|account|password|connectMax
//		DBms2 db4 = new DBms2(db3);  //url|account|password|connectMax
		
//		db1.disp();
//		db2.disp();
		//db4.disp();
	}

}
