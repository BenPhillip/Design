package _2����ģʽStrategy;

public class CashContext {
	private CashSuper cs;
	/**
	 * ���Ժͼ򵥹����Ľ��
	 * @param type ���ǲ��ԵĶ�������շ�����
	 */
	public CashContext(String type) {
		switch(type) {
		  case "�����շ�":
			  cs=new CashNormal();
			  break;
		  case "8��":
			  cs=new CashRebate("0.8");
			  break;
		//..............
		}
	}
	
	public double getResult(double money) {
		return cs.acceptCash(money);
	}
}
