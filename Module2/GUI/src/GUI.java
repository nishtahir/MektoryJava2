import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {

	public GUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
		FlowLayout layout = new FlowLayout();
		
		JButton button = new JButton("Click Me!");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
			}
		});
		setLayout(layout);
		add(button);
		pack();
	}

	public static void main(String[] args) {
		new GUI();
	}
}
