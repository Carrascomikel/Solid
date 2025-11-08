package dip;

public class Vat implements IVat {

	private double percentage = 0.16;
	@Override
	public float calcVAT(float billAmount) {
		return (float) (billAmount*percentage);	
	}

}
