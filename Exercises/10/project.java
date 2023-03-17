import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        boolean isError = true;

        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();
        if(number>0) {
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {

                    isError = false;
                    break;
                }
            }
            if(number==1){
                isError=false;
            }
            if (isError) {
                System.out.println(number + " asal sayıdır");
            } else
                System.out.println(number + " asal sayı değildir");

        }else
            System.out.println("Pozitif sayı giriniz!");

    }

    }

