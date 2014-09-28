import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Block {
	private Image floor;
	private Image BrokenGlass;
	private int x;
	private int y;
	private int nextBlock = 50;
	private boolean ChkBlockPass = false;
	

	public Block(int x, int y) throws SlickException {
		BrokenGlass = new Image("res/Brokenglass2.jpg");
		floor = new Image("res/floor.jpg");
		this.x = x;
		this.y = y;

	}

	public void render() {
			floor.draw(x, y);
	}


}
