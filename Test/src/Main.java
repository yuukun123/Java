public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(100, "Yuu");
        Date date2 = new Date(10, "Yu");
//        date2 = date1;
//        System.out.println(date1.getDay() == date2.getDay());


//        System.out.println(date1.getName().equals(date2.getName()));
//        System.out.println(date1 == date2);
        System.out.println(date1.equals(date2));

    }
}