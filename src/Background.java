import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Background {
	private int x = 0;
	private int y = 370;
	private Image Bg;
	
	public void render() throws SlickException {
		Bg = new Image("res/bg2.jpg");
		Bg.draw(x, y);
	}
}
