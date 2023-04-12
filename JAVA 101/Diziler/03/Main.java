public class Main {
    public static void main(String[] args){

        int[] list = {-15,23,-76,34,55,1,3,7,-79};

        int min,max;

        min=list[0];
        max=list[0];

        for(int i:list){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }

        System.out.println("Maksimum Değer : "+ max);
        System.out.println("Minimum Değer : "+ min);

    }
}
