import java.util.*;
public class primenumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        boolean isprime = true;

        for(int i = 2 ; i*i <= n ; i++){
            if(n % i == 0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println( + n + " is a prime number");
        }else{
            System.out.println( + n + " is not a prime number");
        }
        sc.close();
    }
}

