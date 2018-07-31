package _11抽象工厂模式AbstractFactory;

/**
 * 添加数据表的操作
 * @author BenPhillip
 *
 */
interface IFactory {
	IUser CreateUser();
	IDepartment createDepartment();
}
