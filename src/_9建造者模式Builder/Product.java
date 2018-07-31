package _9建造者模式Builder;

import java.util.ArrayList;
import java.util.List;

 class Product {
	private List<String> parts=new ArrayList<>();
	
	public void add(String part) {
		parts.add(part);

	}
	
	public void show() {
		System.out.println("产品创建");
		for(String part:parts) {
			System.out.println(part);
		}
	}
}
