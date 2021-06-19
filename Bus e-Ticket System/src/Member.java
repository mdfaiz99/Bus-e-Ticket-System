
public class Member {

	private String firstName;
	private String lastName;
	private String memberId;
	private String password;

	public Member(String f, String l, String m, String p) {
		firstName = f;
		lastName = l;
		memberId = m;
		password = p;
	}

	public Member(String id) {
		memberId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getPassword() {
		return password;
	}
}
