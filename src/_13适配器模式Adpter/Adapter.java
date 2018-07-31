package _13ÊÊÅäÆ÷Ä£Ê½Adpter;

class Adapter extends Target {
	private Adaptee adaptee=new Adaptee();
	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
