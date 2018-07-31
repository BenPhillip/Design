package _10观察者模式Observer;

class ConcreteSubject extends Subject{
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
	
}
