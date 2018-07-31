package _11抽象工厂模式AbstractFactory;

 class AcessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("Acess的User表插入数据");
		
	}

	@Override
	public User getUser(int id) {
		System.out.println("Acess的User表查询一条数据");
		return null;
	}

}
