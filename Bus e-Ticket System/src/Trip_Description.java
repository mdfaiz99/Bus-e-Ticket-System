
public class Trip_Description {

	private String from;
	private String to;
	private String departureTime;
	private String etaTime;

	public Trip_Description(String from, String to, String departureTime, String etaTime) {
		this.from = from;
		this.to = to;
		this.departureTime = departureTime;
		this.etaTime = etaTime;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setDepartTime(String departtime) {
		this.departureTime = departtime;
	}

	public String getTo() {
		return to;
	}

	public String getFrom() {
		return from;
	}

	public String getDepartTime() {
		return departureTime;
	}

	public String getEtaTime() {
		return etaTime;
	}

	public void displayTripInfo() {
		System.out.print(from + "   " + to + "   " + departureTime + "  " + etaTime);
	}
}
