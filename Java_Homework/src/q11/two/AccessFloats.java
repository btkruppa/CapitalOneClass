package q11.two;

import q11.one.FloatVariables;

public class AccessFloats {

	public static void main(String[] args) {
		FloatVariables fv = new FloatVariables();
		fv.setF1(12.01f);
		fv.setF2(21.56f);
	
		System.out.println("Float One: " + fv.getF1());
		System.out.println("Float Two: " + fv.getF2());

	}

}
