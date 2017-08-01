//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetApplicationSettings.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetApplicationSettings" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the response that contains the method
 *                         specific return value(s).
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetApplicationSettings" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         All response schemas contain the info element which
 *                         contain the return value of the method. If the method
 *                         does not define an info element, the method has no
 *                         return value.
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
 *         &lt;element name="app-settings" type="{urn:com.microsoft.wc.methods.response.GetApplicationSettings}AppSettings" minOccurs="0"/>
 *         &lt;element name="selected-record-id" type="{urn:com.microsoft.wc.types}guid" minOccurs="0"/>
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
    "appSettings",
    "selectedRecordId"
})
public class GetApplicationSettingsResponse {

    @XmlElement(name = "app-settings")
    protected AppSettings appSettings;
    @XmlElement(name = "selected-record-id")
    protected String selectedRecordId;

    /**
     * Gets the value of the appSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AppSettings }
     *     
     */
    public AppSettings getAppSettings() {
        return appSettings;
    }

    /**
     * Sets the value of the appSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppSettings }
     *     
     */
    public void setAppSettings(AppSettings value) {
        this.appSettings = value;
    }

    /**
     * Gets the value of the selectedRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedRecordId() {
        return selectedRecordId;
    }

    /**
     * Sets the value of the selectedRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedRecordId(String value) {
        this.selectedRecordId = value;
    }

}
