package _11抽象工厂模式AbstractFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射来生成相应的
 * @author BenPhillip
 *
 */
class DataAccessReflection {
	private static final String db="Access";
	private static final String packageName="_11抽象工厂模式AbstractFactory";
	
	
	public static IUser createUser() {
		try {
			return (IUser) Class.forName(packageName+db+"User")//带包名的类路径
					.getConstructor(null)//获取public 构造函数，参数为无参
					.newInstance(null);//调用构造方法 无参数
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}//
		
	}
	
	public static IDepartment createDepartment() {
		try {
			return (IDepartment) Class.forName(packageName+db+"Department")
					.getConstructor()
					.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}
