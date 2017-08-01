//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.thing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.Organization;
import com.microsoft.healthvault.types.dates.ApproxDateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:lab="urn:com.microsoft.wc.thing.lab-test-results" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A series of lab test results.
 *                     &lt;/summary&gt;
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="lab-group" type="{urn:com.microsoft.wc.thing.lab-test-results}lab-test-results-group-type" maxOccurs="unbounded"/>
 *         &lt;element name="ordered-by" type="{urn:com.microsoft.wc.thing.types}Organization" minOccurs="0"/>
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
    "when",
    "labGroup",
    "orderedBy"
})
@XmlRootElement(name = "lab-test-results", namespace = "urn:com.microsoft.wc.thing.lab-test-results")
public class LabTestResults {

    protected ApproxDateTime when;
    @XmlElement(name = "lab-group", required = true)
    protected List<LabTestResultsGroupType> labGroup;
    @XmlElement(name = "ordered-by")
    protected Organization orderedBy;

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setWhen(ApproxDateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the labGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabTestResultsGroupType }
     * 
     * 
     */
    public List<LabTestResultsGroupType> getLabGroup() {
        if (labGroup == null) {
            labGroup = new ArrayList<LabTestResultsGroupType>();
        }
        return this.labGroup;
    }

    /**
     * Gets the value of the orderedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrderedBy() {
        return orderedBy;
    }

    /**
     * Sets the value of the orderedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrderedBy(Organization value) {
        this.orderedBy = value;
    }

}
