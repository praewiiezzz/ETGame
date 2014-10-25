package Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class ETGame extends BasicGame {

	private PlayerController player;
	private Block[] blocks;
	private Background background;
	private PlayAgainButton play_again;
	private Equipment equipment;

	// Set Map
	public static int MapWidth = 400;
	public static int MapHeight = 450;
	public static int NextBlock = 50;
	public static int AllBlock = 49;
	public static int setMapX = 100;
	public static int setMapY = 150;
	public static int CountBlock = 0;
	public static int stage = 1;

	// Set Win Game or Game over
	private Win win;
	private GameOver gameover;
	public static boolean isGameOver = false;
	public static boolean IsWin = false;
	public static boolean Winner = false;
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
		arg1.drawString("" + CountBlock, 200, 0);
		equipment.render();
		player.render();
		ChkWinOrGameover();

	}

	public void ChkWinOrGameover() {
		if (isGameOver) {
			gameover.render();
			play_again.render();
		}
		if (IsWin) {
			win.render();
		}
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		CreateMap();
		equipment = new Equipment();
		player = new PlayerController(MapWidth - setMapX - NextBlock, MapHeight);
		background = new Background();
		gameover = new GameOver(false);
		play_again = new PlayAgainButton(false);

	}

	private void CreateMap() throws SlickException {
		int MapX = setMapX;
		int MapY = setMapY;
		blocks = new Block[AllBlock];
		for (int i = 0; i < AllBlock; i++) {
			if (MapX > MapWidth) {
				MapX = setMapX;
				MapY += NextBlock;
				blocks[i] = new Block(MapX, MapY, true, i, stage);
				MapX += NextBlock;
			} else {
				blocks[i] = new Block(MapX, MapY, true, i, stage);
				MapX += NextBlock;
			}
		}
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		Input input = container.getInput();
		if (!isGameOver && !Winner) {
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
		} else if ( Winner) {
			
			// press any key to continue
			if (input.isKeyDown(Input.KEY_ENTER))
			{
				stage++;
				SetGameInit(container);
			}
		}
		PlayAgain_WhenGameOver(container, input);
		player.isCollect(); // To chk player collect equipment or not
		win = new Win();

	}

	public void SetGameInit(GameContainer container) throws SlickException {
		init(container);
		CountBlock = 0;
		Winner = false;
	}

	public void PlayAgain_WhenGameOver(GameContainer container, Input input) 
			throws SlickException {
		if (isGameOver)
		{
			if (input.isKeyDown(Input.KEY_ENTER))
			{
				SetGameInit(container);
				isGameOver = false;
			}
		}
	}

	void updatePlayerMovement(Input input, int delta)
			throws InterruptedException {
		if (input.isKeyDown(Input.KEY_LEFT)) {
			player.moveLeft();
			CountBlock++;
		}
		if (input.isKeyDown(Input.KEY_RIGHT)) {
			player.moveRight();
			CountBlock++;
		}
		if (input.isKeyDown(Input.KEY_UP)) {
			player.moveUP();
			CountBlock++;
		}
		if (input.isKeyDown(Input.KEY_DOWN)) {
			player.moveDown();
			CountBlock++;
		}

		player.Border();
	}

	public static void main(String[] arg) {
		try {
			ETGame game = new ETGame("E.T. Puzzle");
			AppGameContainer appgc = new AppGameContainer(game);
			appgc.setDisplayMode(550, 600, false);
			appgc.setTargetFrameRate(30);
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
