package _12状态模式State;
/**
 * 当一个对象的内在状态改变时允许改变其的行为
 * 这个对象看起来像是改变了其类
 *  
 *  主要解决的时当控制一个对象的状态转换的条件表达式过于复杂时的情况
 *  把状态的判断逻辑转移到表示不同状态的一系列类当中去。
 *
 */
public class Main {

	public static void main(String[] args) {
		/**
		 * 设置A为初始状态
		 */
		Context context=new Context(new ConcreteStateA());
		//不断请求状态来 改变模式
		context.request();
		context.request();
		context.request();
		context.request();

	}

}
