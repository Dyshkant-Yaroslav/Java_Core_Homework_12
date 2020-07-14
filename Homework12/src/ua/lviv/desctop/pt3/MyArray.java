package ua.lviv.desctop.pt3;

import java.util.Arrays;

public class MyArray<T> {

	private final int INIT_SIZE = 16;
	private final int CUT_RATE = 4;
	private Object[] array = new Object[INIT_SIZE];
	private int pointer = 0;

	public void add(T item) {
		if (pointer == array.length - 1)
			resize(array.length * 2);
		array[pointer++] = item;
	}

	public void remove(int index) {
		for (int i = index; i < pointer; i++)
			array[i] = array[i + 1];
		array[pointer] = null;
		pointer--;
		if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
			resize(array.length / 2);
	}

	private void resize(int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(array, 0, newArray, 0, pointer);
		array = newArray;
	}

	@Override
	public String toString() {
		return "MyArray [" + Arrays.toString(array) + "]";
	}

}
