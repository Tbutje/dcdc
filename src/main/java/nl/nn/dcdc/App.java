package nl.nn.dcdc;

import nl.nn.dcdc.api.TibcoQueue;
import nl.nn.dcdc.api.bpxsd.XmlGenerator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		XmlGenerator.main( args );
		TibcoQueue.main(args);

	}
}
