import java.util.Scanner;
public class project {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int number;

        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();

        if (number % 5==0 && number % 6!=0)
            System.out.print("Sayı 5'e bölünür.");
        if (number % 5!=0 && number % 6==0)
            System.out.println("Sayı 6'ya bölünür.");
        if (number % 5==0 && number % 6==0)
            System.out.println("Sayı hem 5'e hem 6'ya bölünür.");
        else
            System.out.println("Sayı ne 5'e ne 6'ya bölünür");


    }
}
