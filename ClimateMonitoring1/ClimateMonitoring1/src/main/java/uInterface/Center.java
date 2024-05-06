package uInterface;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.List;

public class Center extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static int xx,yy;
	private JTextField inputNCivico;
	private JTextField inputName;
	private JTextField inputCAP;
	private JTextField inputVia;
	private JTextField inputComune;
	private JTextField inputProvincia;
	private JTextField buttonInserireIParametri;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Center frame = new Center();
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
	@SuppressWarnings("deprecation")
	public Center() {
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
		setBounds(400, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeIcon = new JLabel("");
		lblNomeIcon.setIcon(new ImageIcon(Center.class.getResource("/img/center-30.png")));
		lblNomeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeIcon.setForeground(Color.WHITE);
		lblNomeIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNomeIcon.setBackground(new Color(0, 139, 139));
		lblNomeIcon.setBounds(150, 45, 30, 30);
		contentPane.add(lblNomeIcon);
		
		JLabel lblClose = new JLabel("");
		lblClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblClose.setIcon(new ImageIcon(Center.class.getResource("/img/close.png")));
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setForeground(Color.WHITE);
		lblClose.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblClose.setBounds(499, 17, 30, 30);
		contentPane.add(lblClose);
		
		JLabel lblReduce = new JLabel("");
		lblReduce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblReduce.setIcon(new ImageIcon(Center.class.getResource("/img/minus-30.png")));
		lblReduce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblReduce.setHorizontalAlignment(SwingConstants.CENTER);
		lblReduce.setForeground(Color.WHITE);
		lblReduce.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblReduce.setBounds(465, 17, 30, 30);
		contentPane.add(lblReduce);
		
		JLabel lblDettagliCentro = new JLabel("Dettagli centro");
		lblDettagliCentro.setHorizontalAlignment(SwingConstants.CENTER);
		lblDettagliCentro.setForeground(Color.WHITE);
		lblDettagliCentro.setBounds(16, 120, 105, 16);
		contentPane.add(lblDettagliCentro);
		
		JLabel lblAreeDiInteresse = new JLabel("Aree di interesse");
		lblAreeDiInteresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreeDiInteresse.setForeground(Color.WHITE);
		lblAreeDiInteresse.setBounds(26, 350, 105, 16);
		contentPane.add(lblAreeDiInteresse);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(50, 151, 50, 16);
		contentPane.add(lblNome);
		
		inputName = new JTextField();
		inputName.setHorizontalAlignment(SwingConstants.CENTER);
		inputName.setForeground(new Color(25, 25, 112));
		inputName.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputName.setColumns(10);
		inputName.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputName.setBackground(new Color(176, 196, 222));
		inputName.setBounds(50, 169, 200, 30);
		contentPane.add(inputName);
		
		JLabel lblNumeroCivico = new JLabel("Numero civico");
		lblNumeroCivico.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumeroCivico.setForeground(Color.WHITE);
		lblNumeroCivico.setBounds(50, 256, 100, 16);
		contentPane.add(lblNumeroCivico);
		
		inputNCivico = new JTextField();
		inputNCivico.setHorizontalAlignment(SwingConstants.CENTER);
		inputNCivico.setForeground(new Color(25, 25, 112));
		inputNCivico.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputNCivico.setColumns(10);
		inputNCivico.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputNCivico.setBackground(new Color(176, 196, 222));
		inputNCivico.setBounds(50, 275, 200, 30);
		contentPane.add(inputNCivico);
		
		JLabel lblVia = new JLabel("Via");
		lblVia.setHorizontalAlignment(SwingConstants.LEFT);
		lblVia.setForeground(Color.WHITE);
		lblVia.setBounds(51, 202, 25, 16);
		contentPane.add(lblVia);
		
		inputVia = new JTextField();
		inputVia.setHorizontalAlignment(SwingConstants.CENTER);
		inputVia.setForeground(new Color(25, 25, 112));
		inputVia.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputVia.setColumns(10);
		inputVia.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputVia.setBackground(new Color(176, 196, 222));
		inputVia.setBounds(50, 219, 200, 30);
		contentPane.add(inputVia);
		
		JLabel lblCap = new JLabel("CAP");
		lblCap.setHorizontalAlignment(SwingConstants.LEFT);
		lblCap.setForeground(Color.WHITE);
		lblCap.setBounds(294, 150, 30, 16);
		contentPane.add(lblCap);
		
		inputCAP = new JTextField();
		inputCAP.setHorizontalAlignment(SwingConstants.CENTER);
		inputCAP.setForeground(new Color(25, 25, 112));
		inputCAP.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputCAP.setColumns(10);
		inputCAP.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputCAP.setBackground(new Color(176, 196, 222));
		inputCAP.setBounds(295, 169, 200, 30);
		contentPane.add(inputCAP);
		
		JLabel lblComune = new JLabel("Comune");
		lblComune.setHorizontalAlignment(SwingConstants.LEFT);
		lblComune.setForeground(Color.WHITE);
		lblComune.setBounds(295, 202, 55, 16);
		contentPane.add(lblComune);
		
		inputComune = new JTextField();
		inputComune.setHorizontalAlignment(SwingConstants.CENTER);
		inputComune.setForeground(new Color(25, 25, 112));
		inputComune.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputComune.setColumns(10);
		inputComune.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputComune.setBackground(new Color(176, 196, 222));
		inputComune.setBounds(295, 219, 200, 30);
		contentPane.add(inputComune);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setHorizontalAlignment(SwingConstants.LEFT);
		lblProvincia.setForeground(Color.WHITE);
		lblProvincia.setBounds(295, 256, 60, 16);
		contentPane.add(lblProvincia);
		
		List list = new List();
		list.setMultipleMode(true);
		list.setFont(new Font("Chakra Petch", Font.PLAIN, 13));
		list.setForeground(new Color(255, 255, 255));
		list.setBackground(new Color(106, 90, 205));
		list.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		list.setBounds(50, 375, 450, 150);
		list.addItem("Oakham;Oakham;US;United States;42.35287, -72.04535");
		list.addItem("Onset;Onset;US;United States;41.74177, -70.65781");
		list.addItem("Plympton;Plympton;US;United States;41.95288, -70.81448");
		list.addItem("Oakham;Oakham;US;United States;42.35287, -72.04535");
		list.addItem("Onset;Onset;US;United States;41.74177, -70.65781");
		list.addItem("Plympton;Plympton;US;United States;41.95288, -70.81448");
		list.addItem("Oakham;Oakham;US;United States;42.35287, -72.04535");
		list.addItem("Onset;Onset;US;United States;41.74177, -70.65781");
		list.addItem("Plympton;Plympton;US;United States;41.95288, -70.81448");
		list.addItem("Oakham;Oakham;US;United States;42.35287, -72.04535");
		list.addItem("Onset;Onset;US;United States;41.74177, -70.65781");
		list.addItem ("Plympton;Plympton;US;United States;41.95288, -70.81448");
		
		buttonInserireIParametri = new JTextField();
		buttonInserireIParametri.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Parametrs().setVisible(true);
			}
		});
		buttonInserireIParametri.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonInserireIParametri.setText("Parametri climatici");
		buttonInserireIParametri.setHorizontalAlignment(SwingConstants.CENTER);
		buttonInserireIParametri.setForeground(new Color(255, 255, 255));
		buttonInserireIParametri.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		buttonInserireIParametri.setEditable(false);
		buttonInserireIParametri.setColumns(10);
		buttonInserireIParametri.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		buttonInserireIParametri.setBackground(new Color(0, 0, 255));
		buttonInserireIParametri.setBounds(320, 543, 200, 30);
		contentPane.add(buttonInserireIParametri);
		
		JLabel lblParametri = new JLabel("");
		lblParametri.setIcon(new ImageIcon(Center.class.getResource("/img/parameters-30.png")));
		lblParametri.setHorizontalAlignment(SwingConstants.CENTER);
		lblParametri.setForeground(Color.WHITE);
		lblParametri.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblParametri.setBackground(new Color(0, 139, 139));
		lblParametri.setBounds(285, 543, 30, 30);
		contentPane.add(lblParametri);
		contentPane.add(list);
		
		inputProvincia = new JTextField();
		inputProvincia.setHorizontalAlignment(SwingConstants.CENTER);
		inputProvincia.setForeground(new Color(25, 25, 112));
		inputProvincia.setFont(new Font("Chakra Petch", Font.PLAIN, 15));
		inputProvincia.setColumns(10);
		inputProvincia.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(255, 255, 255)));
		inputProvincia.setBackground(new Color(176, 196, 222));
		inputProvincia.setBounds(295, 275, 200, 30);
		contentPane.add(inputProvincia);
		
		JLabel lblCentroMonitoraggio = new JLabel("CENTRO MONITORAGGIO");
		lblCentroMonitoraggio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCentroMonitoraggio.setForeground(Color.WHITE);
		lblCentroMonitoraggio.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCentroMonitoraggio.setBounds(185, 45, 250, 25);
		contentPane.add(lblCentroMonitoraggio);
		
		JLabel lblInsideBox = new JLabel("");
		lblInsideBox.setIcon(new ImageIcon(Center.class.getResource("/img/abstract.jpg")));
		lblInsideBox.setBounds(20, 135, 500, 217);
		contentPane.add(lblInsideBox);
		
		JLabel lblBackIcon = new JLabel("");
		lblBackIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBackIcon.setIcon(new ImageIcon(Center.class.getResource("/img/back-30.png")));
		lblBackIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				setVisible(false); 
				new Home().setVisible(true);
			}
		});
		lblBackIcon.setBounds(16, 17, 30, 30);
		contentPane.add(lblBackIcon);
		
		JLabel lblBackgound = new JLabel("");
		lblBackgound.setIcon(new ImageIcon(Center.class.getResource("/img/abstract.jpg")));
		lblBackgound.setBounds(0, 0, 550, 600);
		contentPane.add(lblBackgound);
	}
}
