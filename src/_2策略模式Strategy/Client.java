package _2策略模式Strategy;
/**
 * 商场促销的案例
 * @author BenPhillip
 *
 */
public class Client {

	public static void main(String[] args) {
		double result;
		
		
		/*
		 * 策略模式
		 * 是一种定义一系列算法的方法(封装算法)
		 * 算法完成的工作内容相同，只是实现不同
		 * 以相同方式调用所有算法，减少各类算法和使用算法类之间的耦合
		 * 优点：简化单元测试，每个算法都有自己的类
		 */
		Context context;
		context=new Context(new ConcreteStrategyA());//实例化不同的策略，获取不同结果
		context.contextInterface();
/*------------------------------------------------------------------------------------------*/
		
		/*
		 * 改造后的收费客户端
		 * 策略模式+简单工厂
		 */
		CashContext cs=new CashContext("8折");
		result=cs.getResult(2000.5);
		
		//简单工厂的用法
		//CashSuper cs=CashFactory.createCashAccept("8折");
		//result=cs.getResult(2000.5);
		
		/*对比
		1. 简单工厂需要认识2个类。CashSuper 和 CashFactory
		2. 策略模式只需认识1个类。CashContext
		*/
	}

}
