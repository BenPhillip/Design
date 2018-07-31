package _6原型模式Prototype;

public class ConcretePrototype extends Prototype implements Cloneable {
	


	public ConcretePrototype(String id) {
		super(id);
		
	}

	//@Override
	public Prototype Clone()   {
		
		try {
			return this.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	//浅克隆 只复制出基本类型
	@Override
	public ConcretePrototype clone() throws CloneNotSupportedException {
		return (ConcretePrototype) super.clone();
	}

}
