//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetThingsBulk.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetThingsBulk" xmlns:wc-method-getthingsbulk="urn:com.microsoft.wc.methods.GetThingsBulk" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the request that contains the method
 *                         specific parameters.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetThingsBulk" xmlns:wc-method-getthingsbulk="urn:com.microsoft.wc.methods.GetThingsBulk" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         All requests contain the info element to pass parameters
 *                         that are specific to each method. If the method does not
 *                         define an info element, the method does not take any
 *                         parameters.
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
 *         &lt;element name="requesting-app-id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="requested-things" type="{urn:com.microsoft.wc.methods.GetThingsBulk}RequestedThings"/>
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
    "requestingAppId",
    "requestedThings"
})
public class GetThingsBulkRequest {

    @XmlElement(name = "requesting-app-id", required = true)
    protected String requestingAppId;
    @XmlElement(name = "requested-things", required = true)
    protected RequestedThings requestedThings;

    /**
     * Gets the value of the requestingAppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingAppId() {
        return requestingAppId;
    }

    /**
     * Sets the value of the requestingAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingAppId(String value) {
        this.requestingAppId = value;
    }

    /**
     * Gets the value of the requestedThings property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedThings }
     *     
     */
    public RequestedThings getRequestedThings() {
        return requestedThings;
    }

    /**
     * Sets the value of the requestedThings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedThings }
     *     
     */
    public void setRequestedThings(RequestedThings value) {
        this.requestedThings = value;
    }

}
