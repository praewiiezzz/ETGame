import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class PlayerController {
	private int x;
	private int y;
	private Image Alien;
	
	
	public PlayerController(int x, int y) throws SlickException {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		Alien = new Image("res/alien2.png");
	}
	
	public void render() {
		Alien.draw(x+4,y+5);
	}
	public void moveLeft() throws InterruptedException {
		// TODO Auto-generated method stub
		x -= ETGame.NextBlock;
		Thread.sleep(150);
	}

	public void moveRight() throws InterruptedException {
		// TODO Auto-generated method stub
		x += ETGame.NextBlock;
		Thread.sleep(150);
	}

	public void moveUP() throws InterruptedException {
		// TODO Auto-generated method stub
		y -= ETGame.NextBlock;
		Thread.sleep(150);
	}

	public void moveDown() throws InterruptedException {
		// TODO Auto-generated method stub
		y += ETGame.NextBlock;
		Thread.sleep(150);
	}

	public void Border() {
		// TODO Auto-generated method stub
		if (x > ETGame.MapWidth) {
			x = ETGame.MapWidth;
		} else if (x <= ETGame.setMapX) {
			x = ETGame.setMapX; // ขนาดความกว้างจอ 640 ไม่ต้องการให้ตกขอบ
		}
		if (y > ETGame.MapHeight) {
			y = ETGame.MapHeight;
		} else if (y <= ETGame.setMapY) {
			y = ETGame.setMapY; // ขนาดความกว้างจอ 480 ไม่ต้องการให้ตกขอบ
		}
	}
}
