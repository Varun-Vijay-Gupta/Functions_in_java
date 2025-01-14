public class Palindrome_Fun {
    public static void main(String[] args) {
        PalindromeOfNumber(123);
    }
    public static void PalindromeOfNumber(int n){
        int sum = 0;
        int temp = n;
        while(temp != 0){
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }
        if(sum == n){
            System.out.println("Palindrome...");
        }
        else{
            System.out.println("Not a palindrome...");
        }
    }
}
