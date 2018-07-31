package _3װ��ģʽDecorator;

/**
 * ������(Decorator)
 * @author BenPhillip
 *
 */
public class Finery extends Person {
	protected Person component;
	
	public void decorate(Person person) {
		this.component=person;
	}
	
	@Override
	public void show() {
		if(this.component!=null) {
			this.component.show();
		}
	}
}
