package _11���󹤳�ģʽAbstractFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * ͨ��������������Ӧ��
 * @author BenPhillip
 *
 */
class DataAccessReflection {
	private static final String db="Access";
	private static final String packageName="_11���󹤳�ģʽAbstractFactory";
	
	
	public static IUser createUser() {
		try {
			return (IUser) Class.forName(packageName+db+"User")//����������·��
					.getConstructor(null)//��ȡpublic ���캯��������Ϊ�޲�
					.newInstance(null);//���ù��췽�� �޲���
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
