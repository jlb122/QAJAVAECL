package miscellaneous;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionPaneExample extends JFrame {  

	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private Container container;

	public JOptionPaneExample(){
		initUI();
	}

	private void initUI(){
		setTitle("JOptionPane Example");
		setSize(400,400);
		setLayout(new GridLayout(3, 1));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		container = this.getContentPane();

		headerLabel = new JLabel("", JLabel.CENTER);        
		headerLabel.setText("JOptionPane Examples"); 
		
		statusLabel = new JLabel("",JLabel.CENTER);    
		statusLabel.setSize(350,100);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		container.add(headerLabel);
		container.add(controlPanel);
		container.add(statusLabel);
		
		showDialogs();
	}

	private void showDialogs(){                                       
		// Demo 9.15 - JOptionPaneActionListeners 
		JButton okButton = new JButton("OK");        
		JButton javaButton = new JButton("Yes/No");
		JButton cancelButton = new JButton("Yes/No/Cancel");

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(
						container, "JOptionPaneExample");
			}          
		});

		javaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int output = JOptionPane.showConfirmDialog(container
						, "Click any button"
						,"JOptionPaneExample"
						,JOptionPane.YES_NO_OPTION);

				if(output == JOptionPane.YES_OPTION){
					statusLabel.setText("Yes selected.");
				}else if(output == JOptionPane.NO_OPTION){
					statusLabel.setText("No selected.");
				}
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {                
				int output = JOptionPane.showConfirmDialog(container
						, "Click any button"
						,"JOptionPaneExample"
						,JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

				if(output == JOptionPane.YES_OPTION){
					statusLabel.setText("Yes selected.");
				}else if(output == JOptionPane.NO_OPTION){
					statusLabel.setText("No selected.");
				}else if(output == JOptionPane.CANCEL_OPTION){
					statusLabel.setText("Cancel selected.");
				}
			}
		});

		controlPanel.add(okButton);
		controlPanel.add(javaButton);
		controlPanel.add(cancelButton);        
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run() {
				JOptionPaneExample  swingControlDemo = new JOptionPaneExample();
				swingControlDemo.setVisible(true);
			}
		});	         
	}
}
