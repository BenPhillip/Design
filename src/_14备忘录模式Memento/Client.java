package _14±¸ÍüÂ¼Ä£Ê½Memento;

public class Client {
	public static void main(String[] args) {
		/**
		 * ³õÊ¼×´Ì¬on
		 */
		Originator o=new Originator();
		o.setState("on");
		o.show();
		/**
		 * ±£´æ×´Ì¬
		 * 
		 */
		Caretaker caretaker=new Caretaker();
		caretaker.setMemento(o.createMemento());
		/**
		 * ÐÞ¸Ä×´Ì¬Îªoff
		 *
		 */
		o.setState("off");
		o.show();
		/**
		 * »Ö¸´×´Ì¬
		 */
		o.setMemento(caretaker.getMemento());
		o.show();
		
	}
}
