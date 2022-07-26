package Calculator;

public class CalculatorDef implements ArithmeticCal{


	@Override
	public int addition(int num1, int num2) {
		// TODO Auto-generated method stub
		int res=0;
		res=num1+num2;
		return res;
	}

	@Override
	public int subraction(int num1, int num2) {
		int res=0;
		res=num1-num2;
		return res;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int multiplication(int num1, int num2) {
		// TODO Auto-generated method stub
		int res=0;
		res=num1*num2;
		return res;
	}

	@Override
	public float division(int num1, int num2) {
		// TODO Auto-generated method stub
		float res = 0;
		if (num2>0){
			res=num1/num2;
		}
		return res;
	}

	@Override
	public int modulo(int num1, int num2) {
		// TODO Auto-generated method stub
		int res=0;
		if(num2>0) {
			res=num1%num2;
		}
		return res;
	}
	

}
