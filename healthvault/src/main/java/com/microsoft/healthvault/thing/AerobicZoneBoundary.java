//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.thing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.aerobic-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     A heart rate zone boundary.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.aerobic-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     The boundary of a heart rate zone may be set as either an
 *                     absolute heart rate (measured in BPM) or as a percentage
 *                     of a person's maximum heart rate.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ZoneBoundary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneBoundary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="absolute-heartrate" type="{urn:com.microsoft.wc.thing.types}positiveInt"/>
 *         &lt;element name="percent-max-heartrate" type="{urn:com.microsoft.wc.thing.types}percentage"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneBoundary", namespace = "urn:com.microsoft.wc.thing.aerobic-profile", propOrder = {
    "absoluteHeartrate",
    "percentMaxHeartrate"
})
public class AerobicZoneBoundary {

    @XmlElement(name = "absolute-heartrate")
    protected Integer absoluteHeartrate;
    @XmlElement(name = "percent-max-heartrate")
    protected Double percentMaxHeartrate;

    /**
     * Gets the value of the absoluteHeartrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAbsoluteHeartrate() {
        return absoluteHeartrate;
    }

    /**
     * Sets the value of the absoluteHeartrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAbsoluteHeartrate(Integer value) {
        this.absoluteHeartrate = value;
    }

    /**
     * Gets the value of the percentMaxHeartrate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentMaxHeartrate() {
        return percentMaxHeartrate;
    }

    /**
     * Sets the value of the percentMaxHeartrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentMaxHeartrate(Double value) {
        this.percentMaxHeartrate = value;
    }

}