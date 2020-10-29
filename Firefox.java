import java.sql.Driver;

class Firefox {
	public static Driver getFirefoxDriver() {
		return null;
	}

	public static void generateHTMLReports(String test, Driver driver) {
		System.out.println("Generating HTML report for Firefox");
	}

	public static void generateJUnitReports(String test, Driver driver) {
		System.out.println("Generating JUNIT report for Firefox");
	}

}