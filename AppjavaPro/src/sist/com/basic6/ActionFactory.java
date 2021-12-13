package sist.com.basic6;

public class ActionFactory {
	static final ActionFactory ACTION_FACTORY;
	static {
		ACTION_FACTORY = new ActionFactory();
	}
	public static ActionFactory getInstance() {   // 싱글톤
		return ACTION_FACTORY;     
	}

	public static Action getAction(String command) {
		if(command.equalsIgnoreCase("login")) {
			return new LoginAction(new OracleDao(),"loginView", true);
		}
		else if(command.equalsIgnoreCase("delete")) {
			return new DeleteAction(new MysqulDao(),"listView", false);
		}
		else if(command.equalsIgnoreCase("update")) {
			return new UpdateAction(new MssqlDao(),"upDateView", true);
		}
		else if(command.equalsIgnoreCase("info")) {
			return new InfoAction(new OracleDao(),"InfoView", false);
		}
		return null;
	}
	

	
}
