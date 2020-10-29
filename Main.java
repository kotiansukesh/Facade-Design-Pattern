/*
Properties
	• Structural design pattern
	• Used when there are multiple interfaces of similar kind of jobs, then we add a Façade interface, which provide better interface to these interfaces and clients. It basically help in routing to related interface.
	• i.e. Drivers, Databases.


Implementation
	• We will implement a Façade helper class, which will route to method related to specific class based on input.

*/

class Main {
  public static void main(String[] args) {
    WebExplorerHelperFacade.generateReports("firefox", "html", "Check Element");
	WebExplorerHelperFacade.generateReports("firefox", "junit", "Check Element");
	WebExplorerHelperFacade.generateReports("chrome", "html", "Check Element");
	WebExplorerHelperFacade.generateReports("chrome", "junit", "Check Element");
  }
}