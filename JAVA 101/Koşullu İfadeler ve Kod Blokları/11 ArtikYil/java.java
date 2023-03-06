import java.util.Scanner;
public class java {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int year;
        System.out.print("Yıl Giriniz :");
        year=inp.nextInt();

        if (year%4==0){
            if(year%100!=0) {
                System.out.println("Artık yıldır.");
            }
            else if(year%100==0 && year%400==0){
                System.out.print("Artık yıldır.");
            }else
                System.out.println("Artık yıl değildir.");
        }else
            System.out.println("Artık yıl değildir.");


    }
}
