import java.sql.SQLOutput;
import java.util.Scanner;
public class UcakFiyat {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        boolean isError=false;
        int km,age,type;
        double total,price=1;
        System.out.print("Enter Km: ");
        km=inp.nextInt();
        System.out.print("Enter your age: ");
        age=inp.nextInt();
        System.out.print("Select Flight Type\n1-Tek Yön\n2-Gidiş Dönüş\nSeçiminiz :");
        type=inp.nextInt();
        total=km*price*type;

        if (km>0 && age>0 && (type==1 || type==2) ) {
            if (type == 1) {
                if (age <= 12) {
                    total = total / 2;
                } else if (age < 24) {
                    total = total - total * 10 / 100;

                } else if (age > 65) {
                    total = total - total * 30 / 100;
                }
            } else {
                isError=true;
            }


            if (type==2){
                if (age <= 12) {
                    total = total-total*70/100;
                } else if (age < 24) {
                    total = total - total * 30 / 100;

                } else if (age > 65) {
                    total = total - total * 50 / 100;

            }else
                isError=true;

        }else
            isError=true;


    }
        System.out.println(isError);
        if (isError) {
            System.out.println("bilet fiyatı: "+total);

        }else
            System.out.println("Hata var");

}}
