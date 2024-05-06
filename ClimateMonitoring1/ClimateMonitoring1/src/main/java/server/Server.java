package server;

import java.awt.EventQueue;

import DB.*;
import uInterface.Parametrs;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Server extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputUsername;
	private JTextField buttonStartDB;
	private JTextField inputHost;
	private JTextField inputPort;
	private JPasswordField inputPassword;
	static int xx,yy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
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
	public Server() {
			
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 400, 530);
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y= e.getYOnScreen();
				setLocation(x-xx, y-yy);
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				yy=e.getY();
			}
		});
		
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setMaximumSize(new Dimension(2500, 32767));
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("");
		lblUser.setBounds(74, 185, 45, 40);
		lblUser.setBackground(new Color(0, 139, 139));
		lblUser.setIcon(new ImageIcon(Server.class.getResource("/img/user-30.png")));
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setForeground(new Color(255, 255, 255));
		lblUser.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(lblUser);
		
		inputUsername = new JTextField();
		inputUsername.setBounds(121, 190, 200, 30);
		inputUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		inputUsername.setEditable(false);
		inputUsername.setForeground(new Color(25, 25, 112));
		inputUsername.setHorizontalAlignment(SwingConstants.CENTER);
		inputUsername.setText("postgres");
		inputUsername.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputUsername.setBackground(new Color(176, 196, 222));
		contentPane.add(inputUsername);
		inputUsername.setColumns(10);
		
		JLabel lblCentroMntrg = new JLabel("");
		lblCentroMntrg.setBounds(153, 70, 100, 100);
		lblCentroMntrg.setIcon(new ImageIcon(Server.class.getResource("/img/climate-100.png")));
		contentPane.add(lblCentroMntrg);
		
		inputPassword = new JPasswordField();
		inputPassword.setHorizontalAlignment(SwingConstants.CENTER);
		inputPassword.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputPassword.setBackground(new Color(176, 196, 222));
		inputPassword.setBounds(121, 243, 200, 30);
		contentPane.add(inputPassword);
		
		buttonStartDB = new JTextField();
		buttonStartDB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabella();
				
			}
		});
		buttonStartDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabella();
			}
		});
		buttonStartDB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonStartDB.setEditable(false);
		buttonStartDB.setBounds(166, 400, 120, 35);
		buttonStartDB.setBackground(new Color(176, 196, 222));
		buttonStartDB.setForeground(new Color(0, 0, 139));
		buttonStartDB.setHorizontalAlignment(SwingConstants.CENTER);
		buttonStartDB.setText("Lancia il DB");
		contentPane.add(buttonStartDB);
		buttonStartDB.setColumns(10);
		
		inputHost = new JTextField();
		inputHost.setBounds(121, 293, 200, 30);
		inputHost.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		inputHost.setEditable(false);
		inputHost.setText("localhost");
		inputHost.setHorizontalAlignment(SwingConstants.CENTER);
		inputHost.setForeground(new Color(0, 0, 128));
		inputHost.setColumns(10);
		inputHost.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputHost.setBackground(new Color(176, 196, 222));
		contentPane.add(inputHost);
		
		inputPort = new JTextField();
		inputPort.setBounds(121, 341, 200, 30);
		inputPort.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		inputPort.setEditable(false);
		inputPort.setText("5432");
		inputPort.setHorizontalAlignment(SwingConstants.CENTER);
		inputPort.setForeground(new Color(0, 0, 128));
		inputPort.setColumns(10);
		inputPort.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputPort.setBackground(new Color(176, 196, 222));
		contentPane.add(inputPort);
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setBounds(74, 237, 45, 40);
		lblPassword.setIcon(new ImageIcon(Server.class.getResource("/img/password-30.png")));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblPassword.setBackground(new Color(0, 139, 139));
		contentPane.add(lblPassword);
		
		JLabel lblPort = new JLabel("");
		lblPort.setBounds(74, 341, 45, 40);
		lblPort.setIcon(new ImageIcon(Server.class.getResource("/img/porta.png")));
		lblPort.setHorizontalAlignment(SwingConstants.CENTER);
		lblPort.setForeground(Color.WHITE);
		lblPort.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblPort.setBackground(new Color(0, 139, 139));
		contentPane.add(lblPort);
		
		JLabel lblHost = new JLabel("");
		lblHost.setBounds(74, 289, 45, 40);
		lblHost.setIcon(new ImageIcon(Server.class.getResource("/img/host.png")));
		lblHost.setHorizontalAlignment(SwingConstants.CENTER);
		lblHost.setForeground(Color.WHITE);
		lblHost.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblHost.setBackground(new Color(0, 139, 139));
		contentPane.add(lblHost);
		
		JLabel lblInside = new JLabel("");
		lblInside.setBounds(0, 0, 400, 530);
		lblInside.setBorder(null);
		lblInside.setIcon(new ImageIcon(Server.class.getResource("/img/abstract.jpg")));
		lblInside.setForeground(SystemColor.textHighlight);
		lblInside.setBackground(SystemColor.textHighlight);
		contentPane.add(lblInside);
		
		JLabel lblClose = new JLabel("");
		lblClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});
		lblClose.setBounds(350, 25, 30, 30);
		lblClose.setIcon(new ImageIcon(Server.class.getResource("/img/close.png")));
		lblClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblClose.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblClose.setForeground(new Color(255, 255, 255));
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblClose);
		
		JLabel lblReduce = new JLabel("");
		lblReduce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblReduce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblReduce.setBounds(316, 25, 30, 30);
		lblReduce.setIcon(new ImageIcon(Server.class.getResource("/img/minus-30.png")));
		lblReduce.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduce.setForeground(Color.WHITE);
		lblReduce.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lblReduce);
	}

	public void tabella() {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/ClimateMonitoring";
		String username=inputUsername.getText();
		String password =inputPassword.getText();
		try {
			Connection connnection=DBManager.connect(url, username, password);
			JOptionPane.showMessageDialog(this, "Database connection successful!");
			CreateTable.createtablecoordimoni(connnection);
			CreateTable.inserisci(url, username, password);
			
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(this, "Error"+e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);}
		
	}
}
