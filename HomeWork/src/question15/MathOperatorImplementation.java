package question15;

public class MathOperatorImplementation implements MathOperations{

	@Override
	public int myAddition(int x, int y) {
		int z = x + y;
		return z;
	}

	@Override
	public int mySubtraction(int x, int y) {
		int z = x - y;
		return z;
	}

	@Override
	public int myMultiplication(int x, int y) {
		int z = x * y;
		return z;
	}

	@Override
	public int myDivision(int x, int y) {
		if(y == 0){
			return -1;
		}else{
		int z = x / y;
		return z;
		}
	}

}
