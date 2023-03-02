import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int heat;
        System.out.print("Enter the heat:");
        heat=inp.nextInt();

        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 2 ve 20 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 30 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        */

        if (heat<=5){
            if(2<=heat){
                System.out.print("Kayak ve Sinema");
            }else {
                System.out.println("Kayak");
            }
        } else if (heat<=20) {
            if (heat<=15){
                System.out.print("Sinema");
            }else {
                System.out.print("Sinema ve Piknik");
            }

        } else if (heat<=30) {
            if (20<heat && heat<=25){
                System.out.print("Piknik");
            }else {
                System.out.print("Piknik ve Yüzme");
            }

        }else {
            System.out.print("Yüzme");
        }

        System.out.print("\nProgram Bitti.");


    }
}