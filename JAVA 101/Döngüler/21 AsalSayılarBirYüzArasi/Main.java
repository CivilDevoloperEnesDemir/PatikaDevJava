public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            System.out.println(i-1+".döngü");
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {
                System.out.println("i="+i);
                System.out.println("j="+j);
                System.out.println("i/j=0 ise döngüyü sonlandır başa dön.\ni/j!=0 ise döngüye devam et");
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {   // sayı asalsa ekrana yazdırılır
               System.out.println("Asal sayı="+i);
            }
        }
    }
}

/*

Bu programda, iki adet for döngüsü kullanılmıştır.
Dıştaki döngü, 2'den 100'e kadar olan sayıları tek
tek kontrol ederken,içteki döngü ise, her bir sayının
2'den kendisine kadar olan sayılara bölünüp bölünmediğini kontrol ediyor.
Eğer sayı herhangi bir sayıya bölünüyorsa, o sayı asal olmadığı için asalMi
değişkeni false yapılıyor ve içteki döngü sonlandırılıyor.
Eğer asalMi değişkeni hala true ise, sayı asaldır ve ekrana yazdırılıyor.

 */