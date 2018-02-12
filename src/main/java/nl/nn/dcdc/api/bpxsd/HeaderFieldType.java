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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HeaderFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPAId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConversationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorrelationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalRefToMessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderProperties" type="{http://nn.nl/XSD/Generic/MessageHeader/2}PropertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderFieldType", namespace = "http://nn.nl/XSD/Generic/MessageHeader/2", propOrder = {
    "cpaId",
    "conversationId",
    "messageId",
    "correlationId",
    "externalRefToMessageId",
    "timestamp",
    "transactionId",
    "headerProperties"
})
public class HeaderFieldType {

    @XmlElement(name = "CPAId", required = true)
    protected String cpaId;
    @XmlElement(name = "ConversationId", required = true)
    protected String conversationId;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "CorrelationId")
    protected String correlationId;
    @XmlElement(name = "ExternalRefToMessageId")
    protected String externalRefToMessageId;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "HeaderProperties")
    protected PropertiesType headerProperties;

    /**
     * Gets the value of the cpaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPAId() {
        return cpaId;
    }

    /**
     * Sets the value of the cpaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPAId(String value) {
        this.cpaId = value;
    }

    /**
     * Gets the value of the conversationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Sets the value of the conversationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationId(String value) {
        this.conversationId = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the externalRefToMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRefToMessageId() {
        return externalRefToMessageId;
    }

    /**
     * Sets the value of the externalRefToMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRefToMessageId(String value) {
        this.externalRefToMessageId = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the headerProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getHeaderProperties() {
        return headerProperties;
    }

    /**
     * Sets the value of the headerProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setHeaderProperties(PropertiesType value) {
        this.headerProperties = value;
    }

}