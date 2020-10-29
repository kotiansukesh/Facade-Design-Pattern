import java.sql.Driver;

class WebExplorerHelperFacade {
	
	public static void generateReports(String explorer, String report, String test) {
		Driver driver = null;

		switch(explorer) {
			case "firefox" : driver = Firefox.getFirefoxDriver();
							switch(report) {
								case "html" 	: 	Firefox.generateHTMLReports(test, driver);
													break;
								case "junit" 	: 	Firefox.generateJUnitReports(test, driver);
													break;
							}
							break;
			
			case "chrome" : driver = Chrome.getChromeDriver();
							switch(report) {
								case "html" 	: 	Chrome.generateHTMLReports(test, driver);
													break;
								case "junit" 	: 	Chrome.generateJUnitReports(test, driver);
													break;
							}						
		}
	}

}