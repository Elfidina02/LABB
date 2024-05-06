package uInterface;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;


public class Parametrs extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JTextField BtnSalva;

    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parametrs frame = new Parametrs();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

    public Parametrs() {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 450);
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
        

        table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
        table.setCellSelectionEnabled(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setSelectionBackground(new Color(173, 216, 230));
        table.setGridColor(new Color(128, 128, 128));
        table.setFont(new Font("Chakra Petch", Font.PLAIN, 13));
        table.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        table.setSelectionForeground(new Color(0, 128, 128));
        table.setBackground(new Color(176, 224, 230));
        table.setRowHeight(25);
        

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setViewportBorder(null);
        scrollPane.setFont(new Font("Chakra Petch", Font.PLAIN, 13));
        scrollPane.setBackground(new Color(147, 112, 219));
        scrollPane.setBounds(5, 150, 540, 200); // Set the size and position of the scroll pane
        contentPane.add(scrollPane);
        
        JLabel lblClose = new JLabel("");
        lblClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});
        lblClose.setIcon(new ImageIcon(Parametrs.class.getResource("/img/close.png")));
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
        lblReduce.setIcon(new ImageIcon(Parametrs.class.getResource("/img/minus-30.png")));
        lblReduce.setBounds(465, 17, 30, 30);
        contentPane.add(lblReduce);
        
        JLabel lblBackcon = new JLabel("");
        lblBackcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblBackcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Center().setVisible(true);
			}
		});
        lblBackcon.setIcon(new ImageIcon(Parametrs.class.getResource("/img/back-30.png")));
        lblBackcon.setBounds(15, 17, 30, 30);
        contentPane.add(lblBackcon);
        
        JLabel lblRegisterIcon = new JLabel("");
        lblRegisterIcon.setIcon(new ImageIcon(Parametrs.class.getResource("/img/parameters-30.png")));
        lblRegisterIcon.setBounds(143, 45, 30, 30);
        contentPane.add(lblRegisterIcon);
        
        JLabel lblParametriClimatici = new JLabel("PARAMETRI CLIMATICI\r\n");
        lblParametriClimatici.setHorizontalAlignment(SwingConstants.CENTER);
        lblParametriClimatici.setForeground(Color.WHITE);
        lblParametriClimatici.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblParametriClimatici.setBounds(175, 45, 235, 30);
        contentPane.add(lblParametriClimatici);
        
        BtnSalva = new JTextField();
        BtnSalva.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        BtnSalva.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Center().setVisible(true);
			}
		});
        BtnSalva.setText("Salva");
        BtnSalva.setHorizontalAlignment(SwingConstants.CENTER);
        BtnSalva.setForeground(Color.WHITE);
        BtnSalva.setFont(new Font("Dialog", Font.PLAIN, 15));
        BtnSalva.setEditable(false);
        BtnSalva.setColumns(10);
        BtnSalva.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
        BtnSalva.setBackground(Color.BLUE);
        BtnSalva.setBounds(420, 376, 100, 30);
        contentPane.add(BtnSalva);
        
        JLabel lblSaveIcon = new JLabel("");
        lblSaveIcon.setIcon(new ImageIcon(Parametrs.class.getResource("/img/confirm-30.png")));
        lblSaveIcon.setHorizontalAlignment(SwingConstants.CENTER);
        lblSaveIcon.setForeground(Color.WHITE);
        lblSaveIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
        lblSaveIcon.setBackground(new Color(0, 139, 139));
        lblSaveIcon.setBounds(385, 376, 30, 30);
        contentPane.add(lblSaveIcon);

        JLabel lblBackground = new JLabel("");
        lblBackground.setIcon(new ImageIcon(Parametrs.class.getResource("/img/abstract.jpg")));
        lblBackground.setBounds(0, 0, 550, 450);
        contentPane.add(lblBackground);
        lblBackground.setOpaque(true);
         // Move to back so it does not cover the table
    }
}
