import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Block {
	private Image floor;
	private Image BrokenGlass;
	private int x;
	private int y;
	private BlockCantPass blockCantPass;
	private int nextBlock = 50;
	public static boolean chkPass;
	private int i = 0;

	public Block(int x, int y, boolean chkPass,int i) throws SlickException {
		BrokenGlass = new Image("res/Brokenglass2.jpg");
		floor = new Image("res/floor.jpg");
		this.x = x;
		this.y = y;
		this.i = i;
	}

	public void render() {
		//BrokenGlass.draw(x, y);
		floor.draw(x, y);
	}

	public boolean chkPass() {
		return false;
	}


	
	public boolean isPass(PlayerController P) throws SlickException {
		if(x==(P.getX()) && y==P.getY())
		{
			blockCantPass = new BlockCantPass(x, y);
			System.out.println("eiei"+i);
			System.out.println("x"+x+" y"+y);
			//ETGame.Path++;
		}
		return false;
	}
}
