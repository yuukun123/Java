import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void DisplayAlbum(AlbumCD[] album) {
        for (int i = 0; i < album.length; i++) {
            album[i].output();
        }
    }

    public static void Count(AlbumCD[] album) {
        System.out.println("Total CD in Album: " + album.length);
    }

    public static void SumPrice(AlbumCD[] album) {
        int sum = 0;
        for (int i = 0; i < album.length; i++) {
            sum += album[i].getPrice();
        }
        System.out.println("Total price in Album: " + sum);
    }

    public static void SortPrice(AlbumCD[] album) {
        Arrays.sort(album, Comparator.comparingDouble(AlbumCD::getPrice).reversed());
        System.out.println("Albums sorted by price in descending order:");
        DisplayAlbum(album);
    }

    public static void SortName(AlbumCD[] album) {
        Arrays.sort(album, Comparator.comparing(AlbumCD::getName));
        System.out.println("Albums sorted by name in ascending order:");
        DisplayAlbum(album);
    }

    // Main for run
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AlbumCD[] album = null;

        int option;

        do {
            System.out.println();
            System.out.println("========Menu========");
            System.out.println("\t1. Add album");
            System.out.println("\t2. Update CD");
            System.out.println("\t3. Delete CD");
            System.out.println("\t4. Display album");
            System.out.println("\t5. Search CD");
            System.out.println("\t6. Count CD");
            System.out.println("\t7. Sum price CD");
            System.out.println("\t8. Sort album with price");
            System.out.println("\t9. Sort album with name CD");
            System.out.println("\t0. Exit");
            System.out.print("Enter your option: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    int n = 0;
                    if (album == null) {
                        System.out.print("Enter the number of CD in Album: ");
                        n = sc.nextInt();
                        sc.nextLine();
                        album = new AlbumCD[n];

                        for (int i = 0; i < n; i++) {
                            album[i] = new AlbumCD();
                            album[i].input(sc);
                        }
                    }
                    else if (album != null) {
                        System.out.println("Add more CD in Albums");
                        int add = sc.nextInt();
                        sc.nextLine();
                        if (add + n > album.length) {
                            System.out.println("Not enough space");
                        } else {
                            for (int i = 0; i < add; i++) {
                                album[i] = new AlbumCD();
                                album[i].input(sc);
                            }
                        }
                    }
                    break;
                case 2:
                    AlbumCD album2 = new AlbumCD();
                    if(album == null) {
                        System.out.println();
                        System.out.println("List is empty");
                    }

                    if(album != null) {
                        System.out.println();
                        System.out.print("Choose name CD or singer name to find: ");
                        String choose = sc.nextLine();
                        if(choose.equals("CD")) {
                            album2.Search_CD_Name(sc);
                        }
                        else if(choose.equals("Singer")) {
                            album2.Search_Singer_Name(sc);
                        }
                        System.out.print("Do you want to update? (y/n): ");
                        String choice = sc.nextLine();
                        if (choice.equals("yes") || choice.equals("y") || choice.equals("YES") || choice.equals("Y")) {
                            for (int i = 0; i < album.length; i++) {
                                if (album2.getName().equals(album[i].getName()) || album2.getName().equals(album[i].getNameSinger())) {
                                    album2.Update();
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    AlbumCD album3 = new AlbumCD();

                    if(album == null) {
                        System.out.println();
                        System.out.println("List is empty");
                    }

                    if(album != null) {
                        System.out.println();
                        System.out.print("Choose name CD or singer name to delete: ");
                        String choose = sc.nextLine();
                        if(choose.equals("CD")) {
                            album3.Search_CD_Name(sc);
                        }
                        else if(choose.equals("Singer")) {
                            album3.Search_Singer_Name(sc);
                        }

                        System.out.print("Do you want to delete? (y/n): ");
                        String choice = sc.nextLine();
                        if (choice.equals("yes") || choice.equals("y") || choice.equals("YES") || choice.equals("Y")) {
                            for (int i = 0; i < album.length; i++) {
                                if (album3.getName().equals(album[i].getName()) || album3.getName().equals(album[i].getNameSinger())) {
                                    album[i] = null;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    AlbumCD album0 = new AlbumCD();
                    album0.Line();
                    if (album == null || album.length == 0) {
                        System.out.println();
                        System.out.println("List is empty");
                    } else {
                        System.out.println();
                        System.out.printf("| %-15s %-18s %-20s %-18s %-20s |\n", "Mã CD", "Tên CD", "Tên ca sỹ", "Số bài hát", "Giá thành");
                        DisplayAlbum(album);
                    }
                    album0.Line();
                    break;
                case 5:
                    AlbumCD album4 = new AlbumCD();
                    if(album == null) {
                        System.out.println();
                        System.out.println("List is empty");
                    }

                    if(album != null) {
                        System.out.println();
                        System.out.print("Choose name CD or singer name to find: ");
                        String choose = sc.nextLine();
                        if(choose.equals("CD")) {
                            album4.Search_CD_Name(sc);
                        }
                        else if(choose.equals("Singer")) {
                            album4.Search_Singer_Name(sc);
                        }

                        for (int i = 0; i < album.length; i++) {
                            if (album4.getName().equals(album[i].getName()) || album4.getName().equals(album[i].getNameSinger())) {
                                System.out.println();
                                System.out.printf("%-15s %-18s %-20s %-18s %-20s \n", "Mã CD", "Tên CD", "Tên ca sỹ", "Số bài hát", "Giá thành");
                                album[i].output();
                                break;
                            }
                        }
                    }
                    break;
                case 6:
                    if(album == null) {
                        System.out.println();
                        System.out.println("List is empty");
                    }

                    if(album != null) {
                        Count(album);
                    }
                case 7:
                    if(album == null) {
                        System.out.println();
                        System.out.println("List is empty");
                    }

                    if(album != null) {
                        SumPrice(album);
                    }
                case 8:
                    if(album == null) {
                        System.out.println();
                        System.out.println("List is empty");
                    }

                    if(album != null) {
                        SortPrice(album);
                    }
                case 9:
                    if(album == null) {
                        System.out.println();
                        System.out.println("List is empty");
                    }

                    if(album != null) {
                        SortName(album);
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        } while (true);
    }
}