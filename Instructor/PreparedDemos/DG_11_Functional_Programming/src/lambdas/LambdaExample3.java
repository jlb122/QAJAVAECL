package lambdas;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class LambdaExample3 extends JFrame {
	
	public LambdaExample3() {
		initUI();
	}
	
	private void initUI() {
		setTitle("Components Example");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		
		JButton newButton = new JButton("New");
		
		// Demo 11.09 - ActionListener with Anonymous Function
/*		newButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked the new button");				
			}			
		});*/
		
		// Demo 11.10 - ActionListener with Lambda Expression
		newButton.addActionListener(e -> System.out.println("You clicked the new button"));
		
		container.add(newButton);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				LambdaExample3 le3 = new LambdaExample3();
				le3.setVisible(true);
			}
		});
	}
}
