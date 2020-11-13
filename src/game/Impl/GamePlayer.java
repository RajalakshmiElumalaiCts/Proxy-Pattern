package game.Impl;

import game.IGamePlayer;

public class GamePlayer implements IGamePlayer  {

	String loginID;
	
	String userName;	
	
	GamePlayerProxy proxyInstance;
	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
	
	public GamePlayer() {
		super();
	}

	public GamePlayer(String loginId) {
		super();
		this.loginID = loginId;
		proxyInstance = new GamePlayerProxy(loginId);
		
	}

	@Override
	public void login(String username, String pwd) {		
		String mesage = " Please use Proxy to access. ";
		System.out.println(mesage);
	}

	@Override
	public void killBoss() {
		String message = " Please use Proxy to access. ";
		System.out.println(message);
	}

	@Override
	public void upgrade() {
		String message =  "Please use Proxy to access.";
		System.out.println(message);
	}

	@Override
	public IGamePlayer getProxy() {
		if(proxyInstance == null) {
			proxyInstance = new GamePlayerProxy();
		}
		proxyInstance.setLoginID(loginID);
		proxyInstance.setRealPlayer(this);
		return proxyInstance;
	}
	
	String realLogin(String username, String pwd)
	{
		this.userName = username;
		String mesage = this.loginID +" has logged successfully via login ID: "+loginID+ " !";
		return mesage;
		
	}

	String realKillBoss() {
		String message = this.loginID + " is killing boss!";
		return message;		
	}

	String realUpgrade() {
		String message = this.loginID + " has upgraded one level!";
		return message;
	}

}
