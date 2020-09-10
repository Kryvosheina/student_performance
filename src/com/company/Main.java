package com.company;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> schoolboys = new ArrayList<>();

    public static void main(String[] args)
    {

        Scanner inS = new Scanner(System.in);

        try {
            File file = new File("D:/обучение/students/student.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            schoolboys.add(line);
            while (line != null) {
                System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
                if (line == null) {break;}
                schoolboys.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Размер массива : " + schoolboys.size());
        Menu main_menu = new Menu();
        int choice;

        while (true)
        {
            choice = main_menu.AskMainMenuPoint();

            switch (choice)
            {
             // пока выбор не богатый :)) - самое сложное впереди
                case 1, 4, 5, 6:
                    Print_Pupil(schoolboys); // вывод списка учеников
                    break;
                case 2:
                    String new_name;
                    System.out.println("Введите имя нового ученика: ");
                    new_name = inS.nextLine();
                    Add_Pupil(new_name);
                    break;
                case 3:
                    String del_name;
                    System.out.println("Введите имя ученика, которого необходимо удалить из списка :");1
                    del_name = inS.nextLine();
                    Delete_Pupil(del_name);
                    break;
                case 7:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Неправильный символ: " + choice);

            }
        }

    }
    // вывод списка учеников
    public static void Print_Pupil(ArrayList arr)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i) + ", ");
        }
    }
    // добавление ученика в список и перезапись файла - можно было бы заморочиться и добавлять по алфавиту, но леньки. Это возможно будет в следующей итерации :))
    public static ArrayList Add_Pupil (String fio)
    {
        schoolboys.add(fio);
        try
        {
            OutputStream f = new FileOutputStream("D:/обучение/students/student.txt", false);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
            for(int i = 0; i < schoolboys.size(); i++)
            {
                out.write(schoolboys.get(i) + System.getProperty("line.separator"));
                out.flush();
            }
        }
        catch(IOException ex)
        {
            System.err.println(ex);
        }
        return schoolboys;
    }

    // удаление ученика и перезапись файла
    public static ArrayList Delete_Pupil (String fio)
    {
     schoolboys.remove(fio);
        try
        {
            OutputStream f = new FileOutputStream("D:/обучение/students/student.txt", false);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
            for(int i = 0; i < schoolboys.size(); i++)
            {
                out.write(schoolboys.get(i) + System.getProperty("line.separator"));
                out.flush();
            }
        }
        catch(IOException ex)
        {
            System.err.println(ex);
        }
     return schoolboys;
    }

    //
}
