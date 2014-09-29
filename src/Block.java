import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Block {
	private Image floor;
	private Image BrokenGlass;
	private int x;
	private int y;
	private int nextBlock = 50;
	public boolean chkPass;
	private int i = 0;

	public Block(int x, int y, boolean chkPass,int i) throws SlickException {
		BrokenGlass = new Image("res/Brokenglass2.jpg");
		floor = new Image("res/floor.jpg");
		this.x = x;
		this.y = y;
		this.i = i;
		this.chkPass = false;
	}

	public void render() {
		if(chkPass) BrokenGlass.draw(x, y);
		else floor.draw(x, y);
	}

	public boolean chkPass() {
		return false;
	}


	
	public boolean isPass(PlayerController P) throws SlickException {
		if(x==(P.getX()) && y==P.getY())
		{	
			System.out.println("eiei"+i);
			System.out.println("x"+x+" y"+y);
			chkPass = true;
			//ETGame.Path++;
		}
		return false;
	}
}
