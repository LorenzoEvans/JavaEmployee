package employeeApp;

public class Employee {
    // Fields => state of the class
    private static int maxID = 0; // static = class field
    private int id; // integer = base type
    private String f_name; // String = class
    private String l_name;
    private double salary;
    private boolean has401k;
    private int company;
    private int healthPlanID;

    // constructor
    public Employee(String f_name, 
                    String l_name, 
                    double salary, 
                    boolean has401k, 
                    int company, 
                    int healthPlanID) {
        maxID++;
        id = maxID;
        this.f_name = f_name;
        this.l_name = l_name;
        this.salary = salary;
        this.has401k = has401k;
        this.company = company;
        this.healthPlanID = healthPlanID;
    }
    // Methods, behaviors of the class
    public int getId() {  // getter
        return id;
    }

    public String get_f_name() {
        return f_name;
    }

    public void setF_name(String f_name) { // setter
        this.f_name = f_name;
    }

    public String get_l_name() {
        return l_name;
    }

    public void setL_name(String l_name){
        this.l_name = l_name ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean getHas401k() {
        return has401k;
    }

    public void setHas401k(boolean has401k){
        this.has401k = has401k;
    }

    public int getCompany(){
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public int getHealthPlanID() {
        return healthPlanID;
    }

    public void setHealthPlanID(int healthPlanID) {
        this.healthPlanID = healthPlanID;
    }

}