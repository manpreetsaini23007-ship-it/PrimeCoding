import java.util.*;
public class sort_odd_even_without_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        String s = sc.nextLine();

        for(int i = 0 ; i < s.length() ; i++){
            int digit = s.charAt(i) - '0';

            if(digit % 2 != 0){
                System.out.print(digit);
            }
        }

        for(int i = 0 ; i < s.length(); i ++){
            int digit = s.charAt(i) - '0';

            if(digit % 2 == 0){
                System.out.print(digit);
            }
        }

        sc.close();
    }
}
