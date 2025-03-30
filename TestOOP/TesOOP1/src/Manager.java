public class Manager extends Employee {

    public Manager() {

    }

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }


    public void input() {
        System.out.print("Enter id: ");
        super.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter name: ");
        super.setName(sc.nextLine());
        System.out.print("Enter salary: ");
        super.setSalary(sc.nextDouble());
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
