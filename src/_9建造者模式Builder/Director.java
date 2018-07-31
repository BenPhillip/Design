package _9建造者模式Builder;
/*
 * 指挥者类
 */
class Director {
	public void Construct(Builder builder) {
		builder.builderPartA();
		builder.builderPartB();
	}
}
