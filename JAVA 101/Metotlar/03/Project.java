import java.util.Scanner;
public class Project {

    public static void toplama(int a,int b) {
        int result = a+b;
        System.out.print("Toplam : "+result);
    }
    public static void cikarma(int a,int b) {
        int result = a-b;
        System.out.print("Çıkarma : "+result);
    }
    public static void carpma(int a,int b) {
        int result = a*b;
        System.out.print("Çarpım : "+result);
    }
    public static void bolum(double a,double b) {
        if (b == 0) {
            System.out.print("Bir sayı sıfıra bölünemez !");
        } else {
            double result = a / b;
            System.out.print("Bölüm : " + result);
        }
    }
    public static int  power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++) {
            result*=a;
        }
        return result;
    }
    public static int faktoryel(int a) {
        int result=1;
        if(a == 0) {
            return 1;
        } else {
            for (int i = 1; i <= a; i++) {
                result = result * i;
            }
            return result;
        }
    }

    public static void mod(int a,int b) {
        if (b==0) {
            System.out.print("Bir sayı sıfıra bölünemez ! ");
        } else {
            int result = a%b;
            System.out.print(a+" sayısının "+b+" sayısı ile bölümünden kalan = "+result);
        }
    }
    public static void dikdortgen(int a,int b) {
        int alan = a*b;
        int cevre = 2*(a+b);
        System.out.print("Dikdörtgenin Alanı : "+alan+"\nDikdörtgenin çevresi : "+cevre);
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n0- Çıkış\n");





        while (true) {
            int select;

            System.out.print("İlk sayıyı giriniz : ");
            int a = inp.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = inp.nextInt();
            System.out.print("Seçiminiz : ");
            select = inp.nextInt();
            if (select == 0) {
                System.out.print("Çıkış Başarılı !");
                break;
            }
            switch (select) {
                case 1:
                    toplama(a,b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolum(a,b);
                    break;
                case 5:
                    System.out.print(a+" üzeri "+b+" = "+power(a,b));
                    break;
                case 6:
                    System.out.println(a+"! = "+faktoryel(a));
                    System.out.print(b+"! = "+faktoryel(b));
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    dikdortgen(a,b);
                    break;
            }
            System.out.println("\n");
        }



    }
}
