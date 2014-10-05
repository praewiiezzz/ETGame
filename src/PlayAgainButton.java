import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class PlayAgainButton {

	private Image PlayAgain;
	private int x = 125;
	private int y = ETGame.MapHeight;

	public PlayAgainButton(boolean IsGameover) throws SlickException {
		PlayAgain = new Image("res/playagain.png");
		render();
	}

	public void render() {
		PlayAgain.draw(x, y);
	}
}
