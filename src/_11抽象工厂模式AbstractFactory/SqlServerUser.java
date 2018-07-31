package _11抽象工厂模式AbstractFactory;

class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("Sql server数据库 给User表添加一条记录");
		
	}

	@Override
	public User getUser(int id) {
		System.out.println("Sql server 数据库根据ID查询一条记录");
		return null;
	}

}
