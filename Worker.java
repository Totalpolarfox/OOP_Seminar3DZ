/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */

public class Worker extends Employee{

    private Worker(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    public static Worker create(String surName, String name, int age, double salary){
        return new Worker(surName, name, age, salary);
    }

    public String ClassName(){
        return this.getClass().getSimpleName();
    }

}
