package _9������ģʽBuilder;

class ConcreteBuilder1 extends Builder {
	
	private Product product=new Product();
	@Override
	public void builderPartA() {
		product.add("����A");

	}

	@Override
	public void builderPartB() {
		product.add("����B");

	}

	@Override
	public Product getResult() {
		
		return product;
	}

}
