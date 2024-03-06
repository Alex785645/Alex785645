import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scan.nextInt();
        if (liczba > 0) {
            System.out.println("liczba jest dodatnia");
        } else {
            if (liczba < 0) {
                System.out.println("liczba jest ujemna");
            } else {
                System.out.println("liczba =0");

            }

        }
    }


}
