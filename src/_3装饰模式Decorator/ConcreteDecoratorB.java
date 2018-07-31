package _3装饰模式Decorator;

public class ConcreteDecoratorB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		AddedBehavior();
		System.out.println("具体装饰类B的操作");
	}

	private void AddedBehavior() {
		System.out.println("AddedBehavior B");
		
	}
	
}
