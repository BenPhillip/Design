package _7ģ�巽��TemplateMethod;

abstract class AbstractClass {
	public abstract void PrimitiveOperation1();
	public abstract void PrimitiveOperation2();
	
	public void TemplateMethod() {
		PrimitiveOperation1();
		PrimitiveOperation2();
		System.out.println("�㷨�Ǽ�");
	}
}
