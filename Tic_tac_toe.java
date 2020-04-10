//DEVELOPED BY DEEP JANI
package tic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class Tic_tac_toe {

	private JFrame frmTicTacToe;

	/**
	 * Launch the application.
	 */
	public static void tic() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tic_tac_toe window = new Tic_tac_toe();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tic_tac_toe( ) {
		initialize();
	}
	//public Tic_tac_toe(String s1,String s2 ) {
		//pl1 = s1;
		//pl2 = s2;
		//initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	int turn=0;
	int used[]= {0,0,0,0,0,0,0,0,0};
	int p1[]= {0,0,0,0,0,0,0,0,0};
	int p2[]= {0,0,0,0,0,0,0,0,0};
	static String pl1;
	static String pl2;
	int p1won()
	{
		if(p1[0]==1 && p1[1]==1 && p1[2]==1)
		{
			return 1;
		}
		else if(p1[3]==1 && p1[4]==1 && p1[5]==1)
		{
			return 1;
		}
		else if(p1[6]==1 && p1[7]==1 && p1[8]==1)
		{
			return 1;
		}
		else if(p1[0]==1 && p1[4]==1 && p1[8]==1)
		{
			return 1;
		}
		else if(p1[2]==1 && p1[4]==1 && p1[6]==1)
		{
			return 1;
		}
		else if(p1[0]==1 && p1[3]==1 && p1[6]==1)
		{
			return 1;
		}
		else if(p1[1]==1 && p1[4]==1 && p1[7]==1)
		{
			return 1;
		}
		else if(p1[2]==1 && p1[5]==1 && p1[8]==1)
		{
			return 1;
		}
		return 0;
	}
	int p2won()
	{
		if(p2[0]==1 && p2[1]==1 && p2[2]==1)
		{
			return 1;
		}
		else if(p2[3]==1 && p2[4]==1 && p2[5]==1)
		{
			return 1;
		}
		else if(p2[6]==1 && p2[7]==1 && p2[8]==1)
		{
			return 1;
		}
		else if(p2[0]==1 && p2[4]==1 && p2[8]==1)
		{
			return 1;
		}
		else if(p2[2]==1 && p2[4]==1 && p2[6]==1)
		{
			return 1;
		}
		else if(p2[0]==1 && p2[3]==1 && p2[6]==1)
		{
			return 1;
		}
		else if(p2[1]==1 && p2[4]==1 && p2[7]==1)
		{
			return 1;
		}
		else if(p2[2]==1 && p2[5]==1 && p2[8]==1)
		{
			return 1;
		}
		return 0;
	}
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("TIC TAC TOE");
		frmTicTacToe.setBounds(100, 100, 600, 623);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(null);
		
		String msg1=pl1 +" WON THE MATCH";
		String msg2=pl2 +" WON THE MATCH";
		JButton b1 = new JButton("");
		b1.setFont(new Font("Times New Roman", Font.BOLD, 70));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(used[0]==0)
				{
					if(turn%2==0)
					{
						turn++; 
						b1.setBackground(Color.GREEN);
						b1.setText("O");
						used[0]=1;
						p1[0]=1;
						
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe,msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
					else
					{
						turn++;
						b1.setBackground(Color.RED);
						b1.setText("X");
						used[0]=1;
						p2[0]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe,msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
				}
			}
		});
		b1.setBounds(10, 13, 142, 148);
		frmTicTacToe.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.setFont(new Font("Times New Roman", Font.BOLD, 70));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(used[1]==0)
				{
					if(turn%2==0)
					{
						turn++;
						b2.setBackground(Color.GREEN);
						b2.setText("O");
						used[1]=1;
						p1[1]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
					else
					{
						turn++;
						b2.setBackground(Color.RED);
						b2.setText("X");
						used[1]=1;
						p2[1]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
				}
			}
		});
		b2.setBounds(221, 13, 142, 148);
		frmTicTacToe.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.setFont(new Font("Times New Roman", Font.BOLD, 70));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(used[2]==0)
				{
					if(turn%2==0)
					{
						turn++;
						b3.setBackground(Color.GREEN);
						b3.setText("O");
						used[2]=1;
						p1[2]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
					else
					{
						turn++;
						b3.setBackground(Color.RED);
						b3.setText("X");
						used[2]=1;
						p2[2]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
				}
			}
		});
		b3.setBounds(434, 13, 142, 148);
		frmTicTacToe.getContentPane().add(b3);
		
		JButton b4 = new JButton("");
		b4.setFont(new Font("Times New Roman", Font.BOLD, 70));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(used[3]==0)
				{
					if(turn%2==0)
					{
						turn++;
						b4.setBackground(Color.GREEN);
						b4.setText("O");
						used[3]=1;
						p1[3]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
					else
					{
						turn++;
						b4.setBackground(Color.RED);
						b4.setText("X");
						used[3]=1;
						p2[3]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
				}
			}
		});
		b4.setBounds(11, 180, 142, 148);
		frmTicTacToe.getContentPane().add(b4);
		
		JButton b5 = new JButton("");
		b5.setFont(new Font("Times New Roman", Font.BOLD, 70));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(used[4]==0)
				{
					if(turn%2==0)
					{
						turn++;
						b5.setBackground(Color.GREEN);
						b5.setText("O");
						used[4]=1;
						p1[4]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
					else
					{
						turn++;
						b5.setBackground(Color.RED);
						b5.setText("X");
						used[4]=1;
						p2[4]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
				}
			}
		});
		b5.setBounds(221, 180, 142, 148);
		frmTicTacToe.getContentPane().add(b5);
		
		JButton b6 = new JButton("");
		b6.setFont(new Font("Times New Roman", Font.BOLD, 70));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(used[5]==0)
				{
					if(turn%2==0)
					{
						turn++;
						b6.setBackground(Color.GREEN);
						b6.setText("O");
						used[5]=1;
						p1[5]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
					else
					{
						turn++;
						b6.setBackground(Color.RED);
						b6.setText("X");
						used[5]=1;
						p2[5]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
				}
			}
		});
		b6.setBounds(434, 180, 142, 148);
		frmTicTacToe.getContentPane().add(b6);
		
		JButton b7 = new JButton("");
		b7.setFont(new Font("Times New Roman", Font.BOLD, 70));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(used[6]==0)
				{
					if(turn%2==0)
					{
						turn++;
						b7.setBackground(Color.GREEN);
						b7.setText("O");
						used[6]=1;
						p1[6]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
					else
					{
						turn++;
						b7.setBackground(Color.RED);
						b7.setText("X");
						used[6]=1;
						p2[6]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
				}
			}
		});
		b7.setBounds(10, 359, 142, 148);
		frmTicTacToe.getContentPane().add(b7);
		
		JButton b8 = new JButton("");
		b8.setFont(new Font("Times New Roman", Font.BOLD, 70));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(used[7]==0)
				{
					if(turn%2==0)
					{
						turn++;
						b8.setBackground(Color.GREEN);
						b8.setText("O");
						used[7]=1;
						p1[7]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
					else
					{
						turn++;
						b8.setBackground(Color.RED);
						b8.setText("X");
						used[7]=1;
						p2[7]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
				}
			}
		});
		b8.setBounds(221, 359, 142, 148);
		frmTicTacToe.getContentPane().add(b8);
		
		JButton b9 = new JButton("");
		b9.setFont(new Font("Times New Roman", Font.BOLD, 70));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(used[8]==0)
				{
					if(turn%2==0)
					{
						turn++;
						b9.setBackground(Color.GREEN);
						b9.setText("O");
						used[8]=1;
						p1[8]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg2);
						}
					}
					else
					{
						turn++;
						b9.setBackground(Color.RED);
						b9.setText("X");
						used[8]=1;
						p2[8]=1;
						int player1=p1won();
						int player2=p2won();
						if(player1==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe, msg1);
						}
						else if(player2==1)
						{
							JOptionPane.showMessageDialog(frmTicTacToe,msg2);
						}
					}
				}
			}
		});
		b9.setBounds(434, 359, 142, 148);
		frmTicTacToe.getContentPane().add(b9);
		
		JButton btnGameOver = new JButton("GAME OVER");
		btnGameOver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				turn=0;
				for(int i=0;i<9;i++)
				{
					used[i]=0;
					p1[i]=0;
					p2[i]=0;
				}
				b1.setText("");
				b2.setText("");
				b3.setText("");
				b4.setText("");
				b5.setText("");
				b6.setText("");
				b7.setText("");
				b8.setText("");
				b9.setText("");
				b1.setBackground(null);
				b2.setBackground(null);
				b3.setBackground(null);
				b4.setBackground(null);
				b5.setBackground(null);
				b6.setBackground(null);
				b7.setBackground(null);
				b8.setBackground(null);
				b9.setBackground(null);
				
			}
		});
		btnGameOver.setBounds(221, 531, 142, 44);
		frmTicTacToe.getContentPane().add(btnGameOver);
	}
}
