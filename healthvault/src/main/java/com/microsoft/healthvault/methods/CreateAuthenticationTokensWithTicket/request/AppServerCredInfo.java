//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.CreateAuthenticationTokensWithTicket.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AppServerCredInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppServerCredInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="app-id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="hmac" type="{urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket}hmac"/>
 *         &lt;element name="signing-time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppServerCredInfo", namespace = "urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket", propOrder = {
    "appId",
    "hmac",
    "signingTime"
})
public class AppServerCredInfo {

    @XmlElement(name = "app-id", required = true)
    protected String appId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Hmac hmac;
    @XmlElement(name = "signing-time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signingTime;

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the hmac property.
     * 
     * @return
     *     possible object is
     *     {@link Hmac }
     *     
     */
    public Hmac getHmac() {
        return hmac;
    }

    /**
     * Sets the value of the hmac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hmac }
     *     
     */
    public void setHmac(Hmac value) {
        this.hmac = value;
    }

    /**
     * Gets the value of the signingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSigningTime() {
        return signingTime;
    }

    /**
     * Sets the value of the signingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSigningTime(XMLGregorianCalendar value) {
        this.signingTime = value;
    }

}
