package _3装饰模式Decorator;

public class Main {
	public static void main(String[]args) {
		
		
		ConcreteComponent c=new ConcreteComponent();
		ConcreteDecoratorA d1=new ConcreteDecoratorA();
		ConcreteDecoratorB d2=new ConcreteDecoratorB();
		/**
		 * 装饰方法：
		 * 1. 用ComcrereComponent实例化对象c
		 * 2. 用ComcreteDecorationA实例化对象d1来包装c
		 * 3. 用ComcrereDecorationB实例化对象d2来包装d1
		 * 4. 最终执行d2.operation();
		 */
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
		
	/*-----------------------------------------*/	
		Person person=new Person("小明");
		Shoes shoes=new Shoes();
		TShirt tShirt=new TShirt();
		
		tShirt.decorate(person);
		shoes.decorate(tShirt);
		shoes.show();
		
		/**
		 * 总结：
		 * 装饰模式是为已有功能动态的添加更多的功能的一种方式
		 * 把类中的装饰功能从类中搬移去除，这样可以简化原有的类
		 */
		

	}
}
