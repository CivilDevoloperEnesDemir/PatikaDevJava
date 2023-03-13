import java.sql.SQLOutput;
import java.util.Scanner;
public class MainFor {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        int n1,n2,n3,ebob=1,ekok=1;

        System.out.print("1.Sayıyı giriniz : ");
        n1=inp.nextInt();

        System.out.print("2.Sayıyı giriniz : ");
        n2=inp.nextInt();


        for (int i=1 ; i<=n1 ; i++){
            if(n1%i==0 && n2%i==0){
                ebob=i;

            }

        }

        System.out.println("EBOB="+ebob);

        for(int k=1;k<=(n1*n2);k++){
            if(k%n1==0 && k%n2==0){
                ekok=k;
                break;

            }
        }

        System.out.println("EKOK="+ekok);




    }
}
