package cn.chlinjiayi.hero;

import cn.chlinjiayi.collection.property;

/**
 * @author lizhihao@iot-cas.com
 * @version V1.0
 * @description: TODO
 * @creat 2019-12-24-14:25
 */
public class Hero extends property {
	String name;
	int price;
	public Hero(){};
	public Hero(String name){
		this.name = name;
	}
	public void effect(){
		System.out.println("我于人见无敌");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}