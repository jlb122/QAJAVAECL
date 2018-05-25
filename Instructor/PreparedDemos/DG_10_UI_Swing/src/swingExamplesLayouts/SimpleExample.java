package swingExamplesLayouts;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleExample extends JFrame {
	// Demo 9.01 - Setting up an application Frame
	// An instance of SimpleExample is inherently a JFrame
	
	public SimpleExample() {
		initUI();
	}
	
	private void initUI() {
		// Add default values
		setTitle("Simple Example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Demo 9.02 - Set the container and layout
		// Several layout options available...
		
		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
		
		// Demo 9.03 - Add a panel
		// Want to add components to panel rather than frame for code reuse
		JPanel panel1 = new JPanel();
		container.add(panel1);
		
		// Demo 9.04 - Add a button
		JButton button1 = new JButton("Click Me");
		panel1.add(button1);
	
	}

	public static void main(String[] args) {
		// Demo 9.05 - Make the application run
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SimpleExample ex = new SimpleExample();
				ex.setVisible(true);
			}
		});

	}

}
