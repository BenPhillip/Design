package _6ԭ��ģʽPrototype;

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
	
	//ǳ��¡ ֻ���Ƴ���������
	@Override
	public ConcretePrototype clone() throws CloneNotSupportedException {
		return (ConcretePrototype) super.clone();
	}

}
