import java.util.ArrayList;
import java.text.DecimalFormat;

public class Trip {

	DecimalFormat dc = new DecimalFormat("0.00");
	private Trip_Description tripDetail;
	private String tripId;
	private boolean available = true;
	private Bus bus;
	private double price;
	private String etaTime;

	public Trip(String id, String from, String to, String departTime, String etaTime, double price, Bus bus) {
		this.tripId = id;
		this.bus = bus;
		tripDetail = new Trip_Description(from, to, departTime, etaTime);
		this.price = price;
	}

	public String getDepartTime() {
		return tripDetail.getDepartTime();
	}

	public String getEtaTime() {
		return tripDetail.getEtaTime();
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setTripId(String id) {
		this.tripId = id;
	}

	public String getTripId() {
		return tripId;
	}

	public void bookSeat(String id) {
		bus.bookSeat(id);
	}

	public void displayBusSeat() {
		bus.displaySeat();
	}

	public void chaeckAvailability() {
		if (bus.getAvailability() == true) {
			available = true;
		} 
		else {
			available = false;
		}
	}

	public boolean getAvailability() {
		return available;
	}

	public String getSource() {
		return tripDetail.getFrom();
	}

	public String getDestination() {
		return tripDetail.getTo();
	}

	public void displayDetail() {
		System.out.print(tripId + "         " + bus.getBusId() + "       ");
		tripDetail.displayTripInfo();
		System.out.print("  RM" + dc.format(price));
		System.out.println();
	}

}
