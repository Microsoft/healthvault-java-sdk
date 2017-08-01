//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.core.subscription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.subscription" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Information that is common to all subscriptions.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Common complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Common">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
 *         &lt;element name="notification-authentication-info" type="{urn:com.microsoft.wc.subscription}NotificationAuthenticationInfo"/>
 *         &lt;element name="notification-channel" type="{urn:com.microsoft.wc.subscription}NotificationChannel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Common", namespace = "urn:com.microsoft.wc.subscription", propOrder = {
    "id",
    "notificationAuthenticationInfo",
    "notificationChannel"
})
@XmlSeeAlso({
    CommonPrivileged.class
})
public class Common {

    protected String id;
    @XmlElement(name = "notification-authentication-info", required = true)
    protected NotificationAuthenticationInfo notificationAuthenticationInfo;
    @XmlElement(name = "notification-channel", required = true)
    protected NotificationChannel notificationChannel;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the notificationAuthenticationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationAuthenticationInfo }
     *     
     */
    public NotificationAuthenticationInfo getNotificationAuthenticationInfo() {
        return notificationAuthenticationInfo;
    }

    /**
     * Sets the value of the notificationAuthenticationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationAuthenticationInfo }
     *     
     */
    public void setNotificationAuthenticationInfo(NotificationAuthenticationInfo value) {
        this.notificationAuthenticationInfo = value;
    }

    /**
     * Gets the value of the notificationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationChannel }
     *     
     */
    public NotificationChannel getNotificationChannel() {
        return notificationChannel;
    }

    /**
     * Sets the value of the notificationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationChannel }
     *     
     */
    public void setNotificationChannel(NotificationChannel value) {
        this.notificationChannel = value;
    }

}
