package view;

import javax.swing.*;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		
		MainPanel panel = new MainPanel();
		
		this.add(panel);
		this.setTitle("Shalom Event Manager");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
