package _6原型模式Prototype;

public class Client {

	public static void main(String[] args) {
		/*ConcretePrototype c1=new ConcretePrototype("2018");
		ConcretePrototype c2=(ConcretePrototype)c1.Clone();
*/		
		Resume resume=new Resume("ben","boy");
		
		Resume resume2=(Resume)resume.clone();
		System.out.println(resume.getName());
		resume2.setName("ben1");
		System.out.println(resume.getName());
		System.out.println(resume2.getName());
		
		
	}

}
