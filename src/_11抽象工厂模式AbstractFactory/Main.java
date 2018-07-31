package _11抽象工厂模式AbstractFactory;


public class Main {

	public static void main(String[] args) {
		User user=new User();
		Department department=new Department();
		/**
		 *  普通写法
		 */
//		SqlServerUser su=new SqlServerUser(); 与Sql Server 耦合
//		su.insert(user);
//		su.getUser(1);
		
		/**
		 * 工厂方法模式
		 * 只有一个User类和User操作类 适合用工厂方法
		 * 业务逻辑和数据库访问的解耦
		 */	
		
		//IFactory iFactory=new SqlServerFactory();
		IFactory iFactory=new AcessFactory(); //数据库的切换 
		IUser iUser=iFactory.CreateUser();
		iUser.insert(user);//看不出在访问哪个数据库 却完成了任务
		iUser.getUser(1);
		
		IDepartment iDepartment=iFactory.createDepartment();
		iDepartment.insertDepartment(department);
		iDepartment.getDepartment(1);
		
	
		/**
		 * 抽象工厂模式
		 * 适用：多张数据库 并且SqlServer和Access两大不同分类情况下
		 * 说明:提供一系列相关操作或相互依赖的接口，而无需指定它们具体的类。
		 */
		//简单工厂+抽象工厂
		IUser iu=DataAccess.createUser();
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id=DataAccess.createDepartment();
		id.insertDepartment(department);
		id.getDepartment(1);
		
		//反射+抽象工厂模式
		iu=DataAccessReflection.createUser();
		iu.insert(user);
		iu.getUser(1);
		id=DataAccessReflection.createDepartment();
		id.getDepartment(1);
		id.insertDepartment(department);
		
		
		

	}

}
