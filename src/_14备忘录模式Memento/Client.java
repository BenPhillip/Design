package _14����¼ģʽMemento;

public class Client {
	public static void main(String[] args) {
		/**
		 * ��ʼ״̬on
		 */
		Originator o=new Originator();
		o.setState("on");
		o.show();
		/**
		 * ����״̬
		 * 
		 */
		Caretaker caretaker=new Caretaker();
		caretaker.setMemento(o.createMemento());
		/**
		 * �޸�״̬Ϊoff
		 *
		 */
		o.setState("off");
		o.show();
		/**
		 * �ָ�״̬
		 */
		o.setMemento(caretaker.getMemento());
		o.show();
		
	}
}
