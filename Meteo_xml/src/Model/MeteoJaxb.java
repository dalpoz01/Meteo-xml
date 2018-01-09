package Model;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class MeteoJaxb {

	public static void main(String[] args) throws MalformedURLException {
		try {

			URL xmlFile = new URL(
					"http://samples.openweathermap.org/data/2.5/weather?q=treviso&mode=xml&appid=b1b15e88fa797225412429c1c50c122a1");
			
			// Inizializzo Jaxb per dire che dovrà leggere l'xml in un certo modo
			JAXBContext jaxbContext = JAXBContext.newInstance(Weatherdata.class);
			// Il unmarshaller è l'oggetto che legge l'xml
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Weatherdata current = (Weatherdata) jaxbUnmarshaller.unmarshal(xmlFile);
			System.out.println(current.getLocation());

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
