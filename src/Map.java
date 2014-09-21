import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;



public class Map {
	private Image floor;
	private Image BrokenGlass;
	private int x;
	private int y;
	
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
		for (int i = 0 ; i< 7; i++)
		{
			MapX = x;
			for (int j = 0; j< 8 ;j++)
			{
				if (MapX%150==0 && MapY%150==0)
				{
					BrokenGlass.draw(MapX,MapY);
				}
				else {
				floor.draw(MapX, MapY);
				}
				MapX +=50;
				
			}
			MapY +=50;
		}
	}
	public void draw(int x,int y) {
		// TODO Auto-generated method stub
		floor.draw(x, y);
	}

	public void SetMap() {
		// TODO Auto-generated method stub
		x = 200;
		y = 200;
	}

}
