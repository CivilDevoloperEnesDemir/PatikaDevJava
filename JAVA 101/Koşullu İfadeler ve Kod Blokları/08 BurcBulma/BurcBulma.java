import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int month,day;
        String burc="";
        boolean isError =false;

        System.out.print("Hangi ayda doğdunuz (1-12) ? :");
        month=inp.nextInt();
        System.out.print("Hangi günde doğdunuz ? :");
        day=inp.nextInt();

        if (month==1){
            if (day>=1 && day<=31){
                if (day<22) {
                  burc="Oğlak";
                }else
                    burc="Kova";
            }else
                isError =true;

        } else if (month==2) {
            if (day>=1 && day<=28){
                if (day<=19){
                    burc="Kova";
                }else
                    burc="Balık";

            }else
                isError =true;

        } else if (month==3) {
            if (day>=1 && day<32){
                if (day<=20){
                    burc="Balık";
                }else
                    burc="Koç";
            }else
                isError =true;

        } else if (month==4) {
            if (day>=1 && day<=30){
                if (day<=20){
                    burc="Koç";
                }else
                    burc="Boğa";
            }else
                isError =true;

        } else if (month==5) {
            if(day>=1 && day<=31){
                if (day<=21){
                    burc="Boğa";
                }else
                    burc="İkizler";
            }else
                isError =true;

        } else if (month==6) {
            if(day>=1 && day<=30){
                if(day<=22){
                    burc="İkizler";
                }else
                    burc="Yengeç";

            }else
                isError =true;

        } else if (month==7) {
            if(day>=1 && day<=31){
                if(day<=22){
                    burc="Yengeç";
                }else
                    burc="Aslan";
            }else
                isError =true;

        } else if (month==8) {
            if(day>=1 && day<=31){
                if(day<=22){
                    burc="Aslan";
                }else
                    burc="Başak";
            }

        } else if (month==9) {
            if(day>=1 && day<=30){
                if(day<=22){
                    burc="Başak";
                }else
                    burc="Terazi";
            }else
                isError =true;

        }else if (month==10){
            if(day>=1 && day<=31){
                if(day<=22){
                    burc="Terazi";
                }else
                    burc="Akrep";
            }else
                isError =true;

        } else if (month==11) {
            if(day>=1 && day<=30){
                if(day<=21){
                    burc="Akrep";
                }else
                    burc="Yay";
            }else
                isError =true;

        } else if (month==12) {
            if(day>=1 && day<=31){
                if(day<=21){
                    burc="Yay";
                }else
                    burc="Oğlak";
            }else
                isError=true;

        }

        else{
            isError=true;
        }


        if (isError){
            System.out.println("Hatalı veri girişi");
        }else
            System.out.println("Burcunuz: "+burc);







    }
}
