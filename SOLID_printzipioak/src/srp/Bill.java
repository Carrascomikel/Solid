package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
	Deduction d=new Deduction(deductionPercentage);
	billDeduction=d.deductionCalculator(billAmount);
	
	Vat vat=new Vat();
	VAT=vat.vatCalculator(billAmount, code);
	
	billTotal = (billAmount - billDeduction) + VAT;
	}

}
