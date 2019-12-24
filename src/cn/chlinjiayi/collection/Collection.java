package cn.chlinjiayi.collection; /**
 * @author lizhihao@iot-cas.com
 * @version V1.0
 * @description: TODO
 * @creat 2019-12-24-14:25
 */
import cn.chlinjiayi.hero.Hero;
import cn.chlinjiayi.item.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Collection {
	public static void main(String[] args) {

		//---
		//常见的集合
		//---

		//ArrayList
		/*无泛型的集合，任意的类型都可添加*/
		List heros = new ArrayList();
		heros.add(new Hero("kk"));
		//存放人物的也可放武器
		heros.add(new Weapon("无尽"));

		Hero h1 = (Hero) heros.get(0);
		//转类型却会出错，武器人物不可互转
//		Hero h2 = (Hero) heros.get(1);
		//输出集合的结果
//		System.out.println(h1.getName());

		//带泛型的集合
		List<Hero> herosTest= new ArrayList<>();
		herosTest.add(new Hero("sss"));
		//不可执行，规定了集合类型，里面只可以是Hero
//		herosTest.add(new Weapon("春哥"));

		List<Weapon> weaponsTest = new ArrayList<>();
		weaponsTest.add(new Weapon("穿甲弓"));

		//同时添加两种,通过父类添加
		List<property> characterList = new ArrayList<>();
		characterList.add(new Hero("kkk"));
		characterList.add(new Weapon("多兰"));

		//HashMap(键值对形式，键是唯一的，用来配对应的元素值，哈希函数散列表的应用，查找速度比ArrayList快)
		HashMap<String,String> map = new HashMap<>();
		map.put("adc","物理英雄");
		map.put("ap","魔法英雄");
		System.out.println(map.get("ap"));

		//HashSet(不允许有重复值，无序，封装了HashMap，散列表关键字不允许重复)

		//---
		//集合遍历方式
		//----
		//迭代器Iterator
		List<Hero> herosIt = new ArrayList();
		herosIt.add(new Hero("kk1"));
		herosIt.add(new Hero("kk2"));
		herosIt.add(new Hero("kk3"));
		Iterator<Hero> iterator = herosIt.iterator();
		//用while判断迭代器内是否还有元素
		while (iterator.hasNext())
		{
			Hero h = iterator.next();
			System.out.println(h.getName());
		}
		//增强for循环
		for(Hero hero : herosIt){
			System.out.println(hero.getName());
		}

	}
}