package com.nishtahir;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.commons.io.FileUtils;

// Employee 

public class Application extends JFrame {

	// AWT - Abstract window toolkit
	public Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setLayout(new BorderLayout());

		JButton openButton = new JButton("Open");
		openButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Application.this, "You broke everything. Everything is ruined.",
						"You messed up!", JOptionPane.ERROR_MESSAGE);
			}
		});

		JButton otherButton = new JButton("Input");
		otherButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userInput = JOptionPane.showInputDialog("Enter an email");
				if (validateEmail(userInput)) {
					JOptionPane.showMessageDialog(null, "Thanks. We'll spam you later");
				}
			}

			private boolean validateEmail(String userInput) {
				return true;
			}
		});

		JButton fileButton = new JButton("file");
		fileButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Comma seperated values (*.csv)",
						"csv", "tsv", "csvx");
				fileChooser.setFileFilter(fileFilter);
				int option = fileChooser.showOpenDialog(Application.this);

				switch (option) {
				case JFileChooser.APPROVE_OPTION:
					File selectedFile = fileChooser.getSelectedFile();
					try {
						String fileContent = FileUtils.readFileToString(selectedFile);
						parseCsv(fileContent);
					} catch (IOException e1) {
						e1.printStackTrace();
					}

					break;
				case JFileChooser.CANCEL_OPTION:

					break;
				default:
					JOptionPane.showMessageDialog(null, "Something went wrong. That's all i know");
				}
			}

		});

		JPanel myPanel = new JPanel();
		myPanel.add(openButton);
		myPanel.add(otherButton);
		myPanel.add(fileButton);
		add(myPanel, BorderLayout.PAGE_START);
		setVisible(true);

		Address a = new Address.Builder()
				.county("NYC county")
				.streetName("Wallstreet")
				.appartmentNumber(114)
				.city("Manhattan")
				.create();
	}

	private void parseCsv(String fileContent) {
		String[] lines = fileContent.split("\n");
		for(String line : lines){
			String[] content = line.split(",");
			
		}
		Employee employee;
		Address address;
	}

	public static void main(String[] args) {
		new Application();
	}

}
