package _9������ģʽBuilder;
/**
 * �������ӵĶ�����Щ�����ڲ�������Ĺ���˳��ͨ�����ȶ��ģ����Ƕ����ڲ��Ĺ���ͨ�������Ÿ��ӵı仯��
 * �������Ӷ�����㷨Ӧ�ö����ڸö������ɲ����Լ����ǵ�װ�䷽ʽʱ���õ�ģʽ
 * @author BenPhillip
 *
 */
 class Main {

	public static void main(String[] args) {
		Director director=new Director();
		Builder builder1=new ConcreteBuilder1();
		Builder builder2=new ConcreteBuilder2();
		
		director.Construct(builder1);
		Product product=builder1.getResult();
		product.show();
		
		director.Construct(builder2);
		product=builder2.getResult();
		product.show();

	}

}
