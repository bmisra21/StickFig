import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Man extends JComponent
{
	private Ellipse2D.Double head;
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, torso;
	
	public Man()
	{
		head = new Ellipse2D.Double(20,20,20,20);
		this.setSize(11,11);
		torso = new Rectangle(20,40,20,40);
		leftArm = new Rectangle(0,40,40,10);
		rightArm = new Rectangle(40,40,20,10);
		leftLeg = new Rectangle(20,80,7,40);
		rightLeg = new Rectangle(33,80,7,40);
		
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(head);
		g2.draw(torso);
		g2.draw(leftArm);
		g2.draw(rightArm);
		g2.draw(leftLeg);
		g2.draw(rightLeg);
	}
}
