import java.util.Scanner;

public class Factorial_Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int sum = Fact(n);

        System.out.println("Factorial of the number is: "+sum);
    }
    public static int Fact(int n){

        if(n < 0){
            System.out.println("Invalid number....");
        }
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum = sum * i;
        }
        return sum;
    }
}
