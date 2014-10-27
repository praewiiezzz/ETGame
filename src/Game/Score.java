package Game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Score {
	public static int X = 0;
	public static int Y = 0;

	private Image Score;
	private int getStar = 0;
	private long TimeFinishAllStage = 0; 
	private String Picture = " ";

	public Score(long tStart, long tFinish) throws SlickException {
		TimeFinishAllStage = (tFinish - tStart)/1000000000; // /10^9 unit of time is nanosecond
		getStar = countScore(TimeFinishAllStage);
		Picture = "res/score" + getStar + ".png";
		Score = new Image(Picture);
		render();
	}

	public void render() {
		Score.draw(X, Y);
	}

	private int  countScore(long TimeUse)
	{
		int GetStar = 0;
		if(TimeUse <90)
		{
			GetStar = 5;
		}
		else if(TimeUse >=90 && TimeUse <150)
		{
			GetStar = 4;
		}
		else if(TimeUse >=150 && TimeUse <210)
		{
			GetStar = 3;
		}
		else if(TimeUse >=210 && TimeUse <270)
		{
			GetStar = 2;
		}
		else if(TimeUse >=270)
		{
			GetStar = 1;
		}
		if (ETGame.NumofStar<GetStar)
		{
			ETGame.NumofStar = GetStar;
		}
		System.out.println("temp"+ETGame.NumofStar);
		System.out.println(TimeUse);
		return ETGame.NumofStar;
		
			
	}
}
