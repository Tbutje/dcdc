//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.08 at 11:52:04 AM CET 
//


package nl.nn.dcdc.api.bpxsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneNumberContactPointUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneNumberContactPointUsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPointUsageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumberChangeIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://nn.nl/XSD/CustomerAdministration/Party/2/HandleBusinessPartner/4}TelephoneNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumberContactPointUsageType", propOrder = {
    "contactPointUsageType",
    "telephoneNumberChangeIND",
    "telephoneNumber"
})
public class TelephoneNumberContactPointUsageType {

    @XmlElement(name = "ContactPointUsageType")
    protected String contactPointUsageType;
    @XmlElement(name = "TelephoneNumberChangeIND")
    protected String telephoneNumberChangeIND;
    @XmlElement(name = "TelephoneNumber", required = true)
    protected TelephoneNumberType telephoneNumber;

    /**
     * Gets the value of the contactPointUsageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPointUsageType() {
        return contactPointUsageType;
    }

    /**
     * Sets the value of the contactPointUsageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPointUsageType(String value) {
        this.contactPointUsageType = value;
    }

    /**
     * Gets the value of the telephoneNumberChangeIND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumberChangeIND() {
        return telephoneNumberChangeIND;
    }

    /**
     * Sets the value of the telephoneNumberChangeIND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumberChangeIND(String value) {
        this.telephoneNumberChangeIND = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberType }
     *     
     */
    public TelephoneNumberType getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberType }
     *     
     */
    public void setTelephoneNumber(TelephoneNumberType value) {
        this.telephoneNumber = value;
    }

}
