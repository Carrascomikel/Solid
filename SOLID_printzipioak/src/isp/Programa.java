package isp;

public class Programa {
	public static void main(String[] args) {
		GmailAccount gA = new GmailAccount();
		EmailSender.sendEmail(gA, "Mezua");
	}
}
