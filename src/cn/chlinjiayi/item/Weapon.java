package cn.chlinjiayi.item;

import cn.chlinjiayi.collection.property;

/**
 * @author lizhihao@iot-cas.com
 * @version V1.0
 * @description: TODO
 * @creat 2019-12-24-14:52
 */
public class Weapon extends property {
	String name;
	int price;
	public Weapon(String name){
		this.name = name;
	}
	public void effect(){
		System.out.println("产生效果");
	}
}