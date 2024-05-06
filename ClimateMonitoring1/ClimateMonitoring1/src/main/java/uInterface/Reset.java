package uInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class Reset extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputUserID;
	private JTextField buttonReset;
	static int xx,yy;
	private JTextField inputMail;
	private JTextField outputPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reset frame = new Reset();
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
	public Reset() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent event) {
				int x = event.getXOnScreen();
				int y= event.getYOnScreen();
				setLocation(x-xx, y-yy);
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent event) {
				xx = event.getX();
				yy = event.getY();
			}
		});
		setBounds(400, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBackIcon = new JLabel("");
		lblBackIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBackIcon.setIcon(new ImageIcon(Reset.class.getResource("/img/back-30.png")));
		lblBackIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Home().setVisible(true);
			}
		});
		lblBackIcon.setBounds(16, 17, 30, 30);
		contentPane.add(lblBackIcon);
		
		JLabel lblResetIconTitle = new JLabel("");
		lblResetIconTitle.setIcon(new ImageIcon(Reset.class.getResource("/img/password-reset-30.png")));
		lblResetIconTitle.setBounds(150, 45, 30, 30);
		contentPane.add(lblResetIconTitle);
		
		JLabel lblResetTitle = new JLabel("RECUPERA PASSWORD");
		lblResetTitle.setBounds(185, 45, 220, 25);
		lblResetTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblResetTitle.setForeground(Color.WHITE);
		lblResetTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lblResetTitle);
		
		JLabel lblReduce = new JLabel("");
		lblReduce.setIcon(new ImageIcon(Reset.class.getResource("/img/minus-30.png")));
		lblReduce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblReduce.setBounds(465, 17, 30, 30);
		lblReduce.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduce.setForeground(Color.WHITE);
		lblReduce.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lblReduce);
		
		JLabel lblClose = new JLabel("");
		lblClose.setIcon(new ImageIcon(Reset.class.getResource("/img/close.png")));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});
		lblClose.setBounds(499, 17, 30, 30);
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setForeground(Color.WHITE);
		lblClose.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		contentPane.add(lblClose);
		
		JLabel lblResetTXT = new JLabel("Recupera  password");
		lblResetTXT.setBounds(58, 111, 130, 16);
		lblResetTXT.setHorizontalAlignment(SwingConstants.CENTER);
		lblResetTXT.setForeground(Color.WHITE);
		contentPane.add(lblResetTXT);
		
		JLabel lblUserIDIcon = new JLabel("");
		lblUserIDIcon.setIcon(new ImageIcon(Reset.class.getResource("/img/user-30.png")));
		lblUserIDIcon.setBounds(92, 166, 30, 30);
		lblUserIDIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserIDIcon.setForeground(Color.WHITE);
		lblUserIDIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblUserIDIcon.setBackground(new Color(0, 139, 139));
		contentPane.add(lblUserIDIcon);
		
		JLabel lblUserIDTXT = new JLabel("User-id");
		lblUserIDTXT.setBounds(134, 147, 48, 16);
		lblUserIDTXT.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserIDTXT.setForeground(Color.WHITE);
		contentPane.add(lblUserIDTXT);
		
		inputUserID = new JTextField();
		inputUserID.setBounds(134, 166, 200, 30);
		inputUserID.setHorizontalAlignment(SwingConstants.CENTER);
		inputUserID.setForeground(new Color(25, 25, 112));
		inputUserID.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputUserID.setColumns(10);
		inputUserID.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputUserID.setBackground(new Color(176, 196, 222));
		contentPane.add(inputUserID);
		
		JLabel lblResetconButton = new JLabel("");
		lblResetconButton.setIcon(new ImageIcon(Reset.class.getResource("/img/password-reset-30.png")));
		lblResetconButton.setBounds(356, 166, 30, 30);
		lblResetconButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblResetconButton.setForeground(Color.WHITE);
		lblResetconButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblResetconButton.setBackground(new Color(0, 139, 139));
		contentPane.add(lblResetconButton);
		
		buttonReset = new JTextField();
		buttonReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonReset.setBounds(391, 166, 100, 30);
		buttonReset.setText("Recupera");
		buttonReset.setHorizontalAlignment(SwingConstants.CENTER);
		buttonReset.setForeground(Color.WHITE);
		buttonReset.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		buttonReset.setEditable(false);
		buttonReset.setColumns(10);
		buttonReset.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		buttonReset.setBackground(Color.BLUE);
		contentPane.add(buttonReset);
		
		inputMail = new JTextField();
		inputMail.setHorizontalAlignment(SwingConstants.CENTER);
		inputMail.setForeground(new Color(25, 25, 112));
		inputMail.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputMail.setColumns(10);
		inputMail.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputMail.setBackground(new Color(176, 196, 222));
		inputMail.setBounds(134, 221, 200, 30);
		contentPane.add(inputMail);
		
		JLabel lblOutputPwrdIcon = new JLabel("");
		lblOutputPwrdIcon.setIcon(new ImageIcon(Reset.class.getResource("/img/confirm-30.png")));
		lblOutputPwrdIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutputPwrdIcon.setForeground(Color.WHITE);
		lblOutputPwrdIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblOutputPwrdIcon.setBackground(new Color(0, 139, 139));
		lblOutputPwrdIcon.setBounds(270, 285, 30, 30);
		contentPane.add(lblOutputPwrdIcon);
		
		outputPassword = new JTextField();
		outputPassword.setText("Password recuperata");
		outputPassword.setEditable(false);
		outputPassword.setHorizontalAlignment(SwingConstants.CENTER);
		outputPassword.setForeground(new Color(25, 25, 112));
		outputPassword.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		outputPassword.setColumns(10);
		outputPassword.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		outputPassword.setBackground(new Color(176, 196, 222));
		outputPassword.setBounds(308, 285, 200, 30);
		contentPane.add(outputPassword);
		
		JLabel lblMailIcon = new JLabel("");
		lblMailIcon.setIcon(new ImageIcon(Reset.class.getResource("/img/icons8-email-30.png")));
		lblMailIcon.setBounds(92, 218, 30, 30);
		lblMailIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblMailIcon.setForeground(Color.WHITE);
		lblMailIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblMailIcon.setBackground(new Color(0, 139, 139));
		contentPane.add(lblMailIcon);
		
		JLabel lblMailTXT = new JLabel("E-Mail");
		lblMailTXT.setBounds(134, 202, 45, 16);
		lblMailTXT.setHorizontalAlignment(SwingConstants.LEFT);
		lblMailTXT.setForeground(Color.WHITE);
		contentPane.add(lblMailTXT);
		
		JLabel lblAreaBox = new JLabel("");
		lblAreaBox.setIcon(new ImageIcon(Reset.class.getResource("/img/abstract.jpg")));
		lblAreaBox.setBounds(58, 139, 450, 130);
		contentPane.add(lblAreaBox);
		
		JLabel lblRegIcon = new JLabel("");
		lblRegIcon.setBounds(300, 72, 0, 0);
		lblRegIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegIcon.setForeground(Color.WHITE);
		lblRegIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblRegIcon.setBackground(new Color(0, 139, 139));
		contentPane.add(lblRegIcon);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 550, 400);
		lblBackground.setIcon(new ImageIcon(Reset.class.getResource("/img/abstract.jpg")));
		contentPane.add(lblBackground);
	}

}
