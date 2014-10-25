package Game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class StageMap {
	private int x;
	private int y;
	private int i;
	private int stage;
	private int NumberOfStage = 5; // This game have 5 stage
	public static int NumberOfBlock = 0; // To count all of block that player
											// can pass
	private boolean ChkStepOnSpace = false;
	public boolean ChkSpace = false;

	public StageMap(int x, int y, int i, int stage) throws SlickException {
		this.x = x;
		this.y = y;
		this.i = i;
		this.stage = stage;
		DrawSpace(stage);
	}

	public void DrawSpace(int stage) throws SlickException {
		int j = 0;
		int[][] drawSpaceMap = new int[NumberOfStage][]; //

		if (stage == 1) {
			drawSpaceMap[0] = new int[] { 0, 7, 11, 12, 16, 19, 23, 24, 26, 28,
					30, 33, 37, 40 };
		}
		if (stage == 2) {
			drawSpaceMap[1] = new int[] { 0, 1, 7, 10, 11, 12, 14, 18, 19, 21,
					23, 25, 34, 40, 41, 44, 46, 47, 48 };
		}
		if (stage == 3) {
			drawSpaceMap[2] = new int[] { 0, 1, 2, 5, 6, 7, 14, 18, 23, 29, 39,
					44, 46, 47, 48 };
		}
		if (stage == 4) {
			drawSpaceMap[3] = new int[] { 0, 1, 6, 7, 8, 10, 13, 17, 26, 30,
					31, 33, 43, 44, 46 };
		}
		
		if (stage == 5) {
			drawSpaceMap[4] = new int[] { 0, 4, 7, 11, 12, 14, 18, 19, 23, 25,
					34, 41, 44, 48 };
		}

		NumberOfBlock = ETGame.AllBlock - drawSpaceMap[stage - 1].length - 1;
		while (j < drawSpaceMap[stage - 1].length) {
			if (i == drawSpaceMap[stage - 1][j]) {
				ChkStepOnSpace = true;
				ChkSpace = true;
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
