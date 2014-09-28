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
		x -= 50;
		Thread.sleep(150);
	}

	public void moveRight() throws InterruptedException {
		// TODO Auto-generated method stub
		x += 50;
		Thread.sleep(150);
	}

	public void moveUP() throws InterruptedException {
		// TODO Auto-generated method stub
		y -= 50;
		Thread.sleep(150);
	}

	public void moveDown() throws InterruptedException {
		// TODO Auto-generated method stub
		y += 50;
		Thread.sleep(150);
	}

	public void Border() {
		// TODO Auto-generated method stub
		if (x > 400) {
			x = 400;
		} else if (x <= 100) {
			x = 100; // ขนาดความกว้างจอ 640 ไม่ต้องการให้ตกขอบ
		}
		if (y > 450) {
			y = 450;
		} else if (y <= 150) {
			y = 150; // ขนาดความกว้างจอ 480 ไม่ต้องการให้ตกขอบ
		}
	}
}
