//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.GetThingType.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetThingType" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     Describes a conversion to apply to a numeric value.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetThingType" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for UnitsConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitsConversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="linear-conversion" type="{urn:com.microsoft.wc.methods.response.GetThingType}LinearConversion"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitsConversion", namespace = "urn:com.microsoft.wc.methods.response.GetThingType", propOrder = {
    "linearConversion"
})
public class UnitsConversion {

    @XmlElement(name = "linear-conversion")
    protected LinearConversion linearConversion;

    /**
     * Gets the value of the linearConversion property.
     * 
     * @return
     *     possible object is
     *     {@link LinearConversion }
     *     
     */
    public LinearConversion getLinearConversion() {
        return linearConversion;
    }

    /**
     * Sets the value of the linearConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearConversion }
     *     
     */
    public void setLinearConversion(LinearConversion value) {
        this.linearConversion = value;
    }

}
