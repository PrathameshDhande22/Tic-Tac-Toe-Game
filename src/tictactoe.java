import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * This file creates the game for 2 player
 * @version 1.1
 * @author PRATHAMESH
 * @since 09/02/2022
 *
 */
public class tictactoe implements ActionListener {

	private JFrame frmTicTacToe;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset;
	private int count = 0;
	private String letter = "";
	private boolean win = false;
	private String user1 = "Player 1";
	private String user2 = "Player 2";
	private JLabel name;
	private JPanel panel_1;
	private String winner;
	private JLabel player1;
	private JLabel player2;
	private JPanel panel_2;

	
	
	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe window = new tictactoe();
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
	public tictactoe() {
		Font font = new Font("Tahoma", Font.PLAIN, 90);

		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic Tac Toe");
		frmTicTacToe.getContentPane().setBackground(new Color(255, 102, 0));
		frmTicTacToe.getContentPane().setLayout(null);
		frmTicTacToe.setResizable(false);
		frmTicTacToe.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 23));
		lblNewLabel.setBounds(226, 11, 204, 32);
		frmTicTacToe.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(26, 83, 364, 303);
		frmTicTacToe.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3));
		panel.setBorder(new LineBorder(Color.black, 2));

		btn1 = new JButton("");
		btn1.setFont(font);
		btn1.setBackground(new Color(255, 255, 255));
		panel.add(btn1);
		btn1.addActionListener(this);

		btn2 = new JButton("");
		btn2.setFont(font);
		btn2.setBackground(new Color(255, 255, 255));
		panel.add(btn2);
		btn2.addActionListener(this);

		btn3 = new JButton("");
		btn3.setFont(font);
		btn3.setBackground(new Color(255, 255, 255));
		panel.add(btn3);
		btn3.addActionListener(this);

		btn4 = new JButton("");
		btn4.setFont(font);
		btn4.setBackground(new Color(255, 255, 255));
		panel.add(btn4);
		btn4.addActionListener(this);

		btn5 = new JButton("");
		btn5.setFont(font);
		btn5.setBackground(new Color(255, 255, 255));
		panel.add(btn5);
		btn5.addActionListener(this);

		btn6 = new JButton("");
		btn6.setFont(font);
		btn6.setBackground(new Color(255, 255, 255));
		panel.add(btn6);
		btn6.addActionListener(this);

		btn7 = new JButton("");
		btn7.setFont(font);
		btn7.setBackground(new Color(255, 255, 255));
		panel.add(btn7);
		btn7.addActionListener(this);

		btn8 = new JButton("");
		btn8.setFont(font);
		btn8.setBackground(new Color(255, 255, 255));
		panel.add(btn8);
		btn8.addActionListener(this);

		btn9 = new JButton("");
		btn9.setFont(font);
		btn9.setBackground(new Color(255, 255, 255));
		panel.add(btn9);
		btn9.addActionListener(this);

		reset = new JButton("Reset");
		reset.setFont(new Font("Calibri", Font.BOLD, 19));
		reset.setBackground(new Color(173, 255, 47));
		reset.setBorder(new LineBorder(Color.BLACK, 2));
		reset.setBounds(451, 73, 149, 40);
		reset.addActionListener(this);
		frmTicTacToe.getContentPane().add(reset);

		name = new JLabel("Name ");
		name.setBackground(new Color(255, 204, 0));
		name.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		name.setBounds(33, 48, 357, 32);

		frmTicTacToe.getContentPane().add(name);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 51));
		panel_1.setBounds(26, 48, 364, 32);
		panel_1.setBorder(new LineBorder(Color.black, 1));

		frmTicTacToe.getContentPane().add(panel_1);

		player2 = new JLabel("New label");
		player2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		player2.setBounds(410, 155, 200, 32);

		frmTicTacToe.getContentPane().add(player2);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 204));
		panel_2.setBounds(400, 124, 210, 65);
		frmTicTacToe.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		player1 = new JLabel("New label");
		player1.setBounds(10, 0, 200, 34);

		panel_2.add(player1);
		player1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnNewButton = new JButton("\u2190 Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Go Back ", "Confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(a==JOptionPane.YES_OPTION) {
//					firstPage fp=new firstPage();
//					fp.frmTicTacToe.setVisible(true);
					frmTicTacToe.dispose();
				}
				
			
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 11, 92, 25);
		frmTicTacToe.getContentPane().add(btnNewButton);
		frmTicTacToe.setBackground(Color.WHITE);
		frmTicTacToe.setBounds(100, 100, 652, 465);
		frmTicTacToe.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				user1 = JOptionPane.showInputDialog(null, "Enter The Player 1 Name :", "Name",
						JOptionPane.INFORMATION_MESSAGE);
				user2 = JOptionPane.showInputDialog(null, "Enter The Player 2 Name :", "Name",
						JOptionPane.INFORMATION_MESSAGE);
				if (user1 == null && user2 == null) {
					System.out.print("yes");
					user1 = "Player 1";
					user2 = "Player 2";
				} else if (user1 == null) {
					user1 = "Player 1";
				} else if (user2 == null) {
					user2 = "Player 2";
				}
				name.setText(user1 + " turn: as X");
				player2.setText(user2 + " As O");
				player1.setText(user1 + " as X");

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				frmTicTacToe.dispose();

			}

			@Override
			public void windowClosed(WindowEvent e) {
				firstPage fp = new firstPage();
				fp.frmTicTacToe.setVisible(true);

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(user1+"\n"+user2);

		count++;
		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
			letter = "X";
		} else if (count == 2 || count == 4 || count == 6 || count == 8) {
			letter = "O";
		} else {
			letter = "";
			count = 0;
		}
		setName();

		if (e.getSource() == btn1) {
			btn1.setText(letter);
			btn1.setEnabled(false);
			System.out.println(letter + count);
		} else if (e.getSource() == btn2) {
			btn2.setText(letter);
			btn2.setEnabled(false);
			System.out.println(letter + count);
		} else if (e.getSource() == btn3) {
			btn3.setText(letter);
			btn3.setEnabled(false);
			System.out.println(letter + count);
		} else if (e.getSource() == btn4) {
			btn4.setText(letter);
			btn4.setEnabled(false);
			System.out.println(letter + count);
		} else if (e.getSource() == btn5) {
			btn5.setText(letter);
			btn5.setEnabled(false);
			System.out.println(letter + count);
		} else if (e.getSource() == btn6) {
			btn6.setText(letter);
			btn6.setEnabled(false);
			System.out.println(letter + count);
		} else if (e.getSource() == btn7) {
			btn7.setText(letter);
			btn7.setEnabled(false);
			System.out.println(letter + count);
		} else if (e.getSource() == btn8) {
			btn8.setText(letter);
			btn8.setEnabled(false);
			System.out.println(letter + count);
		} else if (e.getSource() == btn9) {
			btn9.setText(letter);
			btn9.setEnabled(false);
			System.out.println(letter + count);
		}

		if (e.getSource() == reset) {
			resetAllButton();

		}
		checkWinner();

	}

	private void setName() {
		if (count == 1) {
			name.setText(user2 + " turn: as O");
		} else if (count == 2) {
			name.setText(user1 + " turn: as X");
		} else if (count == 3) {
			name.setText(user2 + " turn: as O");
		} else if (count == 4) {
			name.setText(user1 + " turn: as X");
		} else if (count == 5) {
			name.setText(user2 + " turn: as O");
		} else if (count == 6) {
			name.setText(user1 + " turn: as X");
		} else if (count == 7) {
			name.setText(user2 + " turn: as O");
		} else if (count == 8) {
			name.setText(user1 + " turn:as X");
		} else if (count == 9) {
			name.setText(user2 + " turn: as O");
		}
	}

	private void resetAllButton() {
		win = false;
		btn1.setText("");
		btn2.setText("");
		btn3.setText("");
		btn4.setText("");
		btn5.setText("");
		btn6.setText("");
		btn7.setText("");
		btn8.setText("");
		btn9.setText("");
		name.setText(user1 + " turn: as X");

		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		letter = "";
		count = 0;
		win = false;
	}

	private void deactivateButton() {
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
	}

	private void checkWinner() {
		// check vertically 1st row
		if (btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText() && btn1.getText() != ""
				&& btn2.getText() != "" && btn3.getText() != "") {
			win = true;
			btn4.setText("");
			btn5.setText("");
			btn6.setText("");
			btn7.setText("");
			btn8.setText("");
			btn9.setText("");
			winner = name.getText();
			System.out.println(winner);

		}
		// check vertically 2nd row
		else if (btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText() && btn4.getText() != ""
				&& btn5.getText() != "" && btn6.getText() != "") {
			win = true;
			btn1.setText("");
			btn2.setText("");
			btn3.setText("");
			btn7.setText("");
			btn8.setText("");
			btn9.setText("");
			winner = name.getText();
			System.out.println(winner);
		}
		// check vertically 3rd row
		else if (btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText() && btn7.getText() != ""
				&& btn8.getText() != "" && btn9.getText() != "") {
			win = true;
			btn4.setText("");
			btn5.setText("");
			btn6.setText("");
			btn1.setText("");
			btn2.setText("");
			btn3.setText("");
			winner = name.getText();
			System.out.println(winner);
		}
		// check horizontally 1st column
		else if (btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText() && btn1.getText() != ""
				&& btn4.getText() != "" && btn7.getText() != "") {
			win = true;
			btn2.setText("");
			btn5.setText("");
			btn6.setText("");
			btn3.setText("");
			btn8.setText("");
			btn9.setText("");
			winner = name.getText();
			System.out.println(winner);
		}
		// check horizontally 2nd column
		else if (btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText() && btn2.getText() != ""
				&& btn5.getText() != "" && btn8.getText() != "") {
			win = true;
			btn4.setText("");
			btn1.setText("");
			btn6.setText("");
			btn7.setText("");
			btn3.setText("");
			btn9.setText("");
			winner = name.getText();
			System.out.println(winner);
		}
		// check horizontally 3rd column
		else if (btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText() && btn3.getText() != ""
				&& btn6.getText() != "" && btn9.getText() != "") {
			win = true;
			btn4.setText("");
			btn5.setText("");
			btn1.setText("");
			btn7.setText("");
			btn8.setText("");
			btn2.setText("");
			winner = name.getText();
			System.out.println(winner);
		}
		// check diagonally 1st X
		else if (btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText() && btn1.getText() != ""
				&& btn5.getText() != "" && btn9.getText() != "") {
			win = true;
			btn4.setText("");
			btn2.setText("");
			btn6.setText("");
			btn7.setText("");
			btn8.setText("");
			btn3.setText("");
			winner = name.getText();
			System.out.println(winner);
		}
		// check diagonally 2nd X
		else if (btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText() && btn3.getText() != ""
				&& btn5.getText() != "" && btn7.getText() != "") {
			win = true;
			btn4.setText("");
			btn1.setText("");
			btn6.setText("");
			btn2.setText("");
			btn8.setText("");
			btn9.setText("");
			winner = name.getText();
			System.out.println(winner);
		} else {
			win = false;

		}

		if (win) {
			if (winner.equals(user1 + " turn: as X")) {
				System.out.println("O is winner");
				name.setText(user2 + " is Winner");
				JOptionPane.showMessageDialog(null, name.getText(), "Congratulation " + user2,
						JOptionPane.INFORMATION_MESSAGE);
			} else if (winner.equals(user2 + " turn: as O")) {
				System.out.println("X is wineer");
				name.setText(user1 + " is Winner");
				JOptionPane.showMessageDialog(null, name.getText(), "Congratulation " + user1,
						JOptionPane.INFORMATION_MESSAGE);
			}
			System.out.print("rights");

			deactivateButton();
		} else if (!win && count == 9) {
			name.setText("Tie Play Again By Clicking on Reset Button ");
			deactivateButton();
		}
	}
}
