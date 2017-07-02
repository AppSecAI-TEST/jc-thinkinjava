package com.jc.containers;
/**
 * 测试参数
 * @author jevoncode
 *
 */
public class TestParam {
	public final int size; //集合的长度
	public final int loops; //重复次数的基数

	public TestParam(int size, int loops) {
		this.size = size;
		this.loops = loops;
	}

	// Create an array of TestParam from a varargs sequence:
	public static TestParam[] array(int... values) {
		int size = values.length / 2;
		TestParam[] result = new TestParam[size];
		int n = 0;
		for (int i = 0; i < size; i++)
			result[i] = new TestParam(values[n++], values[n++]);
		return result;
	}

	// Convert a String array to a TestParam array:
	public static TestParam[] array(String[] values) {
		int[] vals = new int[values.length];
		for (int i = 0; i < vals.length; i++)
			vals[i] = Integer.decode(values[i]);
		return array(vals);
	}
}