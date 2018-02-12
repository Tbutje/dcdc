package nl.nn.dcdc.api;

import nl.nn.dcdc.api.bpxsd.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Element;


public class XmlGenerator {

	public static void main(String[] args) {

		// Set PersonName
		PersonNameType personName = new PersonNameType();
		personName.setFirstNames("Malcolm");
		personName.setInitials("M");
		personName.setBasicLastName("Young");

		// Set Person
		PersonType person = new PersonType();
		person.setPersonName(personName);

		// Set Party
		PartyType party = new PartyType();
		party.setAuthorizationGroup("Z003");
		party.setPerson(person);

		// Add all to request
		HandleBusinessPartnerRequestType bpReq = new HandleBusinessPartnerRequestType();
		bpReq.setParty(party);

		ActionType action = new ActionType();
		action.setName("HandleRequest");
		action.setParadigm("Action");
		action.setVersion("1");

		// MessageHeader
		ServiceType service = new ServiceType();
		service.setName("DCDCcreateBP");
		service.setContext("DCDC_POC");
		service.setAction(action);

		MessageHeaderType msgHeader = new MessageHeaderType();
		msgHeader.setService(service);

		// Marshal into XMLs
		try {
			JAXBContext jaxbContextHandleBP = JAXBContext.newInstance(HandleBusinessPartnerRequestType.class);
			Marshaller jaxbMarshallerHandleBP = jaxbContextHandleBP.createMarshaller();

			JAXBContext jaxbContextMsgHeader = JAXBContext.newInstance(MessageHeaderType.class);
			Marshaller jaxbMarshallerMsgHeader = jaxbContextMsgHeader.createMarshaller();

			// Pretty print the xml
			jaxbMarshallerHandleBP.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshallerMsgHeader.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			ObjectFactory objectFactory = new ObjectFactory();
			JAXBElement<HandleBusinessPartnerRequestType> jaxbElementHandleBP = objectFactory
					.createHandleBusinessPartnerRequest(bpReq);
			JAXBElement<MessageHeaderType> jaxbElementMsgHeader = objectFactory.createMessageHeader(msgHeader);

			Document documentMsg = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			Document documentBody = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

			jaxbMarshallerMsgHeader.marshal(jaxbElementMsgHeader, documentMsg);
			// jaxbMarshallerMsgHeader.marshal(jaxbElementMsgHeader, System.out);
			jaxbMarshallerHandleBP.marshal(jaxbElementHandleBP, documentBody);
			// jaxbMarshallerHandleBP.marshal(jaxbElementHandleBP, System.out);

			SOAPMessage soapMessage = generateSOAP(documentMsg, documentBody);

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			soapMessage.writeTo(outputStream);
			String output = new String(outputStream.toByteArray());
			System.out.println(output);

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SOAPException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static SOAPMessage generateSOAP(Document header, Document body) throws SOAPException {

		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();

		soapMessage.getSOAPBody().addDocument(body);
		addDocumentToSoapHeader(header, soapMessage);

		return soapMessage;

		// // Retrieve different parts
		// SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
		//
		// SOAPHeader soapHeader = soapEnvelope.getHeader();
		//
		// SOAPBody soapBody = soapEnvelope.getBody();
		//
		// SOAPFactory soapFactory = SOAPFactory.newInstance();
		//
		// //Header
		// Name headerName = soapFactory.createName("MessageHeader", "ns",
		// "http://nn.nl/XSD/Generic/MessageHeader/1");
		// soapHeader.addHeaderElement(headerName);
		//
		// // To add some element
		//
		// Name bodyName =
		// soapFactory.createName("getEmployeeDetails","ns1","urn:MySoapServices");
		// SOAPBodyElement purchaseLineItems = soapBody.addBodyElement(bodyName);
		// Name childName = soapFactory.createName("param1");
		// SOAPElement order = purchaseLineItems.addChildElement(childName);
		// order.addTextNode("1016577");
		//
		// return soapMessage;
		//
	}
	
	private static SOAPBodyElement addDocumentToSoapHeader(Document document, SOAPMessage soapMessage) throws SOAPException {
	    SOAPBodyElement newBodyElement = null;
	    DocumentFragment docFrag = document.createDocumentFragment();
	    Element rootElement = document.getDocumentElement();
	    if(rootElement != null) {
	        docFrag.appendChild( rootElement);
	        Document ownerDoc = soapMessage.getSOAPHeader().getOwnerDocument();
	        org.w3c.dom.Node replacingNode = ownerDoc.importNode(docFrag, true);
	        //this.addNode(replacingNode);
	        soapMessage.getSOAPHeader().appendChild(replacingNode);

	    }

	    return newBodyElement;
	}

}
