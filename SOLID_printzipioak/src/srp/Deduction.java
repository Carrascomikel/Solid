package srp;

public class Deduction {
	private int deductionPercentage;
	public Deduction(int deductionPercentage) {
		this.deductionPercentage=deductionPercentage;	
	}
	public float deductionCalculator(float billAmount) {
		float billDeduction;
		if (billAmount >50000)
			 billDeduction = (billAmount * deductionPercentage +5) / 100;
		else 
			billDeduction = (billAmount * deductionPercentage)/100;
		
		return billDeduction;
		
	}

}
