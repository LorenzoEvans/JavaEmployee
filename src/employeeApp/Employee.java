package employeeApp;

public class Employee {
    // Fields => state of the class
    private int id; // integer = base type
    private String f_name; // String = class
    private String l_name;
    private double salary;
    private boolean has401k;
    private int company;
    private int healthPlanID;

    // constructor
    public Employee(String f_name, String l_name, double salary, boolean has401k, int company, int healthPlanID) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.salary = salary;
        this.has401k = has401k;
        this.company = company;
        this.healthPlanID = healthPlanID;
    }
    // Methods, behaviors of the class
}