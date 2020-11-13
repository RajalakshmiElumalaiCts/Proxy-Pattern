package game;

public interface IGamePlayer {
	
	void login(String usename, String pwd);

    void killBoss();

    void upgrade();
    
    IGamePlayer getProxy();
	

}
