package _3装饰模式Decorator;

public abstract class Decorator extends Component {
	protected Component component;
	
	public void setComponent(Component component) {
		this.component=component;
	}
	
	/**
	 * 实现抽象方法
	 * 执行的事component的operation()方法
	 */
	@Override
	public void operation() {
		if(this.component!=null) {
			this.component.operation();
		}
	}
}
