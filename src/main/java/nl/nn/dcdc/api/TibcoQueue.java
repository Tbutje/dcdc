package nl.nn.dcdc.api;

import java.util.Vector;
import javax.jms.*;
import com.tibco.tibjms.*;

public class TibcoQueue {

	public static void main(String[] args) {

		ConfigReader configReader = new ConfigReader();
		String serverUrl = configReader.getServerUrl();
		String userName = configReader.getUserName();
		String password = configReader.getPassword();
		String senderName = configReader.getQueueName();

		try {

			Vector<Object> data = new Vector<Object>();
			data.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" +
					"<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" +
					"	<SOAP-ENV:Header>\r\n" +
					"		<ns:MessageHeader xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:ns=\"http://nn.nl/XSD/Generic/MessageHeader/1\" xmlns:ns0=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" +
					"			<ns:From>\r\n" +
					"				<ns:Id>BankAccountBPMOutbound_BankAccountBPMOutbound_1_HandleRequestOut_1</ns:Id>\r\n" +
					"			</ns:From>\r\n" +
					"			<ns:To>\r\n" +
					"				<ns:Location>P2P.BankSavings.BankAccountBPMOutbound.HandleRequestOut.Request</ns:Location>\r\n" +
					"			</ns:To>\r\n" +
					"			<ns:HeaderFields>\r\n" +
					"				<ns:CPAId>98f313760cc148c8a9bff69b973c6d93</ns:CPAId>\r\n" +
					"				<ns:ConversationId>srtzzapp0113.insim.biz_0ace08b7-4192c972_161322fb38f_-30e5</ns:ConversationId>\r\n" +
					"				<ns:MessageId>123321123321</ns:MessageId>\r\n" +
					"				<ns:CorrelationId>123321123321</ns:CorrelationId>\r\n" +
					"				<ns:Timestamp>2018-02-05T11:06:43.841+01:00</ns:Timestamp>\r\n" +
					"			</ns:HeaderFields>\r\n" +
					"			<ns:Service>\r\n" +
					"				<ns:Name>BankAccountBPMOutbound</ns:Name>\r\n" +
					"				<ns:Context>BankAccountBPMOutbound</ns:Context>\r\n" +
					"				<ns:Action>\r\n" +
					"					<ns:Paradigm>Request</ns:Paradigm>\r\n" +
					"					<ns:Name>HandleRequestOut</ns:Name>\r\n" +
					"					<ns:Version>1</ns:Version>\r\n" +
					"				</ns:Action>\r\n" +
					"			</ns:Service>\r\n" +
					"		</ns:MessageHeader>\r\n" +
					"	</SOAP-ENV:Header>\r\n" +
					"	<SOAP-ENV:Body>\r\n" +
					"		<ns0:HandleBusinessPartner_Request xmlns:ns0=\"http://nn.nl/XSD/CustomerAdministration/Party/2/HandleBusinessPartner/4\">\r\n" +
					"			<ns0:RequestEnvelope>\r\n" + 
					"				<ns0:TransactionDate>2018-02-05</ns0:TransactionDate>\r\n" + 
					"				<ns0:TimeStamp>2018-02-05T11:06:43.882+01:00</ns0:TimeStamp>\r\n" + 
					"				<ns0:AuditTrail>\r\n" + 
					"					<ns0:EventType>EVTNieuweAanvraag</ns0:EventType>\r\n" + 
					"					<ns0:From>F530 Click</ns0:From>\r\n" + 
					"					<ns0:SourceSystem>OFS</ns0:SourceSystem>\r\n" + 
					"					<ns0:ProcessID>pvm:0a121g29h</ns0:ProcessID>\r\n" + 
					"					<ns0:TimeStampProcess>2018-02-05T11:06:43.882+01:00</ns0:TimeStampProcess>\r\n" + 
					"				</ns0:AuditTrail>\r\n" + 
					"			</ns0:RequestEnvelope>\r\n" + 
					"			<ns0:Party>\r\n" + 
					"				<ns0:AuthorizationGroup>Z003</ns0:AuthorizationGroup>\r\n" + 
					"				<ns0:PartyType>1</ns0:PartyType>\r\n" + 
					"				<ns0:Person>\r\n" + 
					"					<ns0:PersonName>\r\n" + 
					"						<ns0:FirstNames>Timo</ns0:FirstNames>\r\n" + 
					"						<ns0:Initials>D.C</ns0:Initials>\r\n" + 
					"						<ns0:BasicLastName>DCDC</ns0:BasicLastName>\r\n" + 
					"						<ns0:LastNamePrefix/>\r\n" + 
					"					</ns0:PersonName>\r\n" + 
					"					<ns0:Demographics>\r\n" + 
					"						<ns0:Gender>2</ns0:Gender>\r\n" + 
					"						<ns0:BirthDate>1969-10-24</ns0:BirthDate>\r\n" + 
					"						<ns0:BirthPlace>Rotterdam</ns0:BirthPlace>\r\n" + 
					"						<ns0:BirthCountry>NL</ns0:BirthCountry>\r\n" + 
					"						<ns0:Nationality>NL</ns0:Nationality>\r\n" + 
					"					</ns0:Demographics>\r\n" + 
					"				</ns0:Person>\r\n" + 
					"				<ns0:PartyRegistration>\r\n" + 
					"					<ns0:PartyRegistrationType>IBS001</ns0:PartyRegistrationType>\r\n" + 
					"					<ns0:RegisteredReference>309813621</ns0:RegisteredReference>\r\n" + 
					"				</ns0:PartyRegistration>\r\n" + 
					"				<ns0:PostalAddressContactPointUsage>\r\n" + 
					"					<ns0:PostalAddress>\r\n" + 
					"						<ns0:Street>Weena</ns0:Street>\r\n" + 
					"						<ns0:HouseNumber>555</ns0:HouseNumber>\r\n" + 
					"						<ns0:HouseNumberAddition>zw</ns0:HouseNumberAddition>\r\n" + 
					"						<ns0:Postalcode>3013 AL</ns0:Postalcode>\r\n" + 
					"						<ns0:City>ROTTERDAM</ns0:City>\r\n" + 
					"						<ns0:CountryCode>NL</ns0:CountryCode>\r\n" + 
					"						<ns0:StartDate>2018-02-05</ns0:StartDate>\r\n" + 
					"					</ns0:PostalAddress>\r\n" + 
					"				</ns0:PostalAddressContactPointUsage>\r\n" + 
					"				<ns0:TelephoneNumberContactPointUsage>\r\n" + 
					"					<ns0:TelephoneNumber>\r\n" + 
					"						<ns0:TelephoneNumberInformation>0101234567</ns0:TelephoneNumberInformation>\r\n" + 
					"					</ns0:TelephoneNumber>\r\n" + 
					"				</ns0:TelephoneNumberContactPointUsage>\r\n" + 
					"				<ns0:EmailAddressContactPointUsage>\r\n" + 
					"					<ns0:EmailAddress>\r\n" + 
					"						<ns0:EmailAddressInformation>timo.koole@nn.nl</ns0:EmailAddressInformation>\r\n" + 
					"						<ns0:Usage>01</ns0:Usage>\r\n" + 
					"					</ns0:EmailAddress>\r\n" + 
					"				</ns0:EmailAddressContactPointUsage>\r\n" + 
					"			</ns0:Party>\r\n" + 
					"		</ns0:HandleBusinessPartner_Request>\r\n" + 
					"	</SOAP-ENV:Body>\r\n" + 
					"</SOAP-ENV:Envelope>");

			System.out.println("Sending JMS message to server @" + serverUrl + "...");

			ConnectionFactory factory = new TibjmsQueueConnectionFactory(serverUrl);
			Connection connection = factory.createConnection(userName, password);
			Session session = connection.createSession(false, javax.jms.Session.AUTO_ACKNOWLEDGE);

			// Use createQueue() to enable sending into dynamic queues.
			Queue senderQueue = session.createQueue(senderName);
			MessageProducer sender = session.createProducer(senderQueue);

			/* publish messages */
			for (int i = 0; i < data.size(); i++) {
				TextMessage jmsMessage = session.createTextMessage();
				String text = (String) data.elementAt(i);
				jmsMessage.setText(text);
				sender.send(jmsMessage);
				System.out.println("Sent message: " + text);
			}

			//Close the connection.
			connection.close();

		} catch (JMSException e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

}
