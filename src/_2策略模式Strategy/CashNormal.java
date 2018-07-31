package _2策略模式Strategy;
//正常收费子类
public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(double money) {
		
		return money;
	}

}
