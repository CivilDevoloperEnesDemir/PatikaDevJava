public class Main {
    public static void main(String[] args){

        int[] list={1,2,3,4,5,6};
        double sum=0.0;
        double average;
        for(int i=0;i<list.length;i++){
            sum=sum+list[i];
        }
        average = sum/list.length;
        System.out.println("Ortalama:"+average);

    }
}
