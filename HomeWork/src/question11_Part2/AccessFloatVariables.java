package question11_Part2;

import question11_Part1.FloatVariables;

public class AccessFloatVariables {

	public static void main(String[] args) {
		FloatVariables fv = new FloatVariables();
		fv.setF1(2.5f);
		fv.setF2(5.8f);
		System.out.println(fv.getF1());
		System.out.println(fv.getF2());
	}
	


	
}
