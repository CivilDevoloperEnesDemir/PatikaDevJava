import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;
        System.out.print("1.sayıyı giriniz : ");
        a = inp.nextInt();
        System.out.print("2.sayıyı giriniz : ");
        b = inp.nextInt();


       for(int i=a;i<=a*b;i++){
           if(i%a==0 && i%b==0){
               System.out.println(i);
               break;
           }

       }



    }
}
