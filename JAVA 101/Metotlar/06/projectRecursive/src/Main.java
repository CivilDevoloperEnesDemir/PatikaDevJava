
public class Main {
    public static void recursiveMethod(int n) {
        System.out.print(n + " ");
        if (n <= 0) {

            return;
        }
        recursiveMethod(n - 5);
        System.out.print(n+" ");
    }
    public static void  main(String[] args) {
        recursiveMethod(16);
    }
}