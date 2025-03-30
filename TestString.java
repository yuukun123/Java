public class TestString {

    public static void main(String[] args) {

        String name1 = "John";
        name1 = name1.toLowerCase();
        System.out.println(name1);
        System.out.println(name1.length());

        String name2 = "Hi";
        name2 = name2.toLowerCase();
        System.out.println(name2);
        System.out.println(name2.length());

        System.out.println(name1.indexOf(name2));
        System.out.println(name2.indexOf(name1));

        System.out.println(name1.substring(0, 3));
        System.out.println(name1.contains(name2));

        /*
        Giả sử s1 và s2 là hai biến chuỗi. Nếu:

        s1 == s2 : 0
        s1 > s2 : giá trị > 0
        s1 < s2 : giá trị < 0
         */
        System.out.println(name1.compareTo(name2));

    }
}
