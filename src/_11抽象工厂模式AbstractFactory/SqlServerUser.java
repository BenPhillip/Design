package _11���󹤳�ģʽAbstractFactory;

class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("Sql server���ݿ� ��User�����һ����¼");
		
	}

	@Override
	public User getUser(int id) {
		System.out.println("Sql server ���ݿ����ID��ѯһ����¼");
		return null;
	}

}
