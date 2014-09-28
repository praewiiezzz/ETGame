import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Map {
	private Image floor;
	private Image BrokenGlass;
	private int x;
	private int y;
	private int nextBlock = 50;
	public int Box[][] = new int[7][7];
	public int LocateBox[][] = new int[7][7];

	public Map(int x, int y) throws SlickException {
		floor = new Image("res/floor.jpg");
		BrokenGlass = new Image("res/Brokenglass2.jpg");
		this.x = x;
		this.y = y;
	}

	public void draw() {
		// TODO Auto-generated method stub
		int MapX = x;
		int MapY = y;
		CreateBox();
		/*
		 * for (int i = 0 ; i< 7; i++) { MapX = x; for (int j = 0; j< 7 ;j++) {
		 * if (MapX%150==0 && MapY%150==0) { BrokenGlass.draw(MapX,MapY); } else
		 * { floor.draw(MapX, MapY); } MapX +=nextBlock;
		 * 
		 * } MapY +=nextBlock; }
		 */

		
	}

	public void draw(int x, int y) {
		// TODO Auto-generated method stub
		floor.draw(x, y);
	}

	public void SetMap() {
		// TODO Auto-generated method stub

	}
	
	public void CreateBox() {
		int MapX = x;
		int MapY = y;
		for (int i = 0; i < 7; i++) {
			MapX = x;
			for (int j = 0; j < 7; j++) 
			{
				Box[i][j] = 0;
				//LocateBox[i][j]= LocateBox[MapX][MapY];

				floor.draw(MapX, MapY);
				MapX += nextBlock;

			}
			MapY += nextBlock;
		}
	}

}
