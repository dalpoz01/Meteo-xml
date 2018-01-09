package View;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;

public class Finestra2 extends JFrame{

	private JPanel contentPane;
	private JLabel lblCitt;
	private JLabel lblNomeCitta;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JLabel label_testo_ora;
	private JLabel label_Testo_Tempo;
	private JLabel label_1;
	private JLabel label_9;
	private JLabel label_2;
	private JLabel label_10;
	private JLabel label_3;
	private JLabel label_11;
	private JLabel label_4;
	private JLabel label_12;
	private JLabel label_5;
	private JLabel label_13;
	private JLabel label_6;
	private JLabel label_14;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_descrizione_1;
	private JLabel label_descrizione_2;
	private JLabel label_descrizione_3;
	private JLabel label_descrizione_4;
	private JLabel label_descrizione_5;
	private JLabel label_descrizione_6;
	private JLabel label_descrizione_7;
	private JLabel label_descrizione_8;
	private JLabel label_Testo_Precipitazioni;
	private JLabel label_temperatura_1;
	private JLabel label_temperatura_2;
	private JLabel label_temperatura_3;
	private JLabel label_temperatura_4;
	private JLabel label_temperatura_5;
	private JLabel label_temperatura_6;
	private JLabel label_temperatura_7;
	private JLabel label_temperatura_8;
	private JLabel label_Celsius_1;
	private JLabel label_Celsius_2;
	private JLabel label_Celsius_3;
	private JLabel label_Celsius_4;
	private JLabel label_Celsius_5;
	private JLabel label_Celsius_6;
	private JLabel label_Celsius_7;
	private JLabel label_Celsius_8;
	private JLabel label_Testo_Umidita;
	private JLabel label_percentuale1;
	private JLabel label_percentuale2;
	private JLabel label_percentuale3;
	private JLabel label_percentuale4;
	private JLabel label_percentuale5;
	private JLabel label_percentuale6;
	private JLabel label_percentuale7;
	private JLabel label_percentuale8;
	private JLabel lblUmidita1;
	private JLabel label_Umidita2;
	private JLabel label_Umidita3;
	private JLabel label_Umidita4;
	private JLabel label_Umidita5;
	private JLabel label_Umidita6;
	private JLabel label_Umidita7;
	private JLabel label_Umidita8;
	private JLabel label_Testo_Pressione;
	private JLabel label_Testo_Vento;
	private JLabel lblPressione_1;
	private JLabel label_Pressione_2;
	private JLabel label_Pressione_3;
	private JLabel label_Pressione_4;
	private JLabel label_Pressione_5;
	private JLabel label_Pressione_6;
	private JLabel label_Pressione_7;
	private JLabel label_Pressione_8;
	private JLabel label_Pressione_9;
	private JLabel label_hPa1;
	private JLabel label_hPa2;
	private JLabel label_hPa3;
	private JLabel label_hPa4;
	private JLabel label_hPa5;
	private JLabel label_hPa6;
	private JLabel label_hPa7;
	private JLabel label_hPa8;
	private JLabel lblVelocitavento_1;
	private JLabel label_Velocitavento_2;
	private JLabel label_Velocitavento_3;
	private JLabel label_Velocitavento_4;
	private JLabel label_Velocitavento_5;
	private JLabel label_Velocitavento_6;
	private JLabel label_Velocitavento_7;
	private JLabel label_Velocitavento_8;
	private JLabel lblDirezione_1;
	private JLabel label_Direzione_2;
	private JLabel label_Direzione_3;
	private JLabel label_Direzione_4;
	private JLabel label_Direzione_5;
	private JLabel label_Direzione_6;
	private JLabel label_Direzione_7;
	private JLabel label_Direzione_8;
	private JButton btnCerca_Città;
	private JPanel panel_1;
	private JLabel label_Testo_ora1;
	private JLabel label_Testo_tempo1;
	private JLabel label_17;
	private JLabel label_25;
	private JLabel label_18;
	private JLabel label_26;
	private JLabel label_19;
	private JLabel label_27;
	private JLabel label_20;
	private JLabel label_28;
	private JLabel label_21;
	private JLabel label_29;
	private JLabel label_22;
	private JLabel label_30;
	private JLabel label_24;
	private JLabel label_23;
	private JLabel label_31;
	private JLabel label_32;
	private JLabel label_descrizione9;
	private JLabel label_descrizione10;
	private JLabel label_descrizione11;
	private JLabel label_descrizione12;
	private JLabel label_descrizione13;
	private JLabel label_descrizione14;
	private JLabel label_descrizione15;
	private JLabel label_descrizione16;
	private JLabel label_Testo_temperatura1;
	private JLabel label_temperatura_9;
	private JLabel label_temperatura_10;
	private JLabel label_temperatura_11;
	private JLabel label_temperatura_12;
	private JLabel label_temperatura_13;
	private JLabel label_temperatura_14;
	private JLabel label_temperatura_15;
	private JLabel label_temperatura_16;
	private JLabel label_Celsius_9;
	private JLabel label_Celsius_10;
	private JLabel label_Celsius_11;
	private JLabel label_Celsius_12;
	private JLabel label_Celsius_13;
	private JLabel label_Celsius_14;
	private JLabel label_Celsius_15;
	private JLabel label_Celsius_16;
	private JLabel label_Testo_umidita1;
	private JLabel label_percentuale9;
	private JLabel label_percentuale10;
	private JLabel label_percentuale12;
	private JLabel label_percentuale13;
	private JLabel label_percentuale14;
	private JLabel label_percentuale15;
	private JLabel label_percentuale16;
	private JLabel label_Umidita9;
	private JLabel label_Umidita10;
	private JLabel label_Umidita11;
	private JLabel label_Umidita12;
	private JLabel label_Umidita13;
	private JLabel label_Umidita14;
	private JLabel label_Umidita15;
	private JLabel label_Umidita16;
	private JLabel label_Testo_pressione1;
	private JLabel label_Testo_vento1;
	private JLabel label_Pressione_10;
	private JLabel label_Pressione_11;
	private JLabel label_Pressione_12;
	private JLabel label_Pressione_13;
	private JLabel label_Pressione_14;
	private JLabel label_Pressione_15;
	private JLabel label_Pressione_16;
	private JLabel label_hPa9;
	private JLabel label_hPa10;
	private JLabel label_hPa11;
	private JLabel label_hPa12;
	private JLabel label_hPa13;
	private JLabel label_hPa14;
	private JLabel label_hPa15;
	private JLabel label_hPa16;
	private JLabel label_Velocitavento_9;
	private JLabel label_Velocitavento_10;
	private JLabel label_Velocitavento_11;
	private JLabel label_Velocitavento_12;
	private JLabel label_Velocitavento_13;
	private JLabel label_Velocitavento_14;
	private JLabel label_Velocitavento_15;
	private JLabel label_Velocitavento_16;
	private JLabel label_Direzione_9;
	private JLabel label_Direzione_10;
	private JLabel label_Direzione_11;
	private JLabel label_Direzione_12;
	private JLabel label_Direzione_13;
	private JLabel label_Direzione_14;
	private JLabel label_Direzione_15;
	private JLabel label_Direzione_16;
	private JPanel panel_2;
	private JLabel label_Testoora2;
	private JLabel label_TestoTempo2;
	private JLabel label_34;
	private JLabel label_42;
	private JLabel label_35;
	private JLabel label_43;
	private JLabel label_36;
	private JLabel label_44;
	private JLabel label_37;
	private JLabel label_45;
	private JLabel label_38;
	private JLabel label_46;
	private JLabel label_39;
	private JLabel label_47;
	private JLabel label_41;
	private JLabel label_40;
	private JLabel label_48;
	private JLabel label_49;
	private JLabel label_descrizione17;
	private JLabel label_descrizione18;
	private JLabel label_descrizione19;
	private JLabel label_descrizione20;
	private JLabel label_descrizione21;
	private JLabel label_descrizione22;
	private JLabel label_descrizione23;
	private JLabel label_descrizione24;
	private JLabel label_Testotemperatura2;
	private JLabel label_temperatura_17;
	private JLabel label_temperatura_18;
	private JLabel label_temperatura_19;
	private JLabel label_temperatura_20;
	private JLabel label_temperatura_21;
	private JLabel label_temperatura_22;
	private JLabel label_temperatura_23;
	private JLabel label_temperatura_24;
	private JLabel label_Celsius_17;
	private JLabel label_Celsius_18;
	private JLabel label_Celsius_19;
	private JLabel label_Celsius_20;
	private JLabel label_Celsius_21;
	private JLabel label_Celsius_22;
	private JLabel label_Celsius_23;
	private JLabel label_Celsius_24;
	private JLabel label_Testoumidita2;
	private JLabel label_percentuale17;
	private JLabel label_percentuale18;
	private JLabel label_percentuale19;
	private JLabel label_percentuale20;
	private JLabel label_percentuale21;
	private JLabel label_percentuale22;
	private JLabel label_percentuale23;
	private JLabel label_percentuale24;
	private JLabel label_Umidita17;
	private JLabel label_Umidita18;
	private JLabel label_Umidita19;
	private JLabel label_Umidita20;
	private JLabel label_Umidita21;
	private JLabel label_Umidita22;
	private JLabel label_Umidita23;
	private JLabel label_Umidita24;
	private JLabel label_Testopressione2;
	private JLabel label_Testovento2;
	private JLabel label_Pressione_17;
	private JLabel label_Pressione_18;
	private JLabel label_Pressione_20;
	private JLabel label_Pressione_21;
	private JLabel label_Pressione_22;
	private JLabel label_Pressione_23;
	private JLabel label_Pressione_24;
	private JLabel label_hPa17;
	private JLabel label_hPa18;
	private JLabel label_hPa19;
	private JLabel label_hPa20;
	private JLabel label_hPa21;
	private JLabel label_hPa22;
	private JLabel label_hPa23;
	private JLabel label_hPa24;
	private JLabel label_Velocitavento_17;
	private JLabel label_Velocitavento_18;
	private JLabel label_Velocitavento_19;
	private JLabel label_Velocitavento_20;
	private JLabel label_Velocitavento_21;
	private JLabel label_Velocitavento_22;
	private JLabel label_Velocitavento_23;
	private JLabel label_Velocitavento_24;
	private JLabel label_Direzione_17;
	private JLabel label_Direzione_18;
	private JLabel label_Direzione_19;
	private JLabel label_Direzione_20;
	private JLabel label_Direzione_21;
	private JLabel label_Direzione_22;
	private JLabel label_Direzione_23;
	private JLabel label_Direzione_24;
	private JLabel label_Pressione_19;
	private JPanel panel_3;
	private JLabel label_Testoora3;
	private JLabel label_TestoTempo3;
	private JLabel label_50;
	private JLabel label_51;
	private JLabel label_52;
	private JLabel label_53;
	private JLabel label_54;
	private JLabel label_55;
	private JLabel label_56;
	private JLabel label_57;
	private JLabel label_58;
	private JLabel label_59;
	private JLabel label_60;
	private JLabel label_61;
	private JLabel label_62;
	private JLabel label_63;
	private JLabel label_64;
	private JLabel label_65;
	private JLabel label_descrizione25;
	private JLabel label_descrizione26;
	private JLabel label_descrizione27;
	private JLabel label_descrizione28;
	private JLabel label_descrizione29;
	private JLabel label_descrizione30;
	private JLabel label_descrizione31;
	private JLabel label_descrizione32;
	private JLabel label_TestoTemperatura3;
	private JLabel label_temperatura_25;
	private JLabel label_temperatura_26;
	private JLabel label_temperatura_27;
	private JLabel label_temperatura_28;
	private JLabel label_temperatura_29;
	private JLabel label_temperatura_30;
	private JLabel label_temperatura_31;
	private JLabel label_temperatura_32;
	private JLabel label_Celsius_25;
	private JLabel label_Celsius_26;
	private JLabel label_Celsius_27;
	private JLabel label_Celsius_28;
	private JLabel label_Celsius_29;
	private JLabel label_Celsius_30;
	private JLabel label_Celsius_31;
	private JLabel label_Celsius_32;
	private JLabel label_TestoUmidita3;
	private JLabel label_percentuale25;
	private JLabel label_percentuale26;
	private JLabel label_percentuale27;
	private JLabel label_percentuale28;
	private JLabel label_percentuale29;
	private JLabel label_percentuale30;
	private JLabel label_percentuale31;
	private JLabel label_percentuale32;
	private JLabel label_Umidita25;
	private JLabel label_Umidita26;
	private JLabel label_Umidita27;
	private JLabel label_Umidita28;
	private JLabel label_Umidita29;
	private JLabel label_Umidita30;
	private JLabel label_Umidita31;
	private JLabel label_Umidita32;
	private JLabel label_TestoPressione3;
	private JLabel label_TestoVento3;
	private JLabel label_Pressione_25;
	private JLabel label_Pressione_26;
	private JLabel label_Pressione_27;
	private JLabel label_Pressione_28;
	private JLabel label_Pressione_29;
	private JLabel label_Pressione_30;
	private JLabel label_Pressione_31;
	private JLabel label_Pressione_32;
	private JLabel label_hPa25;
	private JLabel label_hPa26;
	private JLabel label_hPa27;
	private JLabel label_hPa28;
	private JLabel label_hPa29;
	private JLabel label_hPa30;
	private JLabel label_hPa31;
	private JLabel label_hPa32;
	private JLabel label_Velocitavento_25;
	private JLabel label_Velocitavento_26;
	private JLabel label_Velocitavento_27;
	private JLabel label_Velocitavento_28;
	private JLabel label_Velocitavento_29;
	private JLabel label_Velocitavento_30;
	private JLabel label_Velocitavento_31;
	private JLabel label_Velocitavento_32;
	private JLabel label_Direzione_25;
	private JLabel label_Direzione_26;
	private JLabel label_Direzione_27;
	private JLabel label_Direzione_28;
	private JLabel label_Direzione_29;
	private JLabel label_Direzione_30;
	private JLabel label_Direzione_31;
	private JLabel label_Direzione_32;
	private JPanel panel_4;
	private JLabel label;
	private JLabel label_33;
	private JLabel label_66;
	private JLabel label_67;
	private JLabel label_68;
	private JLabel label_69;
	private JLabel label_70;
	private JLabel label_71;
	private JLabel label_72;
	private JLabel label_73;
	private JLabel label_74;
	private JLabel label_75;
	private JLabel label_76;
	private JLabel label_77;
	private JLabel label_78;
	private JLabel label_79;
	private JLabel label_80;
	private JLabel label_81;
	private JLabel label_descrizione33;
	private JLabel label_descrizione34;
	private JLabel label_descrizione35;
	private JLabel label_descrizione36;
	private JLabel label_descrizione37;
	private JLabel label_descrizione38;
	private JLabel label_descrizione39;
	private JLabel label_descrizione40;
	private JLabel label_90;
	private JLabel label_temperatura_33;
	private JLabel label_temperatura_34;
	private JLabel label_temperatura_35;
	private JLabel label_temperatura_36;
	private JLabel label_temperatura_37;
	private JLabel label_temperatura_38;
	private JLabel label_temperatura_39;
	private JLabel label_temperatura_40;
	private JLabel label_Celsius_33;
	private JLabel label_Celsius_34;
	private JLabel label_Celsius_35;
	private JLabel label_Celsius_36;
	private JLabel label_Celsius_37;
	private JLabel label_Celsius_38;
	private JLabel label_Celsius_39;
	private JLabel label_Celsius_40;
	private JLabel label_107;
	private JLabel label_percentuale33;
	private JLabel label_percentuale34;
	private JLabel label_percentuale35;
	private JLabel label_percentuale36;
	private JLabel label_percentuale37;
	private JLabel label_percentuale38;
	private JLabel label_percentuale39;
	private JLabel label_percentuale40;
	private JLabel label_Umidita33;
	private JLabel label_Umidita34;
	private JLabel label_Umidita35;
	private JLabel label_Umidita36;
	private JLabel label_Umidita37;
	private JLabel label_Umidita38;
	private JLabel label_Umidita39;
	private JLabel label_Umidita40;
	private JLabel label_124;
	private JLabel label_125;
	private JLabel label_Pressione_33;
	private JLabel label_Pressione_34;
	private JLabel label_Pressione_35;
	private JLabel label_Pressione_36;
	private JLabel label_Pressione_37;
	private JLabel label_Pressione_38;
	private JLabel label_Pressione_39;
	private JLabel label_Pressione_40;
	private JLabel label_hPa33;
	private JLabel label_hPa34;
	private JLabel label_hPa35;
	private JLabel label_hPa36;
	private JLabel label_hPa37;
	private JLabel label_hPa38;
	private JLabel label_hPa39;
	private JLabel label_hPa40;
	private JLabel label_Velocitavento_33;
	private JLabel label_Velocitavento_34;
	private JLabel label_Velocitavento_35;
	private JLabel label_Velocitavento_36;
	private JLabel label_Velocitavento_37;
	private JLabel label_Velocitavento_38;
	private JLabel label_Velocitavento_39;
	private JLabel label_Velocitavento_40;
	private JLabel label_Direzione_33;
	private JLabel label_Direzione_34;
	private JLabel label_Direzione_35;
	private JLabel label_Direzione_36;
	private JLabel label_Direzione_37;
	private JLabel label_Direzione_38;
	private JLabel label_Direzione_39;
	private JLabel label_Direzione_40;
	private JLabel label_Alba;
	private JLabel label_OraAlba;
	private JLabel lblTramonto;
	private JLabel Label_OraTramonto;
	private JLabel lblLatitudine;
	private JLabel label_datiLatitudine;
	private JLabel lblLongitudine;
	private JLabel label_Datilongitudine;
	private JButton btnAvviso;

