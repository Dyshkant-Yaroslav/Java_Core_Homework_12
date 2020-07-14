package ua.lviv.desctop.pt3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		MyArray<Integer> ar1 = new MyArray<Integer>();
		ar1.add(10);
		ar1.add(15);
		ar1.add(34);
		ar1.add(49);
		ar1.add(76);
		System.out.println(ar1);
		ar1.remove(3);
		System.out.println(ar1);

	}

}
