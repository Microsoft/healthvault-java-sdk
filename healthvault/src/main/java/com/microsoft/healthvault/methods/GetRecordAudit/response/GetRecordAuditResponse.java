//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetRecordAudit.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.core.application.App;
import com.microsoft.healthvault.core.person.PartialPersonInfo;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetRecordAudit" xmlns:wc-app="urn:com.microsoft.wc.application" xmlns:wc-person="urn:com.microsoft.wc.person" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetRecordAudit" xmlns:wc-app="urn:com.microsoft.wc.application" xmlns:wc-person="urn:com.microsoft.wc.person" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
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
 *         &lt;element name="record-audit" type="{urn:com.microsoft.wc.methods.response.GetRecordAudit}RecordAudit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partial-person-info" type="{urn:com.microsoft.wc.person}PartialPersonInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="application" type="{urn:com.microsoft.wc.application}App" maxOccurs="unbounded" minOccurs="0"/>
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
    "recordAudit",
    "partialPersonInfo",
    "application"
})
public class GetRecordAuditResponse {

    @XmlElement(name = "record-audit")
    protected List<RecordAudit> recordAudit;
    @XmlElement(name = "partial-person-info")
    protected List<PartialPersonInfo> partialPersonInfo;
    protected List<App> application;

    /**
     * Gets the value of the recordAudit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordAudit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordAudit }
     * 
     * 
     */
    public List<RecordAudit> getRecordAudit() {
        if (recordAudit == null) {
            recordAudit = new ArrayList<RecordAudit>();
        }
        return this.recordAudit;
    }

    /**
     * Gets the value of the partialPersonInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partialPersonInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartialPersonInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartialPersonInfo }
     * 
     * 
     */
    public List<PartialPersonInfo> getPartialPersonInfo() {
        if (partialPersonInfo == null) {
            partialPersonInfo = new ArrayList<PartialPersonInfo>();
        }
        return this.partialPersonInfo;
    }

    /**
     * Gets the value of the application property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the application property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link App }
     * 
     * 
     */
    public List<App> getApplication() {
        if (application == null) {
            application = new ArrayList<App>();
        }
        return this.application;
    }

}
