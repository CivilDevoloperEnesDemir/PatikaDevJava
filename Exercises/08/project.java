import java.util.Scanner;
public class project {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int code,k;
        double amount,interest=0;

        System.out.print("Para miktarını giriniz : ");
        amount = inp.nextDouble();

        System.out.print("Banka kodunuzu giriniz,\n99-TIRT\n98-ZIRT\n97-FIRT\n96-KIRT\nSeçiminiz:");
        code = inp.nextInt();

        if(code==99) {
            interest = (amount*0.09)/12;
        } else if (code==98) {
            interest = (amount*0.1)/12;
        } else if (code==97) {
            interest = (amount*0.08)/12;
        } else if (code==96) {
            interest = (amount*0.11)/12;
        }else {
            System.out.println("Hatalı veri girişi !");
        }

        System.out.print("Kaç aylık faiz hesaplansın :");
        k = inp.nextInt();


        System.out.println(k+" aylık fazi getirisi : "+interest*k);



    }
}
