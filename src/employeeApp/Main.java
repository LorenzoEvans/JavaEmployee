package employeeApp;

public class Main {
    public static void main(String[] args) {
        HealthPlan h1 = new HealthPlan("My Health Plan");
        HealthPlan h2 = new HealthPlan("My other Health Plan");
        Company myComp = new Company("Company", 9001); // its over 9000!

        Employee emp1 = new Employee("Steve", "Green", 45000, true, myComp.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 450000, true, myComp.id, h2.getId());
        System.out.println(h1);
        System.out.println(myComp);
        System.out.println(emp1);
        System.out.println(emp2);
    }
}