package com.company;
import java.util.Scanner;

public class Menu
{
    public int AskMenuPointDiary(Scanner ans)
    {
        int answer = 0;
        System.out.println("Что бы Вы хотели сделать:");
        System.out.println("1 - добавить оценку");
        System.out.println("2 - максимальная оценка");
        System.out.println("3 - минимальная оценка");
        System.out.println("4 - средний балл по предмету");
        System.out.println("5 - вернуться назад");

        if (ans.hasNextInt())
        {
            answer = ans.nextInt();
        }

        return answer;
    }
    public int AskMainMenuPoint ()
    {
        Scanner ans = new Scanner(System.in);
        int answer = 0;
        System.out.println("Что бы Вы хотели сделать:");
        System.out.println("1 - вывести список учеников");
        System.out.println("2 - добавить ученика");
        System.out.println("3 - удалить ученика");
        System.out.println("4 - просмотреть дневник ученика");
        System.out.println("5 - статистика по предмету");
        System.out.println("6 - общая статистика по всем предметам");
        System.out.println("7 - выход");

        if (ans.hasNextInt())
        {
            answer = ans.nextInt();
        }
        return answer;
    }
}
