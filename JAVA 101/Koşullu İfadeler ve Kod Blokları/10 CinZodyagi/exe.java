import java.util.Scanner;
public class exe {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String zodyak="";
        int year;
        System.out.print("Doğum tarihinizi giriniz :");
        year=inp.nextInt();


        if (year%12==0){
            zodyak="Maymun";
        }
        else if (year%12==1){
            zodyak="Horoz";
        }
        else if (year%12==2){
            zodyak="Köpek";
        }
        else if (year%12==3){
            zodyak="Domuz";
        }
        else if (year%12==4){
            zodyak="Fare";
        }
        else if (year%12==5){
            zodyak="Öküz";
        }
        else if (year%12==6){
            zodyak="Kaplan";
        }
        else if (year%12==7){
            zodyak="Tavşan";
        }
        else if (year%12==8){
            zodyak="Ejderha";
        }
        else if (year%12==9){
            zodyak="Yılan";
        }
        else if (year%12==10){
            zodyak="At";
        }
        else if (year%12==11){
            zodyak="Koyun";
        }

        System.out.println("Çin Zodyağınız: "+zodyak);

    }
}
