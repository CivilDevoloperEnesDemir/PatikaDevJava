import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int n;

        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        for(int i=n;;i--){
            if(i==0){
                break;
            }else

                for(int j=0;j<=n-i;j++){
                    System.out.print(" ");

                }

                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
            System.out.println();
        }

    }
}
