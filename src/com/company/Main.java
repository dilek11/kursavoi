package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main классы қолданушы туралы ақпаратты еңгізу және деректерді файлда сақтау
 * @author SIB
 * @version 1.0
 * @since 1.1
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Ақпаратты еңгізу
        Database db = new Database(); // Database.java классының объектісі
        ArrayList<Person> people = db.getUser(); // Базадан ақпаратты алу
        int count = 0; // санаушы айнымалысы
        while (true) { // шексіз цикл
            System.out.println("""
                    PRESS 1 TO SIGN IN
                    PRESS 2 TO REGISTER
                    PRESS 3 TO EXIT
                    """); // Интерфейс графический
            String choice = in.next(); // қызмет түрін таңдау
            if (choice.equals("1")) { // шартты оператор
                System.out.println("Insert login"); // ақпаратты шығару
                String login = in.next(); // жаңа айнымалы
                System.out.println("Insert password"); // ақпаратты шығару
                String password = in.next(); // жаңа айнымалы
                for (Person p : people) { // цикл foreach
                    if (login.equals(p.getLogin()) && password.equals(p.getPassword())) { // шартты оператор
                        System.out.println(p); // ақпаратты шығару
                    } else if (!login.equals(p.getLogin()) || !password.equals(p.getPassword())) { // шартты оператор
                        count++; // санаушы
                    }
                }
                if (count == people.size()) { // шартты оператор
                    System.out.println("Invalid login or password"); //ақпаратты шығару
                    count = 0; // қайта мән беру
                }
            } else if (choice.equals("2")) { // шартты оператор
                System.out.println("Insert name:"); // ақпаратты шығару
                String name = in.next(); // жаңа айнымалы
                System.out.println("Insert surname:"); // ақпаратты шығару
                String surname = in.next(); // жаңа айнымалы
                System.out.println("Insert phone number"); // ақпаратты шығару
                String phone = in.next(); // жаңа айнымалы
                System.out.println("Insert Login :"); // ақпаратты шығару
                String login = in.next(); // жаңа айнымалы
                System.out.println("Insert password: "); // ақпаратты шығару
                String password = in.next(); // жаңа айнымалы
                for (Person p : people) { // цикл foreach
                    if (p.getPhone_number().equals(phone) || p.getLogin().equals(login)) { // шартты оператор
                        if (p.getLogin().equals(login)) { // шартты оператор
                            while (p.getLogin().equals(login)) { // цикл
                                System.out.println("Insert another login :"); // ақпаратты шығару
                                login = in.next(); // жаңа айнымалы
                            }
                        }
                        if (p.getPhone_number().equals(phone)) {   // шартты оператор
                            while (p.getPhone_number().equals(phone)) { // цикл while
                                System.out.println("Insert another phone number:");
                                phone = in.next(); // жаңа айнымалыны еңгізу
                            }
                        }
                    }
                }
                people.add(new Person(name, surname, phone, login, password)); // тізімге барлық деректерді қосу
                db.saveUser(people); // тізімдегі ақпаратты файлға сақтау
            } else
                System.exit(0);
        }
    }
}