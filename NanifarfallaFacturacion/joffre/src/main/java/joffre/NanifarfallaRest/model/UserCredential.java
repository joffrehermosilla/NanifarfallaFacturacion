package joffre.NanifarfallaRest.model;

public class UserCredential {

	@Override
	public String toString() {
		return "UserCredential [username=" + username + ", password=" + password + "]";
	}

	private String username;

	private String password;

	public UserCredential(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public UserCredential() {

	}

	public void setPassword(String password) {
		this.password = password;
	}
}
