package _1简单工厂模式SimpleFactory;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		if(numberB==0)
			throw new RuntimeException("");	
		return numberA/numberB;
	}

}
