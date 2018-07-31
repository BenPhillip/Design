package _2策略模式Strategy;

public class CashContext {
	private CashSuper cs;
	/**
	 * 策略和简单工厂的结合
	 * @param type 不是策略的对象而是收费类型
	 */
	public CashContext(String type) {
		switch(type) {
		  case "正常收费":
			  cs=new CashNormal();
			  break;
		  case "8折":
			  cs=new CashRebate("0.8");
			  break;
		//..............
		}
	}
	
	public double getResult(double money) {
		return cs.acceptCash(money);
	}
}
