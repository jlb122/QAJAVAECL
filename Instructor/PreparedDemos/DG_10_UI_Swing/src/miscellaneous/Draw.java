package miscellaneous;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Draw extends JFrame{
	
	public Draw() {
		initUI();
	}
	
	public void initUI() {
		setTitle("Drawing with Java");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		
		// Demo 9.19 - Add drawing to JFrame
		container.add(new MyDrawing());
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Draw drawing = new Draw();
				drawing.setVisible(true);
			}
		});

	}

}
