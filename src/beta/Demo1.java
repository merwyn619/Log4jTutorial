package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I have clicked the button");
		if(5>4)
			log.info("Button is displayed");
		log.error("Button is not displayed");
		log.fatal("Button is missing");
	}

}
