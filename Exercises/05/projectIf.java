import java.util.Scanner;
public class projectIf {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int type;
        double price,tax=0,salePrice;

        System.out.print("Ürün fiyatını giriniz : ");
        price = inp.nextInt();

        System.out.print("Ürün tipini giriniz\n1-Tip 172\n2-Tip 188\n3-Tip 196\nSeçiminiz : ");
        type = inp.nextInt();

        if(type == 1) {
            tax = price*(0.18);
        } else if (type == 2) {
            tax = price*(0.08);
        } else if (type == 3) {
            tax = price*(0);
        }else{
            System.out.print("Hatalı veri girişi !");
        }

        salePrice = price + tax;

        System.out.print("Ürünün son fiyatı :"+salePrice);



    }
}
