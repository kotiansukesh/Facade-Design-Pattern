import java.sql.Driver;

class Chrome {
	public static Driver getChromeDriver() {
		return null;
	}

	public static void generateHTMLReports(String test, Driver driver) {
		System.out.println("Generating HTML report for Chrome");
	}

	public static void generateJUnitReports(String test, Driver driver) {
		System.out.println("Generating JUNIT report for Chrome");
	}

}