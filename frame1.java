package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JTextField myTitle;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("test");
		//newTitle = new JTextField("titel");
		//newTitle.setBounds(80, 40, 225, 20);
		//JTextField myTitle;
		//myTitle = new JTextField("test");
		//myTitle.setBounds(80, 40, 225, 20);
		//options.add(myTitle);
		
		JButton btnYes = new JButton("yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "du tröck ja");
			}
		});
		btnYes.setBounds(223, 180, 89, 23);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("no");
		btnNo.setBounds(322, 180, 89, 23);
		frame.getContentPane().add(btnNo);
	}
}
