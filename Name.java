//DEVELOPED BY DEEP JANI
package tic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Name extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Name frame = new Name();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Name() {
		setTitle("NAME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Player1 = new JButton("NAME OF PLAYER 1");
		Player1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		Player1.setBounds(47, 11, 334, 43);
		contentPane.add(Player1);
		
		JButton Player2 = new JButton("NAME OF PLAYER 2");
		Player2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		Player2.setBounds(47, 122, 334, 36);
		contentPane.add(Player2);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(47, 70, 334, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(47, 178, 334, 36);
		contentPane.add(textField_1);
		String name2 = textField_1.getText();
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tic_tac_toe t1 = new Tic_tac_toe();
				tic.Tic_tac_toe.pl1 = textField.getText();
				tic.Tic_tac_toe.pl2 = textField_1.getText();
				Tic_tac_toe.tic();
			}
		});
		btnPlay.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnPlay.setBounds(173, 229, 89, 23);
		contentPane.add(btnPlay);
	}
}
