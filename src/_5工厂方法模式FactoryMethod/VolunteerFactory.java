package _5��������ģʽFactoryMethod;

public class VolunteerFactory implements IFactory{
	
	@Override
	public LeiFeng createLeiFeng() {
		return new  Volunteer();
	}

}
