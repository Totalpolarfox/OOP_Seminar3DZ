/**
 * Фрилансер (работник с почасовой оплатой)
*/

public class Freelancer extends Employee {

    private Freelancer(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    public static Freelancer create(String surName, String name, int age, double salary){
        return new Freelancer(surName, name, age, salary);
    }

    public String ClassName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public double calculateSalary() {
        return salary * 15 * 5;
    }

    @Override
    public String toString() {
        return String.format("%s:\t%s %s; возраст: %d; ставка: %.2f руб.; заработная плата: %.2f руб.",
            ClassName(), surName, name, age, salary, calculateSalary());
    }

}
