package Control;

import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Model.Weatherdata;
import View.Finestra;
import View.Finestra2;

public class Controller implements ActionListener{
	Finestra f;
	Finestra2 f2;
	ImageIcon icon;
	int pioggia_giorno_1=0,pioggia_giorno_2=0,pioggia_giorno_3=0,pioggia_giorno_4=0,pioggia_giorno_5=0,neve_giorno_1=0,neve_giorno_2=0,neve_giorno_3=0,neve_giorno_4=0,neve_giorno_5=0;
	public Controller(Finestra f,Finestra2 f2){
		this.f=f;
		this.f2=f2;
		f.getBtnCerca().addActionListener(this);
		f2.getBtnCerca_Città().addActionListener(this);
		f2.getBtnAvviso().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ArrayList<Weatherdata.Forecast.Time> tm;
		String tempo,tempodescr;
		int i,dim,j=0,giornoinizio,meseinizio,orainizio;
		if(e.getSource()==f.getBtnCerca()){
			if(f.getTextField_Citta().getText().equals("")) {
				JOptionPane.showMessageDialog(f, "Inserire una città", "Errore", 0);
			}else {
				boolean errore=false;
				try {
					URL xmlFile = new URL(
							"http://api.openweathermap.org/data/2.5/forecast?q="+f.getTextField_Citta().getText()+",it&lang=it&units=metric&mode=xml&appid=cfb167eee572b912f8df485749d839d4");
					
					// Inizializzo Jaxb per dire che dovrà leggere l'xml in un certo modo
					JAXBContext jaxbContext = JAXBContext.newInstance(Weatherdata.class);
					// Il unmarshaller è l'oggetto che legge l'xml
					Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
					Weatherdata current = (Weatherdata) jaxbUnmarshaller.unmarshal(xmlFile);
					tm=new ArrayList<Weatherdata.Forecast.Time>(current.getForecast().getTime());
				} catch (JAXBException e1) {
					errore=true;
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					errore=true;
				}
				if(errore==true) {
					JOptionPane.showMessageDialog(f, "Citta non trovata", "Errore", 0);
					f.getTextField_Citta().setText("");
				}else {
					try {
						//JOptionPane.showMessageDialog(f, "Città cercata: "+f.getTextField_Citta().getText(), "Messaggio", 1);
						URL xmlFile = new URL(
								"http://api.openweathermap.org/data/2.5/forecast?q="+f.getTextField_Citta().getText()+",it&lang=it&units=metric&mode=xml&appid=cfb167eee572b912f8df485749d839d4");
						
						// Inizializzo Jaxb per dire che dovrà leggere l'xml in un certo modo
						JAXBContext jaxbContext = JAXBContext.newInstance(Weatherdata.class);
						// Il unmarshaller è l'oggetto che legge l'xml
						Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
						Weatherdata current = (Weatherdata) jaxbUnmarshaller.unmarshal(xmlFile);
						tm=new ArrayList<Weatherdata.Forecast.Time>(current.getForecast().getTime());
						giornoinizio=tm.get(0).getFrom().getDay();
						meseinizio=tm.get(0).getFrom().getMonth();
						orainizio=tm.get(0).getFrom().getHour();
						//SETTO GIORNI SU TABBEDPANE
						for(i=0;i<f2.getTabbedPane().getComponentCount();i++){
							f2.getTabbedPane().setTitleAt(i, ""+giornoinizio+"/"+meseinizio);
							giornoinizio++;
							if(giornoinizio==32){
								giornoinizio=1;
								if(meseinizio==12){
									meseinizio=1;
								}else{
									meseinizio++;
								}
							}
						}
						pioggia_giorno_1=0;pioggia_giorno_2=0;pioggia_giorno_3=0;pioggia_giorno_4=0;pioggia_giorno_5=0;
						neve_giorno_1=0;neve_giorno_2=0;neve_giorno_3=0;neve_giorno_4=0;neve_giorno_5=0;
						//MOSTRO DATI ALBA E TRAMONTO
						f2.getLabel_OraAlba().setText(""+(current.getSun().getRise().getHour()+1)+":"+current.getSun().getRise().getMinute());
						f2.getLabel_OraTramonto().setText(""+(current.getSun().getSet().getHour()+1)+":"+current.getSun().getSet().getMinute());
						//METTO DATI LATITUDINE E LONGITUDINE
						f2.getLabel_datiLatitudine().setText(""+current.getLocation().getLocation().getLatitude().doubleValue());
						f2.getLabel_Datilongitudine().setText(""+current.getLocation().getLocation().getLongitude().doubleValue());
						//PRENDO DIMESIONE ARRAY
						dim=tm.size();
						//SETTAGGIO PRIMO GIORNO
						tempo=tm.get(0).getSymbol().getName();
						tempodescr=tm.get(0).getSymbol().getName();
						switch(orainizio){
						case 0:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" notte";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_1++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_1++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_9().setIcon(icon);
							f2.getLabel_descrizione_1().setText(tempodescr);
							f2.getLabel_temperatura_1().setText(""+tm.get(0).getTemperature().getValue().doubleValue());
							f2.getLblUmidita1().setText(""+tm.get(0).getHumidity().getValue().intValue());
							f2.getLblPressione_1().setText(""+tm.get(0).getPressure().getValue().doubleValue());
							f2.getLblVelocitavento_1().setText(""+tm.get(0).getWindSpeed().getMps().doubleValue());
							f2.getLblDirezione_1().setText(""+tm.get(0).getWindDirection().getCode());
							break;
						case 3:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" notte";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_1++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_1++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_10().setIcon(icon);
							f2.getLabel_descrizione_2().setText(tempodescr);
							f2.getLabel_temperatura_2().setText(""+tm.get(0).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita2().setText(""+tm.get(0).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_2().setText(""+tm.get(0).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_2().setText(""+tm.get(0).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_2().setText(""+tm.get(0).getWindDirection().getCode());
							f2.getLabel_1().setText("");
							f2.getLabel_Celsius_1().setText("");
							f2.getLabel_percentuale1().setText("");
							f2.getLabel_hPa1().setText("");
							break;
						case 6:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" notte";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_1++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_1++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_11().setIcon(icon);
							f2.getLabel_descrizione_3().setText(tempodescr);
							f2.getLabel_temperatura_3().setText(""+tm.get(0).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita3().setText(""+tm.get(0).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_3().setText(""+tm.get(0).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_3().setText(""+tm.get(0).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_3().setText(""+tm.get(0).getWindDirection().getCode());
							f2.getLabel_Celsius_1().setText("");
							f2.getLabel_percentuale1().setText("");
							f2.getLabel_hPa1().setText("");
							f2.getLabel_1().setText("");
							f2.getLabel_2().setText("");
							f2.getLabel_Celsius_2().setText("");
							f2.getLabel_percentuale2().setText("");
							f2.getLabel_hPa2().setText("");
							break;
						case 9:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" giorno";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_1++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_1++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_12().setIcon(icon);
							f2.getLabel_descrizione_4().setText(tempodescr);
							f2.getLabel_temperatura_4().setText(""+tm.get(0).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita4().setText(""+tm.get(0).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_4().setText(""+tm.get(0).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_4().setText(""+tm.get(0).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_4().setText(""+tm.get(0).getWindDirection().getCode());
							f2.getLabel_Celsius_1().setText("");
							f2.getLabel_percentuale1().setText("");
							f2.getLabel_hPa1().setText("");
							f2.getLabel_1().setText("");
							f2.getLabel_2().setText("");
							f2.getLabel_Celsius_2().setText("");
							f2.getLabel_percentuale2().setText("");
							f2.getLabel_hPa2().setText("");
							f2.getLabel_3().setText("");
							f2.getLabel_Celsius_3().setText("");
							f2.getLabel_percentuale3().setText("");
							f2.getLabel_hPa3().setText("");
							break;
						case 12:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" giorno";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_1++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_1++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_13().setIcon(icon);
							f2.getLabel_descrizione_5().setText(tempodescr);
							f2.getLabel_temperatura_5().setText(""+tm.get(0).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita5().setText(""+tm.get(0).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_5().setText(""+tm.get(0).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_5().setText(""+tm.get(0).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_5().setText(""+tm.get(0).getWindDirection().getCode());
							f2.getLabel_Celsius_1().setText("");
							f2.getLabel_percentuale1().setText("");
							f2.getLabel_hPa1().setText("");
							f2.getLabel_1().setText("");
							f2.getLabel_2().setText("");
							f2.getLabel_Celsius_2().setText("");
							f2.getLabel_percentuale2().setText("");
							f2.getLabel_hPa2().setText("");
							f2.getLabel_3().setText("");
							f2.getLabel_Celsius_3().setText("");
							f2.getLabel_percentuale3().setText("");
							f2.getLabel_hPa3().setText("");
							f2.getLabel_4().setText("");
							f2.getLabel_Celsius_4().setText("");
							f2.getLabel_percentuale4().setText("");
							f2.getLabel_hPa4().setText("");
							break;
						case 15:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" giorno";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_1++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_1++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_14().setIcon(icon);
							f2.getLabel_descrizione_6().setText(tempodescr);
							f2.getLabel_temperatura_6().setText(""+tm.get(0).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita6().setText(""+tm.get(0).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_6().setText(""+tm.get(0).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_6().setText(""+tm.get(0).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_6().setText(""+tm.get(0).getWindDirection().getCode());
							f2.getLabel_Celsius_1().setText("");
							f2.getLabel_percentuale1().setText("");
							f2.getLabel_hPa1().setText("");
							f2.getLabel_1().setText("");
							f2.getLabel_2().setText("");
							f2.getLabel_Celsius_2().setText("");
							f2.getLabel_percentuale2().setText("");
							f2.getLabel_hPa2().setText("");
							f2.getLabel_3().setText("");
							f2.getLabel_Celsius_3().setText("");
							f2.getLabel_percentuale3().setText("");
							f2.getLabel_hPa3().setText("");
							f2.getLabel_4().setText("");
							f2.getLabel_Celsius_4().setText("");
							f2.getLabel_percentuale4().setText("");
							f2.getLabel_hPa4().setText("");
							f2.getLabel_5().setText("");
							f2.getLabel_Celsius_5().setText("");
							f2.getLabel_percentuale5().setText("");
							f2.getLabel_hPa5().setText("");
							break;
						case 18:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" giorno";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_1++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_1++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_15().setIcon(icon);
							f2.getLabel_descrizione_7().setText(tempodescr);
							f2.getLabel_temperatura_7().setText(""+tm.get(0).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita7().setText(""+tm.get(0).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_7().setText(""+tm.get(0).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_7().setText(""+tm.get(0).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_7().setText(""+tm.get(0).getWindDirection().getCode());
							f2.getLabel_Celsius_1().setText("");
							f2.getLabel_percentuale1().setText("");
							f2.getLabel_hPa1().setText("");
							f2.getLabel_1().setText("");
							f2.getLabel_2().setText("");
							f2.getLabel_Celsius_2().setText("");
							f2.getLabel_percentuale2().setText("");
							f2.getLabel_hPa2().setText("");
							f2.getLabel_3().setText("");
							f2.getLabel_Celsius_3().setText("");
							f2.getLabel_percentuale3().setText("");
							f2.getLabel_hPa3().setText("");
							f2.getLabel_4().setText("");
							f2.getLabel_Celsius_4().setText("");
							f2.getLabel_percentuale4().setText("");
							f2.getLabel_hPa4().setText("");
							f2.getLabel_5().setText("");
							f2.getLabel_Celsius_5().setText("");
							f2.getLabel_percentuale5().setText("");
							f2.getLabel_hPa5().setText("");
							f2.getLabel_6().setText("");
							f2.getLabel_Celsius_6().setText("");
							f2.getLabel_percentuale6().setText("");
							f2.getLabel_hPa6().setText("");
							break;
						case 21:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" notte";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_1++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_1++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_16().setIcon(icon);
							f2.getLabel_descrizione_8().setText(tempodescr);
							f2.getLabel_temperatura_8().setText(""+tm.get(0).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita8().setText(""+tm.get(0).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_8().setText(""+tm.get(0).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_8().setText(""+tm.get(0).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_8().setText(""+tm.get(0).getWindDirection().getCode());
							f2.getLabel_Celsius_1().setText("");
							f2.getLabel_percentuale1().setText("");
							f2.getLabel_hPa1().setText("");
							f2.getLabel_1().setText("");
							f2.getLabel_2().setText("");
							f2.getLabel_Celsius_2().setText("");
							f2.getLabel_percentuale2().setText("");
							f2.getLabel_hPa2().setText("");
							f2.getLabel_3().setText("");
							f2.getLabel_Celsius_3().setText("");
							f2.getLabel_percentuale3().setText("");
							f2.getLabel_hPa3().setText("");
							f2.getLabel_4().setText("");
							f2.getLabel_Celsius_4().setText("");
							f2.getLabel_percentuale4().setText("");
							f2.getLabel_hPa4().setText("");
							f2.getLabel_5().setText("");
							f2.getLabel_Celsius_5().setText("");
							f2.getLabel_percentuale5().setText("");
							f2.getLabel_hPa5().setText("");
							f2.getLabel_6().setText("");
							f2.getLabel_Celsius_6().setText("");
							f2.getLabel_percentuale6().setText("");
							f2.getLabel_hPa6().setText("");
							f2.getLabel_7().setText("");
							f2.getLabel_Celsius_7().setText("");
							f2.getLabel_percentuale7().setText("");
							f2.getLabel_hPa7().setText("");
							break;	
						}
						if(orainizio==21) {
							i=0;
							giornoinizio++;
						}else {
							i=orainizio+3;
							j++;
							while(i<24) {
								tempo=tm.get(j).getSymbol().getName();
								tempodescr=tm.get(j).getSymbol().getName();
								switch(i){
								case 3:
									if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
										tempo=tempo+" notte";
									}
									if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
										pioggia_giorno_1++;
									}
									if(tempo.equals("neve")||tempo.equals("neve moderata")) {
										neve_giorno_1++;
									}
									icon=this.setIcona(tempo);
									f2.getLabel_10().setIcon(icon);
									f2.getLabel_descrizione_2().setText(tempodescr);
									f2.getLabel_temperatura_2().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
									f2.getLabel_Umidita2().setText(""+tm.get(j).getHumidity().getValue().intValue());
									f2.getLabel_Pressione_2().setText(""+tm.get(j).getPressure().getValue().doubleValue());
									f2.getLabel_Velocitavento_2().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
									f2.getLabel_Direzione_2().setText(""+tm.get(j).getWindDirection().getCode());
									break;
								case 6:
									if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
										tempo=tempo+" notte";
									}
									if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
										pioggia_giorno_1++;
									}
									if(tempo.equals("neve")||tempo.equals("neve moderata")) {
										neve_giorno_1++;
									}
									icon=this.setIcona(tempo);
									f2.getLabel_11().setIcon(icon);
									f2.getLabel_descrizione_3().setText(tempodescr);
									f2.getLabel_temperatura_3().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
									f2.getLabel_Umidita3().setText(""+tm.get(j).getHumidity().getValue().intValue());
									f2.getLabel_Pressione_3().setText(""+tm.get(j).getPressure().getValue().doubleValue());
									f2.getLabel_Velocitavento_3().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
									f2.getLabel_Direzione_3().setText(""+tm.get(j).getWindDirection().getCode());
									break;
								case 9:
									if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
										tempo=tempo+" giorno";
									}
									if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
										pioggia_giorno_1++;
									}
									if(tempo.equals("neve")||tempo.equals("neve moderata")) {
										neve_giorno_1++;
									}
									icon=this.setIcona(tempo);
									f2.getLabel_12().setIcon(icon);
									f2.getLabel_descrizione_4().setText(tempodescr);
									f2.getLabel_temperatura_4().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
									f2.getLabel_Umidita4().setText(""+tm.get(j).getHumidity().getValue().intValue());
									f2.getLabel_Pressione_4().setText(""+tm.get(j).getPressure().getValue().doubleValue());
									f2.getLabel_Velocitavento_4().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
									f2.getLabel_Direzione_4().setText(""+tm.get(j).getWindDirection().getCode());
									break;
								case 12:
									if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
										tempo=tempo+" giorno";
									}
									if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
										pioggia_giorno_1++;
									}
									if(tempo.equals("neve")||tempo.equals("neve moderata")) {
										neve_giorno_1++;
									}
									icon=this.setIcona(tempo);
									f2.getLabel_13().setIcon(icon);
									f2.getLabel_descrizione_5().setText(tempodescr);
									f2.getLabel_temperatura_5().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
									f2.getLabel_Umidita5().setText(""+tm.get(j).getHumidity().getValue().intValue());
									f2.getLabel_Pressione_5().setText(""+tm.get(j).getPressure().getValue().doubleValue());
									f2.getLabel_Velocitavento_5().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
									f2.getLabel_Direzione_5().setText(""+tm.get(j).getWindDirection().getCode());
									break;
								case 15:
									if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
										tempo=tempo+" giorno";
									}
									if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
										pioggia_giorno_1++;
									}
									if(tempo.equals("neve")||tempo.equals("neve moderata")) {
										neve_giorno_1++;
									}
									icon=this.setIcona(tempo);
									f2.getLabel_14().setIcon(icon);
									f2.getLabel_descrizione_6().setText(tempodescr);
									f2.getLabel_temperatura_6().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
									f2.getLabel_Umidita6().setText(""+tm.get(j).getHumidity().getValue().intValue());
									f2.getLabel_Pressione_6().setText(""+tm.get(j).getPressure().getValue().doubleValue());
									f2.getLabel_Velocitavento_6().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
									f2.getLabel_Direzione_6().setText(""+tm.get(j).getWindDirection().getCode());							
									break;
								case 18:
									if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
										tempo=tempo+" giorno";
									}
									if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
										pioggia_giorno_1++;
									}
									if(tempo.equals("neve")||tempo.equals("neve moderata")) {
										neve_giorno_1++;
									}
									icon=this.setIcona(tempo);
									f2.getLabel_15().setIcon(icon);
									f2.getLabel_descrizione_7().setText(tempodescr);
									f2.getLabel_temperatura_7().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
									f2.getLabel_Umidita7().setText(""+tm.get(j).getHumidity().getValue().intValue());
									f2.getLabel_Pressione_7().setText(""+tm.get(j).getPressure().getValue().doubleValue());
									f2.getLabel_Velocitavento_7().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
									f2.getLabel_Direzione_7().setText(""+tm.get(j).getWindDirection().getCode());
									
									break;
								case 21:
									if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
										tempo=tempo+" notte";
									}
									if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
										pioggia_giorno_1++;
									}
									if(tempo.equals("neve")||tempo.equals("neve moderata")) {
										neve_giorno_1++;
									}
									icon=this.setIcona(tempo);
									f2.getLabel_16().setIcon(icon);
									f2.getLabel_descrizione_8().setText(tempodescr);
									f2.getLabel_temperatura_8().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
									f2.getLabel_Umidita8().setText(""+tm.get(j).getHumidity().getValue().intValue());
									f2.getLabel_Pressione_8().setText(""+tm.get(j).getPressure().getValue().doubleValue());
									f2.getLabel_Velocitavento_8().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
									f2.getLabel_Direzione_8().setText(""+tm.get(j).getWindDirection().getCode());
									break;	
								}
								i+=3;
								j++;
							}
						}
						//SETTAGGIO SECONDO GIORNO
						i=0;
						while(i<24) {
							tempo=tm.get(j).getSymbol().getName();
							tempodescr=tm.get(j).getSymbol().getName();
							switch(i){
							case 0:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_2++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_2++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_25().setIcon(icon);
								f2.getLabel_descrizione9().setText(tempodescr);
								f2.getLabel_temperatura_9().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita9().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_9().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_9().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_9().setText(""+tm.get(j).getWindDirection().getCode());								
								break;
							case 3:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_2++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_2++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_26().setIcon(icon);
								f2.getLabel_descrizione10().setText(tempodescr);
								f2.getLabel_temperatura_10().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita10().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_10().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_10().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_10().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 6:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_2++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_2++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_27().setIcon(icon);
								f2.getLabel_descrizione11().setText(tempodescr);
								f2.getLabel_temperatura_11().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita11().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_11().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_11().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_11().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 9:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_2++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_2++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_28().setIcon(icon);
								f2.getLabel_descrizione12().setText(tempodescr);
								f2.getLabel_temperatura_12().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita12().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_12().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_12().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_12().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 12:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_2++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_2++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_29().setIcon(icon);
								f2.getLabel_descrizione13().setText(tempodescr);
								f2.getLabel_temperatura_13().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita13().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_13().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_13().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_13().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 15:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_2++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_2++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_30().setIcon(icon);
								f2.getLabel_descrizione14().setText(tempodescr);
								f2.getLabel_temperatura_14().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita14().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_14().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_14().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_14().setText(""+tm.get(j).getWindDirection().getCode());		
								break;
							case 18:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_2++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_2++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_31().setIcon(icon);
								f2.getLabel_descrizione15().setText(tempodescr);
								f2.getLabel_temperatura_15().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita15().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_15().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_15().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_15().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 21:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_2++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_2++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_32().setIcon(icon);
								f2.getLabel_descrizione16().setText(tempodescr);
								f2.getLabel_temperatura_16().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita16().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_16().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_16().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_16().setText(""+tm.get(j).getWindDirection().getCode());
								break;	
							}
							i+=3;
							j++;							
						}
						//SETTAGGIO TERZO GIORNO
						i=0;
						while(i<24) {
							tempo=tm.get(j).getSymbol().getName();
							tempodescr=tm.get(j).getSymbol().getName();
							switch(i){
							case 0:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_3++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_3++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_42().setIcon(icon);
								f2.getLabel_descrizione17().setText(tempodescr);
								f2.getLabel_temperatura_17().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita17().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_17().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_17().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_17().setText(""+tm.get(j).getWindDirection().getCode());								
								break;
							case 3:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_3++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_3++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_43().setIcon(icon);
								f2.getLabel_descrizione18().setText(tempodescr);
								f2.getLabel_temperatura_18().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita18().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_18().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_18().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_18().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 6:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_3++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_3++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_44().setIcon(icon);
								f2.getLabel_descrizione19().setText(tempodescr);
								f2.getLabel_temperatura_19().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita19().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_19().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_19().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_19().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 9:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_3++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_3++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_45().setIcon(icon);
								f2.getLabel_descrizione20().setText(tempodescr);
								f2.getLabel_temperatura_20().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita20().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_20().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_20().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_20().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 12:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_3++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_3++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_46().setIcon(icon);
								f2.getLabel_descrizione21().setText(tempodescr);
								f2.getLabel_temperatura_21().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita21().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_21().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_21().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_21().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 15:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_3++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_3++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_47().setIcon(icon);
								f2.getLabel_descrizione22().setText(tempodescr);
								f2.getLabel_temperatura_22().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita22().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_22().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_22().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_22().setText(""+tm.get(j).getWindDirection().getCode());		
								break;
							case 18:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_3++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_3++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_48().setIcon(icon);
								f2.getLabel_descrizione23().setText(tempodescr);
								f2.getLabel_temperatura_23().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita23().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_23().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_23().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_23().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 21:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_3++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_3++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_49().setIcon(icon);
								f2.getLabel_descrizione24().setText(tempodescr);
								f2.getLabel_temperatura_24().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita24().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_24().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_24().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_24().setText(""+tm.get(j).getWindDirection().getCode());
								break;	
							}
							i+=3;
							j++;							
						}
						//SETTAGGIO QUARTO GIORNO
						i=0;
						while(i<24) {
							tempo=tm.get(j).getSymbol().getName();
							tempodescr=tm.get(j).getSymbol().getName();
							switch(i){
							case 0:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_4++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_4++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_58().setIcon(icon);
								f2.getLabel_descrizione25().setText(tempodescr);
								f2.getLabel_temperatura_25().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita25().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_25().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_25().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_25().setText(""+tm.get(j).getWindDirection().getCode());								
								break;
							case 3:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_4++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_4++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_59().setIcon(icon);
								f2.getLabel_descrizione26().setText(tempodescr);
								f2.getLabel_temperatura_26().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita26().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_26().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_26().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_26().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 6:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_4++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_4++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_60().setIcon(icon);
								f2.getLabel_descrizione27().setText(tempodescr);
								f2.getLabel_temperatura_27().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita27().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_27().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_27().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_27().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 9:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_4++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_4++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_61().setIcon(icon);
								f2.getLabel_descrizione28().setText(tempodescr);
								f2.getLabel_temperatura_28().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita28().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_28().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_28().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_28().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 12:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_4++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_4++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_62().setIcon(icon);
								f2.getLabel_descrizione29().setText(tempodescr);
								f2.getLabel_temperatura_29().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita29().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_29().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_29().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_29().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 15:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_4++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_4++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_63().setIcon(icon);
								f2.getLabel_descrizione30().setText(tempodescr);
								f2.getLabel_temperatura_30().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita30().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_30().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_30().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_30().setText(""+tm.get(j).getWindDirection().getCode());		
								break;
							case 18:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_4++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_4++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_64().setIcon(icon);
								f2.getLabel_descrizione31().setText(tempodescr);
								f2.getLabel_temperatura_31().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita31().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_31().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_31().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_31().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 21:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_4++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_4++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_65().setIcon(icon);
								f2.getLabel_descrizione32().setText(tempodescr);
								f2.getLabel_temperatura_32().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita32().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_32().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_32().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_32().setText(""+tm.get(j).getWindDirection().getCode());
								break;	
							}
							i+=3;
							j++;							
						}
						//SETTAGGIO ULTIMO GIORNO
						i=0;
						while(i<24&&j<dim) {
							tempo=tm.get(j).getSymbol().getName();
							tempodescr=tm.get(j).getSymbol().getName();
							switch(i){
							case 0:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_5++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_5++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_74().setIcon(icon);
								f2.getLabel_descrizione33().setText(tempodescr);
								f2.getLabel_temperatura_33().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita33().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_33().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_33().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_33().setText(""+tm.get(j).getWindDirection().getCode());								
								break;
							case 3:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_5++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_5++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_75().setIcon(icon);
								f2.getLabel_descrizione34().setText(tempodescr);
								f2.getLabel_temperatura_34().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita34().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_34().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_34().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_34().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 6:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_5++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_5++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_76().setIcon(icon);
								f2.getLabel_descrizione35().setText(tempodescr);
								f2.getLabel_temperatura_35().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita35().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_35().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_35().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_35().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 9:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_5++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_5++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_77().setIcon(icon);
								f2.getLabel_descrizione36().setText(tempodescr);
								f2.getLabel_temperatura_36().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita36().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_36().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_36().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_36().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 12:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_5++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_5++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_78().setIcon(icon);
								f2.getLabel_descrizione37().setText(tempodescr);
								f2.getLabel_temperatura_37().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita37().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_37().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_37().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_37().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 15:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_5++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_5++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_79().setIcon(icon);
								f2.getLabel_descrizione38().setText(tempodescr);
								f2.getLabel_temperatura_38().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita38().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_38().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_38().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_38().setText(""+tm.get(j).getWindDirection().getCode());		
								break;
							case 18:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" giorno";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_5++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_5++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_80().setIcon(icon);
								f2.getLabel_descrizione39().setText(tempodescr);
								f2.getLabel_temperatura_39().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita39().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_39().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_39().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_39().setText(""+tm.get(j).getWindDirection().getCode());
								break;
							case 21:
								if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
									tempo=tempo+" notte";
								}
								if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
									pioggia_giorno_5++;
								}
								if(tempo.equals("neve")||tempo.equals("neve moderata")) {
									neve_giorno_5++;
								}
								icon=this.setIcona(tempo);
								f2.getLabel_81().setIcon(icon);
								f2.getLabel_descrizione40().setText(tempodescr);
								f2.getLabel_temperatura_40().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
								f2.getLabel_Umidita40().setText(""+tm.get(j).getHumidity().getValue().intValue());
								f2.getLabel_Pressione_40().setText(""+tm.get(j).getPressure().getValue().doubleValue());
								f2.getLabel_Velocitavento_40().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
								f2.getLabel_Direzione_40().setText(""+tm.get(j).getWindDirection().getCode());
								break;	
							}
							i=i+3;
							j++;							
						}
						switch(i){
						case 0:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" notte";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_5++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_5++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_74().setIcon(icon);
							f2.getLabel_descrizione33().setText(tempodescr);
							f2.getLabel_temperatura_33().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita33().setText(""+tm.get(j).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_33().setText(""+tm.get(j).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_33().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_33().setText(""+tm.get(j).getWindDirection().getCode());
							f2.getLabel_67().setText("");
							f2.getLabel_68().setText("");
							f2.getLabel_69().setText("");
							f2.getLabel_70().setText("");
							f2.getLabel_71().setText("");
							f2.getLabel_72().setText("");
							f2.getLabel_73().setText("");
							f2.getLabel_Celsius_34().setText("");
							f2.getLabel_Celsius_35().setText("");
							f2.getLabel_Celsius_36().setText("");
							f2.getLabel_Celsius_37().setText("");
							f2.getLabel_Celsius_38().setText("");
							f2.getLabel_Celsius_39().setText("");
							f2.getLabel_Celsius_40().setText("");
							f2.getLabel_percentuale34().setText("");							
							f2.getLabel_percentuale35().setText("");
							f2.getLabel_percentuale36().setText("");
							f2.getLabel_percentuale37().setText("");
							f2.getLabel_percentuale38().setText("");
							f2.getLabel_percentuale39().setText("");
							f2.getLabel_percentuale40().setText("");
							f2.getLabel_hPa34().setText("");
							f2.getLabel_hPa35().setText("");
							f2.getLabel_hPa36().setText("");
							f2.getLabel_hPa37().setText("");
							f2.getLabel_hPa38().setText("");
							f2.getLabel_hPa39().setText("");
							f2.getLabel_hPa40().setText("");
							break;
						case 3:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" notte";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_5++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_5++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_75().setIcon(icon);
							f2.getLabel_descrizione34().setText(tempodescr);
							f2.getLabel_temperatura_34().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita34().setText(""+tm.get(j).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_34().setText(""+tm.get(j).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_34().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_34().setText(""+tm.get(j).getWindDirection().getCode());
							f2.getLabel_68().setText("");
							f2.getLabel_69().setText("");
							f2.getLabel_70().setText("");
							f2.getLabel_71().setText("");
							f2.getLabel_72().setText("");
							f2.getLabel_73().setText("");
							f2.getLabel_Celsius_35().setText("");
							f2.getLabel_Celsius_36().setText("");
							f2.getLabel_Celsius_37().setText("");
							f2.getLabel_Celsius_38().setText("");
							f2.getLabel_Celsius_39().setText("");
							f2.getLabel_Celsius_40().setText("");							
							f2.getLabel_percentuale35().setText("");
							f2.getLabel_percentuale36().setText("");
							f2.getLabel_percentuale37().setText("");
							f2.getLabel_percentuale38().setText("");
							f2.getLabel_percentuale39().setText("");
							f2.getLabel_percentuale40().setText("");
							f2.getLabel_hPa35().setText("");
							f2.getLabel_hPa36().setText("");
							f2.getLabel_hPa37().setText("");
							f2.getLabel_hPa38().setText("");
							f2.getLabel_hPa39().setText("");
							f2.getLabel_hPa40().setText("");
							break;
						case 6:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" notte";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_5++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_5++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_76().setIcon(icon);
							f2.getLabel_descrizione35().setText(tempodescr);
							f2.getLabel_temperatura_35().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita35().setText(""+tm.get(j).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_35().setText(""+tm.get(j).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_35().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_35().setText(""+tm.get(j).getWindDirection().getCode());
							f2.getLabel_69().setText("");
							f2.getLabel_70().setText("");
							f2.getLabel_71().setText("");
							f2.getLabel_72().setText("");
							f2.getLabel_73().setText("");
							f2.getLabel_Celsius_36().setText("");
							f2.getLabel_Celsius_37().setText("");
							f2.getLabel_Celsius_38().setText("");
							f2.getLabel_Celsius_39().setText("");
							f2.getLabel_Celsius_40().setText("");
							f2.getLabel_percentuale36().setText("");
							f2.getLabel_percentuale37().setText("");
							f2.getLabel_percentuale38().setText("");
							f2.getLabel_percentuale39().setText("");
							f2.getLabel_percentuale40().setText("");
							f2.getLabel_hPa36().setText("");
							f2.getLabel_hPa37().setText("");
							f2.getLabel_hPa38().setText("");
							f2.getLabel_hPa39().setText("");
							f2.getLabel_hPa40().setText("");
							break;
						case 9:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" giorno";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_5++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_5++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_77().setIcon(icon);
							f2.getLabel_descrizione36().setText(tempodescr);
							f2.getLabel_temperatura_36().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita36().setText(""+tm.get(j).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_36().setText(""+tm.get(j).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_36().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_36().setText(""+tm.get(j).getWindDirection().getCode());
							f2.getLabel_70().setText("");
							f2.getLabel_71().setText("");
							f2.getLabel_72().setText("");
							f2.getLabel_73().setText("");
							f2.getLabel_Celsius_37().setText("");
							f2.getLabel_Celsius_38().setText("");
							f2.getLabel_Celsius_39().setText("");
							f2.getLabel_Celsius_40().setText("");
							f2.getLabel_percentuale37().setText("");
							f2.getLabel_percentuale38().setText("");
							f2.getLabel_percentuale39().setText("");
							f2.getLabel_percentuale40().setText("");
							f2.getLabel_hPa37().setText("");
							f2.getLabel_hPa38().setText("");
							f2.getLabel_hPa39().setText("");
							f2.getLabel_hPa40().setText("");
							break;
						case 12:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" giorno";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_5++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_5++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_78().setIcon(icon);
							f2.getLabel_descrizione37().setText(tempodescr);
							f2.getLabel_temperatura_37().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita37().setText(""+tm.get(j).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_37().setText(""+tm.get(j).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_37().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_37().setText(""+tm.get(j).getWindDirection().getCode());
							f2.getLabel_71().setText("");
							f2.getLabel_72().setText("");
							f2.getLabel_73().setText("");
							f2.getLabel_Celsius_38().setText("");
							f2.getLabel_Celsius_39().setText("");
							f2.getLabel_Celsius_40().setText("");
							f2.getLabel_percentuale38().setText("");
							f2.getLabel_percentuale39().setText("");
							f2.getLabel_percentuale40().setText("");
							f2.getLabel_hPa38().setText("");
							f2.getLabel_hPa39().setText("");
							f2.getLabel_hPa40().setText("");
							break;
						case 15:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" giorno";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_5++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_5++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_79().setIcon(icon);
							f2.getLabel_descrizione38().setText(tempodescr);
							f2.getLabel_temperatura_38().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita38().setText(""+tm.get(j).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_38().setText(""+tm.get(j).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_38().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_38().setText(""+tm.get(j).getWindDirection().getCode());	
							f2.getLabel_72().setText("");
							f2.getLabel_73().setText("");
							f2.getLabel_Celsius_39().setText("");
							f2.getLabel_Celsius_40().setText("");
							f2.getLabel_percentuale39().setText("");
							f2.getLabel_percentuale40().setText("");
							f2.getLabel_hPa39().setText("");
							f2.getLabel_hPa40().setText("");
							break;
						case 18:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" giorno";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_5++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_5++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_80().setIcon(icon);
							f2.getLabel_descrizione39().setText(tempodescr);
							f2.getLabel_temperatura_39().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita39().setText(""+tm.get(j).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_39().setText(""+tm.get(j).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_39().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_39().setText(""+tm.get(j).getWindDirection().getCode());
							f2.getLabel_73().setText("");
							f2.getLabel_Celsius_40().setText("");
							f2.getLabel_percentuale40().setText("");
							f2.getLabel_hPa40().setText("");
							break;
						case 21:
							if(tempo.equals("cielo sereno")||tempo.equals("poche nuvole")||tempo.equals("nubi sparse")) {
								tempo=tempo+" notte";
							}
							if(tempo.equals("pioggia leggera")||tempo.equals("pioggia moderata")||tempo.equals("forte pioggia")) {
								pioggia_giorno_5++;
							}
							if(tempo.equals("neve")||tempo.equals("neve moderata")) {
								neve_giorno_5++;
							}
							icon=this.setIcona(tempo);
							f2.getLabel_81().setIcon(icon);
							f2.getLabel_descrizione40().setText(tempodescr);
							f2.getLabel_temperatura_40().setText(""+tm.get(j).getTemperature().getValue().doubleValue());
							f2.getLabel_Umidita40().setText(""+tm.get(j).getHumidity().getValue().intValue());
							f2.getLabel_Pressione_40().setText(""+tm.get(j).getPressure().getValue().doubleValue());
							f2.getLabel_Velocitavento_40().setText(""+tm.get(j).getWindSpeed().getMps().doubleValue());
							f2.getLabel_Direzione_40().setText(""+tm.get(j).getWindDirection().getCode());
							break;	
						}
						f2.setLblNomeCitta(f.getTextField_Citta().getText());
						f.setVisible(false);
						f2.getTabbedPane().setSelectedIndex(0);
						f2.setVisible(true);
					} catch (JAXBException e1) {
						e1.printStackTrace();
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}
		//Gestione bottone cerca un'altra città
		if(e.getSource()==f2.getBtnCerca_Città()) {
			f2.setVisible(false);
			f.getTextField_Citta().setText("");
			f.setVisible(true);
		}
		if(e.getSource()==f2.getBtnAvviso()) {
			Avviso();
		}
	}
	public ImageIcon setIcona(String tempo) {
		switch(tempo) {
		case "cielo sereno giorno":
			icon=new ImageIcon("sereno_giorno.png");
			break;
		case "cielo sereno notte":
			icon=new ImageIcon("sereno_notte.png");
			break;
		case "nubi sparse giorno":case "poche nuvole giorno":
			icon=new ImageIcon("poconuvoloso_giorno.png");
			break;
		case "nubi sparse notte":case "poche nuvole notte":
			icon=new ImageIcon("poconuvoloso_notte.png");
			break;
		case "pioggia leggera":
			icon=new ImageIcon("pioggiadebole.png");
			break;
		case "pioggia moderata":
			icon=new ImageIcon("pioggiamoderata.png");
			break;
		case "forte pioggia":
			icon=new ImageIcon("pioggiaforte.png");
			break;
		case "neve debole":
			icon=new ImageIcon("nevedebole.png");
			break;
		case "neve":
			icon=new ImageIcon("nevemoderata.png");
			break;
		case "velature":
			icon=new ImageIcon("cielo_velato_giorno.png");
			break;
		}
		return icon;
	}
	
	public void Avviso() {
		if(f2.getTabbedPane().getSelectedIndex()==0) {
			if(pioggia_giorno_1>3) {
				JOptionPane.showMessageDialog(f2, "Oggi è prevista pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}
			if(neve_giorno_1>3) {
				JOptionPane.showMessageDialog(f2, "Oggi è prevista una nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo pesante", "Avviso", 1);
			}
			if(pioggia_giorno_1==0&&neve_giorno_1==0) {
				JOptionPane.showMessageDialog(f2, "Oggi è prevista una giornata tranquilla senza eventi signifivativi", "Avviso", 1);
			}
					
			if(pioggia_giorno_1>0&&pioggia_giorno_1<3) {
				JOptionPane.showMessageDialog(f2, "Oggi è prevista leggera pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}else {
					if(neve_giorno_1>0&&neve_giorno_1<3) {
				JOptionPane.showMessageDialog(f2, "Oggi è prevista una leggera nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo pesante", "Avviso", 1);
				}
			}
		}
		if(f2.getTabbedPane().getSelectedIndex()==1) {
			if(pioggia_giorno_2>3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(1)+" è prevista pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}
			if(neve_giorno_2>3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(1)+" è prevista una nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo pesante", "Avviso", 1);
			}
			if(pioggia_giorno_2==0&&neve_giorno_2==0) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(1)+" è prevista una giornata tranquilla senza eventi signifivativi", "Avviso", 1);
			}
					
			if(pioggia_giorno_2>0&&pioggia_giorno_2<3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(1)+" è prevista leggera pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}
			if(neve_giorno_2>0&&neve_giorno_2<3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(1)+" è prevista una leggera nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo psante", "Avviso", 1);
			}
		}
		if(f2.getTabbedPane().getSelectedIndex()==2) {
			if(pioggia_giorno_3>3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(2)+" è prevista pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}
			if(neve_giorno_3>3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(2)+" è prevista una nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo pesante", "Avviso", 1);
			}
			if(pioggia_giorno_3==0&&neve_giorno_3==0) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(2)+" è prevista una giornata tranquilla senza eventi signifivativi", "Avviso", 1);
			}
					
			if(pioggia_giorno_3>0&&pioggia_giorno_3<3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(2)+" è prevista leggera pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}
			if(neve_giorno_3>0&&neve_giorno_3<3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(2)+" è prevista una leggera nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo pesante", "Avviso", 1);
			}
		}
		if(f2.getTabbedPane().getSelectedIndex()==3) {
			if(pioggia_giorno_4>3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(3)+" è prevista pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}
			if(neve_giorno_4>3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(3)+" è prevista una nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo pesante", "Avviso", 1);
			}
			if(pioggia_giorno_4==0&&neve_giorno_4==0) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(3)+" è prevista una giornata tranquilla senza eventi signifivativi", "Avviso", 1);
			}
			if(pioggia_giorno_4>0&&pioggia_giorno_4<3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(3)+" è prevista leggera pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}
			if(neve_giorno_4>0&&neve_giorno_4<3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(3)+" è prevista una leggera nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo pesante", "Avviso", 1);
			}
		}
		if(f2.getTabbedPane().getSelectedIndex()==4) {
			if(pioggia_giorno_5>3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(4)+" è prevista pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}
			if(neve_giorno_5>3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(4)+" è prevista una nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo pesante", "Avviso", 1);
			}
			if(pioggia_giorno_5==0&&neve_giorno_5==0) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(4)+" è prevista una giornata tranquilla senza eventi signifivativi", "Avviso", 1);
			}
					
			if(pioggia_giorno_5>0&&pioggia_giorno_5<3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(4)+" è prevista leggera pioggia, si consiglia di portare con sé l'ombrello", "Avviso", 1);
			}
			if(neve_giorno_5>0&&neve_giorno_5<3) {
				JOptionPane.showMessageDialog(f2, "Il giorno"+f2.getTabbedPane().getTitleAt(4)+" è prevista una leggera nevicata, si consiglia di portare con sé l'ombrello e di vestirsi in modo pesante", "Avviso", 1);
			}
		}
	}
}
