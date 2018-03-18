package ru.foxit.grayfox;

import java.text.MessageFormat;

public class Main {

    // Если переменная final = то пишем большими буквами, а пробелы используем подчеркиваниями, так как ее нельзя
    // изменить
    static final int AGE_LIMIT = 40; // Возрастное ограничение.
    static final int WORKER_ARRAY_SIZE = 4; // Размер массива с рабочими.
    public static void main(String[] args) {
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


        System.out.println("Работники: ");

        Worker[] workers = new Worker[WORKER_ARRAY_SIZE];
        workers[0] = new Worker("Захаров Илья", "Сис администратор 2 линии", "hd@oboz.com",
                "+7(925)316-00-82", 70000, 24);
        workers[1] = new Worker("Никита Румянцев", "Руководитель IT проекта",
                "nrumyansev@oboz.com", "+7(903)789-00-45", 90000, 41);
        workers[2] = new Worker("Володин Леонтий", "Сис администратор 1 линии",
                "lvolodin@oboz.com", "+7(917)516-00-04", 40000, 24);
        //Кладем сразу в массив
        workers[3] = new Worker("Володин Леонтий", "Сис администратор 1 линии",
                "lvolodin@oboz.com", "+7(917)516-00-04", 40000, 24);
        System.out.println();
        //System.out.println("Сотрудники старше 40 лет: ");

        for (Worker worker : workers) {
            //получить getAge
            //установить setAge
            if (worker.getAge() > AGE_LIMIT) {
                System.out.println("Сотрудник старше 40 лет: " + worker.workerInfo());
            } else {
                System.out.println("Сотрудник младше 40 лет: " + worker.workerInfo());
            }
        }
        //Вывести ссылку на объект (workers[3]), а workers[3].workerInfo() - вывести инфу.
        //System.out.println("Вывод 4 сотрудника: ");
        System.out.println(workers[3].workerInfo());

        workers[0].setPhone("+79215165151");

    }
}
