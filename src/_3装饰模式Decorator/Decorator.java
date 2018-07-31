package _3װ��ģʽDecorator;

public abstract class Decorator extends Component {
	protected Component component;
	
	public void setComponent(Component component) {
		this.component=component;
	}
	
	/**
	 * ʵ�ֳ��󷽷�
	 * ִ�е���component��operation()����
	 */
	@Override
	public void operation() {
		if(this.component!=null) {
			this.component.operation();
		}
	}
}
