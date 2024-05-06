package intersearch;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DB.Query;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class searchcor extends JFrame {

	private JPanel contentPane;
	private JTextField txtJcoordinate;
	private DefaultListModel<String> ob;
	private JList <String> list;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchcor frame = new searchcor();
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
	public searchcor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtJcoordinate = new JTextField();
		txtJcoordinate.setBounds(174, 10, 86, 20);
		contentPane.add(txtJcoordinate);
		txtJcoordinate.setColumns(10);
		 
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(307, 51, -163, 153);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("inserisci coordinata");
		lblNewLabel.setBounds(10, 13, 134, 17);
		contentPane.add(lblNewLabel);
		
		JButton btnsearchcoordinate = new JButton("searchcoordinate");
		btnsearchcoordinate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String coordinate =txtJcoordinate.getText();
				
				ob=new  DefaultListModel<> ();
				
				
			      ArrayList<String>  data;
				try {
					data=Query.ricercarecoordinate(coordinate);
					
					for( String b : data){
				         
				              ob.addElement(b);
				              JList <String> list = new JList<>( ob);
				              list.setBounds(141, 51, 170, 153);
				      		contentPane.add(list);
				             
				          }
				
				
				
			}
catch (SQLException e1) {
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			      
			}
			
		});
		
		 
		btnsearchcoordinate.setBounds(242, 227, 154, 23);
		contentPane.add(btnsearchcoordinate);
	}
}
