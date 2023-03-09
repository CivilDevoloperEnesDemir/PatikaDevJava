import java.util.Scanner;
public class ForExample {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        double n,r, ntotal =1,rtotal=1,nrtotal=1;

        System.out.println("Bu program girdiğiniz C(n,r) değerlerine göre kombinasyon hesaplar.");
        System.out.print("n değerini giriniz:");
        n=inp.nextInt();
        System.out.print("r değerini giriniz:");
        r=inp.nextInt();

        for(int i=1;i<=n;i++){          // n! hesapladık
            ntotal = ntotal *i;
        }

        for(int i=1;i<=r;i++){          // r! hesapladık
            rtotal=rtotal*i;
        }

        for(int i=1;i<=(n-r);i++){      // (n-r)! hesapladık
            nrtotal=nrtotal*i;
        }

        // Formül C(n,r)=n!/(r!*(n-r)!)

        System.out.println("n!=\t"+ntotal);
        System.out.println("r!=\t"+rtotal);
        System.out.println("(n-r)!=\t"+nrtotal);
        System.out.println("Formül ---> C(n,r)=n!/(r!*(n-r)!)");

        System.out.println("C("+n+","+r+"):"+(ntotal/(rtotal*nrtotal)));



    }

}
