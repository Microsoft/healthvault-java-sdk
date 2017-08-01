//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OmbEthnicity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OmbEthnicity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="American Indian or Alaska Native"/>
 *     &lt;enumeration value="Asian"/>
 *     &lt;enumeration value="Black or African American"/>
 *     &lt;enumeration value="Hispanic or Latino"/>
 *     &lt;enumeration value="Native Hawaiian or Other Pacific Islander"/>
 *     &lt;enumeration value="White"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OmbEthnicity", namespace = "urn:com.microsoft.wc.types")
@XmlEnum
public enum OmbEthnicity {

    @XmlEnumValue("American Indian or Alaska Native")
    AMERICAN_INDIAN_OR_ALASKA_NATIVE("American Indian or Alaska Native"),
    @XmlEnumValue("Asian")
    ASIAN("Asian"),
    @XmlEnumValue("Black or African American")
    BLACK_OR_AFRICAN_AMERICAN("Black or African American"),
    @XmlEnumValue("Hispanic or Latino")
    HISPANIC_OR_LATINO("Hispanic or Latino"),
    @XmlEnumValue("Native Hawaiian or Other Pacific Islander")
    NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER("Native Hawaiian or Other Pacific Islander"),
    @XmlEnumValue("White")
    WHITE("White");
    private final String value;

    OmbEthnicity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OmbEthnicity fromValue(String v) {
        for (OmbEthnicity c: OmbEthnicity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
