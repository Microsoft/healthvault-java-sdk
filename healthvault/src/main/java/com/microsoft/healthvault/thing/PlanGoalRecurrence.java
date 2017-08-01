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
import com.microsoft.healthvault.types.CodableValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.care-plan"&gt;
 *                     This sub-type allows specifying recurrence for Goals.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for goal-recurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goal-recurrence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interval" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="times-in-interval" type="{urn:com.microsoft.wc.thing.types}positiveInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal-recurrence", namespace = "urn:com.microsoft.wc.thing.care-plan", propOrder = {
    "interval",
    "timesInInterval"
})
public class PlanGoalRecurrence {

    @XmlElement(required = true)
    protected CodableValue interval;
    @XmlElement(name = "times-in-interval")
    protected int timesInInterval;

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setInterval(CodableValue value) {
        this.interval = value;
    }

    /**
     * Gets the value of the timesInInterval property.
     * 
     */
    public int getTimesInInterval() {
        return timesInInterval;
    }

    /**
     * Sets the value of the timesInInterval property.
     * 
     */
    public void setTimesInInterval(int value) {
        this.timesInInterval = value;
    }

}
