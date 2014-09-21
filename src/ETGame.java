import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class ETGame extends BasicGame {

	private Map map;
	private PlayerController player;
	
	public ETGame(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		map.draw();
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		map = new Map(100,150);
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	 
	public static void main(String[] arg)
	{
		try {
			ETGame game = new ETGame("E.T. Puzzle");
			AppGameContainer appgc = new AppGameContainer(game);
			appgc.setDisplayMode(600, 600, false);
			appgc.setTargetFrameRate(60);  // FramRate 100 คือ update 100 ครั้งใน 1 วิ 
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
