package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame Menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.Menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Menu = new JFrame();
		Menu.setTitle("Game");
		Menu.setAlwaysOnTop(true);
		Menu.getContentPane().setBackground(new Color(0, 128, 128));
		Menu.setBackground(Color.RED);
		Menu.setBounds(100, 100, 400, 400);
		Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Menu.getContentPane().setLayout(null);
		
		JButton playbutton = new JButton("Play");
		playbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.dispose();
				GameWindow s = new GameWindow();
				s.setVisible(true);
			}
		});
		playbutton.setForeground(new Color(0, 0, 0));
		playbutton.setFont(new Font("Calibri", Font.BOLD, 22));
		playbutton.setBackground(new Color(0, 255, 0));
		playbutton.setBounds(100, 75, 175, 75);
		Menu.getContentPane().add(playbutton);
		
		JButton exitbutton = new JButton("Exit");
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitbutton.setFont(new Font("Calibri", Font.BOLD, 22));
		exitbutton.setBackground(new Color(255, 0, 51));
		exitbutton.setBounds(100, 200, 175, 75);
		Menu.getContentPane().add(exitbutton);
	}
}
