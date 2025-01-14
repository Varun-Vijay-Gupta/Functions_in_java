import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc .nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = Avg(a, b, c);
        System.out.println("Average of three numbers is: "+avg);
    }
    public static float Avg(int a, int b, int c){
        float avg = (a + b + c) / 3;
        return avg;
    }
}
