package _11���󹤳�ģʽAbstractFactory;

 class AcessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("Acess��User���������");
		
	}

	@Override
	public User getUser(int id) {
		System.out.println("Acess��User���ѯһ������");
		return null;
	}

}
