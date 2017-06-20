package com.jc.generic;

/**
 * GenericArray和GenericArray2两个例子都展示了，触犯了ArrayOfGeneric所定下来论据
 * 
 * @author jevoncode
 */
public class GenericArray2<T> {
	private Object[] array;

	public GenericArray2(int sz) {
		array = new Object[sz];
	}

	public void put(int index, T item) {
		array[index] = item;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) array[index];
	}

	@SuppressWarnings("unchecked")
	public T[] rep() {
		return (T[]) array; // Warning: unchecked cast
	}

	public static void main(String[] args) {
		GenericArray2<Integer> gai = new GenericArray2<Integer>(10);
		for (int i = 0; i < 10; i++)
			gai.put(i, i);
		for (int i = 0; i < 10; i++)
			System.out.print(gai.get(i) + " ");
		System.out.println();
		Object[] objs = gai.rep();
		System.out.println(objs);
		try {
			Integer[] ia = gai.rep();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}