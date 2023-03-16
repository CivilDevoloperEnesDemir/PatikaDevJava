// Yarıçapı kullanıcıdan alarak dairenin alanını hesaplayan program yazınız.
// Pi değişkenini sabit bir değere atayarak kullanınız.

import java.util.Scanner;
public class project1 {
    public static void main(String[] args){

        final double Pi = 3.1415;   // "final" komutu javada sabit tanımlamak için kullanılır.

        Scanner s = new Scanner(System.in);

        int r;
        double alan;

        System.out.print("Yarıçapı giriniz : ");
        r = s.nextInt();
        alan=Pi*r*r;

        System.out.println("Dairenin alanı : "+alan);


    }
}
