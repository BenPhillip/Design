package _11抽象工厂模式AbstractFactory;
/**
 * 简单工厂改进后的抽象工厂
 * @author BenPhillip
 *
 */
class DataAccess {
	private static final String db="Sql Server";
	//private static final String db="Access";
	
	public static IUser createUser() {
		IUser result=null;
		switch (db) {
		case "Sql Server":
			result=new SqlServerUser();
			break;
		case "Access":
			result=new AcessUser();
			break;
		default:
			break;
		}
		return result;
	}
	
	public static IDepartment createDepartment() {
		IDepartment result= null;
		switch (db) {
		case "Sql Server":
			result=new SqlServerDepartment();
			break;
		case "Access":
			result=new AccessDepartment();
			break;
		default:
			break;
		}
		return result;
		
	}
}
