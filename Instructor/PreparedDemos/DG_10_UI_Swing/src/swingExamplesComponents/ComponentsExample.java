package swingExamplesComponents;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class ComponentsExample extends JFrame {
	
	Container container;
	JPanel panel1, panel2, panel3;
	JLabel label1, label2;
	JTextField textField1, textField2;
	JList<String> list;
	JTabbedPane tabbedPane;
	JSplitPane splitPane;
	JRadioButton b1, b2, b3, b4;
	ButtonGroup group, group2;
	
	public ComponentsExample() {
		initUI();
	}
	
	private void initUI() {
		setTitle("Components Example");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		container = this.getContentPane();
		container.setLayout(new GridLayout(2,1));
		
		createComponents();
		
		//container.add(panel1);
		//container.add(panel2);
		
		container.add(tabbedPane);
		
	}
	
	public void createComponents() {
		
		// Demo 9.09 Panels
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,1));
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createLineBorder(Color.red));
		
		// Demo 9.10 Label/TextField pairs
		label1 = new JLabel("Name:");
		panel1.add(label1);
		textField1 = new JTextField();
		textField1.setColumns(20);
		panel1.add(textField1);
		
		label2 = new JLabel("Favourite Colour:");
		panel1.add(label2);
		textField2 = new JTextField();
		textField2.setColumns(20);
		panel1.add(textField2);
		
		// Demo 9.11 Lists
		String[] animals = {"Cat", "Dog", "Rabbit", "Fish"};
		list = new JList<String>(animals);
		panel2.add(list);
		
		// Demo 9.12 - Tabbed Panes
		tabbedPane = new JTabbedPane();
		tabbedPane.setFont(new Font("Arial", 0 ,16));
		tabbedPane.add("Text Fields", panel1);
		tabbedPane.add("List", panel2);
		
		// Demo 9.13 - Split Panels
		splitPane = new JSplitPane();
		splitPane.setDividerLocation(200);
		splitPane.setLeftComponent(panel1);
		splitPane.setRightComponent(panel2);
		tabbedPane.add("Split", splitPane);
		
		
		// Demo 9.14 Radio Buttons and Grouping Items
		b1 = new JRadioButton("Option 1");
		b2 = new JRadioButton("Option 2");
		b3 = new JRadioButton("Option A");
		b4 = new JRadioButton("Option B");
		
		group = new ButtonGroup();
		group.add(b1);
		group.add(b2);

		group2 = new ButtonGroup();
		group2.add(b3);
		group2.add(b4);

		
		panel2.add(b1, b2);
		panel2.add(b3);
		panel2.add(b4);
		
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				ComponentsExample example = new ComponentsExample();
				example.setVisible(true);
				
			}
			
		});
	}

}
