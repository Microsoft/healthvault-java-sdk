//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.SetApplicationSettings.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.SetApplicationSettings" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                   The application specific settings for the person.
 *               &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.SetApplicationSettings" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                   An application can store person preferences and other
 *                   settings for the person in the Microsoft Health
 *                   Service. These settings are automatically returned
 *                   when GetPersonInfo is called but can also be retrieved
 *                   through the use of GetApplicationSettings.&lt;br/&gt;&lt;br/&gt;
 *                   If you are familiar with Windows development, this
 *                   would be analogus to HKEY_CURRENT_USER settings in
 *                   the Windows Registry.&lt;br/&gt;&lt;br/&gt;
 *                 Microsoft HealthVault does not interpret this
 *                 data at all and only acts as storage for it on
 *                 behalf of the application.
 *               &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AppSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppSettings", namespace = "urn:com.microsoft.wc.methods.SetApplicationSettings", propOrder = {
    "any"
})
public class AppSettings {

    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
