public class Pythagoras_Triplet{
    public static void main(String[] args) {
        Triplet(3, 4, 5);
    }
    public static void Triplet(int a, int b, int c){
        int x = (a*a) + (b*b);
        int y = (c*c);

        if(x == y){
            System.out.println("Pythagoras Triplet...");
        }
        else{
            System.out.println("Not a Pythagoras Triplet...");
        }
    }
}