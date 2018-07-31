package _9建造者模式Builder;

class ConcreteBuilder2 extends Builder {
	private Product product=new Product();
	
	@Override
	public void builderPartA() {
		product.add("部件X");

	}

	@Override
	public void builderPartB() {
		product.add("部件Y");

	}

	@Override
	public Product getResult() {
		
		return product;
	}

}
