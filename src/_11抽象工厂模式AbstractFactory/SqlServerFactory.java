package _11抽象工厂模式AbstractFactory;

class SqlServerFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		
		return new SqlServerUser();
	}

	@Override
	public IDepartment createDepartment() {
		
		return new SqlServerDepartment();
	}
	
}
