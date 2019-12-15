package employeeApp;

public class Company {
    private static int maxID = 0;
    public final static double match401k = 0.05;

    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt) {
        maxID++;
        id = maxID;
        this.name = name;
        this.debt = debt;
    }

    @Override
    public String toString() {
        String rtnStr = "id: " + id + "name: " + name + "debt: " + debt;
        return rtnStr;
    }
}