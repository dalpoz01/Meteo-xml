package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.UIManager;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JLabel lblMeteo;
	private JLabel lblCitt;
	private JTextField textField_Citta;
	private JButton btnCerca;
	private JLabel lblBy;
	private JLabel lblOpenwheather;
	private ImageIcon icon;
	private JLabel Label_Img1;
	private JLabel Label_Img2;
	
	public Finestra() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("icona_meteo.png"));
		setTitle("Weather Forecast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("info"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMeteo = new JLabel("Meteo 5 giorni");
		lblMeteo.setForeground(new Color(255, 153, 0));
		lblMeteo.setFont(new Font("Script MT Bold", Font.PLAIN, 40));
		lblMeteo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMeteo.setBounds(91, 11, 247, 89);
		contentPane.add(lblMeteo);
		
		lblCitt = new JLabel("Citt\u00E0");
		lblCitt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCitt.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));
		lblCitt.setBounds(10, 110, 71, 25);
		contentPane.add(lblCitt);
		
		textField_Citta = new JTextField();
		textField_Citta.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));
		textField_Citta.setBounds(91, 111, 343, 25);
		contentPane.add(textField_Citta);
		textField_Citta.setColumns(10);
		
		btnCerca = new JButton("Cerca");
		btnCerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCerca.setFont(new Font("Monotype Corsiva", Font.PLAIN, 22));
		btnCerca.setBounds(173, 147, 100, 31);
		contentPane.add(btnCerca);
		
		lblBy = new JLabel("By");
		lblBy.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));
		lblBy.setBounds(53, 207, 33, 31);
		contentPane.add(lblBy);
		
		lblOpenwheather = new JLabel("");
		lblOpenwheather.setBounds(96, 207, 297, 31);
		contentPane.add(lblOpenwheather);
		
		icon=new ImageIcon("logo_OpenWeatherMap_orange.png");
		lblOpenwheather.setIcon(icon);
		
		Label_Img1 = new JLabel("");
		Label_Img1.setBounds(1, 11, 91, 89);
		icon= new ImageIcon("ombrelli_pioggia.jpg");
		Label_Img1.setIcon(icon);
		contentPane.add(Label_Img1);
		
		Label_Img2 = new JLabel("");
		Label_Img2.setBounds(353, 11, 91, 89);
		icon= new ImageIcon("sun-image.jpg");
		Label_Img2.setIcon(icon);
		contentPane.add(Label_Img2);
	}

	public JTextField getTextField_Citta() {
		return textField_Citta;
	}

	public void setTextField_Citta(String s) {
		this.textField_Citta.setText(s);
	}

	public JButton getBtnCerca() {
		return btnCerca;
	}

	public void setBtnCerca(JButton btnCerca) {
		this.btnCerca = btnCerca;
	}
}
