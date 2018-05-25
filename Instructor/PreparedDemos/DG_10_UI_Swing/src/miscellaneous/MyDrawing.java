package miscellaneous;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
// Demo 9.18 - Create MyDrawing
public class MyDrawing extends JComponent {
	public void paintComponent(Graphics g){
		 super.paintComponent(g);
	        Graphics2D g2 = (Graphics2D)g;

	        Line2D line = new Line2D.Double(10, 10, 40, 40);
	        Line2D line2 = new Line2D.Double(200, 10, 140, 40);
	        
	        g2.setColor(Color.blue);
	        g2.setStroke(new BasicStroke(10));
	        g2.draw(line);
	        g2.draw(line2);
	        
	        Rectangle2D r = new Rectangle2D.Double(50,50,100,50);
	        g2.setColor(Color.red);
	        g2.draw(r);

	}
}
