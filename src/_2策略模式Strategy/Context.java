package _2����ģʽStrategy;

public class Context {
	private Strategy strategy;
	
	/**
	 * ��ʼ�����������Զ���
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	
	/**
	 * ���ݾ�����Զ������������㷨�ķ���
	 */
	public void contextInterface() {
		this.strategy.AlgorithmInrerface();
	}
}
