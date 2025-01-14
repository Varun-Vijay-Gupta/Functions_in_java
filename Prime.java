public class Prime {
    public static void main(String[] args) {
        PrimeNo(98);
    }
    public static void PrimeNo(int n){
        int count = 0;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("The number you entered is prime no.");
        }
        else{
            System.out.println("The number you entered is not a prime no.");
        }
    }
}
