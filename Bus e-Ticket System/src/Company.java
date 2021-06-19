import java.util.ArrayList;

public class Company {
		
	private String name;
	private ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	private ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
	private ArrayList<Member> memberList = new ArrayList<Member>();
	private ArrayList<Bus> busList = new ArrayList<Bus>();
	private ArrayList<Trip> tripList = new ArrayList<Trip>();
	private String places[] = { "Penang", "Melaka", "Johor", "K.Lumpur", "N.Sembilan" };
	private String time[] = { "08:00", "10:00", "12:00", "14:00", "16:00", "18:00" };

	public String ETA[] = { "7hrs", "9hrs15mins", "5hrs", "5hrs50mins", "1hr30mins", "2hrs20mins", "3hrs30mins", "4hrs30mins", "1hr", "4hrs20mins"};

	public Company(String n) {
		name = n;

		Member member1 = new Member("Faiz", "Kader", "user1", "user1");
		Member member2 = new Member("Ashraff", "Hadi", "user2", "user2");
		Member member3 = new Member("Amien", "Talib", "user3", "user3");

		Driver driver1 = new Driver("Haikal", "D1");
		Driver driver2 = new Driver("Aiman", "D2");
		Driver driver3 = new Driver("Hasni", "D3");

		Bus bus1 = new Bus("B1", driver1);
		Bus bus2 = new Bus("B2", driver2);
		Bus bus3 = new Bus("B3", driver3);
		Bus bus4 = new Bus("B4", driver1);
		Bus bus5 = new Bus("B5", driver2);
		Bus bus6 = new Bus("B6", driver3);

		memberList.add(member1);
		memberList.add(member2);
		busList.add(bus1);
		busList.add(bus2);
		busList.add(bus3);
		busList.add(bus4);
		busList.add(bus5);
		busList.add(bus6);
		
		tripList.add(new Trip("T01", places[0], places[1], time[0], ETA[0], 58.00, bus1)); //penang to melaka
		tripList.add(new Trip("T02", places[0], places[2], time[0], ETA[1], 70.00, bus1)); //penang to johor
		tripList.add(new Trip("T03", places[0], places[3], time[0], ETA[2], 38.00, bus1)); //penang to kl
		tripList.add(new Trip("T04", places[0], places[4], time[0], ETA[3], 48.00, bus1)); //penang to ns
		
		tripList.add(new Trip("T05", places[1], places[0], time[1], ETA[0], 58.00, bus2)); //melaka to penang
		tripList.add(new Trip("T06", places[1], places[2], time[2], ETA[4], 28.00, bus4)); //melaka to johor
		tripList.add(new Trip("T07", places[1], places[3], time[1], ETA[5], 18.00, bus2)); //melaka to kl
		tripList.add(new Trip("T08", places[1], places[4], time[1], ETA[6], 10.00, bus2)); //melaka to ns
		
		tripList.add(new Trip("T09", places[2], places[0], time[2], ETA[1], 70.00, bus3)); //johor to penang
		tripList.add(new Trip("T10", places[2], places[1], time[2], ETA[4], 28.00, bus3)); //johor to melaka
		tripList.add(new Trip("T11", places[2], places[3], time[2], ETA[7], 38.00, bus3)); //johor to kl
		tripList.add(new Trip("T12", places[2], places[4], time[2], ETA[9], 45.00, bus3)); //johor to ns
		
		tripList.add(new Trip("T13", places[3], places[0], time[4], ETA[2], 38.00, bus4)); //kl to penang
		tripList.add(new Trip("T14", places[3], places[1], time[3], ETA[5], 18.00, bus5)); //kl to melaka
		tripList.add(new Trip("T15", places[3], places[2], time[3], ETA[7], 38.00, bus5)); //kl to johor
		tripList.add(new Trip("T16", places[3], places[4], time[3], ETA[8], 10.00, bus5)); //kl to ns
		
		tripList.add(new Trip("T17", places[4], places[0], time[4], ETA[3], 38.00, bus6)); //ns to penang
		tripList.add(new Trip("T18", places[4], places[1], time[4], ETA[6], 18.00, bus6)); //ns to melaka
		tripList.add(new Trip("T19", places[4], places[2], time[4], ETA[9], 45.00, bus6)); //ns to johor
		tripList.add(new Trip("T20", places[4], places[3], time[4], ETA[8], 10.00, bus6)); //ns to kl
	}

	public String getName() {
		return name;
	}

	public Member getMember(String id, String pwd) {
		for (Member member : memberList) {
			if (member.getMemberId().equals(id) && member.getPassword().equals(pwd))
				return member;
		}
		return null;
	}

	public Trip getTrip(String from, String to) {
		for (Trip trip : tripList) {
			if (trip.getSource().equals(from) && trip.getDestination().equals(to)) {
				return trip;
			}
		}
		return null;
	}

	public void displayTrip(String from, String to) {
		for (Trip trip : tripList) {
			if (trip.getSource().equals(from) && trip.getDestination().equals(to)) {
				trip.displayDetail();
			}
		}
	}

	public double showTicketPrice() {
		double price = 0;
		for (Ticket ticket : ticketList) {
			price += ticket.getPrice();
		}
		return price;

	}

	public int numberOfTicket() {
		return ticketList.size();
	}

	public void displayBusSeat(String tripId) {
		for (Trip trip : tripList) {
			if (trip.getTripId().equals(tripId)) {
				trip.displayBusSeat();
			}
		}

		System.out.println();
	}

	public void bookSeat(String tripId, String name, String contact, String seatId) {
		for (Trip trip : tripList) {
			if (trip.getTripId().equals(tripId)) {
				passengerList.add(new Passenger(name, contact, seatId, trip));
				trip.bookSeat(seatId);
			}
		}

	}

	public void addTicket() {
		for (Passenger passenger : passengerList) {
			Trip trip = passenger.getTrip();
			Ticket ticket = new Ticket(passenger, trip);
			ticketList.add(ticket);
		}
	}

	public void displayAllTicket() {
		for (Ticket ticket : ticketList) {
			ticket.displayTicketInfo();
			System.out.println();
		}
	}
}
