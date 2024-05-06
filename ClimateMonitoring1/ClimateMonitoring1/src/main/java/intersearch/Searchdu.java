package intersearch;

import java.awt.EventQueue;
import DB.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Searchdu extends JFrame {

	private JPanel contentPane;
	private JTextField jcountry;
	private DefaultTableModel ob;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Searchdu frame = new Searchdu();
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
	public Searchdu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	      
		
		jcountry = new JTextField();
		jcountry.setBounds(67, 4, 86, 20);
		contentPane.add(jcountry);
		jcountry.setColumns(10);
		
		JButton jsearchcountrycode = new JButton("New button");
		jsearchcountrycode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchcode=jcountry.getText();
				ob=new  DefaultTableModel ();
				 ob = (DefaultTableModel)table.getModel(); 
				
			      ob.addColumn("countrycode");
			      Vector<Vector<String>> data;
				try {
					data=Query.ricercarecountrycode(searchcode);
					
					for( Vector<String> b : data){
				         
				              ob.addRow(b);
			
				          }
				      
				              
				              
				      
				} catch (SQLException e1) {
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			      
			}
		});
		jsearchcountrycode.setBounds(306, 227, 89, 23);
		contentPane.add(jsearchcountrycode);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(45, 35, 324, 181);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
	}
}
