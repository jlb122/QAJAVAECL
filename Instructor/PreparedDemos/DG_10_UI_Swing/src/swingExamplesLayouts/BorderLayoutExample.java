package swingExamplesLayouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutExample extends JFrame {
	// Demo 9.06 - BorderLayout Example
	JButton button1, button2, button3, button4, button5;
	JPanel panel1;
	
	public BorderLayoutExample() {
		initUI();
	}
	
	private void initUI() {
		
		setTitle("BorderLayout Example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane(); 
		
		panel1 = new JPanel(new BorderLayout());
		
		createButtons();
		//panelPopulate();
		
		panel1.add(button1, "North");
		panel1.add(button2, BorderLayout.SOUTH);
		panel1.add(button3, BorderLayout.WEST);
		panel1.add(button4, BorderLayout.EAST);
		panel1.add(button5, BorderLayout.CENTER);
		
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
	
	// Method to create panel and add buttons
	public void panelPopulate() {
		panel1 = new JPanel(new BorderLayout());
		panel1.add(button1, "North");
		panel1.add(button2, BorderLayout.SOUTH);
		panel1.add(button3, BorderLayout.WEST);
		panel1.add(button4, BorderLayout.EAST);
		panel1.add(button5, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				BorderLayoutExample ex = new BorderLayoutExample();
				ex.setVisible(true);
			}
		});
	}

}
