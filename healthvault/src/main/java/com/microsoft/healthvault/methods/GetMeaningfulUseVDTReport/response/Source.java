//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetMeaningfulUseVDTReport.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetMeaningfulUseVDTReport" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     A Meaningful Use source.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetMeaningfulUseVDTReport" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Source is either the id of the application that contributed to the data or the email domain of the Direct sender.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Source">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patient-activities" type="{urn:com.microsoft.wc.methods.response.GetMeaningfulUseVDTReport}Activities"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{urn:com.microsoft.wc.types}stringnz" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", namespace = "urn:com.microsoft.wc.methods.response.GetMeaningfulUseVDTReport", propOrder = {
    "patientActivities"
})
public class Source {

    @XmlElement(name = "patient-activities", required = true)
    protected Activities patientActivities;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the patientActivities property.
     * 
     * @return
     *     possible object is
     *     {@link Activities }
     *     
     */
    public Activities getPatientActivities() {
        return patientActivities;
    }

    /**
     * Sets the value of the patientActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activities }
     *     
     */
    public void setPatientActivities(Activities value) {
        this.patientActivities = value;
    }

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

}
