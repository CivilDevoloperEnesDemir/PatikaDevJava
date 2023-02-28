import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);

        /*  Alan Formülü = pi*r*r
            Çevre Formülü= 2*pi*r
         */

        double r,cevre,alan;
        System.out.print("Dairenin yarıçapını giriniz:");
        r=inp.nextDouble();

        cevre=2*Math.PI*r;
        alan=Math.PI*Math.pow(r,2);

        System.out.println("Dairenin Çevresi:\t"+cevre);
        System.out.println("Dairenin Alanı:\t\t"+alan);


    }
}
