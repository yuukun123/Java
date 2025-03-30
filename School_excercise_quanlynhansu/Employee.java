package School_excercise_quanlynhansu;

abstract class Employee implements Employee_Function{
    protected String name;
    protected String id;
    protected String email;

    public Employee(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    @Override
    public void doWork() {
        System.out.println(name + " is performing assigned tasks");
    }

    @Override
    public void getPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
}
