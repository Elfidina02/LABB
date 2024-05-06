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

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField buttonCercareAree;
	private JTextField buttonRegistrarsi;
	private JTextField buttonLogin;
	static int xx,yy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 550, 400);
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent event) {
				int x = event.getXOnScreen();
				int y = event.getYOnScreen();
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
		lblClose.setIcon(new ImageIcon(Home.class.getResource("/img/close.png")));
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setForeground(Color.WHITE);
		lblClose.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblClose.setBounds(499, 16, 30, 30);
		contentPane.add(lblClose);
		
		JLabel lblReduce = new JLabel("");
		lblReduce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblReduce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblReduce.setIcon(new ImageIcon(Home.class.getResource("/img/minus-30.png")));
		lblReduce.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduce.setForeground(Color.WHITE);
		lblReduce.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblReduce.setBounds(465, 16, 30, 30);
		contentPane.add(lblReduce);
		
		JLabel lblMenuIcon = new JLabel("");
		lblMenuIcon.setIcon(new ImageIcon(Home.class.getResource("/img/-menu-30.png")));
		lblMenuIcon.setBounds(200, 45, 30, 30);
		contentPane.add(lblMenuIcon);
		
		JLabel lblSearchIcon = new JLabel("");
		lblSearchIcon.setIcon(new ImageIcon(Home.class.getResource("/img/search-30.png")));
		lblSearchIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchIcon.setForeground(Color.WHITE);
		lblSearchIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblSearchIcon.setBackground(new Color(0, 139, 139));
		lblSearchIcon.setBounds(155, 125, 45, 40);
		contentPane.add(lblSearchIcon);
		
		buttonCercareAree = new JTextField();
		buttonCercareAree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Search().setVisible(true);
			}
		});
		buttonCercareAree.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCercareAree.setText("Cercare aree");
		buttonCercareAree.setHorizontalAlignment(SwingConstants.CENTER);
		buttonCercareAree.setForeground(new Color(25, 25, 112));
		buttonCercareAree.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		buttonCercareAree.setEditable(false);
		buttonCercareAree.setColumns(10);
		buttonCercareAree.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		buttonCercareAree.setBackground(new Color(176, 196, 222));
		buttonCercareAree.setBounds(200, 130, 200, 30);
		contentPane.add(buttonCercareAree);
		
		JLabel lblMenuTxt = new JLabel("MENU");
		lblMenuTxt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMenuTxt.setForeground(Color.WHITE);
		lblMenuTxt.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuTxt.setBounds(230, 45, 65, 30);
		contentPane.add(lblMenuTxt);
		
		JLabel lblRegIcon = new JLabel("");
		lblRegIcon.setIcon(new ImageIcon(Home.class.getResource("/img/register-30.png")));
		lblRegIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegIcon.setForeground(Color.WHITE);
		lblRegIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblRegIcon.setBackground(new Color(0, 139, 139));
		lblRegIcon.setBounds(155, 269, 30, 30);
		contentPane.add(lblRegIcon);
		
		JLabel lblFreeAccess = new JLabel("Accesso libero");
		lblFreeAccess.setHorizontalAlignment(SwingConstants.CENTER);
		lblFreeAccess.setForeground(Color.WHITE);
		lblFreeAccess.setBounds(214, 103, 150, 16);
		contentPane.add(lblFreeAccess);
		
		JLabel lblOperAuto = new JLabel("Operatori autorizzati ");
		lblOperAuto.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperAuto.setForeground(Color.WHITE);
		lblOperAuto.setBounds(214, 182, 150, 16);
		contentPane.add(lblOperAuto);
		
		buttonRegistrarsi = new JTextField();
		buttonRegistrarsi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Register().setVisible(true);
			}
		});
		buttonRegistrarsi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonRegistrarsi.setText("Registrarsi");
		buttonRegistrarsi.setHorizontalAlignment(SwingConstants.CENTER);
		buttonRegistrarsi.setForeground(new Color(0, 0, 128));
		buttonRegistrarsi.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		buttonRegistrarsi.setEditable(false);
		buttonRegistrarsi.setColumns(10);
		buttonRegistrarsi.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		buttonRegistrarsi.setBackground(new Color(176, 196, 222));
		buttonRegistrarsi.setBounds(200, 269, 200, 30);
		contentPane.add(buttonRegistrarsi);
		
		buttonLogin = new JTextField();
		buttonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Login().setVisible(true);
			}
		});
		buttonLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonLogin.setText("Login");
		buttonLogin.setHorizontalAlignment(SwingConstants.CENTER);
		buttonLogin.setForeground(new Color(0, 0, 128));
		buttonLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		buttonLogin.setEditable(false);
		buttonLogin.setColumns(10);
		buttonLogin.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		buttonLogin.setBackground(new Color(176, 196, 222));
		buttonLogin.setBounds(200, 220, 200, 30);
		contentPane.add(buttonLogin);
		
		JLabel lblLoginIcon = new JLabel("");
		lblLoginIcon.setIcon(new ImageIcon(Home.class.getResource("/img/icons8-login-30.png")));
		lblLoginIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginIcon.setForeground(Color.WHITE);
		lblLoginIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblLoginIcon.setBackground(new Color(0, 139, 139));
		lblLoginIcon.setBounds(155, 220, 30, 30);
		contentPane.add(lblLoginIcon);
		
		JLabel lblSearchBox = new JLabel("");
		lblSearchBox.setIcon(new ImageIcon(Home.class.getResource("/img/abstract.jpg")));
		lblSearchBox.setBounds(145, 122, 280, 50);
		contentPane.add(lblSearchBox);
		
		JLabel lblOperatorBox = new JLabel("");
		lblOperatorBox.setIcon(new ImageIcon(Home.class.getResource("/img/abstract.jpg")));
		lblOperatorBox.setBounds(145, 202, 280, 110);
		contentPane.add(lblOperatorBox);
		
		JLabel lblInsideBox = new JLabel("");
		lblInsideBox.setIcon(new ImageIcon(Home.class.getResource("/img/abstract.jpg")));
		lblInsideBox.setBounds(50, 89, 450, 250);
		contentPane.add(lblInsideBox);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(Home.class.getResource("/img/abstract.jpg")));
		lblBackground.setBounds(0, 0, 550, 400);
		contentPane.add(lblBackground);
	}
}
