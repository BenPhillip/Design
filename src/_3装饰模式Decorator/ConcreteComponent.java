package _3装饰模式Decorator;
/**
 *  Concrete 实例化的，具体的
 * @author BenPhillip
 *
 */
public class ConcreteComponent extends Component{

	@Override
	public void operation() {
		System.out.println("具体对象的操作");
		
	}
	
}
