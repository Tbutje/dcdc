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
 * <p>Java class for EmployerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PensionAssociationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IFRSIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEmployerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerType", propOrder = {
    "pensionAssociationIndicator",
    "ifrsIndicator",
    "legalEmployerIndicator"
})
public class EmployerType {

    @XmlElement(name = "PensionAssociationIndicator")
    protected String pensionAssociationIndicator;
    @XmlElement(name = "IFRSIndicator")
    protected String ifrsIndicator;
    @XmlElement(name = "LegalEmployerIndicator")
    protected String legalEmployerIndicator;

    /**
     * Gets the value of the pensionAssociationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionAssociationIndicator() {
        return pensionAssociationIndicator;
    }

    /**
     * Sets the value of the pensionAssociationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionAssociationIndicator(String value) {
        this.pensionAssociationIndicator = value;
    }

    /**
     * Gets the value of the ifrsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFRSIndicator() {
        return ifrsIndicator;
    }

    /**
     * Sets the value of the ifrsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFRSIndicator(String value) {
        this.ifrsIndicator = value;
    }

    /**
     * Gets the value of the legalEmployerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEmployerIndicator() {
        return legalEmployerIndicator;
    }

    /**
     * Sets the value of the legalEmployerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEmployerIndicator(String value) {
        this.legalEmployerIndicator = value;
    }

}