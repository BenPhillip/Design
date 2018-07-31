package _12״̬ģʽState;

class ConcreteStateB extends State {
	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}

}
