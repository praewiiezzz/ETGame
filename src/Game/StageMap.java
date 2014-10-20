package Game;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class StageMap {
	private Space space;
	private int x;
	private int y;
	private int i;
	public static int NumberOfBlock = 0; // To count all of block that player
											// can pass
	private boolean ChkStepOnSpace = false;

	public StageMap(int x, int y, int i) throws SlickException {
		this.x = x;
		this.y = y;
		this.i = i;
		DrawSpace1();

	}

	public void DrawSpace1() throws SlickException {
		int j = 0;
		int drawSpaceMap[] = new int[] { 0, 7, 11, 12, 16, 19, 23, 24, 26, 28,
				30, 33, 37, 40 };
		NumberOfBlock = ETGame.AllBlock - drawSpaceMap.length - 1;
		while (j < drawSpaceMap.length) {
			if (i == drawSpaceMap[j]) {
				space = new Space(x, y, i);
				ChkStepOnSpace = true;
			}
			j++;
		}

	}

	public boolean isPass(PlayerController P) throws SlickException {
		if (ChkStepOnSpace) {
			if (x == (P.getX()) && y == (P.getY())) {
				System.out.println("You lose");
				ETGame.isGameOver = true;
			}
		}
		return false;
	}

}
