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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task"&gt;
 *                         A single task assigned to a user as part of a plan.
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
 *         &lt;element name="date-started" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}stringnznw"/>
 *         &lt;element name="short-description" type="{urn:com.microsoft.wc.thing.types}string128"/>
 *         &lt;element name="long-description" type="{urn:com.microsoft.wc.thing.types}stringnznw"/>
 *         &lt;element name="is-reminder-enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:com.microsoft.wc.thing.task}task-status"/>
 *         &lt;element name="type" type="{urn:com.microsoft.wc.thing.types}guid" minOccurs="0"/>
 *         &lt;element name="schedules" type="{urn:com.microsoft.wc.thing.task}task-schedules" minOccurs="0"/>
 *         &lt;element name="tracking-policy" type="{urn:com.microsoft.wc.thing.task}task-tracking-policy" minOccurs="0"/>
 *         &lt;element name="associated-objective-ids" type="{urn:com.microsoft.wc.thing.task}guids" minOccurs="0"/>
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
    "dateStarted",
    "name",
    "shortDescription",
    "longDescription",
    "isReminderEnabled",
    "status",
    "type",
    "schedules",
    "trackingPolicy",
    "associatedObjectiveIds"
})
@XmlRootElement(name = "task", namespace = "urn:com.microsoft.wc.thing.task")
public class Task {

    @XmlElement(name = "date-started", required = true)
    protected DateTime dateStarted;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "short-description", required = true)
    protected String shortDescription;
    @XmlElement(name = "long-description", required = true)
    protected String longDescription;
    @XmlElement(name = "is-reminder-enabled")
    protected Boolean isReminderEnabled;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TaskStatus status;
    protected String type;
    protected TaskSchedules schedules;
    @XmlElement(name = "tracking-policy")
    protected TaskTrackingPolicy trackingPolicy;
    @XmlElement(name = "associated-objective-ids")
    protected Guids associatedObjectiveIds;

    /**
     * Gets the value of the dateStarted property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateStarted() {
        return dateStarted;
    }

    /**
     * Sets the value of the dateStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateStarted(DateTime value) {
        this.dateStarted = value;
    }

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
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the isReminderEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReminderEnabled() {
        return isReminderEnabled;
    }

    /**
     * Sets the value of the isReminderEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReminderEnabled(Boolean value) {
        this.isReminderEnabled = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TaskStatus }
     *     
     */
    public TaskStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskStatus }
     *     
     */
    public void setStatus(TaskStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the schedules property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSchedules }
     *     
     */
    public TaskSchedules getSchedules() {
        return schedules;
    }

    /**
     * Sets the value of the schedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSchedules }
     *     
     */
    public void setSchedules(TaskSchedules value) {
        this.schedules = value;
    }

    /**
     * Gets the value of the trackingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link TaskTrackingPolicy }
     *     
     */
    public TaskTrackingPolicy getTrackingPolicy() {
        return trackingPolicy;
    }

    /**
     * Sets the value of the trackingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskTrackingPolicy }
     *     
     */
    public void setTrackingPolicy(TaskTrackingPolicy value) {
        this.trackingPolicy = value;
    }

    /**
     * Gets the value of the associatedObjectiveIds property.
     * 
     * @return
     *     possible object is
     *     {@link Guids }
     *     
     */
    public Guids getAssociatedObjectiveIds() {
        return associatedObjectiveIds;
    }

    /**
     * Sets the value of the associatedObjectiveIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guids }
     *     
     */
    public void setAssociatedObjectiveIds(Guids value) {
        this.associatedObjectiveIds = value;
    }

}
