public class Max_Min {
    public static void main(String[] args) {
        Max(1, 2, 3);
        Min(1, 2, 3);
    }
    public static void Max(int a, int b, int c){
        if(a > b && b > c){
            System.out.println("First number is maximum");
        }
        else if(b > a && a > c){
            System.out.println("Second number is maximum");
        }
        else{
            System.out.println("Third number is maximum");
        }
    }
    public static void Min(int a, int b, int c){
        if(a < b && b < c){
            System.out.println("First number is minimum");
        }
        else if(b < a && a < c){
            System.out.println("Second number is minimum");
        }
        else{
            System.out.println("Third number is minimum");
        }
    }
}
