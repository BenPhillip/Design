package _3装饰模式Decorator;

/**
 * 服饰类(Decorator)
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
