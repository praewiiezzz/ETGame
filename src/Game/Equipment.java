package Game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Equipment {
	public static int EquipX = 250;
	public static int EquipY = 150;
	private Image Stage_eq;
	private String Picture = "res/eq" + ETGame.stage + ".png";
	public static boolean chkCollect = false;

	public Equipment() throws SlickException {
		Stage_eq = new Image(Picture);
		chkCollect = false;

	}

	public void render() {
		if (chkCollect) {
			// System.out.println("Fin");
		} else
			Stage_eq.draw(EquipX, EquipY);
	}

}
