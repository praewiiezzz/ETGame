import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Space {
	private Image Space;
	private int x;
	private int y;
	private int i;
	
	public Space(int x, int y, int i) throws SlickException {
		Space = new Image("res/space.png");
		this.x = x;
		this.y = y;
		this.i = i;
		render(x,y);
	}
	
	public void render(int x,int y)
	{
		this.x =x;
		this.y = y;
		Space.draw(x,y);
		
	}
}
