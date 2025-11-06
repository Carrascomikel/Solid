package srp;

public class Vat {
	private double percentage=0.16;
	public float vatCalculator(float billamount,String code) {
		if(code.equals("0"))
			return 0;
		else
			return(float) (billamount*percentage);
	}
}
