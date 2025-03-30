package School_excercise_quanlynhansu;

public class FullTimeEmployee extends Employee {
    public double baseSalary;
    public double allowance;
    public int availableLeavedays;

    public FullTimeEmployee(String name, String id, String email,
                            double baseSalary, double allowances, int availableLeavedays) {
        super(name, id, email);
        this.baseSalary = baseSalary;
        this.allowance = allowances;
        this.availableLeavedays = availableLeavedays;
    }

    @Override
    public void getPersonInfo() {
        System.out.println("=== Full-Time Employee Information ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Allowances: $" + allowance);
        System.out.println("Available Leave Days: " + availableLeavedays);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + allowance;
    }

    public boolean requestLeave(int days) {
        if (availableLeavedays >= days) {
            availableLeavedays -= days;
            System.out.println("Leave approved for " + days + " days");
            return true;
        } else {
            System.out.println("Cannot approve leave for " + days + " days");
            return false;
        }
    }

    public int getAvailableLeavedays() {
        return availableLeavedays;
    }

    public String evaluatePerformance() {
        if (calculateSalary() > 100000) {
            return "Excellent";
        } else if (calculateSalary() > 50000) {
            return "Good";
        } else {
            return "Bad";
        }
    }

}
