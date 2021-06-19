
public class Seat {
	private String seatId;
	private Boolean isBook;

	public Seat(String m, boolean b) {
		seatId = m;
		isBook = b;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getSeatId() {
		return seatId;
	}

	public boolean getBookStatus() {
		return isBook;
	}

	public void book() {
		isBook = true;
	}

	public void unbook() {
		isBook = false;
	}
}
