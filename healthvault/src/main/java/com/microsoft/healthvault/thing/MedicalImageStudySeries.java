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
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.CodableValue;
import com.microsoft.healthvault.types.Organization;
import com.microsoft.healthvault.types.dates.DateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.medical-images"&gt;
 *                     A specific series of images.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for medical-image-study-series complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medical-image-study-series">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acquisition-datetime" type="{urn:com.microsoft.wc.dates}date-time" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="images" type="{urn:com.microsoft.wc.thing.medical-images}medical-image-study-series-image" maxOccurs="unbounded"/>
 *         &lt;element name="institution-name" type="{urn:com.microsoft.wc.thing.types}Organization" minOccurs="0"/>
 *         &lt;element name="modality" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="body-part" type="{urn:com.microsoft.wc.thing.types}codable-value" minOccurs="0"/>
 *         &lt;element name="preview-blob-name" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="series-instance-uid" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medical-image-study-series", namespace = "urn:com.microsoft.wc.thing.medical-images", propOrder = {
    "acquisitionDatetime",
    "description",
    "images",
    "institutionName",
    "modality",
    "bodyPart",
    "previewBlobName",
    "seriesInstanceUid"
})
public class MedicalImageStudySeries {

    @XmlElement(name = "acquisition-datetime")
    protected DateTime acquisitionDatetime;
    protected String description;
    @XmlElement(required = true)
    protected List<MedicalImageStudySeriesImage> images;
    @XmlElement(name = "institution-name")
    protected Organization institutionName;
    protected CodableValue modality;
    @XmlElement(name = "body-part")
    protected CodableValue bodyPart;
    @XmlElement(name = "preview-blob-name")
    protected String previewBlobName;
    @XmlElement(name = "series-instance-uid")
    protected String seriesInstanceUid;

    /**
     * Gets the value of the acquisitionDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getAcquisitionDatetime() {
        return acquisitionDatetime;
    }

    /**
     * Sets the value of the acquisitionDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setAcquisitionDatetime(DateTime value) {
        this.acquisitionDatetime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalImageStudySeriesImage }
     * 
     * 
     */
    public List<MedicalImageStudySeriesImage> getImages() {
        if (images == null) {
            images = new ArrayList<MedicalImageStudySeriesImage>();
        }
        return this.images;
    }

    /**
     * Gets the value of the institutionName property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getInstitutionName() {
        return institutionName;
    }

    /**
     * Sets the value of the institutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setInstitutionName(Organization value) {
        this.institutionName = value;
    }

    /**
     * Gets the value of the modality property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getModality() {
        return modality;
    }

    /**
     * Sets the value of the modality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setModality(CodableValue value) {
        this.modality = value;
    }

    /**
     * Gets the value of the bodyPart property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getBodyPart() {
        return bodyPart;
    }

    /**
     * Sets the value of the bodyPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setBodyPart(CodableValue value) {
        this.bodyPart = value;
    }

    /**
     * Gets the value of the previewBlobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewBlobName() {
        return previewBlobName;
    }

    /**
     * Sets the value of the previewBlobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewBlobName(String value) {
        this.previewBlobName = value;
    }

    /**
     * Gets the value of the seriesInstanceUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesInstanceUid() {
        return seriesInstanceUid;
    }

    /**
     * Sets the value of the seriesInstanceUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesInstanceUid(String value) {
        this.seriesInstanceUid = value;
    }

}
