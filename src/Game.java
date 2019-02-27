import javax.swing.JComponent;
import javax.swing.JFrame;

public class Game extends JFrame
{
	public Game()
	{
		setBounds(50,50, 400, 400);
		setTitle("Game");
		setLayout(null);
		
		Man myMan = new Man();
		myMan.setBounds(150,150,200,150);
		add(myMan);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String [] args)
	{
		Game game = new Game();
	}
}
