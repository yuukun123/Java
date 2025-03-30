import  java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class AlbumCD {
    private int id;
    private String name;
    private String nameSinger;
    private int quantity;
    private double price;

    Scanner sc = new Scanner(System.in);

    public AlbumCD(){

    }

    public AlbumCD(int id, String name, String nameSinger, int quantity, int price){
        this.id = id;
        this.name = name;
        this.nameSinger = nameSinger;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getNameSinger(){
        return nameSinger;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNameSinger(String nameSinger){
        this.nameSinger = nameSinger;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void input(Scanner sc){
        System.out.print("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter nameSinger: ");
        nameSinger = sc.nextLine();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Album{" + "ID=" + id + ", Name CD=" + name + ", Singer=" + nameSinger +
        ", Quantity=" + quantity + ", Price=" + price + "}";
    }

    public void output(){
        System.out.printf("| %-15d %-18s %-20s %-18d %-20.1f |\n", id, name, nameSinger, quantity, price);
    }

    public void Update(){
        System.out.print("Enter new name: ");
        name = sc.nextLine();
        System.out.print("Enter new nameSinger: ");
        nameSinger = sc.nextLine();
        System.out.print("Enter new quantity: ");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new price: ");
        price = sc.nextInt();
        sc.nextLine();
    }

    public void Delete(){
        id = 0;
        name = null;
        nameSinger = null;
        quantity = 0;
        price = 0;
    }

    public void Search_CD_Name(Scanner sc){
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    public void Search_Singer_Name(Scanner sc){
        System.out.print("Enter nameSinger: ");
        nameSinger = sc.nextLine();
    }

    public void Line(){
        for(int i = 0; i < 99; i++){
            System.out.print("-");
        }
    }

}
