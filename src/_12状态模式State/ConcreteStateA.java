package _12״̬ģʽState;



class ConcreteStateA extends State {
	
    @Override
    public void handle(Context context) {
    	context.setState(new ConcreteStateB());
    }
}
