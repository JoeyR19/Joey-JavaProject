package MyPackage;

public class QFifteenImpl implements QFifteenInterface {

	@Override
	public double add(double numa, double numb) {
		// TODO Auto-generated method stub
		return numa + numb;
	}

	@Override
	public double subtract(double numa, double numb) {
		// TODO Auto-generated method stub
		return numa - numb;
	}

	@Override
	public double mult(double numa, double numb) {
		// TODO Auto-generated method stub
		return numa * numb;
	}

	@Override
	public double div(double numa, double numb) {
		// TODO Auto-generated method stub
		if (numb == 0) {
			System.out.println("Can't divide by 0");
		} else {
			return numa / numb;
		}
		return 0;
	}
	
}