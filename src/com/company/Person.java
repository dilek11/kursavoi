package com.company;

/**
 * Information.java классының мұрагері
 */
public class Person extends information{
    /**
     * Параметрлер
     */
    private String login;
    private String password;

    /**
     * Конструктор
     * @param name
     * @param surname
     * @param phone_number
     * @param login
     * @param password
     */
    public Person(String name, String surname, String phone_number, String login, String password) {
        super(name, surname, phone_number);
        this.login = login;
        this.password = password;
    }

    /**
     * Getter
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     * Setter
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Getter
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Ақпаратты шығару әдісі
     * @return
     */
    @Override
    public String toString() {
        return "PERSON -----[" + " NAME: " +getName()+ " SURNAME: "+getSurname() + " PHONE: "+getPhone_number()+" LOGIN: "+login+"]";
    }
}