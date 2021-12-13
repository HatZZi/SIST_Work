package sist.com.basic6;

public class DeleteAction extends Action{

	private String path;
	private boolean redirect;
	private Dao dao;
	
	public DeleteAction(Dao dao, String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
		this.dao = dao;
	}
	@Override
	public ActionForWard execute() {
		// TODO Auto-generated method stub
		return new ActionForWard (path, redirect);  //동시에 리턴두개를 하기위해 액션포워드를 사용한다.
	}
	
	
	
	
}
