package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    Scanner in = new Scanner(System.in);

	    int userAnswer = 0;

        System.out.println("Вы попали в подвал. " +
                "Ваша нога застряла под обломками потолка. " +
                "Рядом с вами находится пила. " +
                "Что вы будете делать?");
        System.out.println("1) Лопнуть от смеха");
        System.out.println("2) Отрезать себе ногу");
        System.out.print("Ваш вариант: ");
        userAnswer = in.nextInt();
        if (userAnswer == 1) {
            System.out.println("Вы умерли.");
            return;
        } else if (userAnswer != 2) {
            System.out.println("Ты дурак. Зачем вводишь неправильный вариант?");
            System.out.println("Ты умер.");
            return;
        }

        System.out.println("У вас началось сильное кровотечение. " +
                "Дверь наружу распахнулась, за ней вы увидели трубу с горячей водой. " +
                "Ваши действия?");
        System.out.println("1) Прижечь рану трубой");
        System.out.println("2) Ползти дальше");
        System.out.println("3) Дожидаться помощи");
        System.out.print("Ваш вариант: ");
        userAnswer = in.nextInt();
        switch (userAnswer) {
            case 1:
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ползем дальше...");
                    Thread.sleep(1000);
                }
                System.out.println("Вы умерли");
                return;
            case 3:
                System.out.println("Вы ждали 20 минут, никого не нашли и умерли.");
                return;
            default:
                System.out.println("Ты дурак.");
                System.out.println("Ты умер.");
                return;
        }
        System.out.println("Кровотечение остановилось. Рядом с трубой находился котенок. " +
                "Вы решили оставить его себе. Как вы его назовете? ");
        String kittyName = in.next();
        System.out.println("Хорошее имя '" + kittyName + "' для котенка!");
        Thread.sleep(1000);
        if (kittyName.equalsIgnoreCase("мясо")
                || kittyName.equalsIgnoreCase("ужин")) {
            System.out.println("Вы выиграли!");
            return;
        }
        System.out.println("Спустя 3 дня вы отчаялись и съели своего котенка '"
                + kittyName + "'");
        System.out.println("Вы проиграли");
    }
}
