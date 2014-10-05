import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Win {
	private int x = 125;
	private int y = ETGame.MapHeight / 2;
	private Image Winlogo;

	public Win() throws SlickException {
		Winlogo = new Image("res/youwin.png");
		CheckWinOrLose();
	}

	public void CheckWinOrLose() {
		if (Equipment.chkCollect == true && (ETGame.CountBlock == StageMap.NumberOfBlock)) {
			
			System.out.println("Win!!");
			ETGame.IsWin = true;
		} 
	}

	public void render() {
		Winlogo.draw(x, y);
		ETGame.IsWin = false;
	}

}
