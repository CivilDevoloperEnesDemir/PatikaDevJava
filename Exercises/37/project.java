import java.util.Scanner;
import java.util.Vector;

public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        double a,b,c,n,x0,xi;

        System.out.print("a : ");
        a = inp.nextDouble();
        System.out.print("b : ");
        b = inp.nextDouble();
        System.out.print("c : ");
        c = inp.nextDouble();
        System.out.print("n : ");
        n = inp.nextDouble();
        System.out.print("x0 : ");
        x0 = inp.nextDouble();

        xi=x0;

        for(int i=1;i<=n;i++) {
            xi = xi-(a*xi*xi+b*xi+c)/(2*a*xi+b);
        }

        System.out.println("Xn = "+xi);


    }
}
