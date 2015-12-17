import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;

public class Introduction {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Introduction window = new Introduction();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Introduction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HeavyTask task = new HeavyTask();
		JButton btnDoCrazyStuff = new JButton("Do crazy stuff");
		btnDoCrazyStuff.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				task.execute();
			}
		});
		frame.getContentPane().add(btnDoCrazyStuff, BorderLayout.NORTH);
		
		JTextPane textPane = new JTextPane();
		frame.getContentPane().add(textPane, BorderLayout.CENTER);
		JProgressBar progressBar = new JProgressBar();
		PropertyChangeListener listener = new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if("progress".equals(evt.getPropertyName())){
					progressBar.setValue((Integer) evt.getNewValue());
				}
			}
		};
		task.addPropertyChangeListener(listener);
		frame.getContentPane().add(progressBar, BorderLayout.SOUTH);
	}

}
