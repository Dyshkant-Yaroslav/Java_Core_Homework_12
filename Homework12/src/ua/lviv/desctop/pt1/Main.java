package ua.lviv.desctop.pt1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import ua.lviv.desctop.pt1.Autho;
import ua.lviv.desctop.pt1.Engine;
import ua.lviv.desctop.pt1.SteeringWheel;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Autho> a = new ArrayList<>();
		int values = (int) (Math.random() * 10 + 1);

		for (int i = 0; i < values; i++) {

			a.add(new Autho((int) (Math.random() * 1001), (int) (Math.random() * 71 + 1950),
					new SteeringWheel((int) (Math.random() * 101), randomMatherial()),
					new Engine((int) (Math.random() * 13))));
		}

		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("random list= " + a);

			}
				break;
			case 2: {
				List<Autho> a1 = new ArrayList<>();
				a1.add(new Autho(250, 2002, new SteeringWheel(50, "Leather"), new Engine(12)));
				a1.add(new Autho(420, 1982, new SteeringWheel(30, "Nubuk"), new Engine(8)));
				a1.add(new Autho(147, 1992, new SteeringWheel(45, "Wood"), new Engine(6)));
				System.out.println("List before= " + a1);
				for (int i = 0; i < a1.size(); i++) {
					a1.set(i, new Autho(800, 2020, new SteeringWheel(100, "Velour"), new Engine(16)));
				}
				System.out.println("List after= " + a1);
			}
				break;
			}

		}

	}

	public static String randomMatherial() {
		String[] math = { "Leather", "Nubuk", "Velour", "Wood" };
		String val = math[(int) (Math.random() * 4)];

		return val;
	}

	public static void menu() {
		System.out.println("Please enter 1 for display toString() of array values");
		System.out.println("Please enter 2 for setting same values for all array objects ");
	}
}
