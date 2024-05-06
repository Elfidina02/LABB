package uInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DB.Query;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Parameters1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField tnomecentro;
	private JTextField tareainteresse;
	private DefaultListModel<String>listModel;
	JList <String> list;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parameters1 frame = new Parameters1();
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
	public Parameters1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		  DefaultTableModel model = new DefaultTableModel();
	        model.addColumn("Climate Category");
	        model.addColumn("Explanation");
	        model.addColumn("Score");
	        model.addColumn("Notes");

	        model.addRow(new Object[]{"Vento", "", "", ""});
	        model.addRow(new Object[]{"Umidità", "", "", ""});
	        model.addRow(new Object[]{"Pressione", "", "", ""});
	        model.addRow(new Object[]{"Temperatura", "", "", ""});
	        model.addRow(new Object[]{"Precipitazioni", "", "", ""});
	        model.addRow(new Object[]{"Altitudine dei ghiacciai", "", "", ""});
	        model.addRow(new Object[]{"Massa dei ghiacciai", "", "", ""});
	        model.addRow(new Object []{"Nuvolosità(optional)","","",""});
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 94, 376, 133);
		contentPane.add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		listModel= new DefaultListModel<>();
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(212, 29, 124, 38);
		contentPane.add(scrollPane_1);
		
		list = new JList<>(listModel);
		scrollPane_1.setViewportView(list);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String visua= tnomecentro.getText();
				 ArrayList<String>  data;
					try {
						data=Query.visualizzaarea(visua, null);
						
						for( String b : data){
					         
					              listModel.addElement(b);
			}
					}catch (SQLException e1) {
	
							e1.printStackTrace();
						}
			}
		});
		btnNewButton.setBounds(395, 26, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomecentro=tnomecentro.getText();
				String areaint=tareainteresse.getText();
	
				String vento= model.getValueAt(0, 2).toString();
				String umidità= model.getValueAt(1, 2).toString();
				String pressione= model.getValueAt(2, 2).toString();
				String temperatura= model.getValueAt(3, 2).toString();
				String precipitazioni= model.getValueAt(4, 2).toString();
				String altdeighiacciai= model.getValueAt(5, 2).toString();
				String massadeighiacciai= model.getValueAt(6, 2).toString();
				String Nuvolosità=model.getValueAt(7, 2).toString();
				String Notes= model.getValueAt(0, 3).toString();
				
				
				try {
					Query.inserisciParametriClimatici(nomecentro, areaint, vento, umidità, pressione, temperatura, precipitazioni, altdeighiacciai, massadeighiacciai,Nuvolosità,Notes);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
				}
				
			
		});
		btnNewButton_1.setBounds(427, 270, 89, 23);
		contentPane.add(btnNewButton_1);
		
		tnomecentro = new JTextField();
		tnomecentro.setBounds(52, 27, 86, 20);
		contentPane.add(tnomecentro);
		tnomecentro.setColumns(10);
		
		tareainteresse = new JTextField();
		tareainteresse.setBounds(398, 60, 86, 20);
		contentPane.add(tareainteresse);
		tareainteresse.setColumns(10);
	}
}
