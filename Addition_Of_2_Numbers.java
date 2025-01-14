import java.util.Scanner;

public class Addition_Of_2_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = Sum(a, b);
        System.out.println("Sum of two numbers are: "+ c);
        }
    public static int Sum(int a, int b){
        int c = a + b;
        return c;
    }
}
