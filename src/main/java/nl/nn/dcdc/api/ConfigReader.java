package nl.nn.dcdc.api;

import java.io.File;
import java.util.Properties;
import java.util.Vector;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.tibco.tibjms.TibjmsQueueConnectionFactory;

public class ConfigReader {

	Properties configFile;

	public ConfigReader() {

		configFile = new java.util.Properties();
		try {
			configFile.load(this.getClass().getClassLoader().getResourceAsStream("file/config.cfg"));
		} catch (Exception eta) {
			eta.printStackTrace();
		}
	}

	private String getProperty(String key) {
		String value = this.configFile.getProperty(key);
		return value;
	}

	public String getServerUrl() {
		return getProperty("serverUrl");
	}

	public String getUserName() {
		return getProperty("userName");
	}

	public String getPassword() {
		return getProperty("password");
	}

	public String getQueueName() {
		return getProperty("senderName");
	}

	public String getReceiver() {
		return getProperty("receiverName");
	}

	public static void main(String[] args) {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		ConfigReader configReader = new ConfigReader();
		System.out.println(configReader.getServerUrl());
	}

}
