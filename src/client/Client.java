package client;

import game.IGamePlayer;
import game.Impl.GamePlayer;

public class Client {

	public static void main(String[] args) {

             IGamePlayer player = new GamePlayer("Edward");
             
             player.login("greatPlayer", "password");

             player.killBoss();

             player.upgrade(); 
             
             //using proxy
             IGamePlayer proxy = player.getProxy();

             proxy.login("greatPlayer", "password");

             proxy.killBoss();

             proxy.upgrade();


	}

}
