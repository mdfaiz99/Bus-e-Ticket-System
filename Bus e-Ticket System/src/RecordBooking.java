
public class RecordBooking {
	private String source;
	private String destination;
	private String departDate;
	private String returnDate;
	private String triptype;
	private String seatnumber;
	private String time;
	private int pax;

	public void setSource(String departure) {
		this.source = departure;
	}

	public void setDestination(String arrival) {
		this.destination = arrival;
	}

	public void setDepartDate(String date) {
		this.departDate = date;
	}

	public void setReturnDate(String date) {
		this.returnDate = date;
	}

	public void setTripType(String seatclass) {
		this.triptype = seatclass;
	}

	public void setSeatnumber(String seatnumber) {
		this.seatnumber = seatnumber;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setPaxNum(int pax) {
		this.pax = pax;
	}

	public int getPaxNum() {
		return pax;
	}

	public String getTime() {
		return time;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public String getDepartDate() {
		return departDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public String geTripType() {
		return triptype;
	}

	public String getSeatnumber() {
		return seatnumber;
	}
}
