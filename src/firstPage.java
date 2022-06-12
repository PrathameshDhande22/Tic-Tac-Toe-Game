import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This is the First Page of the game which give you the option of playing the game
 * @version 1.1
 * @author PRATHAMESH
 *@since 09/02/2022
 */
public class firstPage {

	JFrame frmTicTacToe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstPage window = new firstPage();
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
	public firstPage() {

		String arg = "E:\\java_Programs\\Tictactoe\\src\\animated.gif"; // specify the gif
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic Tac Toe Game");
		frmTicTacToe.getContentPane().setBackground(Color.WHITE);
		frmTicTacToe.setSize(648, 359);
		frmTicTacToe.setResizable(false);
		frmTicTacToe.setLocationRelativeTo(null);
		frmTicTacToe.getContentPane().setLayout(null);
		ImageIcon icon = new ImageIcon(arg);

		JLabel media = new JLabel("");
		media.setBounds(0, 0, 492, 320);
		frmTicTacToe.getContentPane().add(media);
		media.setIcon(icon);
//		media.setBorder(new LineBorder(Color.black, 3));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		panel.setBounds(492, 0, 140, 331);
		frmTicTacToe.getContentPane().add(panel);
		panel.setLayout(null);

		JButton exit = new JButton("EXIT");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTicTacToe.dispose();
				
			}
		});
		exit.setBackground(new Color(173, 255, 47));
		exit.setFont(new Font("Segoe UI", Font.BOLD, 18));
		exit.setBounds(10, 138, 110, 33);
		panel.add(exit);

		JButton about = new JButton("ABOUT");
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about ab=new about();
				ab.setVisible(true);
			}
		});
		about.setBackground(new Color(173, 255, 47));
		about.setFont(new Font("Segoe UI", Font.BOLD, 18));
		about.setBounds(10, 96, 110, 33);
		panel.add(about);

		JButton play = new JButton("PLAY");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictactoe tt=new tictactoe();
				tt.main(null);
				frmTicTacToe.dispose();
			}
		});
		play.setBackground(new Color(173, 255, 47));
		play.setBounds(10, 52, 108, 33);
		panel.add(play);
		play.setFont(new Font("Segoe UI", Font.BOLD, 18));
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
