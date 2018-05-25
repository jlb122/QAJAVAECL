package events;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerExample1 extends JFrame implements ActionListener{

	public ActionListenerExample1() {
		initUI();
	}
	
	private void initUI() {
		setTitle("Components Example");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		
		// Demo 9.15 - Create and add new button with ActionListener
		JButton newButton = new JButton("New");
		newButton.setActionCommand("new");
		newButton.addActionListener(this);
		
		container.add(newButton);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ActionListenerExample1 ale = new ActionListenerExample1();
				ale.setVisible(true);
			}
		});
	}
	
	
	// Add this!
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("new")) {
			System.out.println("You clicked the new button");
		}
		
	}

}
