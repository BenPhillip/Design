package _1�򵥹���ģʽSimpleFactory;
/**
 * �������Ӽ��˳�������
 * @author BenPhillip
 *
 */
public class Calculator {
	public static void main(String [] args) {
		Operation operation;
		String  c="+";
		operation=OperationFactory.createOperate(c);
		System.out.println(operation.getResult());
	}

}
