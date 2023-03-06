
import java.util.Scanner;
public class UcakFiyat {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        boolean isError=false;
        int km,age,type;
        double total,price=0.10;
        System.out.print("Enter Km: ");
        km=inp.nextInt();
        System.out.print("Enter your age: ");
        age=inp.nextInt();
        System.out.print("Select Flight Type\n1-Tek Yön\n2-Gidiş Dönüş\nSeçiminiz :");
        type=inp.nextInt();
        total=km*price*type;

        if((km>0) && (age>0) && (type==1 || type==2)){
                if(age<12){
                    total=total-total*50/100;
                } else if (12<=age && age<=24) {
                    total=total-total*10/100;

                } else if (age<65) {
                    total=total;

                } else if (age>=65) {
                    total=total-total*30/100;

                }
            if (type==1){
                total=total;
            }else
                total=total-total*20/100;


        }else
            isError=true;

        if(isError){
            System.out.println("Hata var");
        }else
            System.out.println("Toplam Tutar :"+total);








}
}
