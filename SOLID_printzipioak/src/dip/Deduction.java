package dip;

public class Deduction implements IDeduction {

	@Override
	public float calcDeduction(float billAmount, float deductionPercentage) {
		float billDeduction;
		if (billAmount >50000)
			 billDeduction = (billAmount * deductionPercentage +5) / 100;
		else 
			billDeduction = (billAmount * deductionPercentage)/100;
		
		return billDeduction;
	}

}
