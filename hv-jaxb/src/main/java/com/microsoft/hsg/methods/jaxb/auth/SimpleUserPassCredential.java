//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//


package com.microsoft.hsg.methods.jaxb.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     A simple user credential that authenticates a user in
 *                     Microsoft HealthVault.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Each user has a unique username and associated password
 *                     that identifies and authenticates a Microsoft HealthVault user.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SimpleUserPassCredential complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleUserPassCredential">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simple-userpass" type="{urn:com.microsoft.wc.auth}UserPassCred"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleUserPassCredential", propOrder = {
    "simpleUserpass"
})
public class SimpleUserPassCredential {

    @XmlElement(name = "simple-userpass", required = true)
    protected UserPassCred simpleUserpass;

    /**
     * Gets the value of the simpleUserpass property.
     * 
     * @return
     *     possible object is
     *     {@link UserPassCred }
     *     
     */
    public UserPassCred getSimpleUserpass() {
        return simpleUserpass;
    }

    /**
     * Sets the value of the simpleUserpass property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPassCred }
     *     
     */
    public void setSimpleUserpass(UserPassCred value) {
        this.simpleUserpass = value;
    }

}