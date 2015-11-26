import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
* Swing forms are instances of JFrame forms
*/
public class HelloSwing extends JFrame {

	public HelloSwing() {

		//This tells the form that whenever we
		//close the window, the program should
		//exit as well
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Here we set the size, to 500 width
		//and 500 height
		setSize(500, 500);

		//Here we create and set the layout for the form
		FlowLayout layout = new FlowLayout();
		setLayout(layout);

		//Now create an instance of JButton
		JButton button = new JButton("Click Me!");

		//Next we add an action listener to the form using
		//an Anonymous inner class to set the values
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//This is called whenever the button is clicked
				System.out.println("Hello World");
			}
		});

		//Add the button to the frame
		add(button);

		//Make the frame visible on the screen
		setVisible(true);
	}

	public static void main(String[] args) {
		//Create an instance of our frame
		new HelloSwing();
	}
}
