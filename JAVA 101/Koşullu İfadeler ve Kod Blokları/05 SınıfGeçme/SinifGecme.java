import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        int mat,fiz,kim,biyo,geo,toplam=0,bolum=0;


        System.out.print("Matematik Notunuzu Giriniz:");
        mat=inp.nextInt();
        if(mat<101 && mat>-1){
            toplam+=mat;
            bolum+=1;
        }

        System.out.print("Fizik Notunuzu Giriniz:");
        fiz=inp.nextInt();
        if(fiz<101 && fiz>-1){
            toplam+=fiz;
            bolum+=1;
        }

        System.out.print("Kimya Notunuzu Giriniz:");
        kim=inp.nextInt();
        if(kim<101 && kim>-1){
            toplam+=kim;
            bolum+=1;
        }

        System.out.print("Biyoloji Notunuzu Giriniz:");
        biyo=inp.nextInt();
        if(biyo<101 && biyo>-1){
            toplam+=biyo;
            bolum+=1;
        }

        System.out.print("Geometri Notunuzu Giriniz:");
        geo=inp.nextInt();
        if(geo<101 && geo>-1){
            toplam+=geo;
            bolum+=1;
        }


        if (bolum!=0){
            int ortalama=(toplam/bolum);
            System.out.print("Ortalamanız:"+ortalama);

        }else
            System.out.print("Derslerde 0-100 aralığında puan girmediğiniz için puan hesaplanmamıştır.");

    }
}
