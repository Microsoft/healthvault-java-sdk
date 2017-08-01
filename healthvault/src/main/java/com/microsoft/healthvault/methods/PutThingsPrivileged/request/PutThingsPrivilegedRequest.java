//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.PutThingsPrivileged.request;

import com.microsoft.healthvault.thing.Thing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the request that contains the method
 *                         specific parameters.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
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
 *         &lt;element name="impersonated-application-id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="package-source" type="{urn:com.microsoft.wc.types}string300nw" minOccurs="0"/>
 *         &lt;element name="package-created-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="auto-reconcile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="thing" type="{urn:com.microsoft.wc.thing}Thing" maxOccurs="unbounded"/>
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
    "impersonatedApplicationId",
    "packageSource",
    "packageCreatedDate",
    "autoReconcile",
    "thing"
})
public class PutThingsPrivilegedRequest {

    @XmlElement(name = "impersonated-application-id", required = true)
    protected String impersonatedApplicationId;
    @XmlElement(name = "package-source")
    protected String packageSource;
    @XmlElement(name = "package-created-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar packageCreatedDate;
    @XmlElement(name = "auto-reconcile")
    protected Boolean autoReconcile;
    @XmlElement(required = true)
    protected List<Thing> thing;

    /**
     * Gets the value of the impersonatedApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpersonatedApplicationId() {
        return impersonatedApplicationId;
    }

    /**
     * Sets the value of the impersonatedApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpersonatedApplicationId(String value) {
        this.impersonatedApplicationId = value;
    }

    /**
     * Gets the value of the packageSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageSource() {
        return packageSource;
    }

    /**
     * Sets the value of the packageSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageSource(String value) {
        this.packageSource = value;
    }

    /**
     * Gets the value of the packageCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPackageCreatedDate() {
        return packageCreatedDate;
    }

    /**
     * Sets the value of the packageCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPackageCreatedDate(XMLGregorianCalendar value) {
        this.packageCreatedDate = value;
    }

    /**
     * Gets the value of the autoReconcile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoReconcile() {
        return autoReconcile;
    }

    /**
     * Sets the value of the autoReconcile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoReconcile(Boolean value) {
        this.autoReconcile = value;
    }

    /**
     * Gets the value of the thing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Thing }
     * 
     * 
     */
    public List<Thing> getThing() {
        if (thing == null) {
            thing = new ArrayList<Thing>();
        }
        return this.thing;
    }

}
