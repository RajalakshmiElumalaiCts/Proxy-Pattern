package game.Impl;

import game.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {
	
	GamePlayer realPlayer;
	String loginID;
	
	String userName;

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

	public GamePlayerProxy() {
		super();
	}	
	
	public GamePlayerProxy(String loginId2) {
		this.loginID = loginId2;		
	}

	@Override
	public void login(String usename, String pwd) {
		System.out.println(realPlayer.realLogin(usename, pwd));
	}

	@Override
	public void killBoss() {
		System.out.println(realPlayer.realKillBoss());
	}

	@Override
	public void upgrade() {
		System.out.println(realPlayer.realUpgrade());
	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

	public GamePlayer getRealPlayer() {
		return realPlayer;
	}

	public void setRealPlayer(GamePlayer realPlayer) {
		this.realPlayer = realPlayer;
	}
	
	

}
