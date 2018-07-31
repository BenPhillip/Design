package _5工厂方法模式FactoryMethod;

public class VolunteerFactory implements IFactory{
	
	@Override
	public LeiFeng createLeiFeng() {
		return new  Volunteer();
	}

}
