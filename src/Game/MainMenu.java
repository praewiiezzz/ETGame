package Game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class MainMenu {

		private Image bg;
	//	private int x = -200;
		private int x = -30;
		private int y = 0;

		public MainMenu(boolean Start) throws SlickException {
			bg = new Image("res/maingame.png");
			ETGame.isStart = Start;
			
		}

		public void render() {
			bg.draw(x, y);
			
			
	}
}
