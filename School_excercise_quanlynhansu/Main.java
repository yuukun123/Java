package School_excercise_quanlynhansu;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee(
            "John Doe",
            "FT001",
            "john.doe@company.com",
            5000.0,  // Base salary
            1000.0,  // Allowances
            20       // Available leave days
        );

        fte.getPersonInfo();
        System.out.println();
        fte.doWork();
        System.out.println("Monthly salary: $" + fte.calculateSalary());
        System.out.println("Performance evaluation: " + fte.evaluatePerformance());
        fte.requestLeave(5);
        System.out.println("Remaining leave days: " + fte.getAvailableLeavedays());
        System.out.println();

        System.out.println();
        Freelancer freelancer = new Freelancer(
                "Jane Smith",
                "FR001",
                "jane.smith@freelance.com",
                50.0    // Hourly rate
        );

        // Test freelancer functionality
        freelancer.getPersonInfo();

        System.out.println();
        freelancer.doWork();

        // Test project management
        freelancer.receiveProject("Website Development");
        freelancer.receiveProject("Mobile App UI");

        System.out.println("\nStatus after receiving projects:");
        freelancer.getPersonInfo();
        System.out.println();

        // Test hours tracking and salary calculation
        freelancer.trackWorkHours(20);
        freelancer.trackWorkHours(15);
        System.out.println("Regular salary calculation after " + freelancer.getTotalProjects() + " projects is : $" + freelancer.calculateSalary() );
        System.out.println("Custom salary calculation: $" +
                freelancer.calculateSalaryForHours(10, 60.0));

        // Complete a project
        freelancer.completeProject("Website Development");

        System.out.println("\nUpdated freelancer information:");
        freelancer.getPersonInfo();
    }
}