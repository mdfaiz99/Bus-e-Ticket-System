
public class Passenger {

	private String name;
	private String contactNo;
	private Trip trip;
	private String seatId;

	public Passenger(String name, String num, String seatId, Trip trip) {
		this.name = name;
		this.contactNo = num;
		this.trip = trip;
		this.seatId = seatId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSeatId(String id) {
		this.seatId = id;
	}

	public void setContactNo(String contact) {
		contactNo = contact;
	}

	public void setTrip(String id) {
		this.trip = trip;
	}

	public String getName() {
		return name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public Trip getTrip() {
		return trip;
	}

	public String getSeatId() {
		return seatId;
	}

}
