import java.util.Scanner;
public class project {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n,n1,n2;
        System.out.print("n sayısını giriniz : ");
        n=inp.nextInt();

        if ( n%2!=0 ) {
            n1 = (n / 2) + 1;
            n2 = (n / 2);


            for (int i = 1; i <= n1; i++) {
                for (int j = 1; j <= (n1 - i); j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();

            }

            for (int i = 1; i <= n2; i++) {
                for (int j = 1; j <= (i); j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * n2 - (2 * i - 1)); k++) {
                    System.out.print("*");
                }
                System.out.println();

            }



        }else{

            n1 = (n / 2);
            n2 = (n / 2);


            for (int i = 1; i <= n1; i++) {
                for (int j = 1; j <= (n1 - i); j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i-1); k++) {
                    System.out.print("*");
                }
                System.out.println();

            }

        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * n2 - (2 * i - 1)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }

        }




        }














