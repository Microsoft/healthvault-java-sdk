//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 12:00:41 PM PDT 
//


package com.microsoft.healthvault.generated.methods.GetMeaningfulUseTimelyAccessReportPrivileged.request;

import java.util.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import java.math.BigInteger;
import com.microsoft.healthvault.generated.core.meaningfuluse.DocumentFilter;
import com.microsoft.healthvault.generated.core.meaningfuluse.DopuDocumentFilter;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetMeaningfulUseTimelyAccessReportPrivileged" xmlns:wc-meaningfuluse="urn:com.microsoft.wc.MeaningfulUse" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the request that contains the method
 *                         specific parameters.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.GetMeaningfulUseTimelyAccessReportPrivileged" xmlns:wc-meaningfuluse="urn:com.microsoft.wc.MeaningfulUse" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
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
 *         &lt;element name="application-id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;choice>
 *           &lt;element name="document-filter" type="{urn:com.microsoft.wc.MeaningfulUse}DocumentFilter"/>
 *           &lt;element name="dopu-document-filter" type="{urn:com.microsoft.wc.MeaningfulUse}DopuDocumentFilter"/>
 *         &lt;/choice>
 *         &lt;element name="delimiter" type="{urn:com.microsoft.wc.types}string1nw"/>
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
@Root(name="")
@Order(elements = {
    "applicationId",
    "documentFilter",
    "dopuDocumentFilter",
    "delimiter",
    "maxItemsPerPage",
    "cursor"
})
public class GetMeaningfulUseTimelyAccessReportPrivilegedRequest {

    @Element(name = "application-id", required = true)
    protected String applicationId;
    @Element(name = "document-filter")
    protected DocumentFilter documentFilter;
    @Element(name = "dopu-document-filter")
    protected DopuDocumentFilter dopuDocumentFilter;
    @Element(required = true)
    protected String delimiter;
    @Element(name = "max-items-per-page")
    protected BigInteger maxItemsPerPage;
    protected String cursor;

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the documentFilter property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFilter }
     *     
     */
    public DocumentFilter getDocumentFilter() {
        return documentFilter;
    }

    /**
     * Sets the value of the documentFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFilter }
     *     
     */
    public void setDocumentFilter(DocumentFilter value) {
        this.documentFilter = value;
    }

    /**
     * Gets the value of the dopuDocumentFilter property.
     * 
     * @return
     *     possible object is
     *     {@link DopuDocumentFilter }
     *     
     */
    public DopuDocumentFilter getDopuDocumentFilter() {
        return dopuDocumentFilter;
    }

    /**
     * Sets the value of the dopuDocumentFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DopuDocumentFilter }
     *     
     */
    public void setDopuDocumentFilter(DopuDocumentFilter value) {
        this.dopuDocumentFilter = value;
    }

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
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