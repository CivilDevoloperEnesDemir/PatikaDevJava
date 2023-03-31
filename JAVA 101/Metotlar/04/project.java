import java.util.Scanner;

public class project {
    public static void power () {
        Scanner inp = new Scanner(System.in);
        int a,b,result=1;
        System.out.print("Taban değerini giriniz :");
        a = inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        b = inp.nextInt();
        for(int i=1;i<=b;i++) {
            result*=a;
        }
        System.out.println("Sonuç : "+result);
        power();

    }
    public static void main(String[] args) {
        power();
    }
}
