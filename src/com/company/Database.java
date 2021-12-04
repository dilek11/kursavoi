package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Database.java классы ақпаратпен жұмыс жасау классы
 *
 */
public class Database implements getAndSave{
    /**
     * Ақпаратты базаға сақтау
     * @param people ArrayList<Person>
     */
    @Override
    public void saveUser(ArrayList<Person> people) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt"));
            for (Person p: people){
                bw.write(p.getName()+"\n");
                bw.write(p.getSurname()+"\n");
                bw.write(p.getPhone_number()+"\n");
                bw.write(p.getLogin()+"\n");
                bw.write(p.getPassword()+"\n");
            }
            bw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Ақпаратты базадан алу әдісі
     * @return ArrayList<Person>
     */
    @Override
    public ArrayList<Person> getUser() {
        ArrayList<Person> people = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("user.txt"));
            String line = "";
            while ((line=br.readLine())!=null){
                String surname = br.readLine();
                String phone = br.readLine();
                String login = br.readLine();
                String password = br.readLine();
                people.add(new Person(line,surname,phone,login,password));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return people;
    }
}