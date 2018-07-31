package _11���󹤳�ģʽAbstractFactory;
/**
 * �򵥹����Ľ���ĳ��󹤳�
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
