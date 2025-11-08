package srp;

public class Vat {
	private double percentage=0.16;
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public float vatCalculator(float billamount,String code) {
		if(code.equals("0"))
			return 0;
		else
			return(float) (billamount*percentage);
	}
}
