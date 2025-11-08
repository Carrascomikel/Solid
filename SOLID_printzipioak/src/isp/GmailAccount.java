package isp;

public class GmailAccount implements IEmail {
	String name, emailAddress;

	@Override
	public String getAddress() {
		return this.emailAddress;
	}
	
}
