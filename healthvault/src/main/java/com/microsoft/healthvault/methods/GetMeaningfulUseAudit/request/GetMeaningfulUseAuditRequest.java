//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetMeaningfulUseAudit.request;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetMeaningfulUseAudit" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *             The element of the request that contains the method
 *             specific parameters.
 *           &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetMeaningfulUseAudit" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *             All requests contain the info element to pass parameters
 *             that are specific to each method. If the method does not
 *             define an info element, the method does not take any
 *             parameters.
 *           &lt;/remarks&gt;
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
 *         &lt;element name="filters" type="{urn:com.microsoft.wc.methods.GetMeaningfulUseAudit}MeaningfulUseAuditFilters" minOccurs="0"/>
 *         &lt;element name="max-items-per-page" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="cursor" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
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
    "filters",
    "maxItemsPerPage",
    "cursor"
})
public class GetMeaningfulUseAuditRequest {

    protected MeaningfulUseAuditFilters filters;
    @XmlElement(name = "max-items-per-page")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxItemsPerPage;
    protected String cursor;

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link MeaningfulUseAuditFilters }
     *     
     */
    public MeaningfulUseAuditFilters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeaningfulUseAuditFilters }
     *     
     */
    public void setFilters(MeaningfulUseAuditFilters value) {
        this.filters = value;
    }

    /**
     * Gets the value of the maxItemsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxItemsPerPage() {
        return maxItemsPerPage;
    }

    /**
     * Sets the value of the maxItemsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxItemsPerPage(BigInteger value) {
        this.maxItemsPerPage = value;
    }

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursor(String value) {
        this.cursor = value;
    }

}
