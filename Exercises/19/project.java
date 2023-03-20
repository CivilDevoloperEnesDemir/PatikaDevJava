import java.util.Scanner;
public class project {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 1;
        int y = 1;
        int z;
        int n;
        System.out.print("Kaç Elemanlı Bir Fibonacci Serisi Yazdırmak İstiyorsunuz: ");
        n = input.nextInt();
        // Fibonacci Serisi
        // 1 1 2 3 5 8 13 21
        // x y z
        //   x y z
        //     x y z
        System.out.println(x);
        System.out.println(y);

        for(int i=2;i<=n;i++) {
            z=x+y;
            x=y;
            y=z;
            System.out.println(z);
        }

    }
}

