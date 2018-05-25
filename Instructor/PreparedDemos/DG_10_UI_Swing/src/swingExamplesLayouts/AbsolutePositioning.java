package swingExamplesLayouts;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AbsolutePositioning extends JFrame {

	// Demo 9.08 - Absolute Positioning
	// Code adapted from: http://docs.oracle.com/javase/tutorial/uiswing/layout/none.html

	public AbsolutePositioning() {
		initUI();
	}
	
	private void initUI() {
		setTitle("Absolute Positioning Example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		container.setLayout(null);
		
		JButton b1 = new JButton("One");
		JButton b2 = new JButton("Two");
		JButton b3 = new JButton("Three");
		
		container.add(b1);
		container.add(b2);
		container.add(b3);
		
		Insets insets = this.getInsets();
		
		Dimension size = b1.getPreferredSize();
		
		b1.setBounds(25 + insets.left, 5 + insets.top, size.width, size.height);
		
		size = b2.getPreferredSize();
		b2.setBounds(55 + insets.left, 40 + insets.top, size.width, size.height);
		size = b3.getPreferredSize();
		b3.setBounds(150 + insets.left, 15 + insets.top, size.width + 50, size.height + 20);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				AbsolutePositioning example = new AbsolutePositioning();
				example.setVisible(true);
			}

		});

	}

}
