package _1简单工厂模式SimpleFactory;
/**
 * 计算器加减乘除的例子
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
