//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.thing;

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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.genetic-snp-result"&gt;
 *                         Stores a collection of results of a SNP genetic test.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.genetic-snp-result"&gt;
 *                         The SNP data is stored in the other-data section of the object, and must
 *                         be fetched by specifying HealthItemRecordSections.OtherData.
 *                         &lt;br/&gt;
 *                         The format of the other-data section is the HealthVault comma-separated format.
 *                         &lt;br/&gt;
 *                         Within the comma-separated data, each SNP is encoded as follows:
 *                         &lt;br/&gt;
 *                         [refSNP id],[strand orientation],[result],[assay id],[start position],[end position]&lt;br/&gt;
 *                         Where:
 *                         refSNP id: identifier from NCBI dbSNP database.
 *                         strand orientation: "+" encodes top, "-" encodes bottom.
 *                         result: the result of the test.
 *                         assay id: Platform-dependent id.
 *                         start position: Start position on the chromosome.
 *                         end position: End position on the chromosome.
 *                         &lt;br/&gt;
 *                         Example: rs1891906,-,GT,SNP_C-315533,940106,940107
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}approx-date-time"/>
 *         &lt;element name="genome-build" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chromosome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numbering-scheme" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt"/>
 *         &lt;element name="ordered-by" type="{urn:com.microsoft.wc.thing.types}Organization" minOccurs="0"/>
 *         &lt;element name="test-provider" type="{urn:com.microsoft.wc.thing.types}Organization" minOccurs="0"/>
 *         &lt;element name="laboratory-name" type="{urn:com.microsoft.wc.thing.types}Organization" minOccurs="0"/>
 *         &lt;element name="annotation-version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbSNP-build " type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "genomeBuild",
    "chromosome",
    "numberingScheme",
    "orderedBy",
    "testProvider",
    "laboratoryName",
    "annotationVersion",
    "dbSNPBuild0020",
    "platform"
})
@XmlRootElement(name = "genetic-snp-results", namespace = "urn:com.microsoft.wc.thing.genetic-snp-result")
public class GeneticSnpResults {

    @XmlElement(required = true)
    protected ApproxDateTime when;
    @XmlElement(name = "genome-build", required = true)
    protected String genomeBuild;
    @XmlElement(required = true)
    protected String chromosome;
    @XmlElement(name = "numbering-scheme")
    protected int numberingScheme;
    @XmlElement(name = "ordered-by")
    protected Organization orderedBy;
    @XmlElement(name = "test-provider")
    protected Organization testProvider;
    @XmlElement(name = "laboratory-name")
    protected Organization laboratoryName;
    @XmlElement(name = "annotation-version")
    protected String annotationVersion;
    @XmlElement(name = "dbSNP-build ")
    protected String dbSNPBuild0020;
    protected String platform;

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
     * Gets the value of the genomeBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenomeBuild() {
        return genomeBuild;
    }

    /**
     * Sets the value of the genomeBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenomeBuild(String value) {
        this.genomeBuild = value;
    }

    /**
     * Gets the value of the chromosome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChromosome() {
        return chromosome;
    }

    /**
     * Sets the value of the chromosome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChromosome(String value) {
        this.chromosome = value;
    }

    /**
     * Gets the value of the numberingScheme property.
     * 
     */
    public int getNumberingScheme() {
        return numberingScheme;
    }

    /**
     * Sets the value of the numberingScheme property.
     * 
     */
    public void setNumberingScheme(int value) {
        this.numberingScheme = value;
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

    /**
     * Gets the value of the testProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getTestProvider() {
        return testProvider;
    }

    /**
     * Sets the value of the testProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setTestProvider(Organization value) {
        this.testProvider = value;
    }

    /**
     * Gets the value of the laboratoryName property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getLaboratoryName() {
        return laboratoryName;
    }

    /**
     * Sets the value of the laboratoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setLaboratoryName(Organization value) {
        this.laboratoryName = value;
    }

    /**
     * Gets the value of the annotationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationVersion() {
        return annotationVersion;
    }

    /**
     * Sets the value of the annotationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationVersion(String value) {
        this.annotationVersion = value;
    }

    /**
     * Gets the value of the dbSNPBuild0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbSNPBuild_0020() {
        return dbSNPBuild0020;
    }

    /**
     * Sets the value of the dbSNPBuild0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbSNPBuild_0020(String value) {
        this.dbSNPBuild0020 = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

}