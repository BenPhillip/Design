package _4代理模式Proxy;

public class RealSubject implements Subject {

	@Override
	public void Request() {
		System.out.println("真实的请求");

	}

}
