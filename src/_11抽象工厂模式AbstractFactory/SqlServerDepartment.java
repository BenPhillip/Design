package _11���󹤳�ģʽAbstractFactory;

 class SqlServerDepartment implements IDepartment {

	@Override
	public void insertDepartment(Department department) {
		System.out.println("SQlserver ��Department�������");
		
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("SqlServer ��Department��ѯһ������");
		return null;
	}

}
