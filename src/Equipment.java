import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Equipment {
	public static int EquipX = 250;
	public static int EquipY = 150;
	private Image Stage1_eq;
	public static boolean chkCollect = false;

	public Equipment() throws SlickException {
		Stage1_eq = new Image("res/eq1.png");
		chkCollect = false;
	}

	public void render() {
		if (chkCollect) {
			// System.out.println("Fin");
		} else
			Stage1_eq.draw(EquipX+10, EquipY-20); // To set center
	}

}
