package _3装饰模式Decorator;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name=name;
	}
	
	public Person() {
		
	}
	
	public void show() {
		System.out.println("装扮的"+this.name);
	}
}
