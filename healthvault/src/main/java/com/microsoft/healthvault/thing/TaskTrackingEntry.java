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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.dates.DateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task-tracking-entry"&gt;
 *                         Represents a single occasion on which the user performed (or was supposed to perform) a task.
 *                     &lt;/summary&gt;
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
 *         &lt;element name="tracking-time" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="tracking-type" type="{urn:com.microsoft.wc.thing.task-tracking-entry}task-tracking-type"/>
 *         &lt;element name="tracking-status" type="{urn:com.microsoft.wc.thing.task-tracking-entry}task-tracking-status"/>
 *         &lt;element name="occurrence-start-time" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *         &lt;element name="occurrence-end-time" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *         &lt;element name="completion-start-time" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="completion-end-time" type="{urn:com.microsoft.wc.dates}date-time"/>
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
    "trackingTime",
    "trackingType",
    "trackingStatus",
    "occurrenceStartTime",
    "occurrenceEndTime",
    "completionStartTime",
    "completionEndTime"
})
@XmlRootElement(name = "task-tracking-entry", namespace = "urn:com.microsoft.wc.thing.task-tracking-entry")
public class TaskTrackingEntry {

    @XmlElement(name = "tracking-time", required = true)
    protected DateTime trackingTime;
    @XmlElement(name = "tracking-type", required = true)
    @XmlSchemaType(name = "string")
    protected TaskTrackingType trackingType;
    @XmlElement(name = "tracking-status", required = true)
    @XmlSchemaType(name = "string")
    protected TaskTrackingStatus trackingStatus;
    @XmlElement(name = "occurrence-start-time")
    protected DateTime occurrenceStartTime;
    @XmlElement(name = "occurrence-end-time")
    protected DateTime occurrenceEndTime;
    @XmlElement(name = "completion-start-time", required = true)
    protected DateTime completionStartTime;
    @XmlElement(name = "completion-end-time", required = true)
    protected DateTime completionEndTime;

    /**
     * Gets the value of the trackingTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTrackingTime() {
        return trackingTime;
    }

    /**
     * Sets the value of the trackingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTrackingTime(DateTime value) {
        this.trackingTime = value;
    }

    /**
     * Gets the value of the trackingType property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTrackingType }
     *     
     */
    public TaskTrackingType getTrackingType() {
        return trackingType;
    }

    /**
     * Sets the value of the trackingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTrackingType }
     *     
     */
    public void setTrackingType(TaskTrackingType value) {
        this.trackingType = value;
    }

    /**
     * Gets the value of the trackingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTrackingStatus }
     *     
     */
    public TaskTrackingStatus getTrackingStatus() {
        return trackingStatus;
    }

    /**
     * Sets the value of the trackingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTrackingStatus }
     *     
     */
    public void setTrackingStatus(TaskTrackingStatus value) {
        this.trackingStatus = value;
    }

    /**
     * Gets the value of the occurrenceStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOccurrenceStartTime() {
        return occurrenceStartTime;
    }

    /**
     * Sets the value of the occurrenceStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOccurrenceStartTime(DateTime value) {
        this.occurrenceStartTime = value;
    }

    /**
     * Gets the value of the occurrenceEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOccurrenceEndTime() {
        return occurrenceEndTime;
    }

    /**
     * Sets the value of the occurrenceEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOccurrenceEndTime(DateTime value) {
        this.occurrenceEndTime = value;
    }

    /**
     * Gets the value of the completionStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCompletionStartTime() {
        return completionStartTime;
    }

    /**
     * Sets the value of the completionStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCompletionStartTime(DateTime value) {
        this.completionStartTime = value;
    }

    /**
     * Gets the value of the completionEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCompletionEndTime() {
        return completionEndTime;
    }

    /**
     * Sets the value of the completionEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCompletionEndTime(DateTime value) {
        this.completionEndTime = value;
    }

}
