package uInterface;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.Query;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Center1 extends JFrame {

	private JPanel contentPane;
	private JTextField tNomecentro;
	private JTextField tvia;
	private JTextField tnumerocivico;
	private JTextField tcap;
	private JTextField tcomune;
	private JTextField tprovincia;
	private JTextField tareeinteresse;
	private DefaultListModel<String>listModel;
	JList <String> list;
	private JTextField tuserid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Center1 frame = new Center1();
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
	public Center1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tNomecentro = new JTextField();
		tNomecentro.setBounds(10, 38, 86, 20);
		contentPane.add(tNomecentro);
		tNomecentro.setColumns(10);
		
		tvia = new JTextField();
		tvia.setBounds(256, 38, 86, 20);
		contentPane.add(tvia);
		tvia.setColumns(10);
		
		tnumerocivico = new JTextField();
		tnumerocivico.setBounds(10, 69, 86, 20);
		contentPane.add(tnumerocivico);
		tnumerocivico.setColumns(10);
		
		tcap = new JTextField();
		tcap.setBounds(256, 69, 86, 20);
		contentPane.add(tcap);
		tcap.setColumns(10);
		
		tcomune = new JTextField();
		tcomune.setBounds(10, 100, 86, 20);
		contentPane.add(tcomune);
		tcomune.setColumns(10);
		
		tprovincia = new JTextField();
		tprovincia.setBounds(256, 100, 86, 20);
		contentPane.add(tprovincia);
		tprovincia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Aree Interesse");
		lblNewLabel.setBounds(20, 131, 76, 14);
		contentPane.add(lblNewLabel);
		
		tareeinteresse = new JTextField();
		tareeinteresse.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_ENTER) {
					aggingitesto();
				}
			}
		});
		tareeinteresse.setBounds(108, 128, 86, 20);
		contentPane.add(tareeinteresse);
		tareeinteresse.setColumns(10);
		
		
		
		
		
		
		
		
		JLabel NomeCentro = new JLabel("Nomecentro");
		NomeCentro.setBounds(122, 41, 72, 14);
		contentPane.add(NomeCentro);
		
		JLabel lblnumerocivo = new JLabel("nr.civivo");
		lblnumerocivo.setBounds(122, 72, 46, 14);
		contentPane.add(lblnumerocivo);
		
		JLabel lblcomune = new JLabel("comune");
		lblcomune.setBounds(122, 103, 46, 14);
		contentPane.add(lblcomune);
		
		JLabel lblNewLabel_3 = new JLabel("via");
		lblNewLabel_3.setBounds(363, 41, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("cap");
		lblNewLabel_4.setBounds(352, 69, 67, 17);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("provincia");
		lblNewLabel_5.setBounds(363, 103, 46, 14);
		contentPane.add(lblNewLabel_5);
		
	listModel= new DefaultListModel<>();
		
	list = new JList<>(listModel);
		list.setBounds(67, 159, 282, 106);
		contentPane.add(list);
		
	
		
		
		JButton btninserisciarea = new JButton("New button");
		btninserisciarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aggingitesto();
			}
		});
		btninserisciarea.setBounds(256, 131, 89, 23);
		contentPane.add(btninserisciarea);
		
		JButton btnregistracentro = new JButton("New button");
		btnregistracentro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Parametrs().setVisible(true);
			}
		});
		btnregistracentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user= tuserid.getText();
				String nomecentro=tNomecentro.getText();
				String a= tvia.getText();
				String b= tnumerocivico.getText();
				String c=tcap.getText();
				String d= tcomune.getText();
				String f=tprovincia.getText();
				String h=tareeinteresse.getText();
				List<String> g = new ArrayList<String>();
				g.add(h);
			
						
				try {
					Query.registraCentroAree(user,nomecentro,a,b,c,d,f,g);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnregistracentro.setBounds(352, 227, 89, 23);
		contentPane.add(btnregistracentro);
		
		tuserid = new JTextField();
		tuserid.setBounds(10, 7, 86, 20);
		contentPane.add(tuserid);
		tuserid.setColumns(10);
		
		JLabel lbluserid = new JLabel("Userid");
		lbluserid.setBounds(122, 10, 46, 14);
		contentPane.add(lbluserid);
	}
	

	private void aggingitesto() {
		String text =tareeinteresse.getText().trim();
		if(!(text.isEmpty())){
			listModel.addElement(text);
			tareeinteresse.setText("");
		}
		
		
	}
}
