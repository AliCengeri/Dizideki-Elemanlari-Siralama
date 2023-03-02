import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int bas = input.nextInt();
        int[] arr = new int[bas];
        for (int i = 0; i < bas; i++) {
            System.out.print(i + 1 + ". Sayıyı giriniz: ");
            int deg = input.nextInt();
            arr[i] = deg;
        }
        Arrays.sort(arr);
        System.out.println("Sıralama: " + Arrays.toString(arr));
    }
}