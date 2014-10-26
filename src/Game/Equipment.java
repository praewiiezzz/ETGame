package Game;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Equipment {
	public static int EquipX = 250;
	public static int EquipY = 150;
	private Image Stage1_eq;
	private String Picture = "res/eq"+ETGame.stage+".png";
	public static boolean chkCollect = false;

	public Equipment() throws SlickException {
		Stage1_eq = new Image(Picture);
		chkCollect = false;
		
	}

	public void render() {
		if (chkCollect) {
			// System.out.println("Fin");
		} else
			Stage1_eq.draw(EquipX, EquipY); // To set center
	}

}
