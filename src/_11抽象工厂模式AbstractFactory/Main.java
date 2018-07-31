package _11���󹤳�ģʽAbstractFactory;


public class Main {

	public static void main(String[] args) {
		User user=new User();
		Department department=new Department();
		/**
		 *  ��ͨд��
		 */
//		SqlServerUser su=new SqlServerUser(); ��Sql Server ���
//		su.insert(user);
//		su.getUser(1);
		
		/**
		 * ��������ģʽ
		 * ֻ��һ��User���User������ �ʺ��ù�������
		 * ҵ���߼������ݿ���ʵĽ���
		 */	
		
		//IFactory iFactory=new SqlServerFactory();
		IFactory iFactory=new AcessFactory(); //���ݿ���л� 
		IUser iUser=iFactory.CreateUser();
		iUser.insert(user);//�������ڷ����ĸ����ݿ� ȴ���������
		iUser.getUser(1);
		
		IDepartment iDepartment=iFactory.createDepartment();
		iDepartment.insertDepartment(department);
		iDepartment.getDepartment(1);
		
	
		/**
		 * ���󹤳�ģʽ
		 * ���ã��������ݿ� ����SqlServer��Access����ͬ���������
		 * ˵��:�ṩһϵ����ز������໥�����Ľӿڣ�������ָ�����Ǿ�����ࡣ
		 */
		//�򵥹���+���󹤳�
		IUser iu=DataAccess.createUser();
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id=DataAccess.createDepartment();
		id.insertDepartment(department);
		id.getDepartment(1);
		
		//����+���󹤳�ģʽ
		iu=DataAccessReflection.createUser();
		iu.insert(user);
		iu.getUser(1);
		id=DataAccessReflection.createDepartment();
		id.getDepartment(1);
		id.insertDepartment(department);
		
		
		

	}

}
