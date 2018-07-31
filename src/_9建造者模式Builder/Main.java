package _9建造者模式Builder;
/**
 * 创建复杂的对象，这些对象内部构建间的构造顺序通常是稳定的，但是对象内部的构建通常面临着复杂的变化。
 * 创建复杂对象的算法应该独立于该对象的组成部分以及他们的装配方式时适用的模式
 * @author BenPhillip
 *
 */
 class Main {

	public static void main(String[] args) {
		Director director=new Director();
		Builder builder1=new ConcreteBuilder1();
		Builder builder2=new ConcreteBuilder2();
		
		director.Construct(builder1);
		Product product=builder1.getResult();
		product.show();
		
		director.Construct(builder2);
		product=builder2.getResult();
		product.show();

	}

}
