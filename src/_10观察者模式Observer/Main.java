package _10�۲���ģʽObserver;
/**
 * һ������ĸı�ͬʱ��Ҫ�ı����������ʱ��
 * ���Ҳ�֪���ж��ٶ����д��ı�ʱ Ӧ��ʹ�ù۲���ģʽ
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
