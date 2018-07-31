package _6原型模式Prototype;

import java.util.jar.Attributes.Name;
//简历类
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
	 * implements Cloneable 才可以调用super.clone
	 * Cloneable 标记类、空体类
	 * clone是浅拷贝   
	 * 深拷贝需要自己修改 将类进行序列化或
	 */
	@Override
	public Object clone() {
		
		/*	1.
		  this.workExperience 是已序列化
			return super.clone();
			*/
			
			//2. workExperience实现了克隆
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
