import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class PlayerController {
	private int x;
	private int y;
	private Image Alien;
	private int SetCenterX = 4;
	private int SetCenterY = 5;
	private int Old_x = 0;
	private int Old_y = 0; 
	
	public PlayerController(int x, int y) throws SlickException {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;

		Alien = new Image("res/alien2.png");
	}
	
	public int getOldX() {
	//	System.out.println("Class Player Old x"+Old_x+"Old y"+Old_y);
		return Old_x;
	}

	public int getOldY() {
		return Old_y;
	}
	
	public int getX() {
		//System.out.println("Class Player Old x"+Old_x+"Old y"+Old_y);
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void render() {
		Alien.draw(x+SetCenterX,y+SetCenterY);
	}
	public void moveLeft() throws InterruptedException {
		// TODO Auto-generated method stub
		Old_x = x;
		Old_y = y;
		x -= ETGame.NextBlock;
		Thread.sleep(150);// To prevent pass more 1 block
	}

	public void moveRight() throws InterruptedException {
		// TODO Auto-generated method stub
		Old_x = x;
		Old_y = y;
		x += ETGame.NextBlock;
		Thread.sleep(150);
	}

	public void moveUP() throws InterruptedException {
		// TODO Auto-generated method stub
		Old_x = x;
		Old_y = y;
		y -= ETGame.NextBlock;
		Thread.sleep(150);
	}

	public void moveDown() throws InterruptedException {
		// TODO Auto-generated method stub
		Old_x = x;
		Old_y = y;
		y += ETGame.NextBlock;
		Thread.sleep(150);
	}

	public void Border() {
		// TODO Auto-generated method stub
		if (x > ETGame.MapWidth) {
			x = ETGame.MapWidth;
		} else if (x <= ETGame.setMapX) {
			x = ETGame.setMapX; // ��Ҵ�������ҧ�� 640 ����ͧ�����鵡�ͺ
		}
		if (y > ETGame.MapHeight) {
			y = ETGame.MapHeight;
		} else if (y <= ETGame.setMapY) {
			y = ETGame.setMapY; // ��Ҵ�������ҧ�� 480 ����ͧ�����鵡�ͺ
		}
	}
	
}
