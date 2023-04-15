import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] dizi = {12,31,12,24,34,22,24,54,76,-54,56,34,0,12};
        System.out.println("Dizi : " + Arrays.toString(dizi));
        //Diziyi küçükten büyüğe sıralıyoruz.
        Arrays.sort(dizi);
        System.out.println("Sıralı : " + Arrays.toString(dizi));
        //Dizi sıralandığında tekrarlayan değerler sıralı geldi. Sonrası zaten kolay :)
        int counter=0;
        for(int i = 0; i < dizi.length-1; i++){
            if(dizi[i] == dizi[i+1]){
                int evenNumber = dizi[i];
                if(evenNumber % 2 == 0){
                    counter++;
                    System.out.print(evenNumber +" ");
                }
            }
        }
        if(counter == 0){
            System.out.println("Tekrar Eden Çift Sayı Bulunamadı...:)");
        }
    }
}