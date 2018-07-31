package _7模板方法TemplateMethod;
/**
 *把不变的行为放到超类，去除子类的重复行为
 * @author BenPhillip
 *
 */
public class Main {

	public static void main(String[] args) {
		AbstractClass aClass;
		aClass=new ConcreteClassA();
		aClass.TemplateMethod();

	}

}
