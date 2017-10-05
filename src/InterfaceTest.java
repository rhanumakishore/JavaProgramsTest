
public class InterfaceTest {
	
	public static void printFlightDetails(IFlightVendor flightVendor)
	{
		flightVendor.getAllAvailableFlights();
	}

	public static void main(String[] args) {
		
		
		IFlightVendor airIndia = new AirIndia();
		printFlightDetails(airIndia);
		IFlightVendor spiceJet = new SpiceJet();
		printFlightDetails(spiceJet);
	}

}
