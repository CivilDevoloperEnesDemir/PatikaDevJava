import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin yüksekliğini giriniz: ");
        int m = input.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}