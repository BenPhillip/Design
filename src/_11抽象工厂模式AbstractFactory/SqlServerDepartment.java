package _11抽象工厂模式AbstractFactory;

 class SqlServerDepartment implements IDepartment {

	@Override
	public void insertDepartment(Department department) {
		System.out.println("SQlserver 往Department添加数据");
		
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("SqlServer 的Department查询一条数据");
		return null;
	}

}
