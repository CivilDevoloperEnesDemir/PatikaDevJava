public class Project {
    public static void main(String[] args) {

        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int [] frekanslar = new int[list.length];

        for(int i=0;i< list.length;i++){
            int num = list[i];
            int frekans = 0;
            for(int j=0;j<list.length;j++){
                if(num==list[j]) {
                    frekans++;
                }
            }
            frekanslar[i]=frekans;
        }

        System.out.println("Dizideki elemanların frekansları : ");
        for(int i=0;i< list.length;i++){
            System.out.println(list[i] + " : " + frekanslar[i] + " kez");
        }

    }
}
