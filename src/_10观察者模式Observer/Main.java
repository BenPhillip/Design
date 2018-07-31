package _10观察者模式Observer;
/**
 * 一个对象的改变同时需要改变其他对象的时候
 * 而且不知道有多少对象有待改变时 应当使用观察者模式
 * @author BenPhillip
 *
 */
class Main {

	public static void main(String[] args) {
		ConcreteSubject subject=new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject, "X"));
		subject.attach(new ConcreteObserver(subject, "Y"));
		subject.attach(new ConcreteObserver(subject, "S"));
		
		subject.setSubjectState("ABC");
		subject.Notify();

	}

}
