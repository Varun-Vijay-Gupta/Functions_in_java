public class Fibonnaci_Fun {
    public static void main(String[] args) {
        Fibo(7);
    }
    public static void Fibo(int n){
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Fibonnaci series: ");
        for(int i = 0; i <= n; i++){
            System.out.println(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
        

    }
}
