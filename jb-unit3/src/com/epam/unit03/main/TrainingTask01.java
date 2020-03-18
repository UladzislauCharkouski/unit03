package com.epam.unit03.main;

import java.util.Random;
import java.util.Scanner;

public class TrainingTask01 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random  = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        System.out.println("Приложение проверяющее знание таблицы умножения");
        System.out.println("Сколько будет если " + x + " умножить на " +y);
        int z = 0;
        if (sc.hasNextInt()) {
        	z = sc.nextInt();
        	if (z == x*y) {
                System.out.println("Верно");
            } else {
                System.out.println("Неверно");
            }
        }
	}
}
