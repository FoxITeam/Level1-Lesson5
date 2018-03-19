package ru.foxit.grayfox;

import java.text.MessageFormat;

public class Main {

    // todo | Комментарии пишу исключительно для себя, хочу понять, как все работает. Писать, что отпадает возможность
    // todo | исключать комментарии не обязательно.

    // final String pattern = "fullName: {0}, position: {1}, email: {2}, phone: {3}, salary: {4}, age: {5}";
    // * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    // * Конструктор класса должен заполнять эти поля при создании объекта;
    // * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    // * Создать массив из 5 сотрудников
    // Пример:
    // Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    // persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    // потом для каждой ячейки массива задаем объект
    // persArray[1] = new Person(...);
    // ...
    // persArray[4] = new Person(...);
    //
    // * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

    ///////////////////////////////////////////////////////////////////
    // Любой метод, который можно вызвать, это и называемся методом.
    // Метод, это то, что содержит внутри себя какое то поведение (другой код).

    // Если переменная final = то пишем название переменной с большими буквами, а в место пробелов используем
    // подчеркивания, так как переменную нельзя изменить.

    // Характеристика или по другому, поля объекта, переменная объекта.

    static final int AGE_LIMIT = 40; // Возрастное ограничение.
    static final int WORKER_ARRAY_SIZE = 5; // Размер массива с рабочими.

    public static void main(String[] args) {


        System.out.println("Работники: ");

        Worker[] workers = new Worker[WORKER_ARRAY_SIZE];
        workers[0] = new Worker("Захаров Илья", "Сис администратор 2 линии", "hd@oboz.com",
                "+7(925)316-00-82", 70000, 24);
        workers[1] = new Worker("Никита Румянцев", "Руководитель IT проекта",
                "nrumyansev@oboz.com", "+7(903)789-00-45", 90000, 41);
        workers[2] = new Worker("Володин Леонтий", "Сис администратор 1 линии",
                "lvolodin@oboz.com", "+7(917)516-00-04", 40000, 24);
        //Кладем сразу в массив
        workers[3] = new Worker("Никонов Павел", "Логист",
                "pnikonov@oboz.com", "+7(912)558-00-12", 60000, 30);
        workers[4] = new Worker("Иванов Дмитрий", "Директор IT проекта",
                "divanov@oboz.com", "+7(912)558-00-13", 120000, 40);
        System.out.println();
        // System.out.println("Сотрудники старше 40 лет: ");

        // String pattern = "fullName: {0}, position: {1}, email: {2}, phone: {3}, salary: {4}, age: {5}"

        // тип переменной Worker - worker имя - workers - то что я перебираю в массиве
        // Я перебираю массив workers и из каждой ячейки по очереди кладу объект Worker в переменную worker.
        for (Worker worker : workers) {
            //получить getAge
            //установить setAge
            if (worker.getAge() > AGE_LIMIT) {
                // Мы вызываем метод worker.workerInfo()); из Worker (другого класса), мы находимся в классе Main,
                System.out.println("Сотрудник старше " + AGE_LIMIT + " лет: " + worker.workerInfo());
            } else if (worker.getAge() == AGE_LIMIT){
                System.out.println("Сотруднику " + AGE_LIMIT + " лет: " + worker.workerInfo());
            } else {
                System.out.println("Сотрудник младше " + AGE_LIMIT + " лет: " + worker.workerInfo());
                //System.out.println(MessageFormat.format(pattern, worker.getFullName(), worker.getPosition(), worker.getEmail(), worker.getPhone(), worker.getSalary(), worker.getAge()));
            }
        }
        //Вывести ссылку на объект (workers[3]), а workers[3].workerInfo() - вывести инфу.
        //System.out.println("Вывод 4 сотрудника: ");
        //System.out.println(workers[3].workerInfo());

        // Чисто для себя, устанавливал сотруднику из массива другой телефон.
        //workers[0].setPhone("+79215165151");

    }
}
