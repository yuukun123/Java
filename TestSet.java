import java.util.*;
import java.util.stream.Collectors;

public class TestSet {
    public static void main(String[] args) {
        // set se loai bo nhung phan tu trung nhau
        // nen neu trong líst co cac phan tu trung nhau thi cho vao list de loai bo phan tu trung nhau
        Set<String> a = new HashSet<>();
        a.add("yuu");
        a.add("hao");
        a.add("Tin");
        System.out.println(a);

        Set<Integer> a1 = new HashSet<>();
        a1.add(1);
        a1.add(3);
        a1.add(2);
        a1.add(0);
        a1.add(4);
        System.out.println(a1);

        Set<String> b = new TreeSet<>();
        b.add("yuu");
        b.add("hao");
        b.add("Tin");
        System.out.println(b);

        Set<Integer> b1 = new TreeSet<>();
        b1.add(1);
        b1.add(0);
        b1.add(2);
        b1.add(4);
        b1.add(5);
        System.out.println(b1);

        // thêm listInteger và setInteger
        List<Integer> listInteger = new ArrayList<>();
        Set<Integer> setInteger = new TreeSet<>();

        // thêm các phần tử vào listInteger
        listInteger.add(0);
        listInteger.add(3);
        listInteger.add(1);
        listInteger.add(4);
        listInteger.add(2);
        listInteger.add(8);

        // lọc các phần tử là số chẵn trong listInteger
        // và thêm vào trong setInteger
        setInteger = listInteger.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toSet());

        // hiển thị các phần tử trong setInteger
        System.out.println("Các phần tử trong setInteger: ");
        for (int numbers : setInteger) {
            System.out.println(numbers);
        }


        // them phan tu vo set
        int number;
        Set<Integer> ListInteger = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        // thêm các phần tử vào setInteger
        setInteger.add(0);
        setInteger.add(3);
        setInteger.add(1);
        setInteger.add(4);
        setInteger.add(2);
        setInteger.add(8);

        // hiển thị các phần tử trong setInteger
        System.out.println("Các phần tử trong setInteger: ");
        System.out.println(setInteger);

        System.out.println("Nhập phần tử cần thêm: ");
        number = scanner.nextInt();

        // thêm một phần tử mới vào setInteger từ bàn phím
        // nếu phần tử đó đã tồn tại thì thông báo đã tồn tại
        // ngược lại thì thêm vào
        if (!setInteger.contains(number)) {
            setInteger.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử trong setInteger sau khi thêm: ");
            System.out.println(setInteger);
        } else {
            System.out.println("Phần tử " + number + " đã tồn tại!");
        }

        // xoa phan tu khoi set
        String str;
        Set<String> setString = new TreeSet<>();

        // thêm các phần tử vào setString
        setString.add("JAVA");
        setString.add("ANDROID");
        setString.add("PHP");
        setString.add("C#");

        System.out.println("Các phần tử có trong setString: ");
        System.out.println(setString);

        System.out.println("Nhập phần tử cần xóa: ");
        str = scanner.nextLine();

        // nếu phần tử cần xóa
        // có tồn tại setString thì sẽ thông báo xóa thành công
        // và hiển thị các phần tử còn lại
        // ngược lại thông báo xóa không thành công
        if (setString.contains(str)) {
            setString.remove(str);
            System.out.println("Xóa thành công!");
            System.out.println("Các phần tử còn lại trong setString:");
            System.out.println(setString);
        } else {
            System.out.println("Xóa không thành công!");
        }

        // xoa tat ca phan tu trong set
        String string;
        Set<String> setstring = new TreeSet<>();

        // thêm các phần tử vào setInteger
        setstring.add("JAVA");
        setstring.add("ANDROID");
        setstring.add("PHP");
        setstring.add("C#");

        // xóa toàn bộ các phần tử trong setString
        // sử dụng phương thức clear()
        setstring.clear();

        // sau khi xóa thì trong setString
        // sẽ không có phần tử nào
        // phương thức isEmpty() dưới đây sẽ kiểm tra
        // nếu setString không có giá trị
        // thì sẽ hiển thị thông báo "Không có phần tử"
        if (setstring.isEmpty()) {
            System.out.println("Không có phần tử.");
        }

        // xuat cac phan tu dung truoc trong listInteger
        List<Integer> Listinteger = new ArrayList<>();

        // thêm các phần tử vào trong listInteger
        Listinteger.add(2);
        Listinteger.add(1);
        Listinteger.add(4);
        Listinteger.add(3);
        Listinteger.add(6);
        Listinteger.add(5);
        Listinteger.add(8);
        Listinteger.add(7);
        Listinteger.add(0);
        Listinteger.add(9);

        // khai báo 1 SortedSet Interface có kiểu là Integer
        // có các phần tử là các phần tử của listInteger
        SortedSet<Integer> sortedsetInteger = new TreeSet<>(Listinteger);

        System.out.println("Các phần tử có trong sortedsetInteger: ");
        System.out.println(sortedsetInteger);

        // khai báo 1 SortedSet có tên là headset
        // có các phần tử được trích xuất
        // từ phần tử đầu tiên đến
        // phần tử đứng trước phần tử 5 trong sortedsetInteger
        SortedSet<Integer> headset = sortedsetInteger.headSet(5);
        System.out.println("Các phần tử có trong headset: ");
        System.out.println(headset);


        // tìm phần tử lớn nhất và nhỏ nhất trong sortedsetInteger
        List<Integer> listinteger = new ArrayList<>();

        // thêm các phần tử vào trong listInteger
        listinteger.add(2);
        listinteger.add(1);
        listinteger.add(4);
        listinteger.add(3);
        listinteger.add(6);
        listinteger.add(5);
        listinteger.add(8);
        listinteger.add(7);
        listinteger.add(0);
        listinteger.add(9);

        SortedSet<Integer> SortedsetInteger = new TreeSet<>(listinteger);

        System.out.println("Các phần tử có trong sortedsetInteger: ");
        System.out.println(SortedsetInteger);

        // tìm phần tử lớn nhất và nhỏ nhất trong sortedsetInteger
        int phanTuLonNhat = SortedsetInteger.last();
        int phanTuNhoNhat = SortedsetInteger.first();
        System.out.println("Phần tử lớn nhất và nhỏ nhất trong"
                + " sortedsetInteger là " + phanTuLonNhat + " và " + phanTuNhoNhat);

    }
}
