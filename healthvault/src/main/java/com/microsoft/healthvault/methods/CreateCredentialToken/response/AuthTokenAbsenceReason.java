//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.methods.CreateCredentialToken.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthTokenAbsenceReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthTokenAbsenceReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PersonNotAuthorizedForApp"/>
 *     &lt;enumeration value="CredentialNotFound"/>
 *     &lt;enumeration value="SecondFactorAuthenticationRequired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthTokenAbsenceReason", namespace = "urn:com.microsoft.wc.methods.response.CreateCredentialToken")
@XmlEnum
public enum AuthTokenAbsenceReason {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.CreateCredentialToken" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             The person is not authorized to run the specified
     *                             application.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PersonNotAuthorizedForApp")
    PERSON_NOT_AUTHORIZED_FOR_APP("PersonNotAuthorizedForApp"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.CreateCredentialToken" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             The credential was not found.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CredentialNotFound")
    CREDENTIAL_NOT_FOUND("CredentialNotFound"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.CreateCredentialToken" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             Second Factor Authentication Required
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SecondFactorAuthenticationRequired")
    SECOND_FACTOR_AUTHENTICATION_REQUIRED("SecondFactorAuthenticationRequired");
    private final String value;

    AuthTokenAbsenceReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthTokenAbsenceReason fromValue(String v) {
        for (AuthTokenAbsenceReason c: AuthTokenAbsenceReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
