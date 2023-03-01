import java.util.Scanner;

public class version2 {

    public static void main(String[] args){

        String userName,password;


        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adı :");
        userName = input.nextLine();

        System.out.println("Şifre :");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("javaci")){
            System.out.println("Giriş Yaptınız");
        }
        else {
            System.out.println("Bilgiler Yanlış - Şifre Sıfırlamak İster misiniz ? 1)Evet 2)Hayır");
            int check;
            String newPassword;
            Scanner input2 = new Scanner(System.in);
            check = input2.nextInt();

            if(check == 1){
                System.out.println("Yeni Şifre :");
                newPassword = input.nextLine();

                if(password.equals(newPassword)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    password = newPassword;
                    System.out.println("Şifre oluşturuldu");
                }

            }

        }



    }


}