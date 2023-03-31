import java.util.Scanner;

public class project {
    public static void asalMi(){
        boolean isError = true;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");

        int k = inp.nextInt();
        if (k==1) {
            System.out.print(k+" asal sayı değildir.");

        }
        if (k==2) {
            System.out.print(k+" asal sayıdır.");

        }

        if(k>2) {
            for (int i = 2; i < k; i++) {


                if (k % i == 0) {
                    isError = true;
                    break;

                } else {
                isError = false;

                }
            }
            if (isError)
                System.out.print(k + " asal sayı değildir.");
            else {
                System.out.print(k + " asal sayıdır.");
            }
        }

        System.out.println();
        asalMi();

    }

    public static void main(String[] args) {
        asalMi();
    }
}
