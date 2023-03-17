import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num;

        System.out.print("Bir sayı giriniz :");
        num=inp.nextInt();


            if (num < 0 && num % 9 == 0) {
                System.out.println("X");
            }
            else if (num > 0 && num % 7 == 0) {
                System.out.print("Y");
            }
            else if (num % 2 != 0) {
                System.out.print("Z");
            }
            else{
                System.out.println("W");
            }


    }
}
