package _10观察者模式Observer;

class ConcreteObserver extends Observer {
	private String name;
	private String observerState;
	private ConcreteSubject subject;

	public ConcreteObserver(ConcreteSubject subject,String name) {
		this.name=name;
		this.subject=subject;
	}
	
	@Override
	public void update() {
		observerState=subject.getSubjectState();
		System.out.printf("观察者%s状态是%s",name,observerState);
		System.out.println("");

	}

	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
	
	

}
