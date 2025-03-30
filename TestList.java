import java.util.*;


public class TestList {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//        for(int i = 0; i < 5; i++){
//            String n = sc.nextLine();
//            list.add(n);
//        }
//        System.out.println(list);
//        list.remove(3);
//        System.out.println(list.reversed());
//    }

    public static void main(String[] args){
        List<String> list0 = new ArrayList<>(100); // khai bao list co kich thuoc 100 phan tu

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.remove(1);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.remove(1);
        System.out.println(list1);

        List<String> list2 = new LinkedList<>();
        list2.add("Hello");
        list2.add("World");
        list2.remove(1);
        System.out.println(list2);


        List<Integer> list3 = new Vector<>();
        for(int i = 0; i < 5; i++){
            list3.add(Integer.valueOf(i));
        }
        for(int i : list3){
            System.out.print(i + " ");
        }


        System.out.println();
        List<Integer> list4 = new Stack<>();
        for(int i = 0; i < 5; i++){
            list4.add(Integer.valueOf(i));
        }
        for(int i : list4){
            System.out.print(i + " ");
        }

        System.out.println();
        List <Integer> list5 = new ArrayList<>();
        for(int i = 1; i < 6; i++){
            list5.add(Integer.valueOf(i));
        }

        // khai bao Iterator
        // Iterator co the su dung cho list, set, map
        Iterator<Integer> iterator = list5.iterator();
        // kiem tra xem interator co phan tu tiep theo khong
        // neu co thi se di chuyen vi tri ma iterator dang tro den saang vi tri phan tu tiep theo
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        List<Integer> list6 = new ArrayList<>(100);
        for(int i = 0; i < 5; i++){
            list6.add(Integer.valueOf(i));
        }
        int n = 3;
        for(int i : list6){
            if(i == n){
                list6.set(i, 9);
            }
        }
        System.out.println(list6);


        List<Integer> list7 = new ArrayList<>(100);
        list7.add(2);
        list7.add(3);
        list7.add(5);
        list7.add(7);

        list7.removeIf(x -> x % 2 == 0); // xoa cac phan tu chia het cho 2
        System.out.println(list7);

        // sap xep
        List<Integer> list8 = new ArrayList<>(100);
        list8.add(2);
        list8.add(1);
        list8.add(3);
        list8.add(0);

        Collections.sort(list8);
        System.out.println(list8);


        List<String> listSource = new ArrayList<String>();

        listSource.add("A");
        listSource.add("B");
        listSource.add("C");
        listSource.add("D");

        // danh sách đích
        // số phần tử của listDest phải lớn hơn hoặc bằng
        // với số phần tử của listSource
        List<String> listDest = new ArrayList<String>();

        listDest.add("V");
        listDest.add("W");
        listDest.add("X");
        listDest.add("Y");
        listDest.add("Z");

        System.out.println("Các phần tử có trong listSource truoc khi duoc listDest copy: ");
        for (String str : listSource) {
            System.out.print(str + " ");
        }

        // sao chép các phần tử của listSource
        // vào trong listDest
        Collections.copy(listDest, listSource);

        System.out.println();
        System.out.println("Các phần tử có trong listDest: ");
        for (String str : listDest) {
            System.out.print(str + " ");
        }

        System.out.println();
        // hoan vi phan tu
        // tạo 1 listNumber có kiểu dữ liệu là Integer
        List<Integer> listNumber = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            listNumber.add(i);
        }

        System.out.println("Các phần tử trong listNumber trước khi hoán vị: ");
        // hiển thị các phần tử trong listNumber ở dạng mảng
        System.out.println(listNumber);

        Collections.shuffle(listNumber);

        System.out.println("Các phần tử trong listNumber sau khi hoán vị: ");
        System.out.println(listNumber);
        // luu y moi khi chay thi se ra ket qua khac nhau
    }
}
