package _9������ģʽBuilder;

class ConcreteBuilder2 extends Builder {
	private Product product=new Product();
	
	@Override
	public void builderPartA() {
		product.add("����X");

	}

	@Override
	public void builderPartB() {
		product.add("����Y");

	}

	@Override
	public Product getResult() {
		
		return product;
	}

}
