package _13适配器模式Adpter;

import java.io.Console;
/*
 * 将一个类的接口转换成客户希望的另一个接口
 * Adapter 模式使原本由于接口不兼容的而不能一起工作的类可以一起工作
 */
class Main {
	public Main() {
		
		/**
		 * 系统的行为和数据都正确，但接口不符合时，应该可以考虑使用适配器
		 * 目的使控制范围之外的一个原有对象与某个接口相匹配。
		 * 适配器模式主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致的情况。
		 */
		Target target=new Adapter();
		target.request();
	}
	
}
