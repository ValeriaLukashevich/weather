
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
 *         &lt;element ref="{}direction"/&gt;
 *         &lt;element ref="{}speedmin"/&gt;
 *         &lt;element ref="{}speedmax"/&gt;
 *         &lt;element ref="{}gust"/&gt;
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
    "direction",
    "speedmin",
    "speedmax",
    "gust"
})
@XmlRootElement(name = "wind")
public class Wind {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String direction;
    @XmlElement(required = true)
    protected String speedmin;
    @XmlElement(required = true)
    protected String speedmax;
    @XmlElement(required = true)
    protected String gust;

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
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the speedmin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedmin() {
        return speedmin;
    }

    /**
     * Sets the value of the speedmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedmin(String value) {
        this.speedmin = value;
    }

    /**
     * Gets the value of the speedmax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedmax() {
        return speedmax;
    }

    /**
     * Sets the value of the speedmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedmax(String value) {
        this.speedmax = value;
    }

    /**
     * Gets the value of the gust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGust() {
        return gust;
    }

    /**
     * Sets the value of the gust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGust(String value) {
        this.gust = value;
    }

}
