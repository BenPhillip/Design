package _13������ģʽAdpter;

class Adapter extends Target {
	private Adaptee adaptee=new Adaptee();
	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
