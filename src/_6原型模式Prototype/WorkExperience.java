package _6原型模式Prototype;

import java.io.Serializable;

/**
 * 1. Serializable 实现序列化
 * 2. clone  实现浅拷贝
 * @author BenPhillip
 *
 */
public class WorkExperience implements Cloneable {
	private String time;
	public WorkExperience(String time) {
		this.time=time;
	}
	@Override
	protected Object clone()  {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
