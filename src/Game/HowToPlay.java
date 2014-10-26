package Game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class HowToPlay {

	private Image bgHowTo;
	private int x = -200;
	private int y = 0;

	public HowToPlay(boolean Start) throws SlickException {
		bgHowTo = new Image("res/howtoplay.png");
	}

	public void render() {
		if (!ETGame.ChkMain) {
			bgHowTo.draw(x, y);
		} else {

		}

	}
}
