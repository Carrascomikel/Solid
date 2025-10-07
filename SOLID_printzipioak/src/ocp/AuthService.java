package ocp;

public class AuthService {
	private Service service;
	public AuthService(Service service) {
		this.service=service;
	}
	public boolean signIn(String username,String pass) {
		return service.signIn(username, pass);
	}
}
