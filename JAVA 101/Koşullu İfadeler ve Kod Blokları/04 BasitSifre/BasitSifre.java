import java.sql.SQLOutput;
import java.util.Scanner;
public class BasitSifre {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String userName,Password,NewPassword;
        int select;

        /* userName=Enes , Password=enes123 */

        System.out.print("Kullanıcı Adını giriniz:");
        userName=inp.nextLine();

        System.out.print("Şifre Giriniz:");
        Password=inp.nextLine();

        if (userName.equals("Enes") && Password.equals("enes123")){
            System.out.print("Giriş Başarılı");
        } else if (userName.equals("Enes") && !(Password.equals("enes123"))) {
            System.out.print("Şifre Yanlış.\nŞifrenizi sıfırlamak için seçim yapınız:\n1-Sıfırla\n2-Vazgeç\nSeçiminiz:");
            select=inp.nextInt();

            if (select==1){
                System.out.print("Yeni Şifrenizi Giriniz:");
                NewPassword=inp.nextLine();
                NewPassword=inp.nextLine();
                if (NewPassword.equals(Password) || NewPassword.equals("enes123")){
                    System.out.print("Yeni şifre hatalı girilen şifreyle veya eski şifre ile aynı olamaz! Lütfen Başka Şifre Giriniz!");
                }else {
                    System.out.println("Şifreniz başarılı bir şekilde değiştirildi.");
                    Password=NewPassword;
                }
            }else {
                System.out.println("Şifreniz Değiştirilmedi!");
            }

        }
        System.out.print("Yeni Şifreniz:"+Password);

        System.out.println("\nProgram Bitti!");
    }
}
