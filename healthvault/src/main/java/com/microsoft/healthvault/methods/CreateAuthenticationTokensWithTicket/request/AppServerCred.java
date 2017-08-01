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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Application server credential that is used when an application
 *                     is identifying itself for subsequent calls to Microsoft
 *                     HealthVault.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     This credential type requires that the content element
 *                     be signed using the application's private key.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AppServerCred complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppServerCred">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="hmacSig" type="{urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket}HmacSig"/>
 *         &lt;/choice>
 *         &lt;element name="content" type="{urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket}AppServerCredInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppServerCred", namespace = "urn:com.microsoft.wc.methods.CreateAuthenticationTokensWithTicket", propOrder = {
    "hmacSig",
    "content"
})
public class AppServerCred {

    protected HmacSig hmacSig;
    @XmlElement(required = true)
    protected AppServerCredInfo content;

    /**
     * Gets the value of the hmacSig property.
     * 
     * @return
     *     possible object is
     *     {@link HmacSig }
     *     
     */
    public HmacSig getHmacSig() {
        return hmacSig;
    }

    /**
     * Sets the value of the hmacSig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HmacSig }
     *     
     */
    public void setHmacSig(HmacSig value) {
        this.hmacSig = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link AppServerCredInfo }
     *     
     */
    public AppServerCredInfo getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppServerCredInfo }
     *     
     */
    public void setContent(AppServerCredInfo value) {
        this.content = value;
    }

}
