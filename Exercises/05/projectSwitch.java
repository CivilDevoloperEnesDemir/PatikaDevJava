import java.util.Scanner;
public class projectSwitch{

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int type;
        double price,tax=0,salePrice;

        System.out.print("Ürün fiyatını giriniz : ");
        price = inp.nextInt();

        System.out.print("Ürün tipini giriniz\n1-Tip 172\n2-Tip 188\n3-Tip 196\nSeçiminiz : ");
        type = inp.nextInt();

        boolean isError = true;

        switch(type) {

            case 1:
            tax = price*(0.18);
            break;

            case 2:
            tax = price*(0.08);
            break;

            case 3:
            tax = price*(0);
            break;

            default:
            System.out.print("Hatalı veri girişi !");
            isError = false;
        }

        if (isError){
            salePrice = price + tax;

            System.out.print("Ürünün son fiyatı :" + salePrice);
        }

            System.out.println("\nProgram Bitti !");



    }
}
