package _3װ��ģʽDecorator;

public class Main {
	public static void main(String[]args) {
		
		
		ConcreteComponent c=new ConcreteComponent();
		ConcreteDecoratorA d1=new ConcreteDecoratorA();
		ConcreteDecoratorB d2=new ConcreteDecoratorB();
		/**
		 * װ�η�����
		 * 1. ��ComcrereComponentʵ��������c
		 * 2. ��ComcreteDecorationAʵ��������d1����װc
		 * 3. ��ComcrereDecorationBʵ��������d2����װd1
		 * 4. ����ִ��d2.operation();
		 */
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
		
	/*-----------------------------------------*/	
		Person person=new Person("С��");
		Shoes shoes=new Shoes();
		TShirt tShirt=new TShirt();
		
		tShirt.decorate(person);
		shoes.decorate(tShirt);
		shoes.show();
		
		/**
		 * �ܽ᣺
		 * װ��ģʽ��Ϊ���й��ܶ�̬����Ӹ���Ĺ��ܵ�һ�ַ�ʽ
		 * �����е�װ�ι��ܴ����а���ȥ�����������Լ�ԭ�е���
		 */
		

	}
}
