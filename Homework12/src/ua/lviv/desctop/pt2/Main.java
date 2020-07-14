package ua.lviv.desctop.pt2;

import ua.lviv.desctop.pt2.Seasons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import ua.lviv.desctop.pt2.Months;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Months> list1 = Arrays.asList(Months.values());

		System.out.println("List of months= "+list1);

		List<Seasons> list2 = Arrays.asList(Seasons.values());
		System.out.println("List of seasons= "+list2);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = isMonthPresent(list1, month);
				if (!flag) {
					System.out.println("Month doesnt exist");
				}
				break;
			}
			case "2": {
				System.out.println("Enter season:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();
				boolean flag = false;
				for (Months months : list1) {
					if (months.getS().name().equals(season)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons s = Seasons.valueOf(season);
					for (Months months : list1) {
						if (months.getS().toString().equalsIgnoreCase(season)) {
							System.out.println(months);
						}
					}
				}
				if (!flag) {
					System.out.println("Season doesnt exist");
				}
				break;
			}
			case "3": {
				System.out.println("enter value of days(30,31,29):");
				sc = new Scanner(System.in);
				int val = sc.nextInt();
				for (Months months : list1) {
					if (months.getDays() == val) {
						System.out.println(months);
					}

				}
				break;

			}
			case "4": {
				System.out.println("enter value of days(30,31,29):");
				sc = new Scanner(System.in);
				int val = sc.nextInt();
				for (Months months : list1) {
					if (months.getDays() < val) {
						System.out.println(months);
					} else if (val <= 29) {
						System.out.println("a month with fewer days does not exist");
						break;
					}
				}
				break;
			}
			case "5": {
				System.out.println("enter value of days(30,31,29):");
				sc = new Scanner(System.in);
				int val = sc.nextInt();
				for (Months months : list1) {
					if (months.getDays() > val) {
						System.out.println(months);
					} else if (val >= 31) {
						System.out.println("a month with fewer days does not exist");
						break;
					}
				}
				break;

			}
			case "6": {
				System.out.println("Enter season:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(list2, season);

				if (flag) {
					Seasons s1 = Seasons.valueOf(season);
					int ordinal = s1.ordinal();
					if (ordinal == (list2.size() - 1)) {
						ordinal = 0;
						System.out.println("The next season is: " + (list2.get(ordinal)));
					} else {
						System.out.println("The next season is: " + (list2.get(ordinal + 1)));
					}
				}

				if (!flag) {
					System.out.println("Season doesnt exist");
				}

				break;
			}
			case "7": {
				System.out.println("Enter season:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(list2, season);

				if (flag) {
					Seasons s1 = Seasons.valueOf(season);
					int ordinal = s1.ordinal();
					if (ordinal == 0) {
						ordinal = 3;
						System.out.println("The previous season is: " + (list2.get(ordinal)));
					} else {
						System.out.println("The previous season is: " + (list2.get(ordinal - 1)));
					}
				}

				if (!flag) {
					System.out.println("Season doesnt exist");
				}

				break;
			}
			case "8": {
				for (Months months : list1) {
					if (months.getDays() % 2 == 0) {
						System.out.println("Month with a pair of days: " + (months));
					}
				}
				break;
			}
			case "9": {
				for (Months months : list1) {
					if (months.getDays() % 2 == 1) {
						System.out.println("Months with an unpaired number of days: " + (months));
					}
				}
				break;
			}
			case "10": {
				System.out.println("Enter month:");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = isMonthPresent(list1, month);
				int value;
				if (flag) {
					for (Months months : list1) {
						if (months.name().equals(month)) {
							value = months.getDays();
							if (value % 2 == 0) {
								System.out.println("Month is with a pair of days");
							} else {
								System.out.println("Months is with an unpaired number of days");
							}
						}
					}

				}

				if (!flag) {
					System.out.println("Month doesnt exist");
				}

				break;
			}

			}

		}
	}

	private static boolean isMonthPresent(List<Months> list1, String month) {
		boolean flag = false;
		for (Months months : list1) {
			if (months.name().equals(month)) {
				System.out.println("Month exist");
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isSeasonPresent(List<Seasons> list2, String season) {
		boolean flag = false;
		for (Seasons seasons : list2) {
			if (seasons.name().equals(season)) {
				System.out.println("Month exist");
				flag = true;
			}
		}
		return flag;
	}

	static void menu() {
		System.out.println("Натисніть 1 щоб: Перевірити чи є такий місяць");
		System.out.println("Натисніть 2 щоб: Вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 3 щоб: Вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натисніть 4 щоб: Вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натисніть 5 щоб: Вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натисніть 6 щоб: Вивести на екран наступну пору року");
		System.out.println("Натисніть 7 щоб: Вивести на екран попередню пору року");
		System.out.println("Натисніть 8 щоб: Вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 9 щоб: Вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 10 щоб: Вивести на екран чи введений з консолі місяць має парну кількість днів");
	}

}
