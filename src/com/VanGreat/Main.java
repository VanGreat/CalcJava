package com.VanGreat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Приветствую, калькулятор имеет ограничения на ввод данных: арабские числа 1-10, римские I-X. \nЧтобы закрыть программу введите пустую строку.\n");

        while(true) {
            System.out.println("Ввод: ");

            Scanner input = new Scanner(System.in); // пользовательский ввод
            String str = input.nextLine();

            Scanner s = new Scanner(str); // обработка пользовательского ввода
            boolean bul1 = s.hasNextInt();
            boolean bul2 = s.hasNext();

            try {
                if (bul1 == true) { // можно ли преобразовать первое слово строки в число
                    String sum = Calc.clc(str);
                    System.out.println("Ответ: \n" + sum);
                } else if (bul1 == false && bul2 == true) { // имеется ли строка, которую нельзя преобразовать в число
                    String str1 = s.next();
                    String str2 = s.next();
                    String str3 = s.next();

                    String sum = Calc.clc(str1, str2, str3);
                    System.out.println("Ответ: \n" + sum);
                } else {
                    System.out.println("Конец работы!"); // если на входе пустая строка, закрываем программу
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ошибка! Что то пошло не так...");
            }
        }
    }
}