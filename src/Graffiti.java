import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.util.RandomGenerator;

public class Graffiti extends GraphicsProgram 
{
	private RandomGenerator rGen = new RandomGenerator();
	String[] phrases = {
			"Play it again sam",
			"Snoop Dogg, yo!",
			"Portia's watching you!",
			"Candy! I want Candy!",
			"Why am I in this hot air ballon?",
			"Go away"
			};
	
	public void run()
	{
		addMouseListeners();
	}
	
	//called when the user clicks on the screen
	public void mouseClicked(MouseEvent e)
	{
		GLabel helloLabel = new GLabel(randomPhrase(), e.getX(), e.getY());
		helloLabel.setColor(rGen.nextColor());
		add(helloLabel);
	}
	
	public String randomPhrase()
	{
		String phrase = phrases[rGen.nextInt(1,phrases.length)];
		String rString = "";
		
		switch(num)
		{
		case 1:
			rString = "Play it again sam";
			break;
		case 2:
			rString = "Snoop Dogg, yo!";
			break;
		case 3:
			rString = "Portia's watching you!";
			break;
		case 4:
			rString = "Candy! I want Candy!";
			break;
		case 5:
			rString = "Why am I in this hot air ballon?";
			break;
		default:
			rString = "Go away";
			
		}
		println(rString);
		return rString;
	}
}
