package _4代理模式Proxy;

import java.lang.reflect.Proxy;

/**
 * 定义了RealSubject Proxy的公共接口 
 * 这样可以使用RealSubject的地方都可以使用Proxy
 * @author BenPhillip
 *
 */
public interface Subject {
	void Request();

}
