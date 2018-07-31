package _4代理模式Proxy;
/**
 * 为其他对象提供一种代理以控制对这个对象的访问
 * @author BenPhillip
 *
 */
public class Main {

	public static void main(String[] args) {
		Proxy proxy=new Proxy();
		proxy.Request();

	}
	
	/**
	 * 使用场合
	 * 1. 远程代理：为一个对象在不同的地址空间提供局部代理。隐藏一个对象存在于不同地址空间的事实。
	 * 2. 虚拟代理： 根据需要创建开销很大的对象。用来存放实例化需要很长时间的真实对象。
	 * 3. 安全代理：用来控制真实对象访问时的权限。对象有不同的访问权限的时候
	 * 4. 智能指引：指当前调用真实的对象时，代理处理一些事。
	 */

}
