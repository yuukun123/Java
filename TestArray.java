import java.util.Scanner;

public class TestArray {
    public static boolean Prime(int n){
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int [] a = {1,2,3,4,5};

        int sum = 0;
        for (int j : a) {
            sum += j;

            if (Prime(j)) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        System.out.print(sum + " ");
    }
}
