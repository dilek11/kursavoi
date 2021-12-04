package com.company;

/**
 * Information.java классы
 */
public class information {
    /**
     * Параметрлер
     */
    private String name;
    private String surname;
    private String phone_number;

    /**
     * Конструктор
     * @param name
     * @param surname
     * @param phone_number
     */
    public information(String name, String surname, String phone_number) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
    }

    /**
     * Getter
     * @return
     */
    public String getName() {  // Модификатор доступа private болған жағдайда осы әдіс арқылы келесі бір классты осы параметрді қолдана аламыз
        return name; // Қолданушының есімін қайтарады
    }

    /**
     * Setter
     * @param name
     */
    public void setName(String name) { // Параметрге мән беру үшін қолданады
        this.name = name;
    }

    /**
     * Getter
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Setter
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Getter
     * @return phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * Setter
     * @param phone_number
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * toString() әдісі ақпаратты шығару әдісі
     * @return
     */
    @Override
    public String toString() {
        return "information{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}