import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("x raised to n is: ");
        int r = Pow(x, n);
        System.out.println(r);
    }
    public static int Pow(int x, int n){
        int result = 1;
        for(int i = 0; i <= n; i++){
            result = result * x;
        }
        return result;
        
    }
}
