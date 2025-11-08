package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public float VATAmount;
	public int deductionPercentage;
	
	private IDeduction d;
	private IVat v;
	public Bill(IDeduction d,IVat v) {
		this.d=d;
		this.v=v;
	}
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
	// Dedukzioa kalkulatu
	
	billDeduction = d.calcDeduction(billAmount ,deductionPercentage);
	// VAT kalkulatzen dugu

	VATAmount = v.calcVAT(billAmount);
	// Totala kalkulatzen dugu
	billTotal = (billAmount - billDeduction) + VATAmount;
	}

}
