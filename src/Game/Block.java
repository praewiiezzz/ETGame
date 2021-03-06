package Game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Block {
	private int stage;
	private int x;
	private int y;
	private int AtBlock = 0;

	private Image floor;
	private Image BrokenGlass;
	private StageMap stageMap;

	private boolean StepOnSpace = false;
	public boolean chkPass;
	public boolean StepOnItAgain;

	public Block(int x, int y, boolean chkPass, int AtBlock, int stage)
			throws SlickException {
		BrokenGlass = new Image("res/Brokenglass4.png");
		floor = new Image("res/floor1.png");
		this.x = x;
		this.y = y;
		this.AtBlock = AtBlock; // Block[AtBlock]
		this.chkPass = false;
		this.StepOnItAgain = false;
		this.stage = stage;
	}

	public void render() throws SlickException {
		ToCreateSpaceOnMap();
		if (stageMap.ChkSpace) // If this block is space the floor will not be
								// created
			;
		else if (chkPass) {
			BrokenGlass.draw(x, y);
		} else {
			floor.draw(x, y);
		}

	}

	public void ToCreateSpaceOnMap() throws SlickException {
		stageMap = new StageMap(x, y, AtBlock, stage);
		StepOnSpace = true;
	}

	public boolean chkPass() {
		return false;
	}

	public boolean isPass(PlayerController P) throws SlickException {
		if (x == (P.getOldX()) && y == (P.getOldY())) {
			chkPass = true;
		}
		ChkGameOver(P);
		return false;
	}

	public void ChkGameOver(PlayerController P) throws SlickException {
		if (chkPass) {
			if (x == (P.getX()) && y == (P.getY())) {
				System.out.println("permission");
				ETGame.isGameOver = true;
			}
		}
		if (StepOnSpace) {
			stageMap.isPass(P);
		}
	}
}
