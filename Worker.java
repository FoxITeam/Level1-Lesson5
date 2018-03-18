package ru.foxit.grayfox;

import java.text.MessageFormat;

// Класс
public class Worker {
//    * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//    * Конструктор класса должен заполнять эти поля при создании объекта;
//    * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//    * Создать массив из 5 сотрудников
//    Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//    потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//    ...
//    persArray[4] = new Person(...);
//
//    * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

    // Поля класса
    private String fullName; // Ф.И.О.
    private String position; // Должность
    private String email; // емаил
    private String phone; // Телефон
    private int salary; // Зарплата
    private int age; // Возраст
    final String pattern = "fullName: {0}, position: {1}, email: {2}, phone: {3}, salary: {4}, age: {5}";


    public Worker(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    // Главная задача геттеров и сеттеров - не обращаться к переменным класса напрямую. Нужно обращаться через методы.
    // Для маленьких программ это не нужно, однако для больших программ это критично.
    // Ты можешь прочесть и записать, а сама переменная не нужна, надо управлять поведением, объектами.

    public String workerInfo() {
        return MessageFormat.format(pattern, this.fullName, this.position, this.email, this.phone, this.salary, this.age);
    }
    // Получить
    public String getFullName() {
        return fullName;
    }
    // Установить
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    // Если private - то мы не сможем перезаписать телефон у сотрудников.
    // private - ты не сможешь Изменить поле phone класса Worker - из другого класса.
    // Get и Set всегда паблик, если он public - он имеет смысл, если он private - смысла от сеттера setPhone нету.
    public void setPhone(String phone) {
        // this. Стучимся к самому классу Worker и его поле phone
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
