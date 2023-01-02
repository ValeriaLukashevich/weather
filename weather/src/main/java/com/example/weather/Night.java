
package com.example.weather;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}phenomenon"/&gt;
 *         &lt;element ref="{}tempmin"/&gt;
 *         &lt;element ref="{}tempmax"/&gt;
 *         &lt;element ref="{}text"/&gt;
 *         &lt;element ref="{}place" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}wind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}sea" minOccurs="0"/&gt;
 *         &lt;element ref="{}peipsi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "phenomenon",
    "tempmin",
    "tempmax",
    "text",
    "place",
    "wind",
    "sea",
    "peipsi"
})
@XmlRootElement(name = "night")
public class Night {

    @XmlElement(required = true)
    protected String phenomenon;
    @XmlElement(required = true)
    protected String tempmin;
    @XmlElement(required = true)
    protected String tempmax;
    @XmlElement(required = true)
    protected String text;

    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<Place> place;

    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<Wind> wind;
    protected String sea;
    protected String peipsi;

    /**
     * Gets the value of the phenomenon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhenomenon() {
        return phenomenon;
    }

    /**
     * Sets the value of the phenomenon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhenomenon(String value) {
        this.phenomenon = value;
    }

    /**
     * Gets the value of the tempmin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempmin() {
        return tempmin;
    }

    /**
     * Sets the value of the tempmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempmin(String value) {
        this.tempmin = value;
    }

    /**
     * Gets the value of the tempmax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempmax() {
        return tempmax;
    }

    /**
     * Sets the value of the tempmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempmax(String value) {
        this.tempmax = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the place property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Place }
     * 
     * 
     */
    public List<Place> getPlace() {
        if (place == null) {
            place = new ArrayList<Place>();
        }
        return this.place;
    }

    /**
     * Gets the value of the wind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the wind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wind }
     * 
     * 
     */
    public List<Wind> getWind() {
        if (wind == null) {
            wind = new ArrayList<Wind>();
        }
        return this.wind;
    }

    /**
     * Gets the value of the sea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSea() {
        return sea;
    }

    /**
     * Sets the value of the sea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSea(String value) {
        this.sea = value;
    }

    /**
     * Gets the value of the peipsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeipsi() {
        return peipsi;
    }

    /**
     * Sets the value of the peipsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeipsi(String value) {
        this.peipsi = value;
    }

}
