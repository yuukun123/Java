package School_excercise_quanlynhansu;

import java.util.ArrayList;
import java.util.List;

public class Freelancer extends Employee {
    private List<String> currentProjects;
    private List<String> completedProjects;
    private int totalWorkedHours;
    private double hourlyRate;

    public Freelancer(String name, String id, String email, double hourlyRate) {
        super(name, id, email);
        this.currentProjects = new ArrayList<>();
        this.completedProjects = new ArrayList<>();
        this.totalWorkedHours = 0;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void getPersonInfo() {
        System.out.println("=== Freelancer Information ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Hours Worked: " + totalWorkedHours);
        System.out.println("Current Projects: " + currentProjects);
        System.out.println("Completed Projects: " + completedProjects);
    }

    @Override
    public double calculateSalary() {
        return totalWorkedHours * hourlyRate;
    }

    public double calculateSalaryForHours(int hoursWorked, double customRate) {
        return hoursWorked * customRate;
    }

    public void receiveProject(String projectName) {
        currentProjects.add(projectName);
    }

    public void trackWorkHours(int hours) {
        totalWorkedHours += hours;
        System.out.println("Total worked hours: " + totalWorkedHours);
    }

    public void completeProject(String projectName) {
        if (currentProjects.remove(projectName)) {
            completedProjects.add(projectName);  // Add to completed projects
            System.out.println("Completed project: " + projectName);
        } else {
            System.out.println("Project not found: " + projectName);
        }
    }

    public void setHourlyRate(double rate) {
        this.hourlyRate = rate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public List<String> getCurrentProjects() {
        return new ArrayList<>(currentProjects);
    }

    public int getTotalWorkedHours() {
        return totalWorkedHours;
    }

    public int getTotalProjects() {
        return currentProjects.size();
    }
}
