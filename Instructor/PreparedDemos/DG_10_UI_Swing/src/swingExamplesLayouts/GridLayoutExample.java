package swingExamplesLayouts;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutExample extends JFrame {
	// Demo 9.07 - GridLayout Example
	JButton button1, button2, button3, button4, button5;
	
	public GridLayoutExample() {
		initUI();
	}
	
	private void initUI() {
		
		setTitle("GridLayout Example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane(); 
		
		JPanel panel1 = new JPanel(new GridLayout(3,2));
		
		createButtons();
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		
		container.add(panel1);
	}
	
	// Method to initialise the buttons
	public void createButtons() {
		button1 = new JButton("Button1");
		button2 = new JButton("Button2");
		button3 = new JButton("Button3");
		button4 = new JButton("Button4");
		button5 = new JButton("Button5");
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				GridLayoutExample ex = new GridLayoutExample();
				ex.setVisible(true);
			}
		});
	}

}
