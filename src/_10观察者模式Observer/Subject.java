package _10观察者模式Observer;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
	private List<Observer> obeservers=new ArrayList<>();
	
	public void attach (Observer observer) {
		obeservers.add(observer);
	}
	public void detach(Observer observer) {
		obeservers.remove(observer);
	}
	
	
	public void Notify() {
		for(Observer observer:obeservers) {
			observer.update();
		}
	}
}
