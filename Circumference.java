import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int r = sc.nextInt();

        float c = Circum(r);
        System.out.println("Circumference of the circle is: "+c);
    }
    public static float Circum(int r){
        float c = (float) (2 * 3.14 * r);
        return c; 
    }
}
