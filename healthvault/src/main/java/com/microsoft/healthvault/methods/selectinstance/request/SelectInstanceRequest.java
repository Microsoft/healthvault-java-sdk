package com.microsoft.healthvault.methods.selectinstance.request;

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.08.01 at 11:25:08 AM PDT
//

import com.microsoft.healthvault.methods.request.HVMethodRequest;
import com.microsoft.healthvault.methods.request.HVRequestInfo;
import com.microsoft.healthvault.types.Location;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/**
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.SelectInstance" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the request that contains the method
 *                         specific parameters.
 *                     &lt;/summary&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.SelectInstance" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
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
 *         &lt;element name="preferred-location" type="{urn:com.microsoft.wc.types}Location"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@Order(elements = {
        "preferred-location"
})
@Root(name = "info")
@HVMethodRequest(methodName = "SelectInstance", methodVersion="1")
public class SelectInstanceRequest implements HVRequestInfo {

    @Element(name = "preferred-location", required = true)
    protected Location preferredLocation;

    /**
     * Gets the value of the preferredLocation property.
     *
     * @return
     *     possible object is
     *     {@link Location }
     *
     */
    public Location getPreferredLocation() {
        return preferredLocation;
    }

    /**
     * Sets the value of the preferredLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link Location }
     *
     */
    public void setPreferredLocation(Location value) {
        this.preferredLocation = value;
    }

}