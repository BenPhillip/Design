package _1�򵥹���ģʽSimpleFactory;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		if(numberB==0)
			throw new RuntimeException("");	
		return numberA/numberB;
	}

}
