package question_11;

import question_11b.FloatVariables;

public class Floats {

	public static void main(String[] args) {

		FloatVariables fl = new FloatVariables();

		fl.floatA(45.83f);
		fl.floatB(65.96f);

		System.out.println("Result of adding 2 float numbers is " + (fl.getA() + fl.getB()));

	}

}
