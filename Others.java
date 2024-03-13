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

}
