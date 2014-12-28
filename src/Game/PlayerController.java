package Game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class PlayerController {
	private int x;
	private int y;
	private Image Alien;
	private Equipment equipment;
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
		return Old_x;
	}

	public int getOldY() {
		return Old_y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void render() {
		Alien.draw(x + SetCenterX, y + SetCenterY);
	}

	public void moveLeft() throws InterruptedException {
		// TODO Auto-generated method stub
		Old_x = x;
		Old_y = y;
		x -= ETGame.NextBlock;
		System.out.println("x " + x + " y" + y);
		Thread.sleep(180);// To prevent pass more 1 block
	}

	public void moveRight() throws InterruptedException {
		// TODO Auto-generated method stub
		Old_x = x;
		Old_y = y;
		x += ETGame.NextBlock;
		System.out.println("x " + x + " y" + y);
		Thread.sleep(180);
	}

	public void moveUP() throws InterruptedException {
		// TODO Auto-generated method stub
		Old_x = x;
		Old_y = y;
		y -= ETGame.NextBlock;
		System.out.println("x " + x + " y" + y);
		Thread.sleep(180);
	}

	public void moveDown() throws InterruptedException {
		// TODO Auto-generated method stub
		Old_x = x;
		Old_y = y;
		y += ETGame.NextBlock;
		System.out.println("x " + x + " y" + y);
		Thread.sleep(180);
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

	public void isCollect() {
		if (x == (equipment.EquipX) && y == (equipment.EquipY)) {
			equipment.chkCollect = true;
		}
	}

}
