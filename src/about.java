import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;

/**
 * this page opens when it is called with about by its first page.
 * @version 1.1
 * @author PRATHAMESH
 *@since 09/02/2022
 */
public class about extends JDialog {

	
	private static final long serialVersionUID = 4554860523688164452L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			about dialog = new about();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public about() {
		setTitle("About the game");
		setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 454, 296);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextPane txtpnThisGameIs = new JTextPane();
		txtpnThisGameIs.setText("\r\n\tThis Game is my First Game in Java Swing also i created Many Applications based on Java Swing. You can do changes in this game by adding more methods which will make the game more Attractable. \r\nYou can Download this game Source code from my code Blog. \r\nhttps://prathameshcode.blogspot.com\r\nMade This Game using JDK 17.0.1 and Eclipse 2021-12 Version.\r\nThank You For Playing this game.\r\n\r\n\r\nDeveloped By Prathamesh Dhande\r\n\r\n");
		txtpnThisGameIs.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnThisGameIs.setBackground(new Color(255, 255, 255));
		txtpnThisGameIs.setEditable(false);
		txtpnThisGameIs.setBounds(0, 0, 434, 228);
		contentPanel.add(txtpnThisGameIs);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
//						firstPage fp=new firstPage();
//						fp.frmTicTacToe.setVisible(true);
						dispose();
					}
				});
				okButton.setBackground(new Color(255, 255, 255));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
//						firstPage fp=new firstPage();
//						fp.frmTicTacToe.setVisible(true);
						dispose();
					}
				});
				cancelButton.setBackground(new Color(255, 255, 255));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
