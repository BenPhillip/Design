package _2����ģʽStrategy;
/**
 * �̳������İ���
 * @author BenPhillip
 *
 */
public class Client {

	public static void main(String[] args) {
		double result;
		
		
		/*
		 * ����ģʽ
		 * ��һ�ֶ���һϵ���㷨�ķ���(��װ�㷨)
		 * �㷨��ɵĹ���������ͬ��ֻ��ʵ�ֲ�ͬ
		 * ����ͬ��ʽ���������㷨�����ٸ����㷨��ʹ���㷨��֮������
		 * �ŵ㣺�򻯵�Ԫ���ԣ�ÿ���㷨�����Լ�����
		 */
		Context context;
		context=new Context(new ConcreteStrategyA());//ʵ������ͬ�Ĳ��ԣ���ȡ��ͬ���
		context.contextInterface();
/*------------------------------------------------------------------------------------------*/
		
		/*
		 * �������շѿͻ���
		 * ����ģʽ+�򵥹���
		 */
		CashContext cs=new CashContext("8��");
		result=cs.getResult(2000.5);
		
		//�򵥹������÷�
		//CashSuper cs=CashFactory.createCashAccept("8��");
		//result=cs.getResult(2000.5);
		
		/*�Ա�
		1. �򵥹�����Ҫ��ʶ2���ࡣCashSuper �� CashFactory
		2. ����ģʽֻ����ʶ1���ࡣCashContext
		*/
	}

}
