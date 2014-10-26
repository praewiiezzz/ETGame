package Game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class MainMenu {

	private Image bgMain;
	private Image bgHowTo;
	private int x = 0;
	private int y = 0;
	private HowToPlay howToPlay;

	public MainMenu(boolean Start) throws SlickException{
		bgMain = new Image("res/maingame.png");
		bgHowTo = new Image("res/howtoplay.png");
		ETGame.isStart = Start;
	}

	public void render() throws InterruptedException {
		if (!ETGame.ChkMain)
		{
			bgMain.draw(x-30, y);
			
		}
		else
		{
			Thread.sleep(5000);
			bgHowTo.draw(x-200, y);
		}

		

	}
}
