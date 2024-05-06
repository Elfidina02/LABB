package uInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginButton;
	private JPasswordField inputPassword;
	private JTextField inputUserid;
	private JTextField registerButton;
	static int xx,yy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
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
		
		JLabel lblClose = new JLabel("");
		lblClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});
		lblClose.setIcon(new ImageIcon(Login.class.getResource("/img/close.png")));
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setForeground(Color.WHITE);
		lblClose.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblClose.setBounds(499, 17, 30, 30);
		contentPane.add(lblClose);
		
		JLabel lblReduce = new JLabel("");
		lblReduce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblReduce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblReduce.setIcon(new ImageIcon(Login.class.getResource("/img/minus-30.png")));
		lblReduce.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduce.setForeground(Color.WHITE);
		lblReduce.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblReduce.setBounds(465, 17, 30, 30);
		contentPane.add(lblReduce);
		
		JLabel lblLoginTitle = new JLabel("LOGIN");
		lblLoginTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginTitle.setForeground(Color.WHITE);
		lblLoginTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblLoginTitle.setBounds(230, 45, 85, 30);
		contentPane.add(lblLoginTitle);
		
		JLabel lblLoginIcon = new JLabel("");
		lblLoginIcon.setIcon(new ImageIcon(Login.class.getResource("/img/icons8-login-30.png")));
		lblLoginIcon.setBounds(200, 45, 30, 30);
		contentPane.add(lblLoginIcon);
		
		JLabel lblPwdTXT = new JLabel("Password");
		lblPwdTXT.setHorizontalAlignment(SwingConstants.LEFT);
		lblPwdTXT.setForeground(Color.WHITE);
		lblPwdTXT.setBounds(134, 202, 65, 16);
		contentPane.add(lblPwdTXT);
		
		loginButton = new JTextField();
		loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginButton.setText("Login");
		loginButton.setHorizontalAlignment(SwingConstants.CENTER);
		loginButton.setForeground(Color.WHITE);
		loginButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		loginButton.setEditable(false);
		loginButton.setColumns(10);
		loginButton.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		loginButton.setBackground(Color.BLUE);
		loginButton.setBounds(391, 166, 100, 30);
		contentPane.add(loginButton);
		
		inputPassword = new JPasswordField();
		inputPassword.setHorizontalAlignment(SwingConstants.CENTER);
		inputPassword.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputPassword.setBackground(new Color(176, 196, 222));
		inputPassword.setBounds(134, 221, 200, 30);
		contentPane.add(inputPassword);
		
		JLabel lblUserIDTXT = new JLabel("User-id");
		lblUserIDTXT.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserIDTXT.setForeground(Color.WHITE);
		lblUserIDTXT.setBounds(134, 147, 50, 16);
		contentPane.add(lblUserIDTXT);
		
		inputUserid = new JTextField();
		inputUserid.setHorizontalAlignment(SwingConstants.CENTER);
		inputUserid.setForeground(new Color(25, 25, 112));
		inputUserid.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputUserid.setColumns(10);
		inputUserid.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputUserid.setBackground(new Color(176, 196, 222));
		inputUserid.setBounds(134, 166, 200, 30);
		contentPane.add(inputUserid);
		
		registerButton = new JTextField();
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Register().setVisible(true);
			}
		});
		registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registerButton.setText("Registrarsi");
		registerButton.setHorizontalAlignment(SwingConstants.CENTER);
		registerButton.setForeground(new Color(0, 0, 128));
		registerButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		registerButton.setEditable(false);
		registerButton.setColumns(10);
		registerButton.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		registerButton.setBackground(new Color(176, 196, 222));
		registerButton.setBounds(308, 305, 200, 30);
		contentPane.add(registerButton);
		
		JLabel lblRegIcon = new JLabel("");
		lblRegIcon.setIcon(new ImageIcon(Login.class.getResource("/img/register-30.png")));
		lblRegIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegIcon.setForeground(Color.WHITE);
		lblRegIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblRegIcon.setBackground(new Color(0, 139, 139));
		lblRegIcon.setBounds(266, 305, 30, 30);
		contentPane.add(lblRegIcon);
		
		JLabel pwrdDimenticataLink = new JLabel("Password dimenticata? ");
		pwrdDimenticataLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pwrdDimenticataLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Reset().setVisible(true);
			}
		});
		pwrdDimenticataLink.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		pwrdDimenticataLink.setHorizontalAlignment(SwingConstants.CENTER);
		pwrdDimenticataLink.setForeground(Color.WHITE);
		pwrdDimenticataLink.setBounds(358, 281, 150, 16);
		contentPane.add(pwrdDimenticataLink);
		
		JLabel lblUserIDIcon = new JLabel("");
		lblUserIDIcon.setIcon(new ImageIcon(Login.class.getResource("/img/user-30.png")));
		lblUserIDIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserIDIcon.setForeground(Color.WHITE);
		lblUserIDIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblUserIDIcon.setBackground(new Color(0, 139, 139));
		lblUserIDIcon.setBounds(92, 166, 30, 30);
		contentPane.add(lblUserIDIcon);
		
		JLabel lblLoginTXT = new JLabel("Effettua il login ");
		lblLoginTXT.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginTXT.setForeground(Color.WHITE);
		lblLoginTXT.setBounds(58, 111, 110, 16);
		contentPane.add(lblLoginTXT);
		
		JLabel lblPwrdIcon = new JLabel("");
		lblPwrdIcon.setIcon(new ImageIcon(Login.class.getResource("/img/password-30.png")));
		lblPwrdIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwrdIcon.setForeground(Color.WHITE);
		lblPwrdIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblPwrdIcon.setBackground(new Color(0, 139, 139));
		lblPwrdIcon.setBounds(92, 218, 30, 30);
		contentPane.add(lblPwrdIcon);
		
		JLabel lblLoginIconButton = new JLabel("");
		lblLoginIconButton.setIcon(new ImageIcon(Login.class.getResource("/img/button-30.png")));
		lblLoginIconButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginIconButton.setForeground(Color.WHITE);
		lblLoginIconButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblLoginIconButton.setBackground(new Color(0, 139, 139));
		lblLoginIconButton.setBounds(354, 166, 30, 30);
		contentPane.add(lblLoginIconButton);
		
		JLabel lblBackcon = new JLabel("");
		lblBackcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBackcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Home().setVisible(true);
			}
		});

		lblBackcon.setIcon(new ImageIcon(Login.class.getResource("/img/back-30.png")));
		lblBackcon.setBounds(16, 17, 30, 30);
		contentPane.add(lblBackcon);
		
		JLabel lblAreaBox = new JLabel("");
		lblAreaBox.setIcon(new ImageIcon(Login.class.getResource("/img/abstract.jpg")));
		lblAreaBox.setBounds(58, 139, 450, 130);
		contentPane.add(lblAreaBox);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(Login.class.getResource("/img/abstract.jpg")));
		lblBackground.setBounds(0, 0, 550, 400);
		contentPane.add(lblBackground);
	}

}
