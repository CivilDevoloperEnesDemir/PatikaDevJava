import java.sql.SQLOutput;
import java.util.Scanner;
public class project {
    public static void metot(){
        Scanner inp = new Scanner(System.in);
        boolean isError = true;
        int n,a;
        System.out.print("Sayı giriniz : ");
        n = inp.nextInt();
        a = n;
        System.out.print(n+" ");
        do {
            n = n-5;
            System.out.print(n+" ");
        }while(n>0);

        while (isError) {
            n=n+5;
            System.out.print(n+" ");
            if(n==a) {
                isError = false;

            }
        }
        System.out.println();
        metot();
    }
    public static void main(String[] args) {
        metot();
    }
}
