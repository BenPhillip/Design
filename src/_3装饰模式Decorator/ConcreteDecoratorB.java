package _3װ��ģʽDecorator;

public class ConcreteDecoratorB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		AddedBehavior();
		System.out.println("����װ����B�Ĳ���");
	}

	private void AddedBehavior() {
		System.out.println("AddedBehavior B");
		
	}
	
}
