package _8门面模式Facade;
/**
 * 需要了解子系统的方法和属性，进行组合，以备外界调用
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
