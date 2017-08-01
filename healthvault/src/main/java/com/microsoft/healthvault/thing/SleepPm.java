//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.thing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.dates.DateTime;
import com.microsoft.healthvault.types.dates.Time;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:sjpm="urn:com.microsoft.wc.thing.sjpm" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Defines an evening sleep journal.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:sjpm="urn:com.microsoft.wc.thing.sjpm" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         The data items in this schema are adapted from NIH
 *                         publication #06-5271, November 2005, "Your Guide to
 *                         Healthy Sleep", ISBN 1-933236-05-1.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="caffeine" type="{urn:com.microsoft.wc.dates}time" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alcohol" type="{urn:com.microsoft.wc.dates}time" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nap" type="{urn:com.microsoft.wc.thing.sjpm}Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exercise" type="{urn:com.microsoft.wc.thing.sjpm}Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sleepiness">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "when",
    "caffeine",
    "alcohol",
    "nap",
    "exercise",
    "sleepiness"
})
@XmlRootElement(name = "sleep-pm", namespace = "urn:com.microsoft.wc.thing.sjpm")
public class SleepPm {

    @XmlElement(required = true)
    protected DateTime when;
    protected List<Time> caffeine;
    protected List<Time> alcohol;
    protected List<Activity> nap;
    protected List<Activity> exercise;
    protected int sleepiness;

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the caffeine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caffeine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaffeine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Time }
     * 
     * 
     */
    public List<Time> getCaffeine() {
        if (caffeine == null) {
            caffeine = new ArrayList<Time>();
        }
        return this.caffeine;
    }

    /**
     * Gets the value of the alcohol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alcohol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlcohol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Time }
     * 
     * 
     */
    public List<Time> getAlcohol() {
        if (alcohol == null) {
            alcohol = new ArrayList<Time>();
        }
        return this.alcohol;
    }

    /**
     * Gets the value of the nap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getNap() {
        if (nap == null) {
            nap = new ArrayList<Activity>();
        }
        return this.nap;
    }

    /**
     * Gets the value of the exercise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exercise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExercise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getExercise() {
        if (exercise == null) {
            exercise = new ArrayList<Activity>();
        }
        return this.exercise;
    }

    /**
     * Gets the value of the sleepiness property.
     * 
     */
    public int getSleepiness() {
        return sleepiness;
    }

    /**
     * Sets the value of the sleepiness property.
     * 
     */
    public void setSleepiness(int value) {
        this.sleepiness = value;
    }

}
