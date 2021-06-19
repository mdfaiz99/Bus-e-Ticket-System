import java.util.ArrayList;

public class Bus {

	private String busId;
	private ArrayList<Seat> seatList = new ArrayList<Seat>();
	private boolean availability;
	private Driver driver;

	// constructor create bus with seats
	public Bus(String m, Driver driver) {
		busId = m;
		this.driver = driver;
		availability = true;
		
		for (char x = 'A'; x <= 'J'; x++) {
			String tag = Character.toString(x);
			for (int i = 1; i <= 3; i++) {
				Seat seat = new Seat(tag + i, false);
				seatList.add(seat);
			}
		}
	}

	public Bus() {
		for (char x = 'A'; x <= 'J'; x++) {
			String tag = Character.toString(x);
			for (int i = 1; i <= 3; i++) {
				Seat seat = new Seat((tag + i), false);
				seatList.add(seat);
			}
		}
	}

	public String getDriverName() {
		return driver.gettName();
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getBusId() {
		return busId;
	}

	public void bookSeat(String id) {
		for (Seat seat : seatList) {
			if (seat.getSeatId().equals(id)) {
				seat.book();
			}
		}
	}

	public void checkAvailability() {
		if (availability == true) {
			for (Seat seat : seatList) {
				if (seat.getBookStatus() == true) {
					availability = false;
				}
			}
		} 
		else {
			availability = true;
		}
	}

	public boolean getAvailability() {
		return availability;
	}

	public void displaySeat() {
		if (seatList.get(0).getBookStatus() == true) {
			System.out.print(" X   ");
		} 
		else {
			System.out.print(" " + seatList.get(0).getSeatId() + "  ");
		}
		
		for (int x = 1; x < seatList.size(); x++) {
			
			if (seatList.get(x).getBookStatus() == false) {

				if (x % 3 == 0) {
					System.out.println();
					System.out.print(" " + seatList.get(x).getSeatId() + "  ");
				} 
				else {
					System.out.print("" + seatList.get(x).getSeatId() + "");
				}
			} 
			
			else {
				if (x % 3 == 0) {
					System.out.println();
					System.out.print(" X   ");
				} 
				else {
					System.out.print("X ");
				}
			}

		}
	}
}