	public Finestra2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("icona_meteo.png"));
		setTitle("Weather Forecast");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCitt = new JLabel("Citt\u00E0:");
		lblCitt.setFont(new Font("Monotype Corsiva", Font.ITALIC, 25));
		lblCitt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCitt.setBounds(10, 11, 61, 21);
		contentPane.add(lblCitt);
		
		lblNomeCitta = new JLabel("");
		lblNomeCitta.setFont(new Font("Monotype Corsiva", Font.ITALIC, 25));
		lblNomeCitta.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeCitta.setBounds(81, 11, 307, 21);
		contentPane.add(lblNomeCitta);
		
		btnCerca_Città = new JButton("Cerca un'altra citt\u00E0");
		btnCerca_Città.setToolTipText("Cerca localit\u00E0");
		btnCerca_Città.setBounds(498, 10, 167, 28);
		contentPane.add(btnCerca_Città);
		
		label_Alba = new JLabel("Alba: ");
		label_Alba.setFont(new Font("Monotype Corsiva", Font.ITALIC, 20));
		label_Alba.setBounds(10, 41, 45, 25);
		contentPane.add(label_Alba);
		
		label_OraAlba = new JLabel("");
		label_OraAlba.setFont(new Font("Monotype Corsiva", Font.ITALIC, 20));
		label_OraAlba.setHorizontalAlignment(SwingConstants.LEFT);
		label_OraAlba.setBounds(65, 41, 51, 25);
		contentPane.add(label_OraAlba);
		
		lblTramonto = new JLabel("Tramonto:");
		lblTramonto.setFont(new Font("Monotype Corsiva", Font.ITALIC, 20));
		lblTramonto.setBounds(126, 43, 74, 25);
		contentPane.add(lblTramonto);
		
		Label_OraTramonto = new JLabel("");
		Label_OraTramonto.setFont(new Font("Monotype Corsiva", Font.ITALIC, 20));
		Label_OraTramonto.setBounds(210, 41, 61, 25);
		contentPane.add(Label_OraTramonto);
		
		lblLatitudine = new JLabel("Latitudine:");
		lblLatitudine.setFont(new Font("Monotype Corsiva", Font.ITALIC, 20));
		lblLatitudine.setBounds(281, 41, 87, 25);
		contentPane.add(lblLatitudine);
		
		label_datiLatitudine = new JLabel("");
		label_datiLatitudine.setFont(new Font("Monotype Corsiva", Font.ITALIC, 20));
		label_datiLatitudine.setBounds(377, 41, 95, 25);
		contentPane.add(label_datiLatitudine);
		
		lblLongitudine = new JLabel("Longitudine:");
		lblLongitudine.setFont(new Font("Monotype Corsiva", Font.ITALIC, 20));
		lblLongitudine.setBounds(482, 41, 95, 25);
		contentPane.add(lblLongitudine);
		
		label_Datilongitudine = new JLabel("");
		label_Datilongitudine.setFont(new Font("Monotype Corsiva", Font.ITALIC, 20));
		label_Datilongitudine.setBounds(587, 41, 95, 25);
		contentPane.add(label_Datilongitudine);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 65, 655, 481);
		contentPane.add(tabbedPane);
		
		panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		label_testo_ora = new JLabel("Ora");
		label_testo_ora.setHorizontalAlignment(SwingConstants.CENTER);
		label_testo_ora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_testo_ora.setBounds(0, 0, 44, 21);
		panel.add(label_testo_ora);
		
		label_Testo_Tempo = new JLabel("Tempo");
		label_Testo_Tempo.setHorizontalAlignment(SwingConstants.CENTER);
		label_Testo_Tempo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_Tempo.setBounds(45, 0, 184, 21);
		panel.add(label_Testo_Tempo);
		
		label_1 = new JLabel("0");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 42, 35, 21);
		panel.add(label_1);
		
		label_9 = new JLabel("");
		label_9.setBounds(45, 32, 44, 42);
		panel.add(label_9);
		
		label_2 = new JLabel("3");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 95, 35, 21);
		panel.add(label_2);
		
		label_10 = new JLabel("");
		label_10.setBounds(45, 85, 44, 42);
		panel.add(label_10);
		
		label_3 = new JLabel("6");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(0, 149, 35, 21);
		panel.add(label_3);
		
		label_11 = new JLabel("");
		label_11.setBounds(45, 138, 44, 42);
		panel.add(label_11);
		
		label_4 = new JLabel("9");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 201, 35, 21);
		panel.add(label_4);
		
		label_12 = new JLabel("");
		label_12.setBounds(45, 191, 44, 42);
		panel.add(label_12);
		
		label_5 = new JLabel("12");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(0, 253, 35, 21);
		panel.add(label_5);
		
		label_13 = new JLabel("");
		label_13.setBounds(45, 244, 44, 42);
		panel.add(label_13);
		
		label_6 = new JLabel("15");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(0, 305, 35, 21);
		panel.add(label_6);
		
		label_14 = new JLabel("");
		label_14.setBounds(45, 297, 44, 42);
		panel.add(label_14);
		
		label_8 = new JLabel("21");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(0, 411, 35, 21);
		panel.add(label_8);
		
		label_7 = new JLabel("18");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(0, 360, 35, 21);
		panel.add(label_7);
		
		label_15 = new JLabel("");
		label_15.setBounds(45, 350, 44, 42);
		panel.add(label_15);
		
		label_16 = new JLabel("");
		label_16.setBounds(45, 400, 44, 42);
		panel.add(label_16);
		
		label_descrizione_1 = new JLabel("");
		label_descrizione_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione_1.setBounds(99, 45, 130, 18);
		panel.add(label_descrizione_1);
		
		label_descrizione_2 = new JLabel("");
		label_descrizione_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione_2.setBounds(99, 98, 130, 18);
		panel.add(label_descrizione_2);
		
		label_descrizione_3 = new JLabel("");
		label_descrizione_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione_3.setBounds(99, 152, 130, 18);
		panel.add(label_descrizione_3);
		
		label_descrizione_4 = new JLabel("");
		label_descrizione_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione_4.setBounds(99, 204, 130, 18);
		panel.add(label_descrizione_4);
		
		label_descrizione_5 = new JLabel("");
		label_descrizione_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione_5.setBounds(99, 256, 130, 18);
		panel.add(label_descrizione_5);
		
		label_descrizione_6 = new JLabel("");
		label_descrizione_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione_6.setBounds(99, 308, 130, 18);
		panel.add(label_descrizione_6);
		
		label_descrizione_7 = new JLabel("");
		label_descrizione_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione_7.setBounds(99, 363, 130, 18);
		panel.add(label_descrizione_7);
		
		label_descrizione_8 = new JLabel("");
		label_descrizione_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione_8.setBounds(99, 414, 130, 18);
		panel.add(label_descrizione_8);
		
		label_Testo_Precipitazioni = new JLabel("Temperatura");
		label_Testo_Precipitazioni.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_Precipitazioni.setBounds(236, 5, 103, 16);
		panel.add(label_Testo_Precipitazioni);
		
		label_temperatura_1 = new JLabel("");
		label_temperatura_1.setBounds(271, 45, 35, 18);
		panel.add(label_temperatura_1);
		
		label_temperatura_2 = new JLabel("");
		label_temperatura_2.setBounds(271, 95, 35, 18);
		panel.add(label_temperatura_2);
		
		label_temperatura_3 = new JLabel("");
		label_temperatura_3.setBounds(271, 152, 35, 18);
		panel.add(label_temperatura_3);
		
		label_temperatura_4 = new JLabel("");
		label_temperatura_4.setBounds(271, 201, 35, 18);
		panel.add(label_temperatura_4);
		
		label_temperatura_5 = new JLabel("");
		label_temperatura_5.setBounds(271, 256, 35, 18);
		panel.add(label_temperatura_5);
		
		label_temperatura_6 = new JLabel("");
		label_temperatura_6.setBounds(271, 308, 35, 18);
		panel.add(label_temperatura_6);
		
		label_temperatura_7 = new JLabel("");
		label_temperatura_7.setBounds(271, 363, 35, 18);
		panel.add(label_temperatura_7);
		
		label_temperatura_8 = new JLabel("");
		label_temperatura_8.setBounds(271, 414, 35, 18);
		panel.add(label_temperatura_8);
		
		label_Celsius_1 = new JLabel("\u00B0C");
		label_Celsius_1.setBounds(309, 42, 25, 21);
		panel.add(label_Celsius_1);
		
		label_Celsius_2 = new JLabel("\u00B0C");
		label_Celsius_2.setBounds(309, 95, 25, 21);
		panel.add(label_Celsius_2);
		
		label_Celsius_3 = new JLabel("\u00B0C");
		label_Celsius_3.setBounds(309, 149, 25, 21);
		panel.add(label_Celsius_3);
		
		label_Celsius_4 = new JLabel("\u00B0C");
		label_Celsius_4.setBounds(309, 201, 25, 21);
		panel.add(label_Celsius_4);
		
		label_Celsius_5 = new JLabel("\u00B0C");
		label_Celsius_5.setBounds(309, 253, 25, 21);
		panel.add(label_Celsius_5);
		
		label_Celsius_6 = new JLabel("\u00B0C");
		label_Celsius_6.setBounds(309, 305, 25, 21);
		panel.add(label_Celsius_6);
		
		label_Celsius_7 = new JLabel("\u00B0C");
		label_Celsius_7.setBounds(309, 360, 25, 21);
		panel.add(label_Celsius_7);
		
		label_Celsius_8 = new JLabel("\u00B0C");
		label_Celsius_8.setBounds(309, 411, 25, 21);
		panel.add(label_Celsius_8);
		
		label_Testo_Umidita = new JLabel("Umidit\u00E0");
		label_Testo_Umidita.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_Umidita.setBounds(349, 5, 63, 16);
		panel.add(label_Testo_Umidita);
		
		label_percentuale1 = new JLabel("%");
		label_percentuale1.setBounds(403, 42, 25, 21);
		panel.add(label_percentuale1);
		
		label_percentuale2 = new JLabel("%");
		label_percentuale2.setBounds(403, 98, 25, 21);
		panel.add(label_percentuale2);
		
		label_percentuale3 = new JLabel("%");
		label_percentuale3.setBounds(403, 152, 25, 21);
		panel.add(label_percentuale3);
		
		label_percentuale4 = new JLabel("%");
		label_percentuale4.setBounds(403, 204, 25, 21);
		panel.add(label_percentuale4);
		
		label_percentuale5 = new JLabel("%");
		label_percentuale5.setBounds(403, 256, 25, 21);
		panel.add(label_percentuale5);
		
		label_percentuale6 = new JLabel("%");
		label_percentuale6.setBounds(403, 308, 25, 21);
		panel.add(label_percentuale6);
		
		label_percentuale7 = new JLabel("%");
		label_percentuale7.setBounds(403, 363, 25, 21);
		panel.add(label_percentuale7);
		
		label_percentuale8 = new JLabel("%");
		label_percentuale8.setBounds(403, 414, 25, 21);
		panel.add(label_percentuale8);
		
		lblUmidita1 = new JLabel("");
		lblUmidita1.setBounds(366, 45, 35, 18);
		panel.add(lblUmidita1);
		
		label_Umidita2 = new JLabel("");
		label_Umidita2.setBounds(366, 98, 35, 18);
		panel.add(label_Umidita2);
		
		label_Umidita3 = new JLabel("");
		label_Umidita3.setBounds(366, 152, 37, 18);
		panel.add(label_Umidita3);
		
		label_Umidita4 = new JLabel("");
		label_Umidita4.setBounds(366, 204, 37, 18);
		panel.add(label_Umidita4);
		
		label_Umidita5 = new JLabel("");
		label_Umidita5.setBounds(366, 256, 37, 18);
		panel.add(label_Umidita5);
		
		label_Umidita6 = new JLabel("");
		label_Umidita6.setBounds(366, 308, 35, 18);
		panel.add(label_Umidita6);
		
		label_Umidita7 = new JLabel("");
		label_Umidita7.setBounds(366, 363, 37, 18);
		panel.add(label_Umidita7);
		
		label_Umidita8 = new JLabel("");
		label_Umidita8.setBounds(366, 414, 37, 18);
		panel.add(label_Umidita8);
		
		label_Testo_Pressione = new JLabel("Pressione");
		label_Testo_Pressione.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_Pressione.setBounds(422, 5, 76, 16);
		panel.add(label_Testo_Pressione);
		
		label_Testo_Vento = new JLabel("Vento(mps)");
		label_Testo_Vento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_Vento.setBounds(533, 5, 94, 16);
		panel.add(label_Testo_Vento);
		
		lblPressione_1 = new JLabel("");
		lblPressione_1.setBounds(438, 45, 57, 18);
		panel.add(lblPressione_1);
		
		label_Pressione_2 = new JLabel("");
		label_Pressione_2.setBounds(438, 98, 57, 18);
		panel.add(label_Pressione_2);
		
		label_Pressione_3 = new JLabel("");
		label_Pressione_3.setBounds(441, 152, 57, 18);
		panel.add(label_Pressione_3);
		
		label_Pressione_4 = new JLabel("");
		label_Pressione_4.setBounds(438, 204, 57, 18);
		panel.add(label_Pressione_4);
		
		label_Pressione_5 = new JLabel("");
		label_Pressione_5.setBounds(438, 256, 57, 18);
		panel.add(label_Pressione_5);
		
		label_Pressione_6 = new JLabel("");
		label_Pressione_6.setBounds(438, 308, 57, 18);
		panel.add(label_Pressione_6);
		
		label_Pressione_7 = new JLabel("");
		label_Pressione_7.setBounds(438, 363, 57, 18);
		panel.add(label_Pressione_7);
		
		label_Pressione_8 = new JLabel("");
		label_Pressione_8.setBounds(438, 414, 57, 18);
		panel.add(label_Pressione_8);
		
		label_hPa1 = new JLabel("hPa");
		label_hPa1.setBounds(495, 45, 25, 21);
		panel.add(label_hPa1);
		
		label_hPa2 = new JLabel("hPa");
		label_hPa2.setBounds(495, 95, 25, 21);
		panel.add(label_hPa2);
		
		label_hPa3 = new JLabel("hPa");
		label_hPa3.setBounds(495, 152, 25, 21);
		panel.add(label_hPa3);
		
		label_hPa4 = new JLabel("hPa");
		label_hPa4.setBounds(495, 204, 25, 21);
		panel.add(label_hPa4);
		
		label_hPa5 = new JLabel("hPa");
		label_hPa5.setBounds(495, 256, 25, 21);
		panel.add(label_hPa5);
		
		label_hPa6 = new JLabel("hPa");
		label_hPa6.setBounds(495, 308, 25, 21);
		panel.add(label_hPa6);
		
		label_hPa7 = new JLabel("hPa");
		label_hPa7.setBounds(495, 363, 25, 21);
		panel.add(label_hPa7);
		
		label_hPa8 = new JLabel("hPa");
		label_hPa8.setBounds(495, 414, 25, 21);
		panel.add(label_hPa8);
		
		lblVelocitavento_1 = new JLabel("");
		lblVelocitavento_1.setBounds(555, 45, 35, 18);
		panel.add(lblVelocitavento_1);
		
		label_Velocitavento_2 = new JLabel("");
		label_Velocitavento_2.setBounds(555, 98, 35, 18);
		panel.add(label_Velocitavento_2);
		
		label_Velocitavento_3 = new JLabel("");
		label_Velocitavento_3.setBounds(555, 152, 35, 18);
		panel.add(label_Velocitavento_3);
		
		label_Velocitavento_4 = new JLabel("");
		label_Velocitavento_4.setBounds(555, 204, 35, 18);
		panel.add(label_Velocitavento_4);
		
		label_Velocitavento_5 = new JLabel("");
		label_Velocitavento_5.setBounds(555, 256, 35, 18);
		panel.add(label_Velocitavento_5);
		
		label_Velocitavento_6 = new JLabel("");
		label_Velocitavento_6.setBounds(552, 308, 35, 18);
		panel.add(label_Velocitavento_6);
		
		label_Velocitavento_7 = new JLabel("");
		label_Velocitavento_7.setBounds(555, 363, 35, 18);
		panel.add(label_Velocitavento_7);
		
		label_Velocitavento_8 = new JLabel("");
		label_Velocitavento_8.setBounds(555, 411, 35, 18);
		panel.add(label_Velocitavento_8);
		
		lblDirezione_1 = new JLabel("");
		lblDirezione_1.setBounds(600, 45, 40, 18);
		panel.add(lblDirezione_1);
		
		label_Direzione_2 = new JLabel("");
		label_Direzione_2.setBounds(600, 98, 40, 18);
		panel.add(label_Direzione_2);
		
		label_Direzione_3 = new JLabel("");
		label_Direzione_3.setBounds(600, 152, 40, 18);
		panel.add(label_Direzione_3);
		
		label_Direzione_4 = new JLabel("");
		label_Direzione_4.setBounds(600, 204, 40, 18);
		panel.add(label_Direzione_4);
		
		label_Direzione_5 = new JLabel("");
		label_Direzione_5.setBounds(600, 256, 40, 18);
		panel.add(label_Direzione_5);
		
		label_Direzione_6 = new JLabel("");
		label_Direzione_6.setBounds(600, 308, 40, 18);
		panel.add(label_Direzione_6);
		
		label_Direzione_7 = new JLabel("");
		label_Direzione_7.setBounds(600, 363, 40, 18);
		panel.add(label_Direzione_7);
		
		label_Direzione_8 = new JLabel("");
		label_Direzione_8.setBounds(600, 414, 40, 18);
		panel.add(label_Direzione_8);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(-17, -30, 657, 483);
		panel.add(scrollPane);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		label_Testo_ora1 = new JLabel("Ora");
		label_Testo_ora1.setHorizontalAlignment(SwingConstants.CENTER);
		label_Testo_ora1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_ora1.setBounds(0, 0, 44, 21);
		panel_1.add(label_Testo_ora1);
		
		label_Testo_tempo1 = new JLabel("Tempo");
		label_Testo_tempo1.setHorizontalAlignment(SwingConstants.CENTER);
		label_Testo_tempo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_tempo1.setBounds(45, 0, 184, 21);
		panel_1.add(label_Testo_tempo1);
		
		label_17 = new JLabel("0");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(0, 42, 35, 21);
		panel_1.add(label_17);
		
		label_25 = new JLabel("");
		label_25.setBounds(45, 32, 44, 42);
		panel_1.add(label_25);
		
		label_18 = new JLabel("3");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setBounds(0, 95, 35, 21);
		panel_1.add(label_18);
		
		label_26 = new JLabel("");
		label_26.setBounds(45, 85, 44, 42);
		panel_1.add(label_26);
		
		label_19 = new JLabel("6");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBounds(0, 149, 35, 21);
		panel_1.add(label_19);
		
		label_27 = new JLabel("");
		label_27.setBounds(45, 138, 44, 42);
		panel_1.add(label_27);
		
		label_20 = new JLabel("9");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setBounds(0, 201, 35, 21);
		panel_1.add(label_20);
		
		label_28 = new JLabel("");
		label_28.setBounds(45, 191, 44, 42);
		panel_1.add(label_28);
		
		label_21 = new JLabel("12");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setBounds(0, 253, 35, 21);
		panel_1.add(label_21);
		
		label_29 = new JLabel("");
		label_29.setBounds(45, 244, 44, 42);
		panel_1.add(label_29);
		
		label_22 = new JLabel("15");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setBounds(0, 305, 35, 21);
		panel_1.add(label_22);
		
		label_30 = new JLabel("");
		label_30.setBounds(45, 297, 44, 42);
		panel_1.add(label_30);
		
		label_24 = new JLabel("21");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setBounds(0, 411, 35, 21);
		panel_1.add(label_24);
		
		label_23 = new JLabel("18");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setBounds(0, 360, 35, 21);
		panel_1.add(label_23);
		
		label_31 = new JLabel("");
		label_31.setBounds(45, 350, 44, 42);
		panel_1.add(label_31);
		
		label_32 = new JLabel("");
		label_32.setBounds(45, 400, 44, 42);
		panel_1.add(label_32);
		
		label_descrizione9 = new JLabel("");
		label_descrizione9.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione9.setBounds(99, 45, 130, 18);
		panel_1.add(label_descrizione9);
		
		label_descrizione10 = new JLabel("");
		label_descrizione10.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione10.setBounds(99, 98, 130, 18);
		panel_1.add(label_descrizione10);
		
		label_descrizione11 = new JLabel("");
		label_descrizione11.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione11.setBounds(99, 152, 130, 18);
		panel_1.add(label_descrizione11);
		
		label_descrizione12 = new JLabel("");
		label_descrizione12.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione12.setBounds(99, 204, 130, 18);
		panel_1.add(label_descrizione12);
		
		label_descrizione13 = new JLabel("");
		label_descrizione13.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione13.setBounds(99, 256, 130, 18);
		panel_1.add(label_descrizione13);
		
		label_descrizione14 = new JLabel("");
		label_descrizione14.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione14.setBounds(99, 308, 130, 18);
		panel_1.add(label_descrizione14);
		
		label_descrizione15 = new JLabel("");
		label_descrizione15.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione15.setBounds(99, 363, 130, 18);
		panel_1.add(label_descrizione15);
		
		label_descrizione16 = new JLabel("");
		label_descrizione16.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione16.setBounds(99, 414, 130, 18);
		panel_1.add(label_descrizione16);
		
		label_Testo_temperatura1 = new JLabel("Temperatura");
		label_Testo_temperatura1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_temperatura1.setBounds(236, 5, 103, 16);
		panel_1.add(label_Testo_temperatura1);
		
		label_temperatura_9 = new JLabel("");
		label_temperatura_9.setBounds(271, 45, 35, 18);
		panel_1.add(label_temperatura_9);
		
		label_temperatura_10 = new JLabel("");
		label_temperatura_10.setBounds(271, 95, 35, 18);
		panel_1.add(label_temperatura_10);
		
		label_temperatura_11 = new JLabel("");
		label_temperatura_11.setBounds(271, 152, 35, 18);
		panel_1.add(label_temperatura_11);
		
		label_temperatura_12 = new JLabel("");
		label_temperatura_12.setBounds(271, 201, 35, 18);
		panel_1.add(label_temperatura_12);
		
		label_temperatura_13 = new JLabel("");
		label_temperatura_13.setBounds(271, 256, 35, 18);
		panel_1.add(label_temperatura_13);
		
		label_temperatura_14 = new JLabel("");
		label_temperatura_14.setBounds(271, 308, 35, 18);
		panel_1.add(label_temperatura_14);
		
		label_temperatura_15 = new JLabel("");
		label_temperatura_15.setBounds(271, 363, 35, 18);
		panel_1.add(label_temperatura_15);
		
		label_temperatura_16 = new JLabel("");
		label_temperatura_16.setBounds(271, 414, 35, 18);
		panel_1.add(label_temperatura_16);
		
		label_Celsius_9 = new JLabel("\u00B0C");
		label_Celsius_9.setBounds(309, 42, 25, 21);
		panel_1.add(label_Celsius_9);
		
		label_Celsius_10 = new JLabel("\u00B0C");
		label_Celsius_10.setBounds(309, 95, 25, 21);
		panel_1.add(label_Celsius_10);
		
		label_Celsius_11 = new JLabel("\u00B0C");
		label_Celsius_11.setBounds(309, 149, 25, 21);
		panel_1.add(label_Celsius_11);
		
		label_Celsius_12 = new JLabel("\u00B0C");
		label_Celsius_12.setBounds(309, 201, 25, 21);
		panel_1.add(label_Celsius_12);
		
		label_Celsius_13 = new JLabel("\u00B0C");
		label_Celsius_13.setBounds(309, 253, 25, 21);
		panel_1.add(label_Celsius_13);
		
		label_Celsius_14 = new JLabel("\u00B0C");
		label_Celsius_14.setBounds(309, 305, 25, 21);
		panel_1.add(label_Celsius_14);
		
		label_Celsius_15 = new JLabel("\u00B0C");
		label_Celsius_15.setBounds(309, 360, 25, 21);
		panel_1.add(label_Celsius_15);
		
		label_Celsius_16 = new JLabel("\u00B0C");
		label_Celsius_16.setBounds(309, 411, 25, 21);
		panel_1.add(label_Celsius_16);
		
		label_Testo_umidita1 = new JLabel("Umidit\u00E0");
		label_Testo_umidita1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_umidita1.setBounds(349, 5, 63, 16);
		panel_1.add(label_Testo_umidita1);
		
		label_percentuale9 = new JLabel("%");
		label_percentuale9.setBounds(403, 42, 25, 21);
		panel_1.add(label_percentuale9);
		
		label_percentuale10 = new JLabel("%");
		label_percentuale10.setBounds(403, 98, 25, 21);
		panel_1.add(label_percentuale10);
		
		JLabel label_percentuale11 = new JLabel("%");
		label_percentuale11.setBounds(403, 152, 25, 21);
		panel_1.add(label_percentuale11);
		
		label_percentuale12 = new JLabel("%");
		label_percentuale12.setBounds(403, 204, 25, 21);
		panel_1.add(label_percentuale12);
		
		label_percentuale13 = new JLabel("%");
		label_percentuale13.setBounds(403, 256, 25, 21);
		panel_1.add(label_percentuale13);
		
		label_percentuale14 = new JLabel("%");
		label_percentuale14.setBounds(403, 308, 25, 21);
		panel_1.add(label_percentuale14);
		
		label_percentuale15 = new JLabel("%");
		label_percentuale15.setBounds(403, 363, 25, 21);
		panel_1.add(label_percentuale15);
		
		label_percentuale16 = new JLabel("%");
		label_percentuale16.setBounds(403, 414, 25, 21);
		panel_1.add(label_percentuale16);
		
		label_Umidita9 = new JLabel("");
		label_Umidita9.setBounds(366, 45, 35, 18);
		panel_1.add(label_Umidita9);
		
		label_Umidita10 = new JLabel("");
		label_Umidita10.setBounds(366, 98, 35, 18);
		panel_1.add(label_Umidita10);
		
		label_Umidita11 = new JLabel("");
		label_Umidita11.setBounds(366, 152, 37, 18);
		panel_1.add(label_Umidita11);
		
		label_Umidita12 = new JLabel("");
		label_Umidita12.setBounds(366, 204, 37, 18);
		panel_1.add(label_Umidita12);
		
		label_Umidita13 = new JLabel("");
		label_Umidita13.setBounds(366, 256, 37, 18);
		panel_1.add(label_Umidita13);
		
		label_Umidita14 = new JLabel("");
		label_Umidita14.setBounds(366, 308, 35, 18);
		panel_1.add(label_Umidita14);
		
		label_Umidita15 = new JLabel("");
		label_Umidita15.setBounds(366, 363, 37, 18);
		panel_1.add(label_Umidita15);
		
		label_Umidita16 = new JLabel("");
		label_Umidita16.setBounds(366, 414, 37, 18);
		panel_1.add(label_Umidita16);
		
		label_Testo_pressione1 = new JLabel("Pressione");
		label_Testo_pressione1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_pressione1.setBounds(422, 5, 76, 16);
		panel_1.add(label_Testo_pressione1);
		
		label_Testo_vento1 = new JLabel("Vento(mps)");
		label_Testo_vento1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testo_vento1.setBounds(533, 5, 94, 16);
		panel_1.add(label_Testo_vento1);
		
		label_Pressione_9 = new JLabel("");
		label_Pressione_9.setBounds(438, 45, 57, 18);
		panel_1.add(label_Pressione_9);
		
		label_Pressione_10 = new JLabel("");
		label_Pressione_10.setBounds(438, 98, 57, 18);
		panel_1.add(label_Pressione_10);
		
		label_Pressione_11 = new JLabel("");
		label_Pressione_11.setBounds(441, 152, 57, 18);
		panel_1.add(label_Pressione_11);
		
		label_Pressione_12 = new JLabel("");
		label_Pressione_12.setBounds(438, 204, 57, 18);
		panel_1.add(label_Pressione_12);
		
		label_Pressione_13 = new JLabel("");
		label_Pressione_13.setBounds(438, 256, 57, 18);
		panel_1.add(label_Pressione_13);
		
		label_Pressione_14 = new JLabel("");
		label_Pressione_14.setBounds(438, 308, 57, 18);
		panel_1.add(label_Pressione_14);
		
		label_Pressione_15 = new JLabel("");
		label_Pressione_15.setBounds(438, 363, 57, 18);
		panel_1.add(label_Pressione_15);
		
		label_Pressione_16 = new JLabel("");
		label_Pressione_16.setBounds(438, 414, 57, 18);
		panel_1.add(label_Pressione_16);
		
		label_hPa9 = new JLabel("hPa");
		label_hPa9.setBounds(495, 45, 25, 21);
		panel_1.add(label_hPa9);
		
		label_hPa10 = new JLabel("hPa");
		label_hPa10.setBounds(495, 95, 25, 21);
		panel_1.add(label_hPa10);
		
		label_hPa11 = new JLabel("hPa");
		label_hPa11.setBounds(495, 152, 25, 21);
		panel_1.add(label_hPa11);
		
		label_hPa12 = new JLabel("hPa");
		label_hPa12.setBounds(495, 204, 25, 21);
		panel_1.add(label_hPa12);
		
		label_hPa13 = new JLabel("hPa");
		label_hPa13.setBounds(495, 256, 25, 21);
		panel_1.add(label_hPa13);
		
		label_hPa14 = new JLabel("hPa");
		label_hPa14.setBounds(495, 308, 25, 21);
		panel_1.add(label_hPa14);
		
		label_hPa15 = new JLabel("hPa");
		label_hPa15.setBounds(495, 363, 25, 21);
		panel_1.add(label_hPa15);
		
		label_hPa16 = new JLabel("hPa");
		label_hPa16.setBounds(495, 414, 25, 21);
		panel_1.add(label_hPa16);
		
		label_Velocitavento_9 = new JLabel("");
		label_Velocitavento_9.setBounds(555, 45, 35, 18);
		panel_1.add(label_Velocitavento_9);
		
		label_Velocitavento_10 = new JLabel("");
		label_Velocitavento_10.setBounds(555, 98, 35, 18);
		panel_1.add(label_Velocitavento_10);
		
		label_Velocitavento_11 = new JLabel("");
		label_Velocitavento_11.setBounds(555, 152, 35, 18);
		panel_1.add(label_Velocitavento_11);
		
		label_Velocitavento_12 = new JLabel("");
		label_Velocitavento_12.setBounds(555, 204, 35, 18);
		panel_1.add(label_Velocitavento_12);
		
		label_Velocitavento_13 = new JLabel("");
		label_Velocitavento_13.setBounds(555, 256, 35, 18);
		panel_1.add(label_Velocitavento_13);
		
		label_Velocitavento_14 = new JLabel("");
		label_Velocitavento_14.setBounds(552, 308, 35, 18);
		panel_1.add(label_Velocitavento_14);
		
		label_Velocitavento_15 = new JLabel("");
		label_Velocitavento_15.setBounds(555, 363, 35, 18);
		panel_1.add(label_Velocitavento_15);
		
		label_Velocitavento_16 = new JLabel("");
		label_Velocitavento_16.setBounds(555, 411, 35, 18);
		panel_1.add(label_Velocitavento_16);
		
		label_Direzione_9 = new JLabel("");
		label_Direzione_9.setBounds(600, 45, 40, 18);
		panel_1.add(label_Direzione_9);
		
		label_Direzione_10 = new JLabel("");
		label_Direzione_10.setBounds(600, 98, 40, 18);
		panel_1.add(label_Direzione_10);
		
		label_Direzione_11 = new JLabel("");
		label_Direzione_11.setBounds(600, 152, 40, 18);
		panel_1.add(label_Direzione_11);
		
		label_Direzione_12 = new JLabel("");
		label_Direzione_12.setBounds(600, 204, 40, 18);
		panel_1.add(label_Direzione_12);
		
		label_Direzione_13 = new JLabel("");
		label_Direzione_13.setBounds(600, 256, 40, 18);
		panel_1.add(label_Direzione_13);
		
		label_Direzione_14 = new JLabel("");
		label_Direzione_14.setBounds(600, 308, 40, 18);
		panel_1.add(label_Direzione_14);
		
		label_Direzione_15 = new JLabel("");
		label_Direzione_15.setBounds(600, 363, 40, 18);
		panel_1.add(label_Direzione_15);
		
		label_Direzione_16 = new JLabel("");
		label_Direzione_16.setBounds(600, 414, 40, 18);
		panel_1.add(label_Direzione_16);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		label_Testoora2 = new JLabel("Ora");
		label_Testoora2.setHorizontalAlignment(SwingConstants.CENTER);
		label_Testoora2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testoora2.setBounds(0, 0, 44, 21);
		panel_2.add(label_Testoora2);
		
		label_TestoTempo2 = new JLabel("Tempo");
		label_TestoTempo2.setHorizontalAlignment(SwingConstants.CENTER);
		label_TestoTempo2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_TestoTempo2.setBounds(45, 0, 184, 21);
		panel_2.add(label_TestoTempo2);
		
		label_34 = new JLabel("0");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setBounds(0, 42, 35, 21);
		panel_2.add(label_34);
		
		label_35 = new JLabel("3");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setBounds(0, 95, 35, 21);
		panel_2.add(label_35);
		
		label_36 = new JLabel("6");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setBounds(0, 149, 35, 21);
		panel_2.add(label_36);
		
		label_37 = new JLabel("9");
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setBounds(0, 201, 35, 21);
		panel_2.add(label_37);
		
		label_38 = new JLabel("12");
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setBounds(0, 253, 35, 21);
		panel_2.add(label_38);
		
		label_39 = new JLabel("15");
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setBounds(0, 305, 35, 21);
		panel_2.add(label_39);
		
		label_40 = new JLabel("18");
		label_40.setHorizontalAlignment(SwingConstants.CENTER);
		label_40.setBounds(0, 360, 35, 21);
		panel_2.add(label_40);
		
		label_41 = new JLabel("21");
		label_41.setHorizontalAlignment(SwingConstants.CENTER);
		label_41.setBounds(0, 411, 35, 21);
		panel_2.add(label_41);
		
		label_42 = new JLabel("");
		label_42.setBounds(45, 32, 44, 42);
		panel_2.add(label_42);
		
		label_43 = new JLabel("");
		label_43.setBounds(45, 85, 44, 42);
		panel_2.add(label_43);
		
		label_44 = new JLabel("");
		label_44.setBounds(45, 138, 44, 42);
		panel_2.add(label_44);
		
		label_45 = new JLabel("");
		label_45.setBounds(45, 191, 44, 42);
		panel_2.add(label_45);
		
		label_46 = new JLabel("");
		label_46.setBounds(45, 244, 44, 42);
		panel_2.add(label_46);
		
		label_47 = new JLabel("");
		label_47.setBounds(45, 297, 44, 42);
		panel_2.add(label_47);
		
		label_48 = new JLabel("");
		label_48.setBounds(45, 350, 44, 42);
		panel_2.add(label_48);
		
		label_49 = new JLabel("");
		label_49.setBounds(45, 400, 44, 42);
		panel_2.add(label_49);
		
		label_descrizione17 = new JLabel("");
		label_descrizione17.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione17.setBounds(99, 45, 130, 18);
		panel_2.add(label_descrizione17);
		
		label_descrizione18 = new JLabel("");
		label_descrizione18.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione18.setBounds(99, 98, 130, 18);
		panel_2.add(label_descrizione18);
		
		label_descrizione19 = new JLabel("");
		label_descrizione19.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione19.setBounds(99, 152, 130, 18);
		panel_2.add(label_descrizione19);
		
		label_descrizione20 = new JLabel("");
		label_descrizione20.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione20.setBounds(99, 204, 130, 18);
		panel_2.add(label_descrizione20);
		
		label_descrizione21 = new JLabel("");
		label_descrizione21.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione21.setBounds(99, 256, 130, 18);
		panel_2.add(label_descrizione21);
		
		label_descrizione22 = new JLabel("");
		label_descrizione22.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione22.setBounds(99, 308, 130, 18);
		panel_2.add(label_descrizione22);
		
		label_descrizione23 = new JLabel("");
		label_descrizione23.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione23.setBounds(99, 363, 130, 18);
		panel_2.add(label_descrizione23);
		
		label_descrizione24 = new JLabel("");
		label_descrizione24.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione24.setBounds(99, 414, 130, 18);
		panel_2.add(label_descrizione24);
		
		label_Testotemperatura2 = new JLabel("Temperatura");
		label_Testotemperatura2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testotemperatura2.setBounds(236, 5, 103, 16);
		panel_2.add(label_Testotemperatura2);
		
		label_temperatura_17 = new JLabel("");
		label_temperatura_17.setBounds(271, 45, 35, 18);
		panel_2.add(label_temperatura_17);
		
		label_temperatura_18 = new JLabel("");
		label_temperatura_18.setBounds(271, 95, 35, 18);
		panel_2.add(label_temperatura_18);
		
		label_temperatura_19 = new JLabel("");
		label_temperatura_19.setBounds(271, 152, 35, 18);
		panel_2.add(label_temperatura_19);
		
		label_temperatura_20 = new JLabel("");
		label_temperatura_20.setBounds(271, 201, 35, 18);
		panel_2.add(label_temperatura_20);
		
		label_temperatura_21 = new JLabel("");
		label_temperatura_21.setBounds(271, 256, 35, 18);
		panel_2.add(label_temperatura_21);
		
		label_temperatura_22 = new JLabel("");
		label_temperatura_22.setBounds(271, 308, 35, 18);
		panel_2.add(label_temperatura_22);
		
		label_temperatura_23 = new JLabel("");
		label_temperatura_23.setBounds(271, 363, 35, 18);
		panel_2.add(label_temperatura_23);
		
		label_temperatura_24 = new JLabel("");
		label_temperatura_24.setBounds(271, 414, 35, 18);
		panel_2.add(label_temperatura_24);
		
		label_Celsius_17 = new JLabel("\u00B0C");
		label_Celsius_17.setBounds(309, 42, 25, 21);
		panel_2.add(label_Celsius_17);
		
		label_Celsius_18 = new JLabel("\u00B0C");
		label_Celsius_18.setBounds(309, 95, 25, 21);
		panel_2.add(label_Celsius_18);
		
		label_Celsius_19 = new JLabel("\u00B0C");
		label_Celsius_19.setBounds(309, 149, 25, 21);
		panel_2.add(label_Celsius_19);
		
		label_Celsius_20 = new JLabel("\u00B0C");
		label_Celsius_20.setBounds(309, 201, 25, 21);
		panel_2.add(label_Celsius_20);
		
		label_Celsius_21 = new JLabel("\u00B0C");
		label_Celsius_21.setBounds(309, 253, 25, 21);
		panel_2.add(label_Celsius_21);
		
		label_Celsius_22 = new JLabel("\u00B0C");
		label_Celsius_22.setBounds(309, 305, 25, 21);
		panel_2.add(label_Celsius_22);
		
		label_Celsius_23 = new JLabel("\u00B0C");
		label_Celsius_23.setBounds(309, 360, 25, 21);
		panel_2.add(label_Celsius_23);
		
		label_Celsius_24 = new JLabel("\u00B0C");
		label_Celsius_24.setBounds(309, 411, 25, 21);
		panel_2.add(label_Celsius_24);
		
		label_Testoumidita2 = new JLabel("Umidit\u00E0");
		label_Testoumidita2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testoumidita2.setBounds(349, 5, 63, 16);
		panel_2.add(label_Testoumidita2);
		
		label_percentuale17 = new JLabel("%");
		label_percentuale17.setBounds(403, 42, 25, 21);
		panel_2.add(label_percentuale17);
		
		label_percentuale18 = new JLabel("%");
		label_percentuale18.setBounds(403, 98, 25, 21);
		panel_2.add(label_percentuale18);
		
		label_percentuale19 = new JLabel("%");
		label_percentuale19.setBounds(403, 152, 25, 21);
		panel_2.add(label_percentuale19);
		
		label_percentuale20 = new JLabel("%");
		label_percentuale20.setBounds(403, 204, 25, 21);
		panel_2.add(label_percentuale20);
		
		label_percentuale21 = new JLabel("%");
		label_percentuale21.setBounds(403, 256, 25, 21);
		panel_2.add(label_percentuale21);
		
		label_percentuale22 = new JLabel("%");
		label_percentuale22.setBounds(403, 308, 25, 21);
		panel_2.add(label_percentuale22);
		
		label_percentuale23 = new JLabel("%");
		label_percentuale23.setBounds(403, 363, 25, 21);
		panel_2.add(label_percentuale23);
		
		label_percentuale24 = new JLabel("%");
		label_percentuale24.setBounds(403, 414, 25, 21);
		panel_2.add(label_percentuale24);
		
		label_Umidita17 = new JLabel("");
		label_Umidita17.setBounds(366, 45, 35, 18);
		panel_2.add(label_Umidita17);
		
		label_Umidita18 = new JLabel("");
		label_Umidita18.setBounds(366, 98, 35, 18);
		panel_2.add(label_Umidita18);
		
		label_Umidita19 = new JLabel("");
		label_Umidita19.setBounds(366, 152, 37, 18);
		panel_2.add(label_Umidita19);
		
		label_Umidita20 = new JLabel("");
		label_Umidita20.setBounds(366, 204, 37, 18);
		panel_2.add(label_Umidita20);
		
		label_Umidita21 = new JLabel("");
		label_Umidita21.setBounds(366, 256, 37, 18);
		panel_2.add(label_Umidita21);
		
		label_Umidita22 = new JLabel("");
		label_Umidita22.setBounds(366, 308, 35, 18);
		panel_2.add(label_Umidita22);
		
		label_Umidita23 = new JLabel("");
		label_Umidita23.setBounds(366, 363, 37, 18);
		panel_2.add(label_Umidita23);
		
		label_Umidita24 = new JLabel("");
		label_Umidita24.setBounds(366, 414, 37, 18);
		panel_2.add(label_Umidita24);
		
		label_Testopressione2 = new JLabel("Pressione");
		label_Testopressione2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testopressione2.setBounds(422, 5, 76, 16);
		panel_2.add(label_Testopressione2);
		
		label_Testovento2 = new JLabel("Vento(mps)");
		label_Testovento2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testovento2.setBounds(533, 5, 94, 16);
		panel_2.add(label_Testovento2);
		
		label_Pressione_17 = new JLabel("");
		label_Pressione_17.setBounds(438, 45, 57, 18);
		panel_2.add(label_Pressione_17);
		
		label_Pressione_18 = new JLabel("");
		label_Pressione_18.setBounds(438, 98, 57, 18);
		panel_2.add(label_Pressione_18);
		
		label_Pressione_19 = new JLabel("");
		label_Pressione_19.setBounds(441, 152, 57, 18);
		panel_2.add(label_Pressione_19);
		
		label_Pressione_20 = new JLabel("");
		label_Pressione_20.setBounds(438, 204, 57, 18);
		panel_2.add(label_Pressione_20);
		
		label_Pressione_21 = new JLabel("");
		label_Pressione_21.setBounds(438, 256, 57, 18);
		panel_2.add(label_Pressione_21);
		
		label_Pressione_22 = new JLabel("");
		label_Pressione_22.setBounds(438, 308, 57, 18);
		panel_2.add(label_Pressione_22);
		
		label_Pressione_23 = new JLabel("");
		label_Pressione_23.setBounds(438, 363, 57, 18);
		panel_2.add(label_Pressione_23);
		
		label_Pressione_24 = new JLabel("");
		label_Pressione_24.setBounds(438, 414, 57, 18);
		panel_2.add(label_Pressione_24);
		
		label_hPa17 = new JLabel("hPa");
		label_hPa17.setBounds(495, 45, 25, 21);
		panel_2.add(label_hPa17);
		
		label_hPa18 = new JLabel("hPa");
		label_hPa18.setBounds(495, 95, 25, 21);
		panel_2.add(label_hPa18);
		
		label_hPa19 = new JLabel("hPa");
		label_hPa19.setBounds(495, 152, 25, 21);
		panel_2.add(label_hPa19);
		
		label_hPa20 = new JLabel("hPa");
		label_hPa20.setBounds(495, 204, 25, 21);
		panel_2.add(label_hPa20);
		
		label_hPa21 = new JLabel("hPa");
		label_hPa21.setBounds(495, 256, 25, 21);
		panel_2.add(label_hPa21);
		
		label_hPa22 = new JLabel("hPa");
		label_hPa22.setBounds(495, 308, 25, 21);
		panel_2.add(label_hPa22);
		
		label_hPa23 = new JLabel("hPa");
		label_hPa23.setBounds(495, 363, 25, 21);
		panel_2.add(label_hPa23);
		
		label_hPa24 = new JLabel("hPa");
		label_hPa24.setBounds(495, 414, 25, 21);
		panel_2.add(label_hPa24);
		
		label_Velocitavento_17 = new JLabel("");
		label_Velocitavento_17.setBounds(555, 45, 35, 18);
		panel_2.add(label_Velocitavento_17);
		
		label_Velocitavento_18 = new JLabel("");
		label_Velocitavento_18.setBounds(555, 98, 35, 18);
		panel_2.add(label_Velocitavento_18);
		
		label_Velocitavento_19 = new JLabel("");
		label_Velocitavento_19.setBounds(555, 152, 35, 18);
		panel_2.add(label_Velocitavento_19);
		
		label_Velocitavento_20 = new JLabel("");
		label_Velocitavento_20.setBounds(555, 204, 35, 18);
		panel_2.add(label_Velocitavento_20);
		
		label_Velocitavento_21 = new JLabel("");
		label_Velocitavento_21.setBounds(555, 256, 35, 18);
		panel_2.add(label_Velocitavento_21);
		
		label_Velocitavento_22 = new JLabel("");
		label_Velocitavento_22.setBounds(552, 308, 35, 18);
		panel_2.add(label_Velocitavento_22);
		
		label_Velocitavento_23 = new JLabel("");
		label_Velocitavento_23.setBounds(555, 363, 35, 18);
		panel_2.add(label_Velocitavento_23);
		
		label_Velocitavento_24 = new JLabel("");
		label_Velocitavento_24.setBounds(555, 411, 35, 18);
		panel_2.add(label_Velocitavento_24);
		
		label_Direzione_17 = new JLabel("");
		label_Direzione_17.setBounds(600, 45, 40, 18);
		panel_2.add(label_Direzione_17);
		
		label_Direzione_18 = new JLabel("");
		label_Direzione_18.setBounds(600, 98, 40, 18);
		panel_2.add(label_Direzione_18);
		
		label_Direzione_19 = new JLabel("");
		label_Direzione_19.setBounds(600, 152, 40, 18);
		panel_2.add(label_Direzione_19);
		
		label_Direzione_20 = new JLabel("");
		label_Direzione_20.setBounds(600, 204, 40, 18);
		panel_2.add(label_Direzione_20);
		
		label_Direzione_21 = new JLabel("");
		label_Direzione_21.setBounds(600, 256, 40, 18);
		panel_2.add(label_Direzione_21);
		
		label_Direzione_22 = new JLabel("");
		label_Direzione_22.setBounds(600, 308, 40, 18);
		panel_2.add(label_Direzione_22);
		
		label_Direzione_23 = new JLabel("");
		label_Direzione_23.setBounds(600, 363, 40, 18);
		panel_2.add(label_Direzione_23);
		
		label_Direzione_24 = new JLabel("");
		label_Direzione_24.setBounds(600, 414, 40, 18);
		panel_2.add(label_Direzione_24);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		label_Testoora3 = new JLabel("Ora");
		label_Testoora3.setHorizontalAlignment(SwingConstants.CENTER);
		label_Testoora3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_Testoora3.setBounds(0, 0, 44, 21);
		panel_3.add(label_Testoora3);
		
		label_TestoTempo3 = new JLabel("Tempo");
		label_TestoTempo3.setHorizontalAlignment(SwingConstants.CENTER);
		label_TestoTempo3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_TestoTempo3.setBounds(45, 0, 184, 21);
		panel_3.add(label_TestoTempo3);
		
		label_50 = new JLabel("0");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setBounds(0, 42, 35, 21);
		panel_3.add(label_50);
		
		label_51 = new JLabel("3");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setBounds(0, 95, 35, 21);
		panel_3.add(label_51);
		
		label_52 = new JLabel("6");
		label_52.setHorizontalAlignment(SwingConstants.CENTER);
		label_52.setBounds(0, 149, 35, 21);
		panel_3.add(label_52);
		
		label_53 = new JLabel("9");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setBounds(0, 201, 35, 21);
		panel_3.add(label_53);
		
		label_54 = new JLabel("12");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setBounds(0, 253, 35, 21);
		panel_3.add(label_54);
		
		label_55 = new JLabel("15");
		label_55.setHorizontalAlignment(SwingConstants.CENTER);
		label_55.setBounds(0, 305, 35, 21);
		panel_3.add(label_55);
		
		label_56 = new JLabel("18");
		label_56.setHorizontalAlignment(SwingConstants.CENTER);
		label_56.setBounds(0, 360, 35, 21);
		panel_3.add(label_56);
		
		label_57 = new JLabel("21");
		label_57.setHorizontalAlignment(SwingConstants.CENTER);
		label_57.setBounds(0, 411, 35, 21);
		panel_3.add(label_57);
		
		label_58 = new JLabel("");
		label_58.setBounds(45, 32, 44, 42);
		panel_3.add(label_58);
		
		label_59 = new JLabel("");
		label_59.setBounds(45, 85, 44, 42);
		panel_3.add(label_59);
		
		label_60 = new JLabel("");
		label_60.setBounds(45, 138, 44, 42);
		panel_3.add(label_60);
		
		label_61 = new JLabel("");
		label_61.setBounds(45, 191, 44, 42);
		panel_3.add(label_61);
		
		label_62 = new JLabel("");
		label_62.setBounds(45, 244, 44, 42);
		panel_3.add(label_62);
		
		label_63 = new JLabel("");
		label_63.setBounds(45, 297, 44, 42);
		panel_3.add(label_63);
		
		label_64 = new JLabel("");
		label_64.setBounds(45, 350, 44, 42);
		panel_3.add(label_64);
		
		label_65 = new JLabel("");
		label_65.setBounds(45, 400, 44, 42);
		panel_3.add(label_65);
		
		label_descrizione25 = new JLabel("");
		label_descrizione25.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione25.setBounds(99, 45, 130, 18);
		panel_3.add(label_descrizione25);
		
		label_descrizione26 = new JLabel("");
		label_descrizione26.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione26.setBounds(99, 98, 130, 18);
		panel_3.add(label_descrizione26);
		
		label_descrizione27 = new JLabel("");
		label_descrizione27.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione27.setBounds(99, 152, 130, 18);
		panel_3.add(label_descrizione27);
		
		label_descrizione28 = new JLabel("");
		label_descrizione28.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione28.setBounds(99, 204, 130, 18);
		panel_3.add(label_descrizione28);
		
		label_descrizione29 = new JLabel("");
		label_descrizione29.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione29.setBounds(99, 256, 130, 18);
		panel_3.add(label_descrizione29);
		
		label_descrizione30 = new JLabel("");
		label_descrizione30.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione30.setBounds(99, 308, 130, 18);
		panel_3.add(label_descrizione30);
		
		label_descrizione31 = new JLabel("");
		label_descrizione31.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione31.setBounds(99, 363, 130, 18);
		panel_3.add(label_descrizione31);
		
		label_descrizione32 = new JLabel("");
		label_descrizione32.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione32.setBounds(99, 414, 130, 18);
		panel_3.add(label_descrizione32);
		
		label_TestoTemperatura3 = new JLabel("Temperatura");
		label_TestoTemperatura3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_TestoTemperatura3.setBounds(236, 5, 103, 16);
		panel_3.add(label_TestoTemperatura3);
		
		label_temperatura_25 = new JLabel("");
		label_temperatura_25.setBounds(271, 45, 35, 18);
		panel_3.add(label_temperatura_25);
		
		label_temperatura_26 = new JLabel("");
		label_temperatura_26.setBounds(271, 95, 35, 18);
		panel_3.add(label_temperatura_26);
		
		label_temperatura_27 = new JLabel("");
		label_temperatura_27.setBounds(271, 152, 35, 18);
		panel_3.add(label_temperatura_27);
		
		label_temperatura_28 = new JLabel("");
		label_temperatura_28.setBounds(271, 201, 35, 18);
		panel_3.add(label_temperatura_28);
		
		label_temperatura_29 = new JLabel("");
		label_temperatura_29.setBounds(271, 256, 35, 18);
		panel_3.add(label_temperatura_29);
		
		label_temperatura_30 = new JLabel("");
		label_temperatura_30.setBounds(271, 308, 35, 18);
		panel_3.add(label_temperatura_30);
		
		label_temperatura_31 = new JLabel("");
		label_temperatura_31.setBounds(271, 363, 35, 18);
		panel_3.add(label_temperatura_31);
		
		label_temperatura_32 = new JLabel("");
		label_temperatura_32.setBounds(271, 414, 35, 18);
		panel_3.add(label_temperatura_32);
		
		label_Celsius_25 = new JLabel("\u00B0C");
		label_Celsius_25.setBounds(309, 42, 25, 21);
		panel_3.add(label_Celsius_25);
		
		label_Celsius_26 = new JLabel("\u00B0C");
		label_Celsius_26.setBounds(309, 95, 25, 21);
		panel_3.add(label_Celsius_26);
		
		label_Celsius_27 = new JLabel("\u00B0C");
		label_Celsius_27.setBounds(309, 149, 25, 21);
		panel_3.add(label_Celsius_27);
		
		label_Celsius_28 = new JLabel("\u00B0C");
		label_Celsius_28.setBounds(309, 201, 25, 21);
		panel_3.add(label_Celsius_28);
		
		label_Celsius_29 = new JLabel("\u00B0C");
		label_Celsius_29.setBounds(309, 253, 25, 21);
		panel_3.add(label_Celsius_29);
		
		label_Celsius_30 = new JLabel("\u00B0C");
		label_Celsius_30.setBounds(309, 305, 25, 21);
		panel_3.add(label_Celsius_30);
		
		label_Celsius_31 = new JLabel("\u00B0C");
		label_Celsius_31.setBounds(309, 360, 25, 21);
		panel_3.add(label_Celsius_31);
		
		label_Celsius_32 = new JLabel("\u00B0C");
		label_Celsius_32.setBounds(309, 411, 25, 21);
		panel_3.add(label_Celsius_32);
		
		label_TestoUmidita3 = new JLabel("Umidit\u00E0");
		label_TestoUmidita3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_TestoUmidita3.setBounds(349, 5, 63, 16);
		panel_3.add(label_TestoUmidita3);
		
		label_percentuale25 = new JLabel("%");
		label_percentuale25.setBounds(403, 42, 25, 21);
		panel_3.add(label_percentuale25);
		
		label_percentuale26 = new JLabel("%");
		label_percentuale26.setBounds(403, 98, 25, 21);
		panel_3.add(label_percentuale26);
		
		label_percentuale27 = new JLabel("%");
		label_percentuale27.setBounds(403, 152, 25, 21);
		panel_3.add(label_percentuale27);
		
		label_percentuale28 = new JLabel("%");
		label_percentuale28.setBounds(403, 204, 25, 21);
		panel_3.add(label_percentuale28);
		
		label_percentuale29 = new JLabel("%");
		label_percentuale29.setBounds(403, 256, 25, 21);
		panel_3.add(label_percentuale29);
		
		label_percentuale30 = new JLabel("%");
		label_percentuale30.setBounds(403, 308, 25, 21);
		panel_3.add(label_percentuale30);
		
		label_percentuale31 = new JLabel("%");
		label_percentuale31.setBounds(403, 363, 25, 21);
		panel_3.add(label_percentuale31);
		
		label_percentuale32 = new JLabel("%");
		label_percentuale32.setBounds(403, 414, 25, 21);
		panel_3.add(label_percentuale32);
		
		label_Umidita25 = new JLabel("");
		label_Umidita25.setBounds(366, 45, 35, 18);
		panel_3.add(label_Umidita25);
		
		label_Umidita26 = new JLabel("");
		label_Umidita26.setBounds(366, 98, 35, 18);
		panel_3.add(label_Umidita26);
		
		label_Umidita27 = new JLabel("");
		label_Umidita27.setBounds(366, 152, 37, 18);
		panel_3.add(label_Umidita27);
		
		label_Umidita28 = new JLabel("");
		label_Umidita28.setBounds(366, 204, 37, 18);
		panel_3.add(label_Umidita28);
		
		label_Umidita29 = new JLabel("");
		label_Umidita29.setBounds(366, 256, 37, 18);
		panel_3.add(label_Umidita29);
		
		label_Umidita30 = new JLabel("");
		label_Umidita30.setBounds(366, 308, 35, 18);
		panel_3.add(label_Umidita30);
		
		label_Umidita31 = new JLabel("");
		label_Umidita31.setBounds(366, 363, 37, 18);
		panel_3.add(label_Umidita31);
		
		label_Umidita32 = new JLabel("");
		label_Umidita32.setBounds(366, 414, 37, 18);
		panel_3.add(label_Umidita32);
		
		label_TestoPressione3 = new JLabel("Pressione");
		label_TestoPressione3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_TestoPressione3.setBounds(422, 5, 76, 16);
		panel_3.add(label_TestoPressione3);
		
		label_TestoVento3 = new JLabel("Vento(mps)");
		label_TestoVento3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_TestoVento3.setBounds(533, 5, 94, 16);
		panel_3.add(label_TestoVento3);
		
		label_Pressione_25 = new JLabel("");
		label_Pressione_25.setBounds(438, 45, 57, 18);
		panel_3.add(label_Pressione_25);
		
		label_Pressione_26 = new JLabel("");
		label_Pressione_26.setBounds(438, 98, 57, 18);
		panel_3.add(label_Pressione_26);
		
		label_Pressione_27 = new JLabel("");
		label_Pressione_27.setBounds(441, 152, 57, 18);
		panel_3.add(label_Pressione_27);
		
		label_Pressione_28 = new JLabel("");
		label_Pressione_28.setBounds(438, 204, 57, 18);
		panel_3.add(label_Pressione_28);
		
		label_Pressione_29 = new JLabel("");
		label_Pressione_29.setBounds(438, 256, 57, 18);
		panel_3.add(label_Pressione_29);
		
		label_Pressione_30 = new JLabel("");
		label_Pressione_30.setBounds(438, 308, 57, 18);
		panel_3.add(label_Pressione_30);
		
		label_Pressione_31 = new JLabel("");
		label_Pressione_31.setBounds(438, 363, 57, 18);
		panel_3.add(label_Pressione_31);
		
		label_Pressione_32 = new JLabel("");
		label_Pressione_32.setBounds(438, 414, 57, 18);
		panel_3.add(label_Pressione_32);
		
		label_hPa25 = new JLabel("hPa");
		label_hPa25.setBounds(495, 45, 25, 21);
		panel_3.add(label_hPa25);
		
		label_hPa26 = new JLabel("hPa");
		label_hPa26.setBounds(495, 95, 25, 21);
		panel_3.add(label_hPa26);
		
		label_hPa27 = new JLabel("hPa");
		label_hPa27.setBounds(495, 152, 25, 21);
		panel_3.add(label_hPa27);
		
		label_hPa28 = new JLabel("hPa");
		label_hPa28.setBounds(495, 204, 25, 21);
		panel_3.add(label_hPa28);
		
		label_hPa29 = new JLabel("hPa");
		label_hPa29.setBounds(495, 256, 25, 21);
		panel_3.add(label_hPa29);
		
		label_hPa30 = new JLabel("hPa");
		label_hPa30.setBounds(495, 308, 25, 21);
		panel_3.add(label_hPa30);
		
		label_hPa31 = new JLabel("hPa");
		label_hPa31.setBounds(495, 363, 25, 21);
		panel_3.add(label_hPa31);
		
		label_hPa32 = new JLabel("hPa");
		label_hPa32.setBounds(495, 414, 25, 21);
		panel_3.add(label_hPa32);
		
		label_Velocitavento_25 = new JLabel("");
		label_Velocitavento_25.setBounds(555, 45, 35, 18);
		panel_3.add(label_Velocitavento_25);
		
		label_Velocitavento_26 = new JLabel("");
		label_Velocitavento_26.setBounds(555, 98, 35, 18);
		panel_3.add(label_Velocitavento_26);
		
		label_Velocitavento_27 = new JLabel("");
		label_Velocitavento_27.setBounds(555, 152, 35, 18);
		panel_3.add(label_Velocitavento_27);
		
		label_Velocitavento_28 = new JLabel("");
		label_Velocitavento_28.setBounds(555, 204, 35, 18);
		panel_3.add(label_Velocitavento_28);
		
		label_Velocitavento_29 = new JLabel("");
		label_Velocitavento_29.setBounds(555, 256, 35, 18);
		panel_3.add(label_Velocitavento_29);
		
		label_Velocitavento_30 = new JLabel("");
		label_Velocitavento_30.setBounds(552, 308, 35, 18);
		panel_3.add(label_Velocitavento_30);
		
		label_Velocitavento_31 = new JLabel("");
		label_Velocitavento_31.setBounds(555, 363, 35, 18);
		panel_3.add(label_Velocitavento_31);
		
		label_Velocitavento_32 = new JLabel("");
		label_Velocitavento_32.setBounds(555, 411, 35, 18);
		panel_3.add(label_Velocitavento_32);
		
		label_Direzione_25 = new JLabel("");
		label_Direzione_25.setBounds(600, 45, 40, 18);
		panel_3.add(label_Direzione_25);
		
		label_Direzione_26 = new JLabel("");
		label_Direzione_26.setBounds(600, 98, 40, 18);
		panel_3.add(label_Direzione_26);
		
		label_Direzione_27 = new JLabel("");
		label_Direzione_27.setBounds(600, 152, 40, 18);
		panel_3.add(label_Direzione_27);
		
		label_Direzione_28 = new JLabel("");
		label_Direzione_28.setBounds(600, 204, 40, 18);
		panel_3.add(label_Direzione_28);
		
		label_Direzione_29 = new JLabel("");
		label_Direzione_29.setBounds(600, 256, 40, 18);
		panel_3.add(label_Direzione_29);
		
		label_Direzione_30 = new JLabel("");
		label_Direzione_30.setBounds(600, 308, 40, 18);
		panel_3.add(label_Direzione_30);
		
		label_Direzione_31 = new JLabel("");
		label_Direzione_31.setBounds(600, 363, 40, 18);
		panel_3.add(label_Direzione_31);
		
		label_Direzione_32 = new JLabel("");
		label_Direzione_32.setBounds(600, 414, 40, 18);
		panel_3.add(label_Direzione_32);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane.addTab("New tab", null, panel_4, null);
		
		label = new JLabel("Ora");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(0, 0, 44, 21);
		panel_4.add(label);
		
		label_33 = new JLabel("Tempo");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_33.setBounds(45, 0, 184, 21);
		panel_4.add(label_33);
		
		label_66 = new JLabel("0");
		label_66.setHorizontalAlignment(SwingConstants.CENTER);
		label_66.setBounds(0, 42, 35, 21);
		panel_4.add(label_66);
		
		label_67 = new JLabel("3");
		label_67.setHorizontalAlignment(SwingConstants.CENTER);
		label_67.setBounds(0, 95, 35, 21);
		panel_4.add(label_67);
		
		label_68 = new JLabel("6");
		label_68.setHorizontalAlignment(SwingConstants.CENTER);
		label_68.setBounds(0, 149, 35, 21);
		panel_4.add(label_68);
		
		label_69 = new JLabel("9");
		label_69.setHorizontalAlignment(SwingConstants.CENTER);
		label_69.setBounds(0, 201, 35, 21);
		panel_4.add(label_69);
		
		label_70 = new JLabel("12");
		label_70.setHorizontalAlignment(SwingConstants.CENTER);
		label_70.setBounds(0, 253, 35, 21);
		panel_4.add(label_70);
		
		label_71 = new JLabel("15");
		label_71.setHorizontalAlignment(SwingConstants.CENTER);
		label_71.setBounds(0, 305, 35, 21);
		panel_4.add(label_71);
		
		label_72 = new JLabel("18");
		label_72.setHorizontalAlignment(SwingConstants.CENTER);
		label_72.setBounds(0, 360, 35, 21);
		panel_4.add(label_72);
		
		label_73 = new JLabel("21");
		label_73.setHorizontalAlignment(SwingConstants.CENTER);
		label_73.setBounds(0, 411, 35, 21);
		panel_4.add(label_73);
		
		label_74 = new JLabel("");
		label_74.setBounds(45, 32, 44, 42);
		panel_4.add(label_74);
		
		label_75 = new JLabel("");
		label_75.setBounds(45, 85, 44, 42);
		panel_4.add(label_75);
		
		label_76 = new JLabel("");
		label_76.setBounds(45, 138, 44, 42);
		panel_4.add(label_76);
		
		label_77 = new JLabel("");
		label_77.setBounds(45, 191, 44, 42);
		panel_4.add(label_77);
		
		label_78 = new JLabel("");
		label_78.setBounds(45, 244, 44, 42);
		panel_4.add(label_78);
		
		label_79 = new JLabel("");
		label_79.setBounds(45, 297, 44, 42);
		panel_4.add(label_79);
		
		label_80 = new JLabel("");
		label_80.setBounds(45, 350, 44, 42);
		panel_4.add(label_80);
		
		label_81 = new JLabel("");
		label_81.setBounds(45, 400, 44, 42);
		panel_4.add(label_81);
		
		label_descrizione33 = new JLabel("");
		label_descrizione33.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione33.setBounds(99, 45, 130, 18);
		panel_4.add(label_descrizione33);
		
		label_descrizione34 = new JLabel("");
		label_descrizione34.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione34.setBounds(99, 98, 130, 18);
		panel_4.add(label_descrizione34);
		
		label_descrizione35 = new JLabel("");
		label_descrizione35.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione35.setBounds(99, 152, 130, 18);
		panel_4.add(label_descrizione35);
		
		label_descrizione36 = new JLabel("");
		label_descrizione36.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione36.setBounds(99, 204, 130, 18);
		panel_4.add(label_descrizione36);
		
		label_descrizione37 = new JLabel("");
		label_descrizione37.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione37.setBounds(99, 256, 130, 18);
		panel_4.add(label_descrizione37);
		
		label_descrizione38 = new JLabel("");
		label_descrizione38.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione38.setBounds(99, 308, 130, 18);
		panel_4.add(label_descrizione38);
		
		label_descrizione39 = new JLabel("");
		label_descrizione39.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione39.setBounds(99, 363, 130, 18);
		panel_4.add(label_descrizione39);
		
		label_descrizione40 = new JLabel("");
		label_descrizione40.setHorizontalAlignment(SwingConstants.CENTER);
		label_descrizione40.setBounds(99, 414, 130, 18);
		panel_4.add(label_descrizione40);
		
		label_90 = new JLabel("Temperatura");
		label_90.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_90.setBounds(236, 5, 103, 16);
		panel_4.add(label_90);
		
		label_temperatura_33 = new JLabel("");
		label_temperatura_33.setBounds(271, 45, 35, 18);
		panel_4.add(label_temperatura_33);
		
		label_temperatura_34 = new JLabel("");
		label_temperatura_34.setBounds(271, 95, 35, 18);
		panel_4.add(label_temperatura_34);
		
		label_temperatura_35 = new JLabel("");
		label_temperatura_35.setBounds(271, 152, 35, 18);
		panel_4.add(label_temperatura_35);
		
		label_temperatura_36 = new JLabel("");
		label_temperatura_36.setBounds(271, 201, 35, 18);
		panel_4.add(label_temperatura_36);
		
		label_temperatura_37 = new JLabel("");
		label_temperatura_37.setBounds(271, 256, 35, 18);
		panel_4.add(label_temperatura_37);
		
		label_temperatura_38 = new JLabel("");
		label_temperatura_38.setBounds(271, 308, 35, 18);
		panel_4.add(label_temperatura_38);
		
		label_temperatura_39 = new JLabel("");
		label_temperatura_39.setBounds(271, 363, 35, 18);
		panel_4.add(label_temperatura_39);
		
		label_temperatura_40 = new JLabel("");
		label_temperatura_40.setBounds(271, 414, 35, 18);
		panel_4.add(label_temperatura_40);
		
		label_Celsius_33 = new JLabel("\u00B0C");
		label_Celsius_33.setBounds(309, 42, 25, 21);
		panel_4.add(label_Celsius_33);
		
		label_Celsius_34 = new JLabel("\u00B0C");
		label_Celsius_34.setBounds(309, 95, 25, 21);
		panel_4.add(label_Celsius_34);
		
		label_Celsius_35 = new JLabel("\u00B0C");
		label_Celsius_35.setBounds(309, 149, 25, 21);
		panel_4.add(label_Celsius_35);
		
		label_Celsius_36 = new JLabel("\u00B0C");
		label_Celsius_36.setBounds(309, 201, 25, 21);
		panel_4.add(label_Celsius_36);
		
		label_Celsius_37 = new JLabel("\u00B0C");
		label_Celsius_37.setBounds(309, 253, 25, 21);
		panel_4.add(label_Celsius_37);
		
		label_Celsius_38 = new JLabel("\u00B0C");
		label_Celsius_38.setBounds(309, 305, 25, 21);
		panel_4.add(label_Celsius_38);
		
		label_Celsius_39 = new JLabel("\u00B0C");
		label_Celsius_39.setBounds(309, 360, 25, 21);
		panel_4.add(label_Celsius_39);
		
		label_Celsius_40 = new JLabel("\u00B0C");
		label_Celsius_40.setBounds(309, 411, 25, 21);
		panel_4.add(label_Celsius_40);
		
		label_107 = new JLabel("Umidit\u00E0");
		label_107.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_107.setBounds(349, 5, 63, 16);
		panel_4.add(label_107);
		
		label_percentuale33 = new JLabel("%");
		label_percentuale33.setBounds(403, 42, 25, 21);
		panel_4.add(label_percentuale33);
		
		label_percentuale34 = new JLabel("%");
		label_percentuale34.setBounds(403, 98, 25, 21);
		panel_4.add(label_percentuale34);
		
		label_percentuale35 = new JLabel("%");
		label_percentuale35.setBounds(403, 152, 25, 21);
		panel_4.add(label_percentuale35);
		
		label_percentuale36 = new JLabel("%");
		label_percentuale36.setBounds(403, 204, 25, 21);
		panel_4.add(label_percentuale36);
		
		label_percentuale37 = new JLabel("%");
		label_percentuale37.setBounds(403, 256, 25, 21);
		panel_4.add(label_percentuale37);
		
		label_percentuale38 = new JLabel("%");
		label_percentuale38.setBounds(403, 308, 25, 21);
		panel_4.add(label_percentuale38);
		
		label_percentuale39 = new JLabel("%");
		label_percentuale39.setBounds(403, 363, 25, 21);
		panel_4.add(label_percentuale39);
		
		label_percentuale40 = new JLabel("%");
		label_percentuale40.setBounds(403, 414, 25, 21);
		panel_4.add(label_percentuale40);
		
		label_Umidita33 = new JLabel("");
		label_Umidita33.setBounds(366, 45, 35, 18);
		panel_4.add(label_Umidita33);
		
		label_Umidita34 = new JLabel("");
		label_Umidita34.setBounds(366, 98, 35, 18);
		panel_4.add(label_Umidita34);
		
		label_Umidita35 = new JLabel("");
		label_Umidita35.setBounds(366, 152, 37, 18);
		panel_4.add(label_Umidita35);
		
		label_Umidita36 = new JLabel("");
		label_Umidita36.setBounds(366, 204, 37, 18);
		panel_4.add(label_Umidita36);
		
		label_Umidita37 = new JLabel("");
		label_Umidita37.setBounds(366, 256, 37, 18);
		panel_4.add(label_Umidita37);
		
		label_Umidita38 = new JLabel("");
		label_Umidita38.setBounds(366, 308, 35, 18);
		panel_4.add(label_Umidita38);
		
		label_Umidita39 = new JLabel("");
		label_Umidita39.setBounds(366, 363, 37, 18);
		panel_4.add(label_Umidita39);
		
		label_Umidita40 = new JLabel("");
		label_Umidita40.setBounds(366, 414, 37, 18);
		panel_4.add(label_Umidita40);
		
		label_124 = new JLabel("Pressione");
		label_124.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_124.setBounds(422, 5, 76, 16);
		panel_4.add(label_124);
		
		label_125 = new JLabel("Vento(mps)");
		label_125.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_125.setBounds(533, 5, 94, 16);
		panel_4.add(label_125);
		
		label_Pressione_33 = new JLabel("");
		label_Pressione_33.setBounds(438, 45, 57, 18);
		panel_4.add(label_Pressione_33);
		
		label_Pressione_34 = new JLabel("");
		label_Pressione_34.setBounds(438, 98, 57, 18);
		panel_4.add(label_Pressione_34);
		
		label_Pressione_35 = new JLabel("");
		label_Pressione_35.setBounds(441, 152, 57, 18);
		panel_4.add(label_Pressione_35);
		
		label_Pressione_36 = new JLabel("");
		label_Pressione_36.setBounds(438, 204, 57, 18);
		panel_4.add(label_Pressione_36);
		
		label_Pressione_37 = new JLabel("");
		label_Pressione_37.setBounds(438, 256, 57, 18);
		panel_4.add(label_Pressione_37);
		
		label_Pressione_38 = new JLabel("");
		label_Pressione_38.setBounds(438, 308, 57, 18);
		panel_4.add(label_Pressione_38);
		
		label_Pressione_39 = new JLabel("");
		label_Pressione_39.setBounds(438, 363, 57, 18);
		panel_4.add(label_Pressione_39);
		
		label_Pressione_40 = new JLabel("");
		label_Pressione_40.setBounds(438, 414, 57, 18);
		panel_4.add(label_Pressione_40);
		
		label_hPa33 = new JLabel("hPa");
		label_hPa33.setBounds(495, 45, 25, 21);
		panel_4.add(label_hPa33);
		
		label_hPa34 = new JLabel("hPa");
		label_hPa34.setBounds(495, 95, 25, 21);
		panel_4.add(label_hPa34);
		
		label_hPa35 = new JLabel("hPa");
		label_hPa35.setBounds(495, 152, 25, 21);
		panel_4.add(label_hPa35);
		
		label_hPa36 = new JLabel("hPa");
		label_hPa36.setBounds(495, 204, 25, 21);
		panel_4.add(label_hPa36);
		
		label_hPa37 = new JLabel("hPa");
		label_hPa37.setBounds(495, 256, 25, 21);
		panel_4.add(label_hPa37);
		
		label_hPa38 = new JLabel("hPa");
		label_hPa38.setBounds(495, 308, 25, 21);
		panel_4.add(label_hPa38);
		
		label_hPa39 = new JLabel("hPa");
		label_hPa39.setBounds(495, 363, 25, 21);
		panel_4.add(label_hPa39);
		
		label_hPa40 = new JLabel("hPa");
		label_hPa40.setBounds(495, 414, 25, 21);
		panel_4.add(label_hPa40);
		
		label_Velocitavento_33 = new JLabel("");
		label_Velocitavento_33.setBounds(555, 45, 35, 18);
		panel_4.add(label_Velocitavento_33);
		
		label_Velocitavento_34 = new JLabel("");
		label_Velocitavento_34.setBounds(555, 98, 35, 18);
		panel_4.add(label_Velocitavento_34);
		
		label_Velocitavento_35 = new JLabel("");
		label_Velocitavento_35.setBounds(555, 152, 35, 18);
		panel_4.add(label_Velocitavento_35);
		
		label_Velocitavento_36 = new JLabel("");
		label_Velocitavento_36.setBounds(555, 204, 35, 18);
		panel_4.add(label_Velocitavento_36);
		
		label_Velocitavento_37 = new JLabel("");
		label_Velocitavento_37.setBounds(555, 256, 35, 18);
		panel_4.add(label_Velocitavento_37);
		
		label_Velocitavento_38 = new JLabel("");
		label_Velocitavento_38.setBounds(552, 308, 35, 18);
		panel_4.add(label_Velocitavento_38);
		
		label_Velocitavento_39 = new JLabel("");
		label_Velocitavento_39.setBounds(555, 363, 35, 18);
		panel_4.add(label_Velocitavento_39);
		
		label_Velocitavento_40 = new JLabel("");
		label_Velocitavento_40.setBounds(555, 411, 35, 18);
		panel_4.add(label_Velocitavento_40);
		
		label_Direzione_33 = new JLabel("");
		label_Direzione_33.setBounds(600, 45, 40, 18);
		panel_4.add(label_Direzione_33);
		
		label_Direzione_34 = new JLabel("");
		label_Direzione_34.setBounds(600, 98, 40, 18);
		panel_4.add(label_Direzione_34);
		
		label_Direzione_35 = new JLabel("");
		label_Direzione_35.setBounds(600, 152, 40, 18);
		panel_4.add(label_Direzione_35);
		
		label_Direzione_36 = new JLabel("");
		label_Direzione_36.setBounds(600, 204, 40, 18);
		panel_4.add(label_Direzione_36);
		
		label_Direzione_37 = new JLabel("");
		label_Direzione_37.setBounds(600, 256, 40, 18);
		panel_4.add(label_Direzione_37);
		
		label_Direzione_38 = new JLabel("");
		label_Direzione_38.setBounds(600, 308, 40, 18);
		panel_4.add(label_Direzione_38);
		
		label_Direzione_39 = new JLabel("");
		label_Direzione_39.setBounds(600, 363, 40, 18);
		panel_4.add(label_Direzione_39);
		
		label_Direzione_40 = new JLabel("");
		label_Direzione_40.setBounds(600, 414, 40, 18);
		panel_4.add(label_Direzione_40);
		
		btnAvviso = new JButton("");
		btnAvviso.setToolTipText("Avvisi");
		btnAvviso.setBounds(456, 6, 32, 32);
		ImageIcon ic=new ImageIcon("info_seg5.gif");
		btnAvviso.setIcon(ic);
		contentPane.add(btnAvviso);
	}

	public JLabel getLblNomeCitta() {
		return lblNomeCitta;
	}

	public void setLblNomeCitta(String NomeCitta) {
		this.lblNomeCitta.setText(NomeCitta);
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public JLabel getLblCitt() {
		return lblCitt;
	}

	public void setLblCitt(JLabel lblCitt) {
		this.lblCitt = lblCitt;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLabel_1() {
		return label_1;
	}

	public void setLabel_1(JLabel label_1) {
		this.label_1 = label_1;
	}

	public JLabel getLabel_9() {
		return label_9;
	}

	public void setLabel_9(JLabel label_9) {
		this.label_9 = label_9;
	}

	public JLabel getLabel_2() {
		return label_2;
	}

	public void setLabel_2(JLabel label_2) {
		this.label_2 = label_2;
	}

	public JLabel getLabel_10() {
		return label_10;
	}

	public void setLabel_10(JLabel label_10) {
		this.label_10 = label_10;
	}

	public JLabel getLabel_3() {
		return label_3;
	}

	public void setLabel_3(JLabel label_3) {
		this.label_3 = label_3;
	}

	public JLabel getLabel_11() {
		return label_11;
	}

	public void setLabel_11(JLabel label_11) {
		this.label_11 = label_11;
	}

	public JLabel getLabel_4() {
		return label_4;
	}

	public void setLabel_4(JLabel label_4) {
		this.label_4 = label_4;
	}

	public JLabel getLabel_12() {
		return label_12;
	}

	public void setLabel_12(JLabel label_12) {
		this.label_12 = label_12;
	}

	public JLabel getLabel_5() {
		return label_5;
	}

	public void setLabel_5(JLabel label_5) {
		this.label_5 = label_5;
	}

	public JLabel getLabel_13() {
		return label_13;
	}

	public void setLabel_13(JLabel label_13) {
		this.label_13 = label_13;
	}

	public JLabel getLabel_6() {
		return label_6;
	}

	public void setLabel_6(JLabel label_6) {
		this.label_6 = label_6;
	}

	public JLabel getLabel_14() {
		return label_14;
	}

	public void setLabel_14(JLabel label_14) {
		this.label_14 = label_14;
	}

	public JLabel getLabel_7() {
		return label_7;
	}

	public void setLabel_7(JLabel label_7) {
		this.label_7 = label_7;
	}

	public JLabel getLabel_8() {
		return label_8;
	}

	public void setLabel_8(JLabel label_8) {
		this.label_8 = label_8;
	}

	public JLabel getLabel_15() {
		return label_15;
	}

	public void setLabel_15(JLabel label_15) {
		this.label_15 = label_15;
	}

	public JLabel getLabel_16() {
		return label_16;
	}

	public void setLabel_16(JLabel label_16) {
		this.label_16 = label_16;
	}

	public JLabel getLabel_descrizione_1() {
		return label_descrizione_1;
	}

	public void setLabel_descrizione_1(JLabel label_descrizione_1) {
		this.label_descrizione_1 = label_descrizione_1;
	}

	public JLabel getLabel_descrizione_2() {
		return label_descrizione_2;
	}

	public void setLabel_descrizione_2(JLabel label_descrizione_2) {
		this.label_descrizione_2 = label_descrizione_2;
	}

	public JLabel getLabel_descrizione_3() {
		return label_descrizione_3;
	}

	public void setLabel_descrizione_3(JLabel label_descrizione_3) {
		this.label_descrizione_3 = label_descrizione_3;
	}

	public JLabel getLabel_descrizione_4() {
		return label_descrizione_4;
	}

	public void setLabel_descrizione_4(JLabel label_descrizione_4) {
		this.label_descrizione_4 = label_descrizione_4;
	}

	public JLabel getLabel_descrizione_5() {
		return label_descrizione_5;
	}

	public void setLabel_descrizione_5(JLabel label_descrizione_5) {
		this.label_descrizione_5 = label_descrizione_5;
	}

	public JLabel getLabel_descrizione_6() {
		return label_descrizione_6;
	}

	public void setLabel_descrizione_6(JLabel label_descrizione_6) {
		this.label_descrizione_6 = label_descrizione_6;
	}

	public JLabel getLabel_descrizione_7() {
		return label_descrizione_7;
	}

	public void setLabel_descrizione_7(JLabel label_descrizione_7) {
		this.label_descrizione_7 = label_descrizione_7;
	}

	public JLabel getLabel_descrizione_8() {
		return label_descrizione_8;
	}

	public void setLabel_descrizione_8(JLabel label_descrizione_8) {
		this.label_descrizione_8 = label_descrizione_8;
	}

	public JLabel getLabel_18() {
		return label_18;
	}

	public void setLabel_18(JLabel label_18) {
		this.label_18 = label_18;
	}

	public JLabel getLabel_19() {
		return label_19;
	}

	public void setLabel_19(JLabel label_19) {
		this.label_19 = label_19;
	}

	public JLabel getLabel_20() {
		return label_20;
	}

	public void setLabel_20(JLabel label_20) {
		this.label_20 = label_20;
	}

	public JLabel getLabel_21() {
		return label_21;
	}

	public void setLabel_21(JLabel label_21) {
		this.label_21 = label_21;
	}

	public JLabel getLabel_22() {
		return label_22;
	}

	public void setLabel_22(JLabel label_22) {
		this.label_22 = label_22;
	}

	public JLabel getLabel_23() {
		return label_23;
	}

	public void setLabel_23(JLabel label_23) {
		this.label_23 = label_23;
	}

	public JLabel getLabel_25() {
		return label_25;
	}

	public void setLabel_25(JLabel label_25) {
		this.label_25 = label_25;
	}

	public JLabel getLabel_26() {
		return label_26;
	}

	public void setLabel_26(JLabel label_26) {
		this.label_26 = label_26;
	}

	public JLabel getLabel_27() {
		return label_27;
	}

	public void setLabel_27(JLabel label_27) {
		this.label_27 = label_27;
	}

	public JLabel getLabel_28() {
		return label_28;
	}

	public void setLabel_28(JLabel label_28) {
		this.label_28 = label_28;
	}

	public JLabel getLabel_29() {
		return label_29;
	}

	public void setLabel_29(JLabel label_29) {
		this.label_29 = label_29;
	}

	public JLabel getLabel_30() {
		return label_30;
	}

	public void setLabel_30(JLabel label_30) {
		this.label_30 = label_30;
	}

	public JLabel getLabel_24() {
		return label_24;
	}

	public void setLabel_24(JLabel label_24) {
		this.label_24 = label_24;
	}

	public JLabel getLabel_31() {
		return label_31;
	}

	public void setLabel_31(JLabel label_31) {
		this.label_31 = label_31;
	}

	public JLabel getLabel_temperatura_1() {
		return label_temperatura_1;
	}

	public void setLabel_temperatura_1(JLabel label_temperatura_1) {
		this.label_temperatura_1 = label_temperatura_1;
	}

	public JLabel getLabel_temperatura_2() {
		return label_temperatura_2;
	}

	public void setLabel_temperatura_2(JLabel label_temperatura_2) {
		this.label_temperatura_2 = label_temperatura_2;
	}

	public JLabel getLabel_temperatura_3() {
		return label_temperatura_3;
	}

	public void setLabel_temperatura_3(JLabel label_temperatura_3) {
		this.label_temperatura_3 = label_temperatura_3;
	}

	public JLabel getLabel_temperatura_4() {
		return label_temperatura_4;
	}

	public void setLabel_temperatura_4(JLabel label_temperatura_4) {
		this.label_temperatura_4 = label_temperatura_4;
	}

	public JLabel getLabel_temperatura_5() {
		return label_temperatura_5;
	}

	public void setLabel_temperatura_5(JLabel label_temperatura_5) {
		this.label_temperatura_5 = label_temperatura_5;
	}

	public JLabel getLabel_temperatura_6() {
		return label_temperatura_6;
	}

	public void setLabel_temperatura_6(JLabel label_temperatura_6) {
		this.label_temperatura_6 = label_temperatura_6;
	}

	public JLabel getLabel_temperatura_7() {
		return label_temperatura_7;
	}

	public void setLabel_temperatura_7(JLabel label_temperatura_7) {
		this.label_temperatura_7 = label_temperatura_7;
	}

	public JLabel getLabel_temperatura_8() {
		return label_temperatura_8;
	}

	public void setLabel_temperatura_8(JLabel label_temperatura_8) {
		this.label_temperatura_8 = label_temperatura_8;
	}

	public JLabel getLabel_percentuale1() {
		return label_percentuale1;
	}

	public void setLabel_percentuale1(JLabel label_percentuale1) {
		this.label_percentuale1 = label_percentuale1;
	}

	public JLabel getLabel_percentuale2() {
		return label_percentuale2;
	}

	public void setLabel_percentuale2(JLabel label_percentuale2) {
		this.label_percentuale2 = label_percentuale2;
	}

	public JLabel getLabel_percentuale3() {
		return label_percentuale3;
	}

	public void setLabel_percentuale3(JLabel label_percentuale3) {
		this.label_percentuale3 = label_percentuale3;
	}

	public JLabel getLabel_percentuale4() {
		return label_percentuale4;
	}

	public void setLabel_percentuale4(JLabel label_percentuale4) {
		this.label_percentuale4 = label_percentuale4;
	}

	public JLabel getLabel_percentuale5() {
		return label_percentuale5;
	}

	public void setLabel_percentuale5(JLabel label_percentuale5) {
		this.label_percentuale5 = label_percentuale5;
	}

	public JLabel getLabel_percentuale6() {
		return label_percentuale6;
	}

	public void setLabel_percentuale6(JLabel label_percentuale6) {
		this.label_percentuale6 = label_percentuale6;
	}

	public JLabel getLabel_percentuale7() {
		return label_percentuale7;
	}

	public void setLabel_percentuale7(JLabel label_percentuale7) {
		this.label_percentuale7 = label_percentuale7;
	}

	public JLabel getLabel_percentuale8() {
		return label_percentuale8;
	}

	public void setLabel_percentuale8(JLabel label_percentuale8) {
		this.label_percentuale8 = label_percentuale8;
	}

	public JLabel getLblUmidita1() {
		return lblUmidita1;
	}

	public void setLblUmidita1(JLabel lblUmidita1) {
		this.lblUmidita1 = lblUmidita1;
	}

	public JLabel getLabel_Umidita2() {
		return label_Umidita2;
	}

	public void setLabel_Umidita2(JLabel label_Umidita2) {
		this.label_Umidita2 = label_Umidita2;
	}

	public JLabel getLabel_Umidita3() {
		return label_Umidita3;
	}

	public void setLabel_Umidita3(JLabel label_Umidita3) {
		this.label_Umidita3 = label_Umidita3;
	}

	public JLabel getLabel_Umidita4() {
		return label_Umidita4;
	}

	public void setLabel_Umidita4(JLabel label_Umidita4) {
		this.label_Umidita4 = label_Umidita4;
	}

	public JLabel getLabel_Umidita5() {
		return label_Umidita5;
	}

	public void setLabel_Umidita5(JLabel label_Umidita5) {
		this.label_Umidita5 = label_Umidita5;
	}

	public JLabel getLabel_Umidita6() {
		return label_Umidita6;
	}

	public void setLabel_Umidita6(JLabel label_Umidita6) {
		this.label_Umidita6 = label_Umidita6;
	}

	public JLabel getLabel_Umidita7() {
		return label_Umidita7;
	}

	public void setLabel_Umidita7(JLabel label_Umidita7) {
		this.label_Umidita7 = label_Umidita7;
	}

	public JLabel getLabel_Umidita8() {
		return label_Umidita8;
	}

	public void setLabel_Umidita8(JLabel label_Umidita8) {
		this.label_Umidita8 = label_Umidita8;
	}

	public JLabel getLblPressione_1() {
		return lblPressione_1;
	}

	public void setLblPressione_1(JLabel lblPressione_1) {
		this.lblPressione_1 = lblPressione_1;
	}

	public JLabel getLabel_Pressione_2() {
		return label_Pressione_2;
	}

	public void setLabel_Pressione_2(JLabel label_Pressione_2) {
		this.label_Pressione_2 = label_Pressione_2;
	}

	public JLabel getLabel_Pressione_3() {
		return label_Pressione_3;
	}

	public void setLabel_Pressione_3(JLabel label_Pressione_3) {
		this.label_Pressione_3 = label_Pressione_3;
	}

	public JLabel getLabel_Pressione_4() {
		return label_Pressione_4;
	}

	public void setLabel_Pressione_4(JLabel label_Pressione_4) {
		this.label_Pressione_4 = label_Pressione_4;
	}

	public JLabel getLabel_Pressione_5() {
		return label_Pressione_5;
	}

	public void setLabel_Pressione_5(JLabel label_Pressione_5) {
		this.label_Pressione_5 = label_Pressione_5;
	}

	public JLabel getLabel_Pressione_6() {
		return label_Pressione_6;
	}

	public void setLabel_Pressione_6(JLabel label_Pressione_6) {
		this.label_Pressione_6 = label_Pressione_6;
	}

	public JLabel getLabel_Pressione_7() {
		return label_Pressione_7;
	}

	public void setLabel_Pressione_7(JLabel label_Pressione_7) {
		this.label_Pressione_7 = label_Pressione_7;
	}

	public JLabel getLabel_Pressione_8() {
		return label_Pressione_8;
	}

	public void setLabel_Pressione_8(JLabel label_Pressione_8) {
		this.label_Pressione_8 = label_Pressione_8;
	}

	public JLabel getLblVelocitavento_1() {
		return lblVelocitavento_1;
	}

	public void setLblVelocitavento_1(JLabel lblVelocitavento_1) {
		this.lblVelocitavento_1 = lblVelocitavento_1;
	}

	public JLabel getLabel_Velocitavento_2() {
		return label_Velocitavento_2;
	}

	public void setLabel_Velocitavento_2(JLabel label_Velocitavento_2) {
		this.label_Velocitavento_2 = label_Velocitavento_2;
	}

	public JLabel getLabel_Velocitavento_3() {
		return label_Velocitavento_3;
	}

	public void setLabel_Velocitavento_3(JLabel label_Velocitavento_3) {
		this.label_Velocitavento_3 = label_Velocitavento_3;
	}

	public JLabel getLabel_Velocitavento_4() {
		return label_Velocitavento_4;
	}

	public void setLabel_Velocitavento_4(JLabel label_Velocitavento_4) {
		this.label_Velocitavento_4 = label_Velocitavento_4;
	}

	public JLabel getLabel_Velocitavento_5() {
		return label_Velocitavento_5;
	}

	public void setLabel_Velocitavento_5(JLabel label_Velocitavento_5) {
		this.label_Velocitavento_5 = label_Velocitavento_5;
	}

	public JLabel getLabel_Velocitavento_6() {
		return label_Velocitavento_6;
	}

	public void setLabel_Velocitavento_6(JLabel label_Velocitavento_6) {
		this.label_Velocitavento_6 = label_Velocitavento_6;
	}

	public JLabel getLabel_Velocitavento_7() {
		return label_Velocitavento_7;
	}

	public void setLabel_Velocitavento_7(JLabel label_Velocitavento_7) {
		this.label_Velocitavento_7 = label_Velocitavento_7;
	}

	public JLabel getLabel_Velocitavento_8() {
		return label_Velocitavento_8;
	}

	public void setLabel_Velocitavento_8(JLabel label_Velocitavento_8) {
		this.label_Velocitavento_8 = label_Velocitavento_8;
	}

	public JLabel getLblDirezione_1() {
		return lblDirezione_1;
	}

	public void setLblDirezione_1(JLabel lblDirezione_1) {
		this.lblDirezione_1 = lblDirezione_1;
	}

	public JLabel getLabel_Direzione_2() {
		return label_Direzione_2;
	}

	public void setLabel_Direzione_2(JLabel label_Direzione_2) {
		this.label_Direzione_2 = label_Direzione_2;
	}

	public JLabel getLabel_Direzione_3() {
		return label_Direzione_3;
	}

	public void setLabel_Direzione_3(JLabel label_Direzione_3) {
		this.label_Direzione_3 = label_Direzione_3;
	}

	public JLabel getLabel_Direzione_4() {
		return label_Direzione_4;
	}

	public void setLabel_Direzione_4(JLabel label_Direzione_4) {
		this.label_Direzione_4 = label_Direzione_4;
	}

	public JLabel getLabel_Direzione_5() {
		return label_Direzione_5;
	}

	public void setLabel_Direzione_5(JLabel label_Direzione_5) {
		this.label_Direzione_5 = label_Direzione_5;
	}

	public JLabel getLabel_Direzione_6() {
		return label_Direzione_6;
	}

	public void setLabel_Direzione_6(JLabel label_Direzione_6) {
		this.label_Direzione_6 = label_Direzione_6;
	}

	public JLabel getLabel_Direzione_7() {
		return label_Direzione_7;
	}

	public void setLabel_Direzione_7(JLabel label_Direzione_7) {
		this.label_Direzione_7 = label_Direzione_7;
	}

	public JLabel getLabel_Direzione_8() {
		return label_Direzione_8;
	}

	public void setLabel_Direzione_8(JLabel label_Direzione_8) {
		this.label_Direzione_8 = label_Direzione_8;
	}

	public JLabel getLabel_hPa2() {
		return label_hPa2;
	}

	public void setLabel_hPa2(JLabel label_hPa2) {
		this.label_hPa2 = label_hPa2;
	}

	public JLabel getLabel_hPa3() {
		return label_hPa3;
	}

	public void setLabel_hPa3(JLabel label_hPa3) {
		this.label_hPa3 = label_hPa3;
	}

	public JLabel getLabel_hPa4() {
		return label_hPa4;
	}

	public void setLabel_hPa4(JLabel label_hPa4) {
		this.label_hPa4 = label_hPa4;
	}

	public JLabel getLabel_hPa5() {
		return label_hPa5;
	}

	public void setLabel_hPa5(JLabel label_hPa5) {
		this.label_hPa5 = label_hPa5;
	}

	public JLabel getLabel_hPa6() {
		return label_hPa6;
	}

	public void setLabel_hPa6(JLabel label_hPa6) {
		this.label_hPa6 = label_hPa6;
	}

	public JLabel getLabel_hPa7() {
		return label_hPa7;
	}

	public void setLabel_hPa7(JLabel label_hPa7) {
		this.label_hPa7 = label_hPa7;
	}

	public JLabel getLabel_hPa8() {
		return label_hPa8;
	}

	public void setLabel_hPa8(JLabel label_hPa8) {
		this.label_hPa8 = label_hPa8;
	}

	public JLabel getLabel_Celsius_1() {
		return label_Celsius_1;
	}

	public void setLabel_Celsius_1(JLabel label_Celsius_1) {
		this.label_Celsius_1 = label_Celsius_1;
	}

	public JLabel getLabel_Celsius_2() {
		return label_Celsius_2;
	}

	public void setLabel_Celsius_2(JLabel label_Celsius_2) {
		this.label_Celsius_2 = label_Celsius_2;
	}

	public JLabel getLabel_Celsius_3() {
		return label_Celsius_3;
	}

	public void setLabel_Celsius_3(JLabel label_Celsius_3) {
		this.label_Celsius_3 = label_Celsius_3;
	}

	public JLabel getLabel_Celsius_4() {
		return label_Celsius_4;
	}

	public void setLabel_Celsius_4(JLabel label_Celsius_4) {
		this.label_Celsius_4 = label_Celsius_4;
	}

	public JLabel getLabel_Celsius_5() {
		return label_Celsius_5;
	}

	public void setLabel_Celsius_5(JLabel label_Celsius_5) {
		this.label_Celsius_5 = label_Celsius_5;
	}

	public JLabel getLabel_Celsius_6() {
		return label_Celsius_6;
	}

	public void setLabel_Celsius_6(JLabel label_Celsius_6) {
		this.label_Celsius_6 = label_Celsius_6;
	}

	public JLabel getLabel_Celsius_7() {
		return label_Celsius_7;
	}

	public void setLabel_Celsius_7(JLabel label_Celsius_7) {
		this.label_Celsius_7 = label_Celsius_7;
	}

	public JLabel getLabel_Celsius_8() {
		return label_Celsius_8;
	}

	public void setLabel_Celsius_8(JLabel label_Celsius_8) {
		this.label_Celsius_8 = label_Celsius_8;
	}

	public JLabel getLabel_hPa1() {
		return label_hPa1;
	}

	public void setLabel_hPa1(JLabel label_hPa1) {
		this.label_hPa1 = label_hPa1;
	}

	public JButton getBtnCerca_Città() {
		return btnCerca_Città;
	}

	public JLabel getLabel_descrizione9() {
		return label_descrizione9;
	}

	public void setLabel_descrizione9(JLabel label_descrizione9) {
		this.label_descrizione9 = label_descrizione9;
	}

	public JLabel getLabel_descrizione10() {
		return label_descrizione10;
	}

	public void setLabel_descrizione10(JLabel label_descrizione10) {
		this.label_descrizione10 = label_descrizione10;
	}

	public JLabel getLabel_descrizione11() {
		return label_descrizione11;
	}

	public void setLabel_descrizione11(JLabel label_descrizione11) {
		this.label_descrizione11 = label_descrizione11;
	}

	public JLabel getLabel_descrizione12() {
		return label_descrizione12;
	}

	public void setLabel_descrizione12(JLabel label_descrizione12) {
		this.label_descrizione12 = label_descrizione12;
	}

	public JLabel getLabel_descrizione13() {
		return label_descrizione13;
	}

	public void setLabel_descrizione13(JLabel label_descrizione13) {
		this.label_descrizione13 = label_descrizione13;
	}

	public JLabel getLabel_descrizione14() {
		return label_descrizione14;
	}

	public void setLabel_descrizione14(JLabel label_descrizione14) {
		this.label_descrizione14 = label_descrizione14;
	}

	public JLabel getLabel_descrizione15() {
		return label_descrizione15;
	}

	public void setLabel_descrizione15(JLabel label_descrizione15) {
		this.label_descrizione15 = label_descrizione15;
	}

	public JLabel getLabel_descrizione16() {
		return label_descrizione16;
	}

	public void setLabel_descrizione16(JLabel label_descrizione16) {
		this.label_descrizione16 = label_descrizione16;
	}

	public JLabel getLabel_temperatura_9() {
		return label_temperatura_9;
	}

	public void setLabel_temperatura_9(JLabel label_temperatura_9) {
		this.label_temperatura_9 = label_temperatura_9;
	}

	public JLabel getLabel_temperatura_10() {
		return label_temperatura_10;
	}

	public void setLabel_temperatura_10(JLabel label_temperatura_10) {
		this.label_temperatura_10 = label_temperatura_10;
	}

	public JLabel getLabel_temperatura_11() {
		return label_temperatura_11;
	}

	public void setLabel_temperatura_11(JLabel label_temperatura_11) {
		this.label_temperatura_11 = label_temperatura_11;
	}

	public JLabel getLabel_temperatura_12() {
		return label_temperatura_12;
	}

	public void setLabel_temperatura_12(JLabel label_temperatura_12) {
		this.label_temperatura_12 = label_temperatura_12;
	}

	public JLabel getLabel_temperatura_13() {
		return label_temperatura_13;
	}

	public void setLabel_temperatura_13(JLabel label_temperatura_13) {
		this.label_temperatura_13 = label_temperatura_13;
	}

	public JLabel getLabel_temperatura_14() {
		return label_temperatura_14;
	}

	public void setLabel_temperatura_14(JLabel label_temperatura_14) {
		this.label_temperatura_14 = label_temperatura_14;
	}

	public JLabel getLabel_temperatura_15() {
		return label_temperatura_15;
	}

	public void setLabel_temperatura_15(JLabel label_temperatura_15) {
		this.label_temperatura_15 = label_temperatura_15;
	}

	public JLabel getLabel_temperatura_16() {
		return label_temperatura_16;
	}

	public void setLabel_temperatura_16(JLabel label_temperatura_16) {
		this.label_temperatura_16 = label_temperatura_16;
	}

	public JLabel getLabel_Umidita9() {
		return label_Umidita9;
	}

	public void setLabel_Umidita9(JLabel label_Umidita9) {
		this.label_Umidita9 = label_Umidita9;
	}

	public JLabel getLabel_Umidita10() {
		return label_Umidita10;
	}

	public void setLabel_Umidita10(JLabel label_Umidita10) {
		this.label_Umidita10 = label_Umidita10;
	}

	public JLabel getLabel_Umidita11() {
		return label_Umidita11;
	}

	public void setLabel_Umidita11(JLabel label_Umidita11) {
		this.label_Umidita11 = label_Umidita11;
	}

	public JLabel getLabel_Umidita12() {
		return label_Umidita12;
	}

	public void setLabel_Umidita12(JLabel label_Umidita12) {
		this.label_Umidita12 = label_Umidita12;
	}

	public JLabel getLabel_Umidita13() {
		return label_Umidita13;
	}

	public void setLabel_Umidita13(JLabel label_Umidita13) {
		this.label_Umidita13 = label_Umidita13;
	}

	public JLabel getLabel_Umidita14() {
		return label_Umidita14;
	}

	public void setLabel_Umidita14(JLabel label_Umidita14) {
		this.label_Umidita14 = label_Umidita14;
	}

	public JLabel getLabel_Umidita15() {
		return label_Umidita15;
	}

	public void setLabel_Umidita15(JLabel label_Umidita15) {
		this.label_Umidita15 = label_Umidita15;
	}

	public JLabel getLabel_Umidita16() {
		return label_Umidita16;
	}

	public void setLabel_Umidita16(JLabel label_Umidita16) {
		this.label_Umidita16 = label_Umidita16;
	}

	public JLabel getLabel_Pressione_10() {
		return label_Pressione_10;
	}

	public void setLabel_Pressione_10(JLabel label_Pressione_10) {
		this.label_Pressione_10 = label_Pressione_10;
	}

	public JLabel getLabel_Pressione_11() {
		return label_Pressione_11;
	}

	public void setLabel_Pressione_11(JLabel label_Pressione_11) {
		this.label_Pressione_11 = label_Pressione_11;
	}

	public JLabel getLabel_Pressione_12() {
		return label_Pressione_12;
	}

	public void setLabel_Pressione_12(JLabel label_Pressione_12) {
		this.label_Pressione_12 = label_Pressione_12;
	}

	public JLabel getLabel_Pressione_13() {
		return label_Pressione_13;
	}

	public void setLabel_Pressione_13(JLabel label_Pressione_13) {
		this.label_Pressione_13 = label_Pressione_13;
	}

	public JLabel getLabel_Pressione_14() {
		return label_Pressione_14;
	}

	public void setLabel_Pressione_14(JLabel label_Pressione_14) {
		this.label_Pressione_14 = label_Pressione_14;
	}

	public JLabel getLabel_Pressione_15() {
		return label_Pressione_15;
	}

	public void setLabel_Pressione_15(JLabel label_Pressione_15) {
		this.label_Pressione_15 = label_Pressione_15;
	}

	public JLabel getLabel_Pressione_16() {
		return label_Pressione_16;
	}

	public void setLabel_Pressione_16(JLabel label_Pressione_16) {
		this.label_Pressione_16 = label_Pressione_16;
	}

	public JLabel getLabel_Velocitavento_9() {
		return label_Velocitavento_9;
	}

	public void setLabel_Velocitavento_9(JLabel label_Velocitavento_9) {
		this.label_Velocitavento_9 = label_Velocitavento_9;
	}

	public JLabel getLabel_Velocitavento_10() {
		return label_Velocitavento_10;
	}

	public void setLabel_Velocitavento_10(JLabel label_Velocitavento_10) {
		this.label_Velocitavento_10 = label_Velocitavento_10;
	}

	public JLabel getLabel_Velocitavento_11() {
		return label_Velocitavento_11;
	}

	public void setLabel_Velocitavento_11(JLabel label_Velocitavento_11) {
		this.label_Velocitavento_11 = label_Velocitavento_11;
	}

	public JLabel getLabel_Velocitavento_12() {
		return label_Velocitavento_12;
	}

	public void setLabel_Velocitavento_12(JLabel label_Velocitavento_12) {
		this.label_Velocitavento_12 = label_Velocitavento_12;
	}

	public JLabel getLabel_Velocitavento_13() {
		return label_Velocitavento_13;
	}

	public void setLabel_Velocitavento_13(JLabel label_Velocitavento_13) {
		this.label_Velocitavento_13 = label_Velocitavento_13;
	}

	public JLabel getLabel_Velocitavento_14() {
		return label_Velocitavento_14;
	}

	public void setLabel_Velocitavento_14(JLabel label_Velocitavento_14) {
		this.label_Velocitavento_14 = label_Velocitavento_14;
	}

	public JLabel getLabel_Velocitavento_15() {
		return label_Velocitavento_15;
	}

	public void setLabel_Velocitavento_15(JLabel label_Velocitavento_15) {
		this.label_Velocitavento_15 = label_Velocitavento_15;
	}

	public JLabel getLabel_Velocitavento_16() {
		return label_Velocitavento_16;
	}

	public void setLabel_Velocitavento_16(JLabel label_Velocitavento_16) {
		this.label_Velocitavento_16 = label_Velocitavento_16;
	}

	public JLabel getLabel_Direzione_9() {
		return label_Direzione_9;
	}

	public void setLabel_Direzione_9(JLabel label_Direzione_9) {
		this.label_Direzione_9 = label_Direzione_9;
	}

	public JLabel getLabel_Direzione_10() {
		return label_Direzione_10;
	}

	public void setLabel_Direzione_10(JLabel label_Direzione_10) {
		this.label_Direzione_10 = label_Direzione_10;
	}

	public JLabel getLabel_Direzione_11() {
		return label_Direzione_11;
	}

	public void setLabel_Direzione_11(JLabel label_Direzione_11) {
		this.label_Direzione_11 = label_Direzione_11;
	}

	public JLabel getLabel_Direzione_12() {
		return label_Direzione_12;
	}

	public void setLabel_Direzione_12(JLabel label_Direzione_12) {
		this.label_Direzione_12 = label_Direzione_12;
	}

	public JLabel getLabel_Direzione_13() {
		return label_Direzione_13;
	}

	public void setLabel_Direzione_13(JLabel label_Direzione_13) {
		this.label_Direzione_13 = label_Direzione_13;
	}

	public JLabel getLabel_Direzione_14() {
		return label_Direzione_14;
	}

	public void setLabel_Direzione_14(JLabel label_Direzione_14) {
		this.label_Direzione_14 = label_Direzione_14;
	}

	public JLabel getLabel_Direzione_15() {
		return label_Direzione_15;
	}

	public void setLabel_Direzione_15(JLabel label_Direzione_15) {
		this.label_Direzione_15 = label_Direzione_15;
	}

	public JLabel getLabel_Direzione_16() {
		return label_Direzione_16;
	}

	public void setLabel_Direzione_16(JLabel label_Direzione_16) {
		this.label_Direzione_16 = label_Direzione_16;
	}

	public JLabel getLabel_32() {
		return label_32;
	}

	public void setLabel_32(JLabel label_32) {
		this.label_32 = label_32;
	}

	public JLabel getLabel_Pressione_9() {
		return label_Pressione_9;
	}

	public void setLabel_Pressione_9(JLabel label_Pressione_9) {
		this.label_Pressione_9 = label_Pressione_9;
	}

	public JLabel getLabel_42() {
		return label_42;
	}

	public void setLabel_42(JLabel label_42) {
		this.label_42 = label_42;
	}

	public JLabel getLabel_43() {
		return label_43;
	}

	public void setLabel_43(JLabel label_43) {
		this.label_43 = label_43;
	}

	public JLabel getLabel_44() {
		return label_44;
	}

	public void setLabel_44(JLabel label_44) {
		this.label_44 = label_44;
	}

	public JLabel getLabel_45() {
		return label_45;
	}

	public void setLabel_45(JLabel label_45) {
		this.label_45 = label_45;
	}

	public JLabel getLabel_46() {
		return label_46;
	}

	public void setLabel_46(JLabel label_46) {
		this.label_46 = label_46;
	}

	public JLabel getLabel_47() {
		return label_47;
	}

	public void setLabel_47(JLabel label_47) {
		this.label_47 = label_47;
	}

	public JLabel getLabel_48() {
		return label_48;
	}

	public void setLabel_48(JLabel label_48) {
		this.label_48 = label_48;
	}

	public JLabel getLabel_49() {
		return label_49;
	}

	public void setLabel_49(JLabel label_49) {
		this.label_49 = label_49;
	}

	public JLabel getLabel_descrizione17() {
		return label_descrizione17;
	}

	public void setLabel_descrizione17(JLabel label_descrizione17) {
		this.label_descrizione17 = label_descrizione17;
	}

	public JLabel getLabel_descrizione18() {
		return label_descrizione18;
	}

	public void setLabel_descrizione18(JLabel label_descrizione18) {
		this.label_descrizione18 = label_descrizione18;
	}

	public JLabel getLabel_descrizione19() {
		return label_descrizione19;
	}

	public void setLabel_descrizione19(JLabel label_descrizione19) {
		this.label_descrizione19 = label_descrizione19;
	}

	public JLabel getLabel_descrizione20() {
		return label_descrizione20;
	}

	public void setLabel_descrizione20(JLabel label_descrizione20) {
		this.label_descrizione20 = label_descrizione20;
	}

	public JLabel getLabel_descrizione21() {
		return label_descrizione21;
	}

	public void setLabel_descrizione21(JLabel label_descrizione21) {
		this.label_descrizione21 = label_descrizione21;
	}

	public JLabel getLabel_descrizione22() {
		return label_descrizione22;
	}

	public void setLabel_descrizione22(JLabel label_descrizione22) {
		this.label_descrizione22 = label_descrizione22;
	}

	public JLabel getLabel_descrizione23() {
		return label_descrizione23;
	}

	public void setLabel_descrizione23(JLabel label_descrizione23) {
		this.label_descrizione23 = label_descrizione23;
	}

	public JLabel getLabel_descrizione24() {
		return label_descrizione24;
	}

	public void setLabel_descrizione24(JLabel label_descrizione24) {
		this.label_descrizione24 = label_descrizione24;
	}

	public JLabel getLabel_temperatura_17() {
		return label_temperatura_17;
	}

	public void setLabel_temperatura_17(JLabel label_temperatura_17) {
		this.label_temperatura_17 = label_temperatura_17;
	}

	public JLabel getLabel_temperatura_18() {
		return label_temperatura_18;
	}

	public void setLabel_temperatura_18(JLabel label_temperatura_18) {
		this.label_temperatura_18 = label_temperatura_18;
	}

	public JLabel getLabel_temperatura_19() {
		return label_temperatura_19;
	}

	public void setLabel_temperatura_19(JLabel label_temperatura_19) {
		this.label_temperatura_19 = label_temperatura_19;
	}

	public JLabel getLabel_temperatura_20() {
		return label_temperatura_20;
	}

	public void setLabel_temperatura_20(JLabel label_temperatura_20) {
		this.label_temperatura_20 = label_temperatura_20;
	}

	public JLabel getLabel_temperatura_21() {
		return label_temperatura_21;
	}

	public void setLabel_temperatura_21(JLabel label_temperatura_21) {
		this.label_temperatura_21 = label_temperatura_21;
	}

	public JLabel getLabel_temperatura_22() {
		return label_temperatura_22;
	}

	public void setLabel_temperatura_22(JLabel label_temperatura_22) {
		this.label_temperatura_22 = label_temperatura_22;
	}

	public JLabel getLabel_temperatura_23() {
		return label_temperatura_23;
	}

	public void setLabel_temperatura_23(JLabel label_temperatura_23) {
		this.label_temperatura_23 = label_temperatura_23;
	}

	public JLabel getLabel_temperatura_24() {
		return label_temperatura_24;
	}

	public void setLabel_temperatura_24(JLabel label_temperatura_24) {
		this.label_temperatura_24 = label_temperatura_24;
	}

	public JLabel getLabel_Umidita17() {
		return label_Umidita17;
	}

	public void setLabel_Umidita17(JLabel label_Umidita17) {
		this.label_Umidita17 = label_Umidita17;
	}

	public JLabel getLabel_Umidita18() {
		return label_Umidita18;
	}

	public void setLabel_Umidita18(JLabel label_Umidita18) {
		this.label_Umidita18 = label_Umidita18;
	}

	public JLabel getLabel_Umidita19() {
		return label_Umidita19;
	}

	public void setLabel_Umidita19(JLabel label_Umidita19) {
		this.label_Umidita19 = label_Umidita19;
	}

	public JLabel getLabel_Umidita20() {
		return label_Umidita20;
	}

	public void setLabel_Umidita20(JLabel label_Umidita20) {
		this.label_Umidita20 = label_Umidita20;
	}

	public JLabel getLabel_Umidita21() {
		return label_Umidita21;
	}

	public void setLabel_Umidita21(JLabel label_Umidita21) {
		this.label_Umidita21 = label_Umidita21;
	}

	public JLabel getLabel_Umidita22() {
		return label_Umidita22;
	}

	public void setLabel_Umidita22(JLabel label_Umidita22) {
		this.label_Umidita22 = label_Umidita22;
	}

	public JLabel getLabel_Umidita23() {
		return label_Umidita23;
	}

	public void setLabel_Umidita23(JLabel label_Umidita23) {
		this.label_Umidita23 = label_Umidita23;
	}

	public JLabel getLabel_Umidita24() {
		return label_Umidita24;
	}

	public void setLabel_Umidita24(JLabel label_Umidita24) {
		this.label_Umidita24 = label_Umidita24;
	}

	public JLabel getLabel_Pressione_17() {
		return label_Pressione_17;
	}

	public void setLabel_Pressione_17(JLabel label_Pressione_17) {
		this.label_Pressione_17 = label_Pressione_17;
	}

	public JLabel getLabel_Pressione_18() {
		return label_Pressione_18;
	}

	public void setLabel_Pressione_18(JLabel label_Pressione_18) {
		this.label_Pressione_18 = label_Pressione_18;
	}

	public JLabel getLabel_Pressione_20() {
		return label_Pressione_20;
	}

	public void setLabel_Pressione_20(JLabel label_Pressione_20) {
		this.label_Pressione_20 = label_Pressione_20;
	}

	public JLabel getLabel_Pressione_21() {
		return label_Pressione_21;
	}

	public void setLabel_Pressione_21(JLabel label_Pressione_21) {
		this.label_Pressione_21 = label_Pressione_21;
	}

	public JLabel getLabel_Pressione_22() {
		return label_Pressione_22;
	}

	public void setLabel_Pressione_22(JLabel label_Pressione_22) {
		this.label_Pressione_22 = label_Pressione_22;
	}

	public JLabel getLabel_Pressione_23() {
		return label_Pressione_23;
	}

	public void setLabel_Pressione_23(JLabel label_Pressione_23) {
		this.label_Pressione_23 = label_Pressione_23;
	}

	public JLabel getLabel_Pressione_24() {
		return label_Pressione_24;
	}

	public void setLabel_Pressione_24(JLabel label_Pressione_24) {
		this.label_Pressione_24 = label_Pressione_24;
	}

	public JLabel getLabel_Velocitavento_17() {
		return label_Velocitavento_17;
	}

	public void setLabel_Velocitavento_17(JLabel label_Velocitavento_17) {
		this.label_Velocitavento_17 = label_Velocitavento_17;
	}

	public JLabel getLabel_Velocitavento_18() {
		return label_Velocitavento_18;
	}

	public void setLabel_Velocitavento_18(JLabel label_Velocitavento_18) {
		this.label_Velocitavento_18 = label_Velocitavento_18;
	}

	public JLabel getLabel_Velocitavento_19() {
		return label_Velocitavento_19;
	}

	public void setLabel_Velocitavento_19(JLabel label_Velocitavento_19) {
		this.label_Velocitavento_19 = label_Velocitavento_19;
	}

	public JLabel getLabel_Velocitavento_20() {
		return label_Velocitavento_20;
	}

	public void setLabel_Velocitavento_20(JLabel label_Velocitavento_20) {
		this.label_Velocitavento_20 = label_Velocitavento_20;
	}

	public JLabel getLabel_Velocitavento_21() {
		return label_Velocitavento_21;
	}

	public void setLabel_Velocitavento_21(JLabel label_Velocitavento_21) {
		this.label_Velocitavento_21 = label_Velocitavento_21;
	}

	public JLabel getLabel_Velocitavento_22() {
		return label_Velocitavento_22;
	}

	public void setLabel_Velocitavento_22(JLabel label_Velocitavento_22) {
		this.label_Velocitavento_22 = label_Velocitavento_22;
	}

	public JLabel getLabel_Velocitavento_23() {
		return label_Velocitavento_23;
	}

	public void setLabel_Velocitavento_23(JLabel label_Velocitavento_23) {
		this.label_Velocitavento_23 = label_Velocitavento_23;
	}

	public JLabel getLabel_Velocitavento_24() {
		return label_Velocitavento_24;
	}

	public void setLabel_Velocitavento_24(JLabel label_Velocitavento_24) {
		this.label_Velocitavento_24 = label_Velocitavento_24;
	}

	public JLabel getLabel_Direzione_17() {
		return label_Direzione_17;
	}

	public void setLabel_Direzione_17(JLabel label_Direzione_17) {
		this.label_Direzione_17 = label_Direzione_17;
	}

	public JLabel getLabel_Direzione_18() {
		return label_Direzione_18;
	}

	public void setLabel_Direzione_18(JLabel label_Direzione_18) {
		this.label_Direzione_18 = label_Direzione_18;
	}

	public JLabel getLabel_Direzione_19() {
		return label_Direzione_19;
	}

	public void setLabel_Direzione_19(JLabel label_Direzione_19) {
		this.label_Direzione_19 = label_Direzione_19;
	}

	public JLabel getLabel_Direzione_20() {
		return label_Direzione_20;
	}

	public void setLabel_Direzione_20(JLabel label_Direzione_20) {
		this.label_Direzione_20 = label_Direzione_20;
	}

	public JLabel getLabel_Direzione_21() {
		return label_Direzione_21;
	}

	public void setLabel_Direzione_21(JLabel label_Direzione_21) {
		this.label_Direzione_21 = label_Direzione_21;
	}

	public JLabel getLabel_Direzione_22() {
		return label_Direzione_22;
	}

	public void setLabel_Direzione_22(JLabel label_Direzione_22) {
		this.label_Direzione_22 = label_Direzione_22;
	}

	public JLabel getLabel_Direzione_23() {
		return label_Direzione_23;
	}

	public void setLabel_Direzione_23(JLabel label_Direzione_23) {
		this.label_Direzione_23 = label_Direzione_23;
	}

	public JLabel getLabel_Direzione_24() {
		return label_Direzione_24;
	}

	public void setLabel_Direzione_24(JLabel label_Direzione_24) {
		this.label_Direzione_24 = label_Direzione_24;
	}

	public JLabel getLabel_Pressione_19() {
		return label_Pressione_19;
	}

	public void setLabel_Pressione_19(JLabel label_Pressione_19) {
		this.label_Pressione_19 = label_Pressione_19;
	}

	public JLabel getLabel_58() {
		return label_58;
	}

	public void setLabel_58(JLabel label_58) {
		this.label_58 = label_58;
	}

	public JLabel getLabel_59() {
		return label_59;
	}

	public void setLabel_59(JLabel label_59) {
		this.label_59 = label_59;
	}

	public JLabel getLabel_60() {
		return label_60;
	}

	public void setLabel_60(JLabel label_60) {
		this.label_60 = label_60;
	}

	public JLabel getLabel_61() {
		return label_61;
	}

	public void setLabel_61(JLabel label_61) {
		this.label_61 = label_61;
	}

	public JLabel getLabel_62() {
		return label_62;
	}

	public void setLabel_62(JLabel label_62) {
		this.label_62 = label_62;
	}

	public JLabel getLabel_63() {
		return label_63;
	}

	public void setLabel_63(JLabel label_63) {
		this.label_63 = label_63;
	}

	public JLabel getLabel_64() {
		return label_64;
	}

	public void setLabel_64(JLabel label_64) {
		this.label_64 = label_64;
	}

	public JLabel getLabel_65() {
		return label_65;
	}

	public void setLabel_65(JLabel label_65) {
		this.label_65 = label_65;
	}

	public JLabel getLabel_descrizione25() {
		return label_descrizione25;
	}

	public void setLabel_descrizione25(JLabel label_descrizione25) {
		this.label_descrizione25 = label_descrizione25;
	}

	public JLabel getLabel_descrizione26() {
		return label_descrizione26;
	}

	public void setLabel_descrizione26(JLabel label_descrizione26) {
		this.label_descrizione26 = label_descrizione26;
	}

	public JLabel getLabel_descrizione27() {
		return label_descrizione27;
	}

	public void setLabel_descrizione27(JLabel label_descrizione27) {
		this.label_descrizione27 = label_descrizione27;
	}

	public JLabel getLabel_descrizione28() {
		return label_descrizione28;
	}

	public void setLabel_descrizione28(JLabel label_descrizione28) {
		this.label_descrizione28 = label_descrizione28;
	}

	public JLabel getLabel_descrizione29() {
		return label_descrizione29;
	}

	public void setLabel_descrizione29(JLabel label_descrizione29) {
		this.label_descrizione29 = label_descrizione29;
	}

	public JLabel getLabel_descrizione30() {
		return label_descrizione30;
	}

	public void setLabel_descrizione30(JLabel label_descrizione30) {
		this.label_descrizione30 = label_descrizione30;
	}

	public JLabel getLabel_descrizione31() {
		return label_descrizione31;
	}

	public void setLabel_descrizione31(JLabel label_descrizione31) {
		this.label_descrizione31 = label_descrizione31;
	}

	public JLabel getLabel_descrizione32() {
		return label_descrizione32;
	}

	public void setLabel_descrizione32(JLabel label_descrizione32) {
		this.label_descrizione32 = label_descrizione32;
	}

	public JLabel getLabel_temperatura_25() {
		return label_temperatura_25;
	}

	public void setLabel_temperatura_25(JLabel label_temperatura_25) {
		this.label_temperatura_25 = label_temperatura_25;
	}

	public JLabel getLabel_temperatura_26() {
		return label_temperatura_26;
	}

	public void setLabel_temperatura_26(JLabel label_temperatura_26) {
		this.label_temperatura_26 = label_temperatura_26;
	}

	public JLabel getLabel_temperatura_27() {
		return label_temperatura_27;
	}

	public void setLabel_temperatura_27(JLabel label_temperatura_27) {
		this.label_temperatura_27 = label_temperatura_27;
	}

	public JLabel getLabel_temperatura_28() {
		return label_temperatura_28;
	}

	public void setLabel_temperatura_28(JLabel label_temperatura_28) {
		this.label_temperatura_28 = label_temperatura_28;
	}

	public JLabel getLabel_temperatura_29() {
		return label_temperatura_29;
	}

	public void setLabel_temperatura_29(JLabel label_temperatura_29) {
		this.label_temperatura_29 = label_temperatura_29;
	}

	public JLabel getLabel_temperatura_30() {
		return label_temperatura_30;
	}

	public void setLabel_temperatura_30(JLabel label_temperatura_30) {
		this.label_temperatura_30 = label_temperatura_30;
	}

	public JLabel getLabel_temperatura_31() {
		return label_temperatura_31;
	}

	public void setLabel_temperatura_31(JLabel label_temperatura_31) {
		this.label_temperatura_31 = label_temperatura_31;
	}

	public JLabel getLabel_temperatura_32() {
		return label_temperatura_32;
	}

	public void setLabel_temperatura_32(JLabel label_temperatura_32) {
		this.label_temperatura_32 = label_temperatura_32;
	}

	public JLabel getLabel_Umidita25() {
		return label_Umidita25;
	}

	public void setLabel_Umidita25(JLabel label_Umidita25) {
		this.label_Umidita25 = label_Umidita25;
	}

	public JLabel getLabel_Umidita26() {
		return label_Umidita26;
	}

	public void setLabel_Umidita26(JLabel label_Umidita26) {
		this.label_Umidita26 = label_Umidita26;
	}

	public JLabel getLabel_Umidita27() {
		return label_Umidita27;
	}

	public void setLabel_Umidita27(JLabel label_Umidita27) {
		this.label_Umidita27 = label_Umidita27;
	}

	public JLabel getLabel_Umidita28() {
		return label_Umidita28;
	}

	public void setLabel_Umidita28(JLabel label_Umidita28) {
		this.label_Umidita28 = label_Umidita28;
	}

	public JLabel getLabel_Umidita29() {
		return label_Umidita29;
	}

	public void setLabel_Umidita29(JLabel label_Umidita29) {
		this.label_Umidita29 = label_Umidita29;
	}

	public JLabel getLabel_Umidita30() {
		return label_Umidita30;
	}

	public void setLabel_Umidita30(JLabel label_Umidita30) {
		this.label_Umidita30 = label_Umidita30;
	}

	public JLabel getLabel_Umidita31() {
		return label_Umidita31;
	}

	public void setLabel_Umidita31(JLabel label_Umidita31) {
		this.label_Umidita31 = label_Umidita31;
	}

	public JLabel getLabel_Umidita32() {
		return label_Umidita32;
	}

	public void setLabel_Umidita32(JLabel label_Umidita32) {
		this.label_Umidita32 = label_Umidita32;
	}

	public JLabel getLabel_Pressione_25() {
		return label_Pressione_25;
	}

	public void setLabel_Pressione_25(JLabel label_Pressione_25) {
		this.label_Pressione_25 = label_Pressione_25;
	}

	public JLabel getLabel_Pressione_26() {
		return label_Pressione_26;
	}

	public void setLabel_Pressione_26(JLabel label_Pressione_26) {
		this.label_Pressione_26 = label_Pressione_26;
	}

	public JLabel getLabel_Pressione_27() {
		return label_Pressione_27;
	}

	public void setLabel_Pressione_27(JLabel label_Pressione_27) {
		this.label_Pressione_27 = label_Pressione_27;
	}

	public JLabel getLabel_Pressione_28() {
		return label_Pressione_28;
	}

	public void setLabel_Pressione_28(JLabel label_Pressione_28) {
		this.label_Pressione_28 = label_Pressione_28;
	}

	public JLabel getLabel_Pressione_29() {
		return label_Pressione_29;
	}

	public void setLabel_Pressione_29(JLabel label_Pressione_29) {
		this.label_Pressione_29 = label_Pressione_29;
	}

	public JLabel getLabel_Pressione_30() {
		return label_Pressione_30;
	}

	public void setLabel_Pressione_30(JLabel label_Pressione_30) {
		this.label_Pressione_30 = label_Pressione_30;
	}

	public JLabel getLabel_Pressione_31() {
		return label_Pressione_31;
	}

	public void setLabel_Pressione_31(JLabel label_Pressione_31) {
		this.label_Pressione_31 = label_Pressione_31;
	}

	public JLabel getLabel_Pressione_32() {
		return label_Pressione_32;
	}

	public void setLabel_Pressione_32(JLabel label_Pressione_32) {
		this.label_Pressione_32 = label_Pressione_32;
	}

	public JLabel getLabel_Velocitavento_25() {
		return label_Velocitavento_25;
	}

	public void setLabel_Velocitavento_25(JLabel label_Velocitavento_25) {
		this.label_Velocitavento_25 = label_Velocitavento_25;
	}

	public JLabel getLabel_Velocitavento_26() {
		return label_Velocitavento_26;
	}

	public void setLabel_Velocitavento_26(JLabel label_Velocitavento_26) {
		this.label_Velocitavento_26 = label_Velocitavento_26;
	}

	public JLabel getLabel_Velocitavento_27() {
		return label_Velocitavento_27;
	}

	public void setLabel_Velocitavento_27(JLabel label_Velocitavento_27) {
		this.label_Velocitavento_27 = label_Velocitavento_27;
	}

	public JLabel getLabel_Velocitavento_28() {
		return label_Velocitavento_28;
	}

	public void setLabel_Velocitavento_28(JLabel label_Velocitavento_28) {
		this.label_Velocitavento_28 = label_Velocitavento_28;
	}

	public JLabel getLabel_Velocitavento_29() {
		return label_Velocitavento_29;
	}

	public void setLabel_Velocitavento_29(JLabel label_Velocitavento_29) {
		this.label_Velocitavento_29 = label_Velocitavento_29;
	}

	public JLabel getLabel_Velocitavento_30() {
		return label_Velocitavento_30;
	}

	public void setLabel_Velocitavento_30(JLabel label_Velocitavento_30) {
		this.label_Velocitavento_30 = label_Velocitavento_30;
	}

	public JLabel getLabel_Velocitavento_31() {
		return label_Velocitavento_31;
	}

	public void setLabel_Velocitavento_31(JLabel label_Velocitavento_31) {
		this.label_Velocitavento_31 = label_Velocitavento_31;
	}

	public JLabel getLabel_Velocitavento_32() {
		return label_Velocitavento_32;
	}

	public void setLabel_Velocitavento_32(JLabel label_Velocitavento_32) {
		this.label_Velocitavento_32 = label_Velocitavento_32;
	}

	public JLabel getLabel_Direzione_25() {
		return label_Direzione_25;
	}

	public void setLabel_Direzione_25(JLabel label_Direzione_25) {
		this.label_Direzione_25 = label_Direzione_25;
	}

	public JLabel getLabel_Direzione_26() {
		return label_Direzione_26;
	}

	public void setLabel_Direzione_26(JLabel label_Direzione_26) {
		this.label_Direzione_26 = label_Direzione_26;
	}

	public JLabel getLabel_Direzione_27() {
		return label_Direzione_27;
	}

	public void setLabel_Direzione_27(JLabel label_Direzione_27) {
		this.label_Direzione_27 = label_Direzione_27;
	}

	public JLabel getLabel_Direzione_28() {
		return label_Direzione_28;
	}

	public void setLabel_Direzione_28(JLabel label_Direzione_28) {
		this.label_Direzione_28 = label_Direzione_28;
	}

	public JLabel getLabel_Direzione_29() {
		return label_Direzione_29;
	}

	public void setLabel_Direzione_29(JLabel label_Direzione_29) {
		this.label_Direzione_29 = label_Direzione_29;
	}

	public JLabel getLabel_Direzione_30() {
		return label_Direzione_30;
	}

	public void setLabel_Direzione_30(JLabel label_Direzione_30) {
		this.label_Direzione_30 = label_Direzione_30;
	}

	public JLabel getLabel_Direzione_31() {
		return label_Direzione_31;
	}

	public void setLabel_Direzione_31(JLabel label_Direzione_31) {
		this.label_Direzione_31 = label_Direzione_31;
	}

	public JLabel getLabel_Direzione_32() {
		return label_Direzione_32;
	}

	public void setLabel_Direzione_32(JLabel label_Direzione_32) {
		this.label_Direzione_32 = label_Direzione_32;
	}

	public JLabel getLabel_74() {
		return label_74;
	}

	public void setLabel_74(JLabel label_74) {
		this.label_74 = label_74;
	}

	public JLabel getLabel_75() {
		return label_75;
	}

	public void setLabel_75(JLabel label_75) {
		this.label_75 = label_75;
	}

	public JLabel getLabel_76() {
		return label_76;
	}

	public void setLabel_76(JLabel label_76) {
		this.label_76 = label_76;
	}

	public JLabel getLabel_77() {
		return label_77;
	}

	public void setLabel_77(JLabel label_77) {
		this.label_77 = label_77;
	}

	public JLabel getLabel_78() {
		return label_78;
	}

	public void setLabel_78(JLabel label_78) {
		this.label_78 = label_78;
	}

	public JLabel getLabel_79() {
		return label_79;
	}

	public void setLabel_79(JLabel label_79) {
		this.label_79 = label_79;
	}

	public JLabel getLabel_80() {
		return label_80;
	}

	public void setLabel_80(JLabel label_80) {
		this.label_80 = label_80;
	}

	public JLabel getLabel_81() {
		return label_81;
	}

	public void setLabel_81(JLabel label_81) {
		this.label_81 = label_81;
	}

	public JLabel getLabel_descrizione33() {
		return label_descrizione33;
	}

	public void setLabel_descrizione33(JLabel label_descrizione33) {
		this.label_descrizione33 = label_descrizione33;
	}

	public JLabel getLabel_descrizione34() {
		return label_descrizione34;
	}

	public void setLabel_descrizione34(JLabel label_descrizione34) {
		this.label_descrizione34 = label_descrizione34;
	}

	public JLabel getLabel_descrizione35() {
		return label_descrizione35;
	}

	public void setLabel_descrizione35(JLabel label_descrizione35) {
		this.label_descrizione35 = label_descrizione35;
	}

	public JLabel getLabel_descrizione36() {
		return label_descrizione36;
	}

	public void setLabel_descrizione36(JLabel label_descrizione36) {
		this.label_descrizione36 = label_descrizione36;
	}

	public JLabel getLabel_descrizione37() {
		return label_descrizione37;
	}

	public void setLabel_descrizione37(JLabel label_descrizione37) {
		this.label_descrizione37 = label_descrizione37;
	}

	public JLabel getLabel_descrizione38() {
		return label_descrizione38;
	}

	public void setLabel_descrizione38(JLabel label_descrizione38) {
		this.label_descrizione38 = label_descrizione38;
	}

	public JLabel getLabel_descrizione39() {
		return label_descrizione39;
	}

	public void setLabel_descrizione39(JLabel label_descrizione39) {
		this.label_descrizione39 = label_descrizione39;
	}

	public JLabel getLabel_descrizione40() {
		return label_descrizione40;
	}

	public void setLabel_descrizione40(JLabel label_descrizione40) {
		this.label_descrizione40 = label_descrizione40;
	}

	public JLabel getLabel_temperatura_33() {
		return label_temperatura_33;
	}

	public void setLabel_temperatura_33(JLabel label_temperatura_33) {
		this.label_temperatura_33 = label_temperatura_33;
	}

	public JLabel getLabel_temperatura_34() {
		return label_temperatura_34;
	}

	public void setLabel_temperatura_34(JLabel label_temperatura_34) {
		this.label_temperatura_34 = label_temperatura_34;
	}

	public JLabel getLabel_temperatura_35() {
		return label_temperatura_35;
	}

	public void setLabel_temperatura_35(JLabel label_temperatura_35) {
		this.label_temperatura_35 = label_temperatura_35;
	}

	public JLabel getLabel_temperatura_36() {
		return label_temperatura_36;
	}

	public void setLabel_temperatura_36(JLabel label_temperatura_36) {
		this.label_temperatura_36 = label_temperatura_36;
	}

	public JLabel getLabel_temperatura_37() {
		return label_temperatura_37;
	}

	public void setLabel_temperatura_37(JLabel label_temperatura_37) {
		this.label_temperatura_37 = label_temperatura_37;
	}

	public JLabel getLabel_temperatura_38() {
		return label_temperatura_38;
	}

	public void setLabel_temperatura_38(JLabel label_temperatura_38) {
		this.label_temperatura_38 = label_temperatura_38;
	}

	public JLabel getLabel_temperatura_39() {
		return label_temperatura_39;
	}

	public void setLabel_temperatura_39(JLabel label_temperatura_39) {
		this.label_temperatura_39 = label_temperatura_39;
	}

	public JLabel getLabel_temperatura_40() {
		return label_temperatura_40;
	}

	public void setLabel_temperatura_40(JLabel label_temperatura_40) {
		this.label_temperatura_40 = label_temperatura_40;
	}

	public JLabel getLabel_Celsius_33() {
		return label_Celsius_33;
	}

	public void setLabel_Celsius_33(JLabel label_Celsius_33) {
		this.label_Celsius_33 = label_Celsius_33;
	}

	public JLabel getLabel_Celsius_34() {
		return label_Celsius_34;
	}

	public void setLabel_Celsius_34(JLabel label_Celsius_34) {
		this.label_Celsius_34 = label_Celsius_34;
	}

	public JLabel getLabel_Celsius_35() {
		return label_Celsius_35;
	}

	public void setLabel_Celsius_35(JLabel label_Celsius_35) {
		this.label_Celsius_35 = label_Celsius_35;
	}

	public JLabel getLabel_Celsius_36() {
		return label_Celsius_36;
	}

	public void setLabel_Celsius_36(JLabel label_Celsius_36) {
		this.label_Celsius_36 = label_Celsius_36;
	}

	public JLabel getLabel_Celsius_37() {
		return label_Celsius_37;
	}

	public void setLabel_Celsius_37(JLabel label_Celsius_37) {
		this.label_Celsius_37 = label_Celsius_37;
	}

	public JLabel getLabel_Celsius_38() {
		return label_Celsius_38;
	}

	public void setLabel_Celsius_38(JLabel label_Celsius_38) {
		this.label_Celsius_38 = label_Celsius_38;
	}

	public JLabel getLabel_Celsius_39() {
		return label_Celsius_39;
	}

	public void setLabel_Celsius_39(JLabel label_Celsius_39) {
		this.label_Celsius_39 = label_Celsius_39;
	}

	public JLabel getLabel_Celsius_40() {
		return label_Celsius_40;
	}

	public void setLabel_Celsius_40(JLabel label_Celsius_40) {
		this.label_Celsius_40 = label_Celsius_40;
	}

	public JLabel getLabel_percentuale33() {
		return label_percentuale33;
	}

	public void setLabel_percentuale33(JLabel label_percentuale33) {
		this.label_percentuale33 = label_percentuale33;
	}

	public JLabel getLabel_percentuale34() {
		return label_percentuale34;
	}

	public void setLabel_percentuale34(JLabel label_percentuale34) {
		this.label_percentuale34 = label_percentuale34;
	}

	public JLabel getLabel_percentuale35() {
		return label_percentuale35;
	}

	public void setLabel_percentuale35(JLabel label_percentuale35) {
		this.label_percentuale35 = label_percentuale35;
	}

	public JLabel getLabel_percentuale36() {
		return label_percentuale36;
	}

	public void setLabel_percentuale36(JLabel label_percentuale36) {
		this.label_percentuale36 = label_percentuale36;
	}

	public JLabel getLabel_percentuale37() {
		return label_percentuale37;
	}

	public void setLabel_percentuale37(JLabel label_percentuale37) {
		this.label_percentuale37 = label_percentuale37;
	}

	public JLabel getLabel_percentuale38() {
		return label_percentuale38;
	}

	public void setLabel_percentuale38(JLabel label_percentuale38) {
		this.label_percentuale38 = label_percentuale38;
	}

	public JLabel getLabel_percentuale39() {
		return label_percentuale39;
	}

	public void setLabel_percentuale39(JLabel label_percentuale39) {
		this.label_percentuale39 = label_percentuale39;
	}

	public JLabel getLabel_percentuale40() {
		return label_percentuale40;
	}

	public void setLabel_percentuale40(JLabel label_percentuale40) {
		this.label_percentuale40 = label_percentuale40;
	}

	public JLabel getLabel_Umidita33() {
		return label_Umidita33;
	}

	public void setLabel_Umidita33(JLabel label_Umidita33) {
		this.label_Umidita33 = label_Umidita33;
	}

	public JLabel getLabel_Umidita34() {
		return label_Umidita34;
	}

	public void setLabel_Umidita34(JLabel label_Umidita34) {
		this.label_Umidita34 = label_Umidita34;
	}

	public JLabel getLabel_Umidita35() {
		return label_Umidita35;
	}

	public void setLabel_Umidita35(JLabel label_Umidita35) {
		this.label_Umidita35 = label_Umidita35;
	}

	public JLabel getLabel_Umidita36() {
		return label_Umidita36;
	}

	public void setLabel_Umidita36(JLabel label_Umidita36) {
		this.label_Umidita36 = label_Umidita36;
	}

	public JLabel getLabel_Umidita37() {
		return label_Umidita37;
	}

	public void setLabel_Umidita37(JLabel label_Umidita37) {
		this.label_Umidita37 = label_Umidita37;
	}

	public JLabel getLabel_Umidita38() {
		return label_Umidita38;
	}

	public void setLabel_Umidita38(JLabel label_Umidita38) {
		this.label_Umidita38 = label_Umidita38;
	}

	public JLabel getLabel_Umidita39() {
		return label_Umidita39;
	}

	public void setLabel_Umidita39(JLabel label_Umidita39) {
		this.label_Umidita39 = label_Umidita39;
	}

	public JLabel getLabel_Umidita40() {
		return label_Umidita40;
	}

	public void setLabel_Umidita40(JLabel label_Umidita40) {
		this.label_Umidita40 = label_Umidita40;
	}

	public JLabel getLabel_Pressione_33() {
		return label_Pressione_33;
	}

	public void setLabel_Pressione_33(JLabel label_Pressione_33) {
		this.label_Pressione_33 = label_Pressione_33;
	}

	public JLabel getLabel_Pressione_34() {
		return label_Pressione_34;
	}

	public void setLabel_Pressione_34(JLabel label_Pressione_34) {
		this.label_Pressione_34 = label_Pressione_34;
	}

	public JLabel getLabel_Pressione_35() {
		return label_Pressione_35;
	}

	public void setLabel_Pressione_35(JLabel label_Pressione_35) {
		this.label_Pressione_35 = label_Pressione_35;
	}

	public JLabel getLabel_Pressione_36() {
		return label_Pressione_36;
	}

	public void setLabel_Pressione_36(JLabel label_Pressione_36) {
		this.label_Pressione_36 = label_Pressione_36;
	}

	public JLabel getLabel_Pressione_37() {
		return label_Pressione_37;
	}

	public void setLabel_Pressione_37(JLabel label_Pressione_37) {
		this.label_Pressione_37 = label_Pressione_37;
	}

	public JLabel getLabel_Pressione_38() {
		return label_Pressione_38;
	}

	public void setLabel_Pressione_38(JLabel label_Pressione_38) {
		this.label_Pressione_38 = label_Pressione_38;
	}

	public JLabel getLabel_Pressione_39() {
		return label_Pressione_39;
	}

	public void setLabel_Pressione_39(JLabel label_Pressione_39) {
		this.label_Pressione_39 = label_Pressione_39;
	}

	public JLabel getLabel_Pressione_40() {
		return label_Pressione_40;
	}

	public void setLabel_Pressione_40(JLabel label_Pressione_40) {
		this.label_Pressione_40 = label_Pressione_40;
	}

	public JLabel getLabel_hPa33() {
		return label_hPa33;
	}

	public void setLabel_hPa33(JLabel label_hPa33) {
		this.label_hPa33 = label_hPa33;
	}

	public JLabel getLabel_hPa34() {
		return label_hPa34;
	}

	public void setLabel_hPa34(JLabel label_hPa34) {
		this.label_hPa34 = label_hPa34;
	}

	public JLabel getLabel_hPa35() {
		return label_hPa35;
	}

	public void setLabel_hPa35(JLabel label_hPa35) {
		this.label_hPa35 = label_hPa35;
	}

	public JLabel getLabel_hPa36() {
		return label_hPa36;
	}

	public void setLabel_hPa36(JLabel label_hPa36) {
		this.label_hPa36 = label_hPa36;
	}

	public JLabel getLabel_hPa37() {
		return label_hPa37;
	}

	public void setLabel_hPa37(JLabel label_hPa37) {
		this.label_hPa37 = label_hPa37;
	}

	public JLabel getLabel_hPa38() {
		return label_hPa38;
	}

	public void setLabel_hPa38(JLabel label_hPa38) {
		this.label_hPa38 = label_hPa38;
	}

	public JLabel getLabel_hPa39() {
		return label_hPa39;
	}

	public void setLabel_hPa39(JLabel label_hPa39) {
		this.label_hPa39 = label_hPa39;
	}

	public JLabel getLabel_hPa40() {
		return label_hPa40;
	}

	public void setLabel_hPa40(JLabel label_hPa40) {
		this.label_hPa40 = label_hPa40;
	}

	public JLabel getLabel_Direzione_33() {
		return label_Direzione_33;
	}

	public void setLabel_Direzione_33(JLabel label_Direzione_33) {
		this.label_Direzione_33 = label_Direzione_33;
	}

	public JLabel getLabel_Direzione_34() {
		return label_Direzione_34;
	}

	public void setLabel_Direzione_34(JLabel label_Direzione_34) {
		this.label_Direzione_34 = label_Direzione_34;
	}

	public JLabel getLabel_Direzione_35() {
		return label_Direzione_35;
	}

	public void setLabel_Direzione_35(JLabel label_Direzione_35) {
		this.label_Direzione_35 = label_Direzione_35;
	}

	public JLabel getLabel_Direzione_36() {
		return label_Direzione_36;
	}

	public void setLabel_Direzione_36(JLabel label_Direzione_36) {
		this.label_Direzione_36 = label_Direzione_36;
	}

	public JLabel getLabel_Direzione_37() {
		return label_Direzione_37;
	}

	public void setLabel_Direzione_37(JLabel label_Direzione_37) {
		this.label_Direzione_37 = label_Direzione_37;
	}

	public JLabel getLabel_Direzione_38() {
		return label_Direzione_38;
	}

	public void setLabel_Direzione_38(JLabel label_Direzione_38) {
		this.label_Direzione_38 = label_Direzione_38;
	}

	public JLabel getLabel_Direzione_39() {
		return label_Direzione_39;
	}

	public void setLabel_Direzione_39(JLabel label_Direzione_39) {
		this.label_Direzione_39 = label_Direzione_39;
	}

	public JLabel getLabel_Direzione_40() {
		return label_Direzione_40;
	}

	public void setLabel_Direzione_40(JLabel label_Direzione_40) {
		this.label_Direzione_40 = label_Direzione_40;
	}

	public JLabel getLabel_Velocitavento_33() {
		return label_Velocitavento_33;
	}

	public void setLabel_Velocitavento_33(JLabel label_Velocitavento_33) {
		this.label_Velocitavento_33 = label_Velocitavento_33;
	}

	public JLabel getLabel_Velocitavento_34() {
		return label_Velocitavento_34;
	}

	public void setLabel_Velocitavento_34(JLabel label_Velocitavento_34) {
		this.label_Velocitavento_34 = label_Velocitavento_34;
	}

	public JLabel getLabel_Velocitavento_35() {
		return label_Velocitavento_35;
	}

	public void setLabel_Velocitavento_35(JLabel label_Velocitavento_35) {
		this.label_Velocitavento_35 = label_Velocitavento_35;
	}

	public JLabel getLabel_Velocitavento_36() {
		return label_Velocitavento_36;
	}

	public void setLabel_Velocitavento_36(JLabel label_Velocitavento_36) {
		this.label_Velocitavento_36 = label_Velocitavento_36;
	}

	public JLabel getLabel_Velocitavento_37() {
		return label_Velocitavento_37;
	}

	public void setLabel_Velocitavento_37(JLabel label_Velocitavento_37) {
		this.label_Velocitavento_37 = label_Velocitavento_37;
	}

	public JLabel getLabel_Velocitavento_38() {
		return label_Velocitavento_38;
	}

	public void setLabel_Velocitavento_38(JLabel label_Velocitavento_38) {
		this.label_Velocitavento_38 = label_Velocitavento_38;
	}

	public JLabel getLabel_Velocitavento_39() {
		return label_Velocitavento_39;
	}

	public void setLabel_Velocitavento_39(JLabel label_Velocitavento_39) {
		this.label_Velocitavento_39 = label_Velocitavento_39;
	}

	public JLabel getLabel_Velocitavento_40() {
		return label_Velocitavento_40;
	}

	public void setLabel_Velocitavento_40(JLabel label_Velocitavento_40) {
		this.label_Velocitavento_40 = label_Velocitavento_40;
	}

	public JLabel getLabel_66() {
		return label_66;
	}

	public void setLabel_66(JLabel label_66) {
		this.label_66 = label_66;
	}

	public JLabel getLabel_67() {
		return label_67;
	}

	public void setLabel_67(JLabel label_67) {
		this.label_67 = label_67;
	}

	public JLabel getLabel_68() {
		return label_68;
	}

	public void setLabel_68(JLabel label_68) {
		this.label_68 = label_68;
	}

	public JLabel getLabel_69() {
		return label_69;
	}

	public void setLabel_69(JLabel label_69) {
		this.label_69 = label_69;
	}

	public JLabel getLabel_70() {
		return label_70;
	}

	public void setLabel_70(JLabel label_70) {
		this.label_70 = label_70;
	}

	public JLabel getLabel_71() {
		return label_71;
	}

	public void setLabel_71(JLabel label_71) {
		this.label_71 = label_71;
	}

	public JLabel getLabel_72() {
		return label_72;
	}

	public void setLabel_72(JLabel label_72) {
		this.label_72 = label_72;
	}

	public JLabel getLabel_73() {
		return label_73;
	}

	public void setLabel_73(JLabel label_73) {
		this.label_73 = label_73;
	}

	public JLabel getLabel_OraAlba() {
		return label_OraAlba;
	}

	public void setLabel_OraAlba(JLabel label_OraAlba) {
		this.label_OraAlba = label_OraAlba;
	}

	public JLabel getLabel_OraTramonto() {
		return Label_OraTramonto;
	}

	public void setLabel_OraTramonto(JLabel label_OraTramonto) {
		Label_OraTramonto = label_OraTramonto;
	}

	public JLabel getLabel_datiLatitudine() {
		return label_datiLatitudine;
	}

	public void setLabel_datiLatitudine(JLabel label_datiLatitudine) {
		this.label_datiLatitudine = label_datiLatitudine;
	}

	public JLabel getLabel_Datilongitudine() {
		return label_Datilongitudine;
	}

	public void setLabel_Datilongitudine(JLabel label_Datilongitudine) {
		this.label_Datilongitudine = label_Datilongitudine;
	}

	public JButton getBtnAvviso() {
		return btnAvviso;
	}

	public void setBtnAvviso(JButton btnAvviso) {
		this.btnAvviso = btnAvviso;
	}
	
}
