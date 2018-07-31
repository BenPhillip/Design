package _11���󹤳�ģʽAbstractFactory;

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
