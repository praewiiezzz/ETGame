import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class GameOver {

	private Image gameover;
	private int x = -270;
	private int y = 0;

	public GameOver(boolean IsGameover) throws SlickException {
		gameover = new Image("res/gameover2.jpg");
		render();
	}

	public void render() {
		gameover.draw(x, y);
	}
}
