package Game;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Background {
	private int x = 0;
	private int y = 0;
	private Image Bg;

	public void render() throws SlickException {
		Bg = new Image("res/background7.jpg");
		Bg.draw(x, y);
	}
}
