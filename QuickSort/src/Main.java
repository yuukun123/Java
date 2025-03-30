import java.util.Scanner;

public class Main {
    public void QuickSort(int[] a, int l, int r) {
        int i = l, j = r, mid = a[l];

        while( i < r && a[i] < mid) i++;
        while( j > l && a[j] > mid) j--;
        if( i <= j ){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++; j--;
        }
        if (l < j) QuickSort(a, l, j);
        if (i < r) QuickSort(a,i, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Main ob = new Main();
        ob.QuickSort(a, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

    }
}