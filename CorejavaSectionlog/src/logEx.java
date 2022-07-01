import org.apache.log4j.Logger;

public class logEx {
		
			static Logger log = Logger.getLogger(logEx.class);
			
			public static void main(String[] args) {


				log.debug("This is a Debug Log1");
				log.info("This is a Info Log");
				log.error("Error in a Project");
			}

		


	}


