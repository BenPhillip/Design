package _1简单工厂模式SimpleFactory;
/**
 * 工厂依赖一个运算类
 * 各种操作符运算继承了运算类
 * 通过switch分支来获取对象
 * @author BenPhillip
 *
 */
public class OperationFactory {
	public static Operation createOperate(String operate) {
		//多态
		Operation oper=null;
		switch(operate) {
			case "+":
				oper=new OperationAdd();
				break;
			case "-":
				oper=new OperationSub();
				break;
			case "*":
				oper=new OperationMul();
				break;
			case "/":
				oper=new OperationDiv();
				break;					 
		}
		
		return oper;
	}
}
