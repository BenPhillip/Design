package _2策略模式Strategy;

public class Context {
	private Strategy strategy;
	
	/**
	 * 初始化传入具体策略对象
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	
	/**
	 * 根据具体策略对象调用其具体算法的方法
	 */
	public void contextInterface() {
		this.strategy.AlgorithmInrerface();
	}
}
