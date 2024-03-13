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

}
