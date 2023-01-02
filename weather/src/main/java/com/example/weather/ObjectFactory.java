
package com.example.weather;

import javax.xml.namespace.QName;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml package. 
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

    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Phenomenon_QNAME = new QName("", "phenomenon");
    private final static QName _Tempmin_QNAME = new QName("", "tempmin");
    private final static QName _Direction_QNAME = new QName("", "direction");
    private final static QName _Speedmin_QNAME = new QName("", "speedmin");
    private final static QName _Speedmax_QNAME = new QName("", "speedmax");
    private final static QName _Gust_QNAME = new QName("", "gust");
    private final static QName _Tempmax_QNAME = new QName("", "tempmax");
    private final static QName _Text_QNAME = new QName("", "text");
    private final static QName _Sea_QNAME = new QName("", "sea");
    private final static QName _Peipsi_QNAME = new QName("", "peipsi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link Wind }
     * 
     */
    public Wind createWind() {
        return new Wind();
    }

    /**
     * Create an instance of {@link Night }
     * 
     */
    public Night createNight() {
        return new Night();
    }

    /**
     * Create an instance of {@link Day }
     * 
     */
    public Day createDay() {
        return new Day();
    }

    /**
     * Create an instance of {@link Forecast }
     * 
     */
    public Forecast createForecast() {
        return new Forecast();
    }

    /**
     * Create an instance of {@link Forecasts }
     * 
     */
    public Forecasts createForecasts() {
        return new Forecasts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "phenomenon")
    public JAXBElement<String> createPhenomenon(String value) {
        return new JAXBElement<String>(_Phenomenon_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tempmin")
    public JAXBElement<String> createTempmin(String value) {
        return new JAXBElement<String>(_Tempmin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "direction")
    public JAXBElement<String> createDirection(String value) {
        return new JAXBElement<String>(_Direction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "speedmin")
    public JAXBElement<String> createSpeedmin(String value) {
        return new JAXBElement<String>(_Speedmin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "speedmax")
    public JAXBElement<String> createSpeedmax(String value) {
        return new JAXBElement<String>(_Speedmax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "gust")
    public JAXBElement<String> createGust(String value) {
        return new JAXBElement<String>(_Gust_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tempmax")
    public JAXBElement<String> createTempmax(String value) {
        return new JAXBElement<String>(_Tempmax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sea")
    public JAXBElement<String> createSea(String value) {
        return new JAXBElement<String>(_Sea_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "peipsi")
    public JAXBElement<String> createPeipsi(String value) {
        return new JAXBElement<String>(_Peipsi_QNAME, String.class, null, value);
    }

}
