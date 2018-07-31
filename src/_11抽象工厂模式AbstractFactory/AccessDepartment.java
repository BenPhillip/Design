package _11抽象工厂模式AbstractFactory;

class AccessDepartment implements IDepartment {

	@Override
	public void insertDepartment(Department department) {
		System.out.println("Access department insert");
		
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("Access get department");
		return null;
	}
	

}
