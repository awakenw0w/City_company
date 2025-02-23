import java.util.*;

abstract class Company {
    protected String name; // название
    protected int persons; // колво сотрудников
    protected int money; // месячный фонд зарплаты

    // констркутор
    public Company(String name, int persons, int money){
        this.name = name;
        this.persons = persons;
        this.money = money;
    }

    //методы
    public String getName(){ // выводим название компании
        return name;
    }
    public void show(){  //выводим всю информации о компании
        System.out.println("В компании " + name + " трудятся " + persons + " сотрудников. Фонд зарплаты: " + money);
    }

    public int averageSalary() { // вычисление средней зп сотрудников
        return money/persons;
    }

    public int maxPersons(int salary){ // наибольшее колво сотрудников при заданной средней зарплате
        return money/salary;
    }

    // сумма налога и отчислений в пенсионный фонд
    public int minus (int minus1/*налог в процентах*/ , int minus2/*отчисление в ПФ в процентах*/){
        return money*(minus1+minus2)/100;
    }
}



