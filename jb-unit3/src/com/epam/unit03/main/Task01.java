package com.epam.unit03.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task01 {
	public static void main(String[] args) {
		String usd = "usd";
		String eur = "eur";
		String rub = "rub";
		String byn = "byn";
		System.out.println("Здраствуйте вас приветствует терминал обмена валют");
		System.out.println("Крусы валют по курсу НБРБ на 05.03.2020:\n" + "USD=1\n" + "EUR=0.8961\n" + "RUB=65.9854\n" + "BYN=2.2311");
		System.out.println("Какую валюту вы бы хотели обменять?\n" + "Введите usd, eur, rub или byn");
		System.out.println(">");
		Scanner sc = new Scanner(System.in);
		String sc1 = sc.next(); //какую валюту поменять
		System.out.println("Введите сумму");
		System.out.println(">");
		int sc2 = sc.nextInt(); //сумма денег
		System.out.println("На какую валюту вы бы хотели обменять ваши  \"  " + sc2 + " - " + sc1 + "  \" ?");
		System.out.println("Введите usd, eur, rub или byn");
		System.out.println(">");
		String sc3 = sc.next(); //какую валюту выдать
		switch (sc1) {
		case "usd":
			if (sc3.contentEquals(eur)) {
				double coef = 0.8961;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "EUR");
			}
			if (sc3.contentEquals(rub)) {
				double coef = 65.9854;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "RUB");
			}
			if (sc3.contentEquals(byn)) {
				double coef = 2.2311;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "BYN");
			}
			break;
		case "eur":
			if (sc3.contentEquals(usd)) {
				double coef = 1.116;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "USD");
			}
			if (sc3.contentEquals(rub)) {
				double coef = 73.6366;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "RUB");
			}
			if (sc3.contentEquals(byn)) {
				double coef = 2.4898;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "BYN");
			}
			break;
		case "rub":
			if (sc3.contentEquals(usd)) {
				double coef = 0.0152;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "USD");
			}
			if (sc3.contentEquals(eur)) {
				double coef = 0.0136;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "EUR");
			}
			if (sc3.contentEquals(byn)) {
				double coef = 0.0338;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "BYN");
			}
			break;
		case "byn":
			if (sc3.contentEquals(usd)) {
				double coef = 0.4482;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "USD");
			}
			if (sc3.contentEquals(eur)) {
				double coef = 0.4016;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "EUR");
			}
			if (sc3.contentEquals(rub)) {
				double coef = 29.5753;
				System.out.println("Сумма к выдаче:  " + sc2 * coef + "  " + "RUB");
			}
			break;
		}
		  System.out.println("Пересчитывайте деньги не отходя от терминала и приходите к нам ещё!");
	}
}
		

