package _3װ��ģʽDecorator;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;
	
	@Override
	public void operation() {
		super.operation();
		this.addedState="New State";
		System.out.println("����װ�ζ���A�Ĳ���");
	}
}
