package com.collections;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new  JFrame();
		frame.setSize(600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel label = new JLabel("User");
		label.setBounds(10, 20, 80, 25);panel.add(label);
		
		JTextField userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		frame.setVisible(true);

	}

}
