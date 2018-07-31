package _6ԭ��ģʽPrototype;

import java.util.jar.Attributes.Name;
//������
public class Resume implements Cloneable {
	private String name;
	private String sex;
	private WorkExperience workExperience;
	
	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	public Resume(String name,String sex) {
		this.name=name;
		this.sex=sex;
	}
	
	public Resume(WorkExperience workExperience) {
		this.workExperience=(WorkExperience) workExperience.clone();
	}
	
	/**
	 * implements Cloneable �ſ��Ե���super.clone
	 * Cloneable ����ࡢ������
	 * clone��ǳ����   
	 * �����Ҫ�Լ��޸� ����������л���
	 */
	@Override
	public Object clone() {
		
		/*	1.
		  this.workExperience �������л�
			return super.clone();
			*/
			
			//2. workExperienceʵ���˿�¡
			Resume resume=new Resume(this.workExperience);
			resume.setSex(this.sex);
			resume.setName(this.name);
			return resume;
			
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}

}
