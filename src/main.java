import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i;

        System.out.println(" Lütfen sınır olarak belirlediğiniz sayıyı giriniz : ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {

            if ((i % 4 == 0) && (i % 5 == 0)) {

                System.out.println(i);
            }

        }
    }

}

