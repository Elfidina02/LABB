package uInterface;

import java.awt.EventQueue;
import controller.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.MatteBorder;

import DB.Query;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField inputPassword;
	private JTextField inputName;
	private JTextField inputCognome;
	private JTextField inputCodiceFiscale;
	private JTextField inputUserId;
	private JTextField inputEmail;
	static int xx,yy;
	private JPasswordField inputRePassword;
	private JTextField buttonSalva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
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
		
		setBounds(400, 200, 550, 450);
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
		lblClose.setIcon(new ImageIcon(Register.class.getResource("/img/close.png")));
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
		lblReduce.setIcon(new ImageIcon(Register.class.getResource("/img/minus-30.png")));
		lblReduce.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduce.setForeground(Color.WHITE);
		lblReduce.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblReduce.setBounds(465, 17, 30, 30);
		contentPane.add(lblReduce);
		
		JLabel lblNomeIcon = new JLabel("");
		lblNomeIcon.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-name-30.png")));
		lblNomeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeIcon.setForeground(Color.WHITE);
		lblNomeIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNomeIcon.setBackground(new Color(0, 139, 139));
		lblNomeIcon.setBounds(21, 131, 30, 30);
		contentPane.add(lblNomeIcon);
		
		JLabel lblCognomeIcon = new JLabel("");
		lblCognomeIcon.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-name-30.png")));
		lblCognomeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblCognomeIcon.setForeground(Color.WHITE);
		lblCognomeIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblCognomeIcon.setBackground(new Color(0, 139, 139));
		lblCognomeIcon.setBounds(283, 131, 30, 30);
		contentPane.add(lblCognomeIcon);
		
		JLabel lblPwrdIcon = new JLabel("");
		lblPwrdIcon.setIcon(new ImageIcon(Register.class.getResource("/img/password-30.png")));
		lblPwrdIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwrdIcon.setForeground(Color.WHITE);
		lblPwrdIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblPwrdIcon.setBackground(new Color(0, 139, 139));
		lblPwrdIcon.setBounds(21, 251, 30, 30);
		contentPane.add(lblPwrdIcon);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setHorizontalAlignment(SwingConstants.LEFT);
		lblCognome.setForeground(Color.WHITE);
		lblCognome.setBounds(320, 112, 70, 16);
		contentPane.add(lblCognome);
		
		inputCognome = new JTextField();
		inputCognome.setHorizontalAlignment(SwingConstants.CENTER);
		inputCognome.setForeground(new Color(25, 25, 112));
		inputCognome.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputCognome.setColumns(10);
		inputCognome.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputCognome.setBackground(new Color(176, 196, 222));
		inputCognome.setBounds(320, 131, 200, 30);
		contentPane.add(inputCognome);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(63, 112, 50, 16);
		contentPane.add(lblNome);
		
		inputName = new JTextField();
		inputName.setHorizontalAlignment(SwingConstants.CENTER);
		inputName.setForeground(new Color(25, 25, 112));
		inputName.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputName.setColumns(10);
		inputName.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputName.setBackground(new Color(176, 196, 222));
		inputName.setBounds(63, 131, 200, 30);
		contentPane.add(inputName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(63, 233, 70, 16);
		contentPane.add(lblPassword);
		
		inputPassword = new JPasswordField();
		
		inputPassword.setHorizontalAlignment(SwingConstants.CENTER);
		inputPassword.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputPassword.setBackground(new Color(176, 196, 222));
		inputPassword.setBounds(63, 252, 200, 30);
		contentPane.add(inputPassword);
		
		JLabel lblCodiceFiscale = new JLabel("Codice fiscale");
		lblCodiceFiscale.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodiceFiscale.setForeground(Color.WHITE);
		lblCodiceFiscale.setBounds(63, 173, 90, 16);
		contentPane.add(lblCodiceFiscale);
		
		inputCodiceFiscale = new JTextField();
		inputCodiceFiscale.setHorizontalAlignment(SwingConstants.CENTER);
		inputCodiceFiscale.setForeground(new Color(25, 25, 112));
		inputCodiceFiscale.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputCodiceFiscale.setColumns(10);
		inputCodiceFiscale.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputCodiceFiscale.setBackground(new Color(176, 196, 222));
		inputCodiceFiscale.setBounds(63, 191, 200, 30);
		contentPane.add(inputCodiceFiscale);
		
		JLabel lblCFIcon = new JLabel("");
		lblCFIcon.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-card-30.png")));
		lblCFIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblCFIcon.setForeground(Color.WHITE);
		lblCFIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblCFIcon.setBackground(new Color(0, 139, 139));
		lblCFIcon.setBounds(21, 191, 30, 30);
		contentPane.add(lblCFIcon);
		
		JLabel lblUserIDIcon = new JLabel("");
		lblUserIDIcon.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-id-30.png")));
		lblUserIDIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserIDIcon.setForeground(Color.WHITE);
		lblUserIDIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblUserIDIcon.setBackground(new Color(0, 139, 139));
		lblUserIDIcon.setBounds(283, 252, 30, 30);
		contentPane.add(lblUserIDIcon);
		
		JLabel lblRegistrati = new JLabel("REGISTRATI");
		lblRegistrati.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrati.setForeground(Color.WHITE);
		lblRegistrati.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblRegistrati.setBounds(230, 45, 130, 30);
		contentPane.add(lblRegistrati);
		
		JLabel lblRegisterIcon = new JLabel("");
		lblRegisterIcon.setIcon(new ImageIcon(Register.class.getResource("/img/register-30.png")));
		lblRegisterIcon.setBounds(200, 45, 30, 30);
		contentPane.add(lblRegisterIcon);
		
		JLabel lblBackcon = new JLabel("");
		lblBackcon.setIcon(new ImageIcon(Register.class.getResource("/img/back-30.png")));
		lblBackcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBackcon.setBounds(15, 17, 30, 30);
		lblBackcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Home().setVisible(true);
			}
		});
		contentPane.add(lblBackcon);
		
		buttonSalva = new JTextField();
		buttonSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		buttonSalva.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String a=inputPassword.getText();
				 while(!PasswordControl.isStrongPassword(a)){
					 JOptionPane.showMessageDialog( null, "Reinserisci la password");
					 a=inputPassword.getText();
					 break;
				 }
				 
				 
				String b= inputName.getText();
				String c= inputCognome.getText();
				String d= inputCodiceFiscale.getText();
					String f= inputUserId.getText();
					String g= inputEmail.getText();
					try {
						Query.registrazione(b, c, d, g, f, a);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		buttonSalva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonSalva.setText("Salva");
		buttonSalva.setHorizontalAlignment(SwingConstants.CENTER);
		buttonSalva.setForeground(Color.WHITE);
		buttonSalva.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		buttonSalva.setEditable(false);
		buttonSalva.setColumns(10);
		buttonSalva.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		buttonSalva.setBackground(Color.BLUE);
		buttonSalva.setBounds(420, 376, 100, 30);
		contentPane.add(buttonSalva);
		
		JLabel lblSaveIcon = new JLabel("");
		lblSaveIcon.setIcon(new ImageIcon(Register.class.getResource("/img/confirm-30.png")));
		lblSaveIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaveIcon.setForeground(Color.WHITE);
		lblSaveIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblSaveIcon.setBackground(new Color(0, 139, 139));
		lblSaveIcon.setBounds(385, 376, 30, 30);
		contentPane.add(lblSaveIcon);
		
		JLabel lblRePassword = new JLabel("Ripeti password");
		lblRePassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblRePassword.setForeground(Color.WHITE);
		lblRePassword.setBounds(63, 294, 105, 16);
		contentPane.add(lblRePassword);
		
		JLabel lblRePwrdIcon = new JLabel("");
		lblRePwrdIcon.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-password-30.png")));
		lblRePwrdIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblRePwrdIcon.setForeground(Color.WHITE);
		lblRePwrdIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblRePwrdIcon.setBackground(new Color(0, 139, 139));
		lblRePwrdIcon.setBounds(21, 313, 30, 30);
		contentPane.add(lblRePwrdIcon);
		
		JLabel lblEmailIcon = new JLabel("");
		lblEmailIcon.setIcon(new ImageIcon(Register.class.getResource("/img/icons8-email-30.png")));
		lblEmailIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailIcon.setForeground(Color.WHITE);
		lblEmailIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblEmailIcon.setBackground(new Color(0, 139, 139));
		lblEmailIcon.setBounds(283, 191, 30, 30);
		contentPane.add(lblEmailIcon);
		
		inputRePassword = new JPasswordField();
		inputRePassword.setHorizontalAlignment(SwingConstants.CENTER);
		inputRePassword.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputRePassword.setBackground(new Color(176, 196, 222));
		inputRePassword.setBounds(63, 313, 200, 30);
		contentPane.add(inputRePassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(320, 173, 90, 16);
		contentPane.add(lblEmail);
		
		inputEmail = new JTextField();
		inputEmail.setHorizontalAlignment(SwingConstants.CENTER);
		inputEmail.setForeground(new Color(25, 25, 112));
		inputEmail.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputEmail.setColumns(10);
		inputEmail.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputEmail.setBackground(new Color(176, 196, 222));
		inputEmail.setBounds(319, 191, 200, 30);
		contentPane.add(inputEmail);
		
		JLabel lblUserId = new JLabel("User-Id");
		lblUserId.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setBounds(320, 233, 70, 16);
		contentPane.add(lblUserId);
		
		inputUserId = new JTextField();
		inputUserId.setHorizontalAlignment(SwingConstants.CENTER);
		inputUserId.setForeground(new Color(25, 25, 112));
		inputUserId.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputUserId.setColumns(10);
		inputUserId.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputUserId.setBackground(new Color(176, 196, 222));
		inputUserId.setBounds(321, 252, 200, 30);
		contentPane.add(inputUserId);
		
		JLabel lblInsideBox = new JLabel("");
		lblInsideBox.setIcon(new ImageIcon(Register.class.getResource("/img/abstract.jpg")));
		lblInsideBox.setBounds(15, 89, 520, 275);
		contentPane.add(lblInsideBox);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(Register.class.getResource("/img/abstract.jpg")));
		lblBackground.setBounds(0, 0, 550, 450);
		contentPane.add(lblBackground);
	}

}
