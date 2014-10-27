package Game;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

public class Background {
	private int x = 0;
	private int y = 0;
	private Image Bg;
	private Music music;
	
	public Background() throws SlickException {
		music = new Music("res/attraction.wav");
		music.setVolume(0.1f);
	}
	public void render() throws SlickException {
		Bg = new Image("res/background7.jpg");
		Bg.draw(x, y);
		
	}
	public void play() {
		music.loop();
	}
}
