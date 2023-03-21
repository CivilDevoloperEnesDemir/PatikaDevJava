import java.util.Scanner;
public class project {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double m,n,carpim=1.0;

        System.out.print("m değerini giriniz : ");
        m = inp.nextDouble();
        System.out.print("n değerini giriniz : ");
        n = inp.nextDouble();

        for(double i=(m-n+1);i<=m;i++){
            carpim = carpim * i;
        }

        System.out.println("Sonuç : "+carpim);



    }
}
