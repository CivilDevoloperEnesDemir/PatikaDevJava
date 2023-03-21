import java.util.Scanner;
public class project {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, total=0;

        do {
            System.out.print("Sayı giriniz : ");
            number = inp.nextInt();
            if(number % 2 == 0) {
                total = total+number;
            }
        } while(number>=0);

        System.out.println("Girilen çift sayıların toplamı :\t"+total);
    }
}
