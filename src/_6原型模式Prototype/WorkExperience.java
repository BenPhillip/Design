package _6ԭ��ģʽPrototype;

import java.io.Serializable;

/**
 * 1. Serializable ʵ�����л�
 * 2. clone  ʵ��ǳ����
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
