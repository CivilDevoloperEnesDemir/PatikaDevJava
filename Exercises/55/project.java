import java.util.Scanner;

public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner(System.in);

        int m,n;

        System.out.print("Dikdörtgenin yüksekliğini giriniz : ");
        m = inp.nextInt();
        System.out.print("Dikdörtgenin genişliğini giriniz : ");
        n = inp.nextInt();

        for (int i=1;i<=m;i++) {
            for (int j=1;j<=n;j++) {
                if (i==1 || i==m || j==1 || j==n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
