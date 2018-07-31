package _4代理模式Proxy;

public class Proxy implements Subject {
	
	private RealSubject realSubject;

	@Override
	public void Request() {
		if(realSubject==null)
			realSubject=new RealSubject();
		this.realSubject.Request();
	}

}
