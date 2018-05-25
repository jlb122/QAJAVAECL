package events;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionListenerExample2 extends JFrame {
	
	public ActionListenerExample2() {
		initUI();
	}
	
	private void initUI() {
		setTitle("Components Example");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		
		// Demo 9.16 - Create and add new button with anonymous ActionListener
		JButton newButton = new JButton("New");
		newButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked the new button");				
			}			
		});
		
		container.add(newButton);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ActionListenerExample2 ale = new ActionListenerExample2();
				ale.setVisible(true);
			}
		});
	}
}
