package _8����ģʽFacade;
/**
 * ��Ҫ�˽���ϵͳ�ķ��������ԣ�������ϣ��Ա�������
 * @author BenPhillip
 *
 */
public class Facade {
	SubSystemOne subSystemOne;
	SubSystemTwo subSystemTwo;
	
	
	public Facade() {
		// TODO Auto-generated constructor stub
		subSystemOne=new SubSystemOne();
		subSystemTwo=new SubSystemTwo();
	}
	
	public void methodA() {
		subSystemOne.methodOne();
	}
	
	public void methidB() {
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
	}
}
