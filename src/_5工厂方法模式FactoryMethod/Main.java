package _5工厂方法模式FactoryMethod;
/**
 * 工厂方法 把简单工厂的内部逻辑判断移到了客户端进行本来修改工厂类 现在修改客户端
 * 是简单工厂的进一步抽象和推广 使用了多态性。
 * 但是每添加一个产品就要创建一个产品工厂类，增加了额外的开发。
 * @author BenPhillip
 *
 */
public class Main {

	public static void main(String[] args) {
		
		IFactory factory=new VolunteerFactory();//只需修改这个工厂就可以了
		LeiFeng lf=factory.createLeiFeng();
		lf.doWork();

	}

}
