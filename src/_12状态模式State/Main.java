package _12״̬ģʽState;
/**
 * ��һ�����������״̬�ı�ʱ����ı������Ϊ
 * ��������������Ǹı�������
 *  
 *  ��Ҫ�����ʱ������һ�������״̬ת�����������ʽ���ڸ���ʱ�����
 *  ��״̬���ж��߼�ת�Ƶ���ʾ��ͬ״̬��һϵ���൱��ȥ��
 *
 */
public class Main {

	public static void main(String[] args) {
		/**
		 * ����AΪ��ʼ״̬
		 */
		Context context=new Context(new ConcreteStateA());
		//��������״̬�� �ı�ģʽ
		context.request();
		context.request();
		context.request();
		context.request();

	}

}
