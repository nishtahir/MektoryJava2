package com.nishtahir;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import org.apache.commons.io.FileUtils;

public class UIGoodness extends JFrame {
	public UIGoodness(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		
		setLayout(new BorderLayout());
		JTextArea textArea = new JTextArea();
		JButton secButton = new JButton("Don't click me also!");
		JButton myButton = new JButton("Don't click me!");
		
		
		// Anonymous inner class
		myButton.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e){
	    		try {
					String content = FileUtils.readFileToString(new File("customerList.txt"));
					textArea.append(content);
				} catch (IOException e1) {
					textArea.append("\n An error occured. That's all i know...\n");
				}
//	    		System.out.println("Action performed!");
	    }
	});
		
		secButton.addActionListener(new ButtonAction2());
		
		
		add(myButton, BorderLayout.PAGE_START);
		add(secButton, BorderLayout.PAGE_END);
		add(textArea, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new UIGoodness();
	}

	//inner class / nested class
	private class ButtonAction2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Ooops! I did it again.");
		}
	}
}
