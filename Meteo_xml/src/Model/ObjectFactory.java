//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.18 alle 12:04:36 PM CET 
//


package Model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the meteo.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: meteo.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Weatherdata }
     * 
     */
    public Weatherdata createWeatherdata() {
        return new Weatherdata();
    }

    /**
     * Create an instance of {@link Weatherdata.Forecast }
     * 
     */
    public Weatherdata.Forecast createWeatherdataForecast() {
        return new Weatherdata.Forecast();
    }

    /**
     * Create an instance of {@link Weatherdata.Forecast.Time }
     * 
     */
    public Weatherdata.Forecast.Time createWeatherdataForecastTime() {
        return new Weatherdata.Forecast.Time();
    }

    /**
     * Create an instance of {@link Weatherdata.Location }
     * 
     */
    public Weatherdata.Location createWeatherdataLocation() {
        return new Weatherdata.Location();
    }

    /**
     * Create an instance of {@link Weatherdata.Meta }
     * 
     */
    public Weatherdata.Meta createWeatherdataMeta() {
        return new Weatherdata.Meta();
    }

    /**
     * Create an instance of {@link Weatherdata.Sun }
     * 
     */
    public Weatherdata.Sun createWeatherdataSun() {
        return new Weatherdata.Sun();
    }

    /**
     * Create an instance of {@link Weatherdata.Forecast.Time.Symbol }
     * 
     */
    public Weatherdata.Forecast.Time.Symbol createWeatherdataForecastTimeSymbol() {
        return new Weatherdata.Forecast.Time.Symbol();
    }

    /**
     * Create an instance of {@link Weatherdata.Forecast.Time.WindDirection }
     * 
     */
    public Weatherdata.Forecast.Time.WindDirection createWeatherdataForecastTimeWindDirection() {
        return new Weatherdata.Forecast.Time.WindDirection();
    }

    /**
     * Create an instance of {@link Weatherdata.Forecast.Time.WindSpeed }
     * 
     */
    public Weatherdata.Forecast.Time.WindSpeed createWeatherdataForecastTimeWindSpeed() {
        return new Weatherdata.Forecast.Time.WindSpeed();
    }

    /**
     * Create an instance of {@link Weatherdata.Forecast.Time.Temperature }
     * 
     */
    public Weatherdata.Forecast.Time.Temperature createWeatherdataForecastTimeTemperature() {
        return new Weatherdata.Forecast.Time.Temperature();
    }

    /**
     * Create an instance of {@link Weatherdata.Forecast.Time.Pressure }
     * 
     */
    public Weatherdata.Forecast.Time.Pressure createWeatherdataForecastTimePressure() {
        return new Weatherdata.Forecast.Time.Pressure();
    }

    /**
     * Create an instance of {@link Weatherdata.Forecast.Time.Humidity }
     * 
     */
    public Weatherdata.Forecast.Time.Humidity createWeatherdataForecastTimeHumidity() {
        return new Weatherdata.Forecast.Time.Humidity();
    }

    /**
     * Create an instance of {@link Weatherdata.Forecast.Time.Clouds }
     * 
     */
    public Weatherdata.Forecast.Time.Clouds createWeatherdataForecastTimeClouds() {
        return new Weatherdata.Forecast.Time.Clouds();
    }

    /**
     * Create an instance of {@link Weatherdata.Location.Location }
     * 
     */
    public Weatherdata.Location.LocationIn createWeatherdataLocationLocation() {
        return new Weatherdata.Location.LocationIn();
    }

}
