package uInterface;

import java.awt.EventQueue;
import intersearch.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.List;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import java.awt.SystemColor;
import DB.*;

public class Search extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputDenomination;
	private JTextField inputStato;
	private JTextField inputLatitudine;
	private JTextField inputLongitudine;
	static int xx,yy;
	private JTextField buttonCercaDenState;
	private JTextField buttonCercaCrdGeo;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 550, 450);
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
		lblClose.setIcon(new ImageIcon(Search.class.getResource("/img/close.png")));
		lblClose.setBounds(499, 17, 30, 30);
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setForeground(Color.WHITE);
		lblClose.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		contentPane.add(lblClose);
		
		JLabel lblReduce = new JLabel("");
		lblReduce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblReduce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblReduce.setBounds(465, 17, 30, 30);
		lblReduce.setIcon(new ImageIcon(Search.class.getResource("/img/minus-30.png")));
		lblReduce.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduce.setForeground(Color.WHITE);
		lblReduce.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lblReduce);
		
		JLabel lblSearchIcon = new JLabel("");
		lblSearchIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchIcon.setIcon(new ImageIcon(Search.class.getResource("/img/search-engine-24.png")));
		lblSearchIcon.setBounds(200, 45, 30, 30);
		contentPane.add(lblSearchIcon);
		
		JLabel lblCeracreArea = new JLabel("AREA");
		lblCeracreArea.setHorizontalAlignment(SwingConstants.CENTER);
		lblCeracreArea.setForeground(Color.WHITE);
		lblCeracreArea.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCeracreArea.setBounds(230, 45, 65, 30);
		contentPane.add(lblCeracreArea);
		
		JLabel lblDenominazioneIcon = new JLabel("");
		lblDenominazioneIcon.setIcon(new ImageIcon(Search.class.getResource("/img/letters-30.png")));
		lblDenominazioneIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblDenominazioneIcon.setForeground(Color.WHITE);
		lblDenominazioneIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblDenominazioneIcon.setBackground(new Color(0, 139, 139));
		lblDenominazioneIcon.setBounds(70, 134, 30, 30);
		contentPane.add(lblDenominazioneIcon);
		
		JLabel lblDenominazione = new JLabel("Denominazione ");
		lblDenominazione.setHorizontalAlignment(SwingConstants.LEFT);
		lblDenominazione.setForeground(Color.WHITE);
		lblDenominazione.setBounds(115, 115, 110, 16);
		contentPane.add(lblDenominazione);
		
		inputDenomination = new JTextField();
		inputDenomination.setHorizontalAlignment(SwingConstants.CENTER);
		inputDenomination.setForeground(new Color(0, 0, 128));
		inputDenomination.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputDenomination.setColumns(10);
		inputDenomination.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputDenomination.setBackground(new Color(176, 196, 222));
		inputDenomination.setBounds(115, 134, 200, 30);
		contentPane.add(inputDenomination);
		
		JLabel lblLatIcon = new JLabel("");
		lblLatIcon.setIcon(new ImageIcon(Search.class.getResource("/img/latitude-30.png")));
		lblLatIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblLatIcon.setForeground(Color.WHITE);
		lblLatIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblLatIcon.setBackground(new Color(0, 139, 139));
		lblLatIcon.setBounds(70, 291, 30, 30);
		contentPane.add(lblLatIcon);
		
		JLabel lblStateIcon = new JLabel("");
		lblStateIcon.setIcon(new ImageIcon(Search.class.getResource("/img/country-30.png")));
		lblStateIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblStateIcon.setForeground(Color.WHITE);
		lblStateIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblStateIcon.setBackground(new Color(0, 139, 139));
		lblStateIcon.setBounds(70, 186, 30, 30);
		contentPane.add(lblStateIcon);
		
		JLabel lblSearchButton = new JLabel("");
		lblSearchButton.setIcon(new ImageIcon(Search.class.getResource("/img/button-30.png")));
		lblSearchButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchButton.setForeground(Color.WHITE);
		lblSearchButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblSearchButton.setBackground(new Color(0, 139, 139));
		lblSearchButton.setBounds(327, 115, 30, 30);
		contentPane.add(lblSearchButton);
		
		JLabel lblRicercaPer = new JLabel("Ricerca per");
		lblRicercaPer.setHorizontalAlignment(SwingConstants.CENTER);
		lblRicercaPer.setForeground(Color.WHITE);
		lblRicercaPer.setBounds(50, 87, 70, 16);
		contentPane.add(lblRicercaPer);
		
		buttonCercaDenState = new JTextField();
		buttonCercaDenState.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false); 
				new Searchdu().setVisible(true);
			}
		});
		buttonCercaDenState.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCercaDenState.setText("Cerca");
		buttonCercaDenState.setHorizontalAlignment(SwingConstants.CENTER);
		buttonCercaDenState.setForeground(new Color(255, 255, 255));
		buttonCercaDenState.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		buttonCercaDenState.setEditable(false);
		buttonCercaDenState.setColumns(10);
		buttonCercaDenState.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		buttonCercaDenState.setBackground(new Color(0, 0, 255));
		buttonCercaDenState.setBounds(367, 115, 100, 30);
		contentPane.add(buttonCercaDenState);
		
		JLabel lblLatitudine = new JLabel("Latitudine ");
		lblLatitudine.setHorizontalAlignment(SwingConstants.CENTER);
		lblLatitudine.setForeground(Color.WHITE);
		lblLatitudine.setBounds(112, 273, 70, 16);
		contentPane.add(lblLatitudine);
		
		inputLatitudine = new JTextField();
		inputLatitudine.setHorizontalAlignment(SwingConstants.CENTER);
		inputLatitudine.setForeground(new Color(0, 0, 128));
		inputLatitudine.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputLatitudine.setColumns(10);
		inputLatitudine.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputLatitudine.setBackground(new Color(176, 196, 222));
		inputLatitudine.setBounds(115, 291, 200, 30);
		contentPane.add(inputLatitudine);
		
		JLabel lblLongitudine = new JLabel("Longitudine ");
		lblLongitudine.setHorizontalAlignment(SwingConstants.CENTER);
		lblLongitudine.setForeground(Color.WHITE);
		lblLongitudine.setBounds(115, 333, 80, 16);
		contentPane.add(lblLongitudine);
		
		inputLongitudine = new JTextField();
		inputLongitudine.setHorizontalAlignment(SwingConstants.CENTER);
		inputLongitudine.setForeground(new Color(0, 0, 128));
		inputLongitudine.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputLongitudine.setColumns(10);
		inputLongitudine.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputLongitudine.setBackground(new Color(176, 196, 222));
		inputLongitudine.setBounds(115, 351, 200, 30);
		contentPane.add(inputLongitudine);
		
		JLabel lblLongIcon = new JLabel("");
		lblLongIcon.setIcon(new ImageIcon(Search.class.getResource("/img/longitude-30.png")));
		lblLongIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblLongIcon.setForeground(Color.WHITE);
		lblLongIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblLongIcon.setBackground(new Color(0, 139, 139));
		lblLongIcon.setBounds(70, 351, 30, 30);
		contentPane.add(lblLongIcon);
		
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
		lblBackcon.setIcon(new ImageIcon(Search.class.getResource("/img/back-30.png")));
		lblBackcon.setBounds(16, 17, 30, 30);
		contentPane.add(lblBackcon);
		
		JLabel lblStato = new JLabel("Stato");
		lblStato.setHorizontalAlignment(SwingConstants.LEFT);
		lblStato.setForeground(Color.WHITE);
		lblStato.setBounds(115, 169, 50, 16);
		contentPane.add(lblStato);
		
		inputStato = new JTextField();
		inputStato.setHorizontalAlignment(SwingConstants.CENTER);
		inputStato.setForeground(new Color(0, 0, 128));
		inputStato.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputStato.setColumns(10);
		inputStato.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputStato.setBackground(new Color(176, 196, 222));
		inputStato.setBounds(115, 188, 200, 30);
		contentPane.add(inputStato);
		
		buttonCercaCrdGeo = new JTextField();
		buttonCercaCrdGeo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonCercaCrdGeo.setText("Cerca");
		buttonCercaCrdGeo.setHorizontalAlignment(SwingConstants.CENTER);
		buttonCercaCrdGeo.setForeground(Color.WHITE);
		buttonCercaCrdGeo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		buttonCercaCrdGeo.setEditable(false);
		buttonCercaCrdGeo.setColumns(10);
		buttonCercaCrdGeo.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		buttonCercaCrdGeo.setBackground(Color.BLUE);
		buttonCercaCrdGeo.setBounds(367, 291, 100, 30);
		contentPane.add(buttonCercaCrdGeo);
		
		JLabel lblSearchButtonIcon = new JLabel("");
		lblSearchButtonIcon.setIcon(new ImageIcon(Search.class.getResource("/img/button-30.png")));
		lblSearchButtonIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchButtonIcon.setForeground(Color.WHITE);
		lblSearchButtonIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblSearchButtonIcon.setBackground(new Color(0, 139, 139));
		lblSearchButtonIcon.setBounds(330, 291, 30, 30);
		contentPane.add(lblSearchButtonIcon);
		
		JLabel lblCoordinateGeo = new JLabel("Coordinate geografiche");
		lblCoordinateGeo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoordinateGeo.setForeground(Color.WHITE);
		lblCoordinateGeo.setBounds(50, 251, 150, 16);
		contentPane.add(lblCoordinateGeo);
		
		JLabel lblCoordBox = new JLabel("");
		lblCoordBox.setIcon(new ImageIcon(Search.class.getResource("/img/abstract.jpg")));
		lblCoordBox.setBounds(50, 273, 450, 120);
		contentPane.add(lblCoordBox);
		
		JLabel lblAreaBox = new JLabel("");
		lblAreaBox.setIcon(new ImageIcon(Search.class.getResource("/img/abstract.jpg")));
		lblAreaBox.setBounds(50, 106, 450, 120);
		contentPane.add(lblAreaBox);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(Search.class.getResource("/img/abstract.jpg")));
		lblBackground.setBounds(0, 0, 550, 450);
		lblBackground.setBorder(null);
		contentPane.add(lblBackground);
		
		table = new JTable();
		table.setBackground(SystemColor.textText);
		table.setForeground(Color.BLUE);
		table.setBounds(472, 154, -105, 62);
		contentPane.add(table);
	}
}
