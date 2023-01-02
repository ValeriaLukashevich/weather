
package com.example.weather;

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
 *         &lt;element ref="{}name"/&gt;
 *         &lt;element ref="{}phenomenon"/&gt;
 *         &lt;element ref="{}tempmin" minOccurs="0"/&gt;
 *         &lt;element ref="{}tempmax" minOccurs="0"/&gt;
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
    "name",
    "phenomenon",
    "tempmin",
    "tempmax"
})
@XmlRootElement(name = "place")
public class Place {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String phenomenon;
    protected String tempmin;
    protected String tempmax;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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

}
