import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        String username,password;
        int right = 3;
        int balance = 1500;
        int amount;
        int select;
        boolean condition = true;

        while (condition){

            System.out.print("\nKullanıcı Adınız : ");
            username = inp.nextLine();
            System.out.print("Parolanız : ");
            password = inp.nextLine();

            if(username.equals("patika") && password.equals("dev123")){
                System.out.print("Giriş Başarılı !");

                while(condition){

                    System.out.print("\nYapmak istediğiniz işlemi seçiniz\n1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap\nSeçiminiz :");
                    select = inp.nextInt();

                    if (select==1){
                        System.out.print("Yatırmak istediğiniz para miktarını giriniz :");
                        amount = inp.nextInt();
                        balance=balance+amount;
                        System.out.print("Hesap Bakiyeniz "+balance+" Tl.");
                        System.out.print("\nAna Menüye dönmek için 1'i Çıkış yapmak için 2'yi tuşlayınız : ");
                        select=inp.nextInt();
                        if(select==1){
                            condition=true;
                        }else{
                            condition=false;
                        }

                    } else if (select==2) {
                        System.out.print("Çekmek istediğiniz para miktarını giriniz :");
                        amount = inp.nextInt();
                        if(balance>amount){
                            balance = balance-amount;
                            System.out.print("Hesap Bakiyeniz "+balance+" Tl.");
                        }else{
                            System.out.print("Yetersiz Bakiye !");
                        }
                        System.out.print("\nAna Menüye dönmek için 1'i Çıkış yapmak için 2'yi tuşlayınız : ");
                        select=inp.nextInt();
                        if(select==1){
                            condition=true;
                        }else{
                            condition=false;
                        }
                    } else if (select==3) {
                        System.out.print("Bakiyeniz :"+balance+" TL.");
                        System.out.print("\nAna Menüye dönmek için 1'i Çıkış yapmak için 2'yi tuşlayınız : ");
                        select=inp.nextInt();
                        if(select==1){
                            condition=true;
                        }else{
                            condition=false;
                        }
                    } else if (select==4) {
                        System.out.print("Çıkış Başarılı !");
                        condition = false;
                    }


                }


            }else {
                right--;

                    if(right == 0) {
                        System.out.println("Hesabınız bloke olmuştur !");
                        condition = false;
                    }else {
                        System.out.println("Kullanıcı Adı veya Parola hatalı, lütfen tekrar deneyiniz !");
                        System.out.println("Kalan deneme hakkınız : "+right);
                    }

            }





        }





    }
}
