//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetServiceDefinition2.response;

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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetServiceDefinition2" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the request that contains the method
 *                         specific parameters.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetServiceDefinition2" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
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
 *         &lt;element name="platform" type="{urn:com.microsoft.wc.methods.response.GetServiceDefinition2}Platform" minOccurs="0"/>
 *         &lt;element name="shell" type="{urn:com.microsoft.wc.methods.response.GetServiceDefinition2}Shell" minOccurs="0"/>
 *         &lt;element name="xml-method" type="{urn:com.microsoft.wc.methods.response.GetServiceDefinition2}XmlMethod" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="common-schema" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instances" type="{urn:com.microsoft.wc.methods.response.GetServiceDefinition2}InstanceList" minOccurs="0"/>
 *         &lt;element name="meaningful-use" type="{urn:com.microsoft.wc.methods.response.GetServiceDefinition2}MeaningfulUse" minOccurs="0"/>
 *         &lt;element name="updated-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "platform",
    "shell",
    "xmlMethod",
    "commonSchema",
    "instances",
    "meaningfulUse",
    "updatedDate"
})
public class GetServiceDefinition2Response {

    protected Platform platform;
    protected Shell shell;
    @XmlElement(name = "xml-method")
    protected List<XmlMethod> xmlMethod;
    @XmlElement(name = "common-schema")
    protected List<String> commonSchema;
    protected InstanceList instances;
    @XmlElement(name = "meaningful-use")
    protected MeaningfulUse meaningfulUse;
    @XmlElement(name = "updated-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link Platform }
     *     
     */
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platform }
     *     
     */
    public void setPlatform(Platform value) {
        this.platform = value;
    }

    /**
     * Gets the value of the shell property.
     * 
     * @return
     *     possible object is
     *     {@link Shell }
     *     
     */
    public Shell getShell() {
        return shell;
    }

    /**
     * Sets the value of the shell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shell }
     *     
     */
    public void setShell(Shell value) {
        this.shell = value;
    }

    /**
     * Gets the value of the xmlMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXmlMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlMethod }
     * 
     * 
     */
    public List<XmlMethod> getXmlMethod() {
        if (xmlMethod == null) {
            xmlMethod = new ArrayList<XmlMethod>();
        }
        return this.xmlMethod;
    }

    /**
     * Gets the value of the commonSchema property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonSchema property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonSchema().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommonSchema() {
        if (commonSchema == null) {
            commonSchema = new ArrayList<String>();
        }
        return this.commonSchema;
    }

    /**
     * Gets the value of the instances property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceList }
     *     
     */
    public InstanceList getInstances() {
        return instances;
    }

    /**
     * Sets the value of the instances property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceList }
     *     
     */
    public void setInstances(InstanceList value) {
        this.instances = value;
    }

    /**
     * Gets the value of the meaningfulUse property.
     * 
     * @return
     *     possible object is
     *     {@link MeaningfulUse }
     *     
     */
    public MeaningfulUse getMeaningfulUse() {
        return meaningfulUse;
    }

    /**
     * Sets the value of the meaningfulUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeaningfulUse }
     *     
     */
    public void setMeaningfulUse(MeaningfulUse value) {
        this.meaningfulUse = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

}
