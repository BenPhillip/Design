package _5��������ģʽFactoryMethod;
/**
 * �������� �Ѽ򵥹������ڲ��߼��ж��Ƶ��˿ͻ��˽��б����޸Ĺ����� �����޸Ŀͻ���
 * �Ǽ򵥹����Ľ�һ��������ƹ� ʹ���˶�̬�ԡ�
 * ����ÿ���һ����Ʒ��Ҫ����һ����Ʒ�����࣬�����˶���Ŀ�����
 * @author BenPhillip
 *
 */
public class Main {

	public static void main(String[] args) {
		
		IFactory factory=new VolunteerFactory();//ֻ���޸���������Ϳ�����
		LeiFeng lf=factory.createLeiFeng();
		lf.doWork();

	}

}
