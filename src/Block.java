import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;



public class Block {
	private Image floor;
	private Image BrokenGlass;
	private int x;
	private int y;
	private int nextBlock = 50;

	public Block(int x, int y) throws SlickException {
		// TODO Auto-generated constructor stub
		floor = new Image("res/floor.jpg");
		BrokenGlass = new Image("res/Brokenglass2.jpg");
		this.x = x;
		this.y = y;
	}
	public void render() {
		// TODO Auto-generated method stub\
		floor.draw(x,y);
		
	}
	public void update() {
		x += nextBlock;
		y += nextBlock;
	}


}
