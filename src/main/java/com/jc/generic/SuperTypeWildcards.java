package com.jc.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 感觉java引入泛型就是个坑，如GenericsAndCovariance解决了一个问题，又来了个坑，不能调用add这类方法。
 * 于是为了解决这个问题，引入了一个叫 超类通配符 
 * 定义时泛型必须一样。
 * @author jevoncode
 */
public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples) {
		apples.add(new Apple());
		apples.add(new Jonathan());
		// apples.add(new Fruit()); // Error
	}
	public static void main(String[] args) {
		List<? super Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Apple());
		fruits.add(new Jonathan());
		fruits.add(new Orange());
		
		List<? super Apple> apple = new ArrayList<Apple>();
		apple.add(new Apple());
		apple.add(new Jonathan());
		//apple.add(new Orange()); // Error
	}
}