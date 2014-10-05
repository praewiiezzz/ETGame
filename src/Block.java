import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Block {
	private Image floor;
	private Image BrokenGlass;
	private Stage_1 stage1;
	private int stage;
	private int x;
	private int y;
	private int nextBlock = 50;
	public boolean chkPass;
	public boolean StepOnItAgain;
	private int i = 0;
	private boolean eiei = false;

	public Block(int x, int y, boolean chkPass,int i,int stage) throws SlickException {
		BrokenGlass = new Image("res/Brokenglass2.jpg");
		floor = new Image("res/floor.jpg");
		this.x = x;
		this.y = y;
		this.i = i;
		this.chkPass = false;
		this.StepOnItAgain = false;
		this.stage = stage;
	}

	public void render() throws SlickException {
		if(chkPass) BrokenGlass.draw(x, y);
		else floor.draw(x, y);
		if (stage==1) stage1 = new Stage_1(x, y, i);
		{
			eiei=true;
		}

	}

	public boolean chkPass() {
		return false;
	}


	
	public boolean isPass(PlayerController P) throws SlickException {
		if(x==(P.getOldX()) && y==(P.getOldY()))
		{	
			chkPass = true;
		}
		if (chkPass)
		{
			if(x==(P.getX()) && y==(P.getY()))
			{
				System.out.println("permission");
			}
		}
		if (eiei)
		{
			stage1.isPass(P);
		}
		return false;
	}
}
