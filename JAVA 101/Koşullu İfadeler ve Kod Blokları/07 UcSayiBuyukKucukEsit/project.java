import java.util.Scanner;
public class project {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int a,b,c;

        System.out.print("a sayısını giriniz:");
        try {
            a=Integer.parseInt(inp.nextLine());
        }catch (NumberFormatException e){
            System.out.print("Sadece tam sayı giriniz!");
            return;
        }


        System.out.print("b sayısını giriniz:");
        try {
            b=Integer.parseInt(inp.nextLine());
        }catch (NumberFormatException e){
            System.out.print("Sadece tam sayı giriniz!");
            return;
        }


        System.out.print("c sayıyını giriniz:");
        try {
            c=Integer.parseInt(inp.nextLine());
        }catch (NumberFormatException e){
            System.out.print("Sadece tam sayı giriniz!");
            return;
        }




        if (b<a && b<c) {              /* b'nin en küçük old. durum */
            if (a<c){
                System.out.print("b<a<c");
            }else if (a>c) {
                System.out.print("b<c<a");
            }

        }

        else if (c<a && c<b) {              /* c'nin en küçük old. durum */
            if(b<a){
                System.out.print("c<b<a");
            }else if (b>a) {
                System.out.print("c<a<b");
            }

        }

        else if (a==b && a==c) {            /* a=b=c old. durum */
            System.out.print("a=b=c");

        }

        else if (a==b && c!=a) {            /* (a=b)!=c old. durum */
            if(a>c){
                System.out.print("a=b>c");
            }else if (a<c) {
                System.out.print("c>a=b");
            }

        }

        else if (a==c && b!=c) {            /* (a=c)!=b old. durum */
            if (a>b){
                System.out.print("a=c>b");
            }else if (a<b) {
                System.out.print("a=c<b");
            }

        }

        else if (b==c && a!=c){             /* (b=c)!=a old. durum */
            if (c<a){
                System.out.print("b=c<a");
            }else if(c>a) {
                System.out.print("b=c>a");
            }

        }

        else if (a<b && a<c){                    /* a'nın en küçük old. durum */
            if(c<b){
                System.out.print("a<c<b");
            }else if (b<c) {
                System.out.print("a<b<c");
            }
        }

        else {
            System.out.print("Lütfen sadece tam sayı giriniz.");
        }

        System.out.print("\nProgram Bitti.");


    }
}
