import java.util.*;
public class print_n_elements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to print: ");
        int n = sc.nextInt();

        for(int i = 0 ; i <= n ; i++){
            System.out.print(i+ " ");
        }

        sc.close();
    }
}