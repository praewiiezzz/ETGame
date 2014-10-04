import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class ETGame extends BasicGame {

	private PlayerController player;
	private Block block;
	private Block[] blocks;
	private Background background;
	public static int MapWidth = 400;
	public static int MapHeight = 450;
	public static int NextBlock = 50;
	public static int setMapX = 100;
	public static int setMapY = 100;
	public static int Path = 0;

	public ETGame(String title) {
		super(title);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		background.render();
		for (Block block : blocks) {
			block.render();
		}
		arg1.drawString("" + Path, 200, 0);
		player.render();

		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		CreateMap();

	}

	private void CreateMap() throws SlickException {
		int MapX = setMapX;
		int MapY = setMapY;
		blocks = new Block[49];
		for (int i = 0; i < 49; i++) {
			if (MapX > MapWidth) {
				MapX = setMapX;
				MapY += NextBlock;
			}
			blocks[i] = new Block(MapX, MapY, true,i);
			MapX += NextBlock;
		}
		
		player = new PlayerController(MapWidth - setMapX - NextBlock, MapHeight);
		background = new Background();
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		Input input = container.getInput();
		try {
			updatePlayerMovement(input, delta);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Block block : blocks) {
			if (!block.isPass(player)) {
			
			}
		}


	}

	void updatePlayerMovement(Input input, int delta)
			throws InterruptedException {

		if (input.isKeyDown(Input.KEY_LEFT)) {
			player.moveLeft();
			Path++;
		}
		if (input.isKeyDown(Input.KEY_RIGHT)) {
			player.moveRight();
			Path++;
		}
		if (input.isKeyDown(Input.KEY_UP)) {
			player.moveUP();
			Path++;
		}
		if (input.isKeyDown(Input.KEY_DOWN)) {
			player.moveDown();
			Path++;
		}

		player.Border();
	}

	public static void main(String[] arg) {
		try {
			ETGame game = new ETGame("E.T. Puzzle");
			AppGameContainer appgc = new AppGameContainer(game);
			appgc.setDisplayMode(550, 600, false);
			appgc.setTargetFrameRate(30); // FramRate 100 คือ update 100 ครั้งใน
											// 1 วิ
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
