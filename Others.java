/**
 * Остальные работники (для примера)
*/

public class Others extends Employee {

    private Others(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    public static Others create(String surName, String name, int age, double salary){
        return new Others(surName, name, age, salary);
    }

    public String ClassName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public double calculateSalary() {
        return salary * 20.8;
    }

    @Override
    public String toString() {
        return String.format("%s:\t\t%s %s; возраст: %d; ставка: %.2f руб.; заработная плата: %.2f руб.",
            ClassName(), surName, name, age, salary, calculateSalary());
    }

}
