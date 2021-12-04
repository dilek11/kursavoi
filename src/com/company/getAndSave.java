package com.company;

import java.util.ArrayList;

/**
 * getAndSave.java интерфейс класы әдістерді сақтайды
 */
public interface getAndSave {
    void saveUser(ArrayList<Person> people);
    ArrayList<Person> getUser();
}